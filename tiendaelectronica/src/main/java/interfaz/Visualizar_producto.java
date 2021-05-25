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
import basededatosorm.Valoracion;
import vistas.VistaVisualizarproducto;

//import Diagrama_de_clases_correcto.Valoraciones_del_producto;

public class Visualizar_producto extends VistaVisualizarproducto {

	BDPrincipal bdp = new BDPrincipal();
	VaadinSession session = VaadinSession.getCurrent();
	VerticalLayout valoracionesLayout = this.getValoracionesProductoVLayout().as(VerticalLayout.class);

	public Visualizar_producto(Producto p, Usuario usuario, VerticalLayout layoutprincipal) {
		this.getIniciarSesionButton().setVisible(false);
		this.getNombreProductoTitulo().setText(p.getNombre());
		this.getDecuentoProductoLabel().setText(("Descuento: "+p.getOferta().getPorcentaje() + "%"));
		this.getDescripcionProductoTArea().setValue(p.getDescripcion());
		this.getValoracionProductoLabel().setText("");
		añadirAlCarrito(p);
		cargarValoraciones(p);
		if (p.getOferta().getPorcentaje() != 0) {
			Double a = p.getOferta().getPorcentaje();
			Double precioConOferta = p.getPrecio() - (p.getPrecio() * a / 100);
			this.getPrecioProductoLabel()
					.setText("Precio: "+p.getOferta().getNombreOferta() + ": " + Double.toString(precioConOferta) + "€");
		} else {
			this.getPrecioProductoLabel().setText("Precio: "+Double.toString(p.getPrecio()) + "€");
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
		this.getDecuentoProductoLabel().setText(("Descuento: "+p.getOferta().getPorcentaje() + "%"));
		this.getDescripcionProductoTArea().setValue(p.getDescripcion());
		this.getValoracionProductoLabel().setText("");
		iniciarSesionButton(layoutprincipal);
		añadirAlCarrito(p);
		cargarValoraciones(p);

		if (p.getOferta().getPorcentaje() != 0) {
			Double a = p.getOferta().getPorcentaje();
			Double precioConOferta = p.getPrecio() - (p.getPrecio() * a / 100);
			this.getPrecioProductoLabel()
					.setText("Precio: "+p.getOferta().getNombreOferta() + ": " + Double.toString(precioConOferta) + "€");
		} else {
			this.getPrecioProductoLabel().setText("Precio: "+Double.toString(p.getPrecio()) + "€");
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
	
	public void cargarValoraciones(Producto producto) {
		Valoracion[] valoraciones = producto.valoracions.toArray();
		for (Valoracion valoracion : valoraciones) {
			valoracionesLayout.add(new Valoracion_del_producto(valoracion.getUsuarioRegistrado(), valoracion));
		}
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