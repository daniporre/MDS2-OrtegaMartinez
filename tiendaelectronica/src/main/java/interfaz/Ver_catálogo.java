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
	public Producto[] p = new Producto[bdp.verCatalogo().length];
	public ArrayList<Producto> productoEnOfertaAL = new ArrayList<Producto>();
	public Producto[] productoEnOferta;
	public ArrayList<Producto> arr = new ArrayList<Producto>();
	public Categoria[] categorias = new Categoria[bdp.obtenerCategorias().length];
	public Ver_categoría verCategoria;

	public Ver_catálogo(Usuario usuario, VerticalLayout layout) {
		
		this.getFiltrarPorCombobox().setVisible(false);
		this.getOrdenarPorCombobox().setItems(comboOrdenar);

		obtenerProductosdeBD();
		ordenarComboBox(usuario, layout);

		actualizarCatalogo(usuario, layout);

		obtenerProductosEnOferta();
		actualizarListaOfertas();
		actualizarListaCategorias();

	}

	public Ver_catálogo(VerticalLayout layout) {
		this.getOrdenarPorCombobox().setItems(comboOrdenar);
		this.getFiltrarPorCombobox().setVisible(false);
		
		obtenerProductosdeBD();
		ordenarComboBox(null, layout);
		obtenerProductosEnOferta();
		actualizarListaOfertas();
		actualizarListaCategorias();
		actualizarCatalogoUNR(layout);

	}

	public void obtenerProductosdeBD() {
		for (int i = 0; i < bdp.verCatalogo().length; i++) {
			p[i] = bdp.verCatalogo()[i];
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
		for (int i = 0; i < p.length; i++) {
			vp = new Ver_producto(p[i], usuario, layoutPincipal);
			vp.getVaadinHorizontalLayout().setAlignItems(Alignment.STRETCH);
			v.setAlignItems(Alignment.STRETCH);
			// Aqui hay que acceder a la bd para obtener las imagenes del producto con su id
			// en p[i]
			v.add(vp);
		}
	}

	public void actualizarCatalogoUNR(VerticalLayout layoutPincipal) {
		for (int i = 0; i < p.length; i++) {
			vp = new Ver_producto(p[i], layoutPincipal);
			vp.getVaadinHorizontalLayout().setAlignItems(Alignment.STRETCH);
			v.setAlignItems(Alignment.STRETCH);
			// Aqui hay que acceder a la bd para obtener las imagenes del producto con su id
			// en p[i]
			v.add(vp);
		}
	}

	public void actualizarListaOfertas() {
		for (int i = 0; i < productoEnOferta.length; i++) {
			vpo = new Ver_oferta(productoEnOferta[i]);
			// Aqui hay que acceder a la bd para obtener las imagenes del producto con su id
			// en p[i]
			ofertas.add(vpo);
		}
	}

	public void actualizarListaCategorias() {
		for (int i = 0; i < bdp.obtenerCategorias().length; i++) {
			categorias[i] = bdp.obtenerCategorias()[i];
			verCategoria = new Ver_categoría(categorias[i]);
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
				Arrays.sort(p);
				getProductosEnCatalogoVLayout().removeAllChildren();
				if(usuario!=null) {
					actualizarCatalogo(usuario, layoutPincipal);
				} else {
					actualizarCatalogoUNR(layoutPincipal);
				}
				
			}

			if (getOrdenarPorCombobox().getValue() == "Más caros primero") {
				obtenerProductosdeBD();
				Arrays.sort(p);
				invArray(p);
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