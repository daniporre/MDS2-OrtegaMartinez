package interfaz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.mapping.Component;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.AbstractField.ComponentValueChangeEvent;
import com.vaadin.flow.component.HasValue.ValueChangeListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexLayout.ContentAlignment;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatosorm.Categoria;
import basededatosorm.Producto;
import basededatosorm.Usuario;
import vistas.VistaVercatalogo;

public class Ver_catálogo extends VistaVercatalogo {

	public VerticalLayout layoutCatalogo = this.getVaadinVerticalLayout().as(VerticalLayout.class);
	public VerticalLayout v = this.getProductosEnCatalogoVLayout().as(VerticalLayout.class);
	public HorizontalLayout ofertas = this.getOfertasHLayout();
	public HorizontalLayout categoriasLayout = this.getCategoriasHLayout();
	public Ver_producto vp;
	public Ver_oferta vpo;
	public BDPrincipal bdp = new BDPrincipal();
	public String[] comboOrdenar = { "Más caros primero", "Más baratos primero" };
	public Producto[] productosAMostrar = new Producto[bdp.verCatalogo().length];
	public ArrayList<Producto> productoEnOfertaAL = new ArrayList<Producto>();
	public Producto[] productoEnOferta;
	public ArrayList<Producto> arr = new ArrayList<Producto>();
	public Categoria[] categorias = new Categoria[bdp.obtenerCategorias().length];
	public Ver_categoría verCategoria;
	Usuario usuario;
	VerticalLayout principalLayout;

	public Ver_catálogo(Usuario usuario, VerticalLayout principalLayout) {
		this.usuario = usuario;
		this.principalLayout = principalLayout;
		
		this.getFiltrarPorCombobox().setVisible(false);
		this.getOrdenarPorCombobox().setItems(comboOrdenar);
		getCategoriaLabel().setText("");

		obtenerProductosdeBD();
		ordenarComboBox(usuario, principalLayout);

		actualizarCatalogo(usuario, principalLayout);

		obtenerProductosEnOferta();
		actualizarListaOfertas(principalLayout);
		actualizarListaCategorias(usuario, principalLayout);

	}

	public Ver_catálogo(VerticalLayout layout) {
		this.getOrdenarPorCombobox().setItems(comboOrdenar);
		this.getFiltrarPorCombobox().setVisible(false);
		getCategoriaLabel().setText("");
		
		obtenerProductosdeBD();
		ordenarComboBox(null, layout);
		obtenerProductosEnOferta();
		actualizarListaOfertasUNR(layout);
		actualizarListaCategorias(null, layout);
		actualizarCatalogoUNR(layout);
	}

	public void obtenerProductosdeBD() {
		for (int i = 0; i < bdp.verCatalogo().length; i++) {
			productosAMostrar[i] = bdp.verCatalogo()[i];
		}
	}

	public void obtenerProductosEnOferta() {
		for (int i = 0; i < bdp.verCatalogo().length; i++) {
			if (bdp.verCatalogo()[i].getOferta().getPorcentaje() != 0) {
				productoEnOfertaAL.add(bdp.verCatalogo()[i]);
			}
		}

		productoEnOferta = new Producto[productoEnOfertaAL.size()];
		productoEnOfertaAL.toArray(productoEnOferta);

		System.out.println("Productos en oferta: " + Arrays.toString(productoEnOferta));
	}

	public void actualizarCatalogo(Usuario usuario, VerticalLayout layoutPincipal) {
		for (int i = 0; i < productosAMostrar.length; i++) {
			vp = new Ver_producto(productosAMostrar[i], usuario, layoutPincipal);
			vp.getVaadinHorizontalLayout().setAlignItems(Alignment.STRETCH);
			v.setAlignItems(Alignment.STRETCH);
			// Aqui hay que acceder a la bd para obtener las imagenes del producto con su id
			// en p[i]
			v.add(vp);
		}
	}

	public void actualizarCatalogoUNR(VerticalLayout layoutPincipal) {
		for (int i = 0; i < productosAMostrar.length; i++) {
			vp = new Ver_producto(productosAMostrar[i], layoutPincipal);
			vp.getVaadinHorizontalLayout().setAlignItems(Alignment.STRETCH);
			v.setAlignItems(Alignment.STRETCH);
			// Aqui hay que acceder a la bd para obtener las imagenes del producto con su id
			// en p[i]
			v.add(vp);
		}
	}

	public void actualizarListaOfertas(VerticalLayout layoutPincipal) {
		for (int i = 0; i < productoEnOferta.length; i++) {
			vpo = new Ver_oferta(productoEnOferta[i], usuario, layoutPincipal);
			// Aqui hay que acceder a la bd para obtener las imagenes del producto con su id
			// en p[i]
			ofertas.add(vpo);
		}
	}
	
	public void actualizarListaOfertasUNR(VerticalLayout layoutPincipal) {
		for (int i = 0; i < productoEnOferta.length; i++) {
			vpo = new Ver_oferta(productoEnOferta[i], layoutPincipal);
			// Aqui hay que acceder a la bd para obtener las imagenes del producto con su id
			// en p[i]
			ofertas.add(vpo);
		}
	}

	public void actualizarListaCategorias(Usuario usuario, VerticalLayout layout) {
		for (int i = 0; i < bdp.obtenerCategorias().length; i++) {
			categorias[i] = bdp.obtenerCategorias()[i];
			verCategoria = new Ver_categoría(categorias[i]);
			int aux = i;
			verCategoria.getVaadinHorizontalLayout().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {

				@Override
				public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
					
					productosAMostrar = bdp.obtenerProductosConCategoria(categorias[aux]);
					getCategoriaLabel().setText("Categoría: "+categorias[aux].getNombre());
					v.removeAll();
					if(usuario!=null) {
						actualizarCatalogo(usuario, layout);
					} else {
						actualizarCatalogoUNR(layout);
					}
					
				}
			});
			
			categoriasLayout.add(verCategoria);
		}
	}

	public void buscarProducto() {
		throw new UnsupportedOperationException();
	}

	public void ordenarComboBox(Usuario usuario, VerticalLayout layoutPincipal) {
		this.getOrdenarPorCombobox().addValueChangeListener(event -> {
			if (getOrdenarPorCombobox().getValue() == "Más baratos primero") {
				obtenerProductosdeBD();
				Arrays.sort(productosAMostrar);
				getProductosEnCatalogoVLayout().removeAllChildren();
				if(usuario!=null) {
					actualizarCatalogo(usuario, layoutPincipal);
				} else {
					actualizarCatalogoUNR(layoutPincipal);
				}
				
			}

			if (getOrdenarPorCombobox().getValue() == "Más caros primero") {
				obtenerProductosdeBD();
				Arrays.sort(productosAMostrar);
				invArray(productosAMostrar);
				getProductosEnCatalogoVLayout().removeAllChildren();
				if(usuario!=null) {
					actualizarCatalogo(usuario, layoutPincipal);
				} else {
					actualizarCatalogoUNR(layoutPincipal);
				}
			}
		});
	}

	public void verCarrito() {
		
	}

	public static Producto[] invArray(Producto[] n) {
		Producto aux;
		for (int i = 0; i < n.length / 2; i++) {
			aux = n[i];
			n[i] = n[n.length - 1 - i];
			n[n.length - 1 - i] = aux;
		}

		return n;
	}
}