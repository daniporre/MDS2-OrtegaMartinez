package interfaz;

import java.util.Arrays;
import java.util.Iterator;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatosorm.Categoria;
import basededatosorm.Oferta;
import basededatosorm.Producto;
import basededatosorm.Usuario;
import vistas.VistaEditarproducto;

public class Modificar_producto extends VistaEditarproducto {

	private String[] nombreOfertas;
	private BDPrincipal bdp = new BDPrincipal();
	public String nombreOferta;
	String nombre;
	Double precio;
	String marca;
	Oferta oferta = null;
	String descripcion;
	Categoria[] categorias = bdp.obtenerCategorias();
	String[] nombreCategorias = new String[categorias.length];
	String nombreCategoria;
	Categoria categoria = null;
	public Ver_categoría verCategoria;
	public HorizontalLayout categoriasLayout = this.getCategoriasLayout();

	public Modificar_producto(Producto producto, Usuario usuario, VerticalLayout layoutPincipal) {
		this.getNombreProductoTF().setValue(producto.getNombre());
		this.getMarcaProductoTF().setValue(producto.getMarca());
		this.getDescripcionProductoTF().setValue(producto.getDescripcion());
		cargarCategorias();
		volverAdmin(usuario, layoutPincipal);
		guardarCambios(producto);

		if (producto.getOferta().getPorcentaje() != 0) {
			Double a = producto.getOferta().getPorcentaje();
			Double precioConOferta = producto.getPrecio() - (producto.getPrecio() * a / 100);
			this.getPrecioProductoTF().setValue(Double.toString(precioConOferta));
		} else {
			this.getPrecioProductoTF().setValue(Double.toString(producto.getPrecio()));
		}

//		if(producto.categorias!=null) {
//			this.getCategoriaProductoComboBox().setValue(producto.categorias);
//		}

		nombreOfertas = new String[bdp.obtenerOfertas().length];

		for (int i = 0; i < bdp.obtenerOfertas().length; i++) {
			nombreOfertas[i] = bdp.obtenerOfertas()[i].getNombreOferta();
		}

		this.getOfertasProductoTF().setItems(nombreOfertas);
		this.getOfertasProductoTF().setValue(producto.getOferta().getNombreOferta());
		actualizarListaCategorias(producto);

	}

	public void añadirImagen1() {
		throw new UnsupportedOperationException();
	}

	public void añadirImagen2() {
		throw new UnsupportedOperationException();
	}

	public void añadirImagen3() {
		throw new UnsupportedOperationException();
	}

	public void añadirImagen4() {
		throw new UnsupportedOperationException();
	}
	
	public void volverAdmin(Usuario administrador, VerticalLayout layoutPrincipal) {
		this.getInicioButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layoutPrincipal.removeAll();
				layoutPrincipal.add(new Administrador(administrador, layoutPrincipal));				
			}
		});
	}

	public void guardarCambios(Producto producto) {

		this.getGuardarCambiosButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				nombre = getNombreProductoTF().getValue();
				precio = Double
						.parseDouble(getPrecioProductoTF().getValue().replace(',', '.').replace('€', ' ').trim());

				marca = getMarcaProductoTF().getValue();
				if (!getOfertasProductoTF().getValue().isEmpty())
					nombreOferta = getOfertasProductoTF().getValue();
				oferta = bdp.obtenerOferta(nombreOferta);

				descripcion = getDescripcionProductoTF().getValue();

				if (getCategoriaProductoComboBox().getValue() != null) {
					nombreCategoria = getCategoriaProductoComboBox().getValue();
					categoria = bdp.obtenerCategoria(nombreCategoria);
					bdp.asignarCategoriaAProducto(producto, categoria);
				}

				if (!nombre.isEmpty() && !precio.toString().isEmpty() && !marca.isEmpty() && !descripcion.isEmpty()) {
					bdp.editarProducto(producto, nombre, precio, marca, oferta, descripcion);
					// Volvemos atras
				} else {
					Notification.show("Rellena todos los datos para modificar el producto");
				}

			}
		});

	}

	public void actualizarListaCategorias(Producto producto) {

		Categoria[] cat = new Categoria[producto.categorias.toArray().length];
		cat = producto.categorias.toArray();
		System.out.println("sdfas" + Arrays.toString(cat));

		for (int i = 0; i < cat.length; i++) {
			verCategoria = new Ver_categoría(cat[i]);
			categoriasLayout.add(verCategoria);
			verCategoria.getCategoriaButton().setEnabled(false);
		}
	}

	public void cargarCategorias() {
		for (int i = 0; i < categorias.length; i++) {
			nombreCategorias[i] = categorias[i].getNombre();
		}

		this.getCategoriaProductoComboBox().setItems(nombreCategorias);
	}
}