package interfaz;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.VaadinSession;

import basededatos.BDPrincipal;
import basededatosorm.Producto;
import basededatosorm.Usuario;
import basededatosorm.UsuarioRegistrado;
import vistas.VistaVisualizarproducto;

//import Diagrama_de_clases_correcto.Valoraciones_del_producto;

public class Visualizar_producto extends VistaVisualizarproducto {

	BDPrincipal bdp = new BDPrincipal();
	Producto[] productos = new Producto[bdp.buscarProducto(this.getSearchBar().getValue()).length];
	VaadinSession session = VaadinSession.getCurrent();

	public Visualizar_producto(Producto p, Usuario usuario, VerticalLayout layoutprincipal) {
		this.getIniciarSesionButton().setVisible(false);
		this.getNombreProductoTitulo().setText(p.getNombre());
		this.getDecuentoProductoLabel().setText((p.getOferta().getPorcentaje() + "%"));
		this.getDescripcionProductoTArea().setValue(p.getDescripcion());
		buscar(usuario, layoutprincipal);
		añadirAlCarrito(p);
		if (p.getOferta().getPorcentaje() != 0) {
			Double a = p.getOferta().getPorcentaje();
			Double precioConOferta = p.getPrecio() - (p.getPrecio() * a / 100);
			this.getPrecioProductoLabel()
					.setText(p.getOferta().getNombreOferta() + ": " + Double.toString(precioConOferta) + "€");
		} else {
			this.getPrecioProductoLabel().setText(Double.toString(p.getPrecio()) + "€");
		}
		this.getReferenciaProductoLabel().setText(String.valueOf(p.getIdProducto()));
		// TODO Acceder a bd valoraciones y buscar este producto, mostrar las suyas
//		this.getValoracionProductoLabel().setText();
		this.getInicioButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layoutprincipal.removeAll();
				layoutprincipal.add(new Usuario_registrado((UsuarioRegistrado) usuario, layoutprincipal));
			}
		});
		
		this.getVerCarritoButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layoutprincipal.removeAll();
				layoutprincipal.add(new Ver_carrito((UsuarioRegistrado) usuario, layoutprincipal));
			}
		});

	}

	public Visualizar_producto(Producto p, VerticalLayout layoutprincipal) {
		this.getIniciarSesionButton().setVisible(true);
		this.getNombreProductoTitulo().setText(p.getNombre());
		this.getDecuentoProductoLabel().setText((p.getOferta().getPorcentaje() + "%"));
		this.getDescripcionProductoTArea().setValue(p.getDescripcion());
		buscar(null, layoutprincipal);
		iniciarSesionButton(layoutprincipal);
		añadirAlCarrito(p);

		if (p.getOferta().getPorcentaje() != 0) {
			Double a = p.getOferta().getPorcentaje();
			Double precioConOferta = p.getPrecio() - (p.getPrecio() * a / 100);
			this.getPrecioProductoLabel()
					.setText(p.getOferta().getNombreOferta() + ": " + Double.toString(precioConOferta) + "€");
		} else {
			this.getPrecioProductoLabel().setText(Double.toString(p.getPrecio()) + "€");
		}
		this.getReferenciaProductoLabel().setText(String.valueOf(p.getIdProducto()));
		// TODO Acceder a bd valoraciones y buscar este producto, mostrar las suyas
//		this.getValoracionProductoLabel().setText();
		this.getInicioButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layoutprincipal.removeAll();
				layoutprincipal.add(new Usuario_no_registrado(layoutprincipal));
			}
		});
		
		this.getVerCarritoButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layoutprincipal.removeAll();
				layoutprincipal.add(new Ver_carrito__Usuario_no_registrado_(layoutprincipal));
			}
		});
	}

	public void buscar(Usuario usuario, VerticalLayout layoutprincipal) {

		productos = bdp.buscarProducto(this.getSearchBar().getValue());

		this.getBuscarButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				if (!getSearchBar().getValue().isEmpty()) {
					if (usuario != null) {

						Productos_buscados pb = new Productos_buscados((UsuarioRegistrado) usuario, productos, null,
								layoutprincipal);

						layoutprincipal.removeAll();
						layoutprincipal.add(pb);
					}
					if (usuario == null) {

						Productos_buscados pb = new Productos_buscados(productos, null, layoutprincipal);

						layoutprincipal.removeAll();
						layoutprincipal.add(pb);
					}
				}

			}
		});
	}

	public void iniciarSesionButton(VerticalLayout layoutPrincipal) {
		this.getIniciarSesionButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				try {
					Iniciar_sesión in = new Iniciar_sesión(layoutPrincipal);
					layoutPrincipal.removeAll();
					layoutPrincipal.add(in);
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
	}

	public void añadirAlCarrito(Producto producto) {

		this.getAniadirAlCarritoButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				System.out.println("Añadir al carrito pulsado");
				
				if(session!=null) {
					ArrayList<Producto> arr = (ArrayList<Producto>) session.getAttribute("carrito");
					arr.add(producto);
					
					System.out.println(arr.toString());
				}

				

			}
		});

	}

}