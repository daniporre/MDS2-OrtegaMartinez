package interfaz;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.VaadinSession;

import basededatos.BDPrincipal;
import basededatos.BDUsuarioRegistrado;
import basededatosorm.Producto;
import basededatosorm.UsuarioRegistrado;
import vistas.VistaVercarrito;

public class Ver_carrito extends VistaVercarrito {

	public Iniciar_sesión lg;
	public BDPrincipal bdp = new BDPrincipal();
	public boolean isSesionOn;
	VerticalLayout layoutPrincipal;
	UsuarioRegistrado usuario;
	VerticalLayout productosCarritoLayout = this.getProductosEnCarritoVLayout().as(VerticalLayout.class);
	VaadinSession session = VaadinSession.getCurrent();
	@SuppressWarnings("unchecked")
	ArrayList<Producto> productos = (ArrayList<Producto>) session.getAttribute("carrito");
	Double precioTotal;

	public Ver_carrito() {
		
	}

	public Ver_carrito(UsuarioRegistrado usuario, VerticalLayout layoutPrincipal) {

		super();
		this.layoutPrincipal = layoutPrincipal;
		this.getCarritoButton().setVisible(false);
		this.getIniciarSesionButton().setVisible(false);
		this.getMiCuentaButton().setVisible(true);
		this.usuario=bdp.obtenerUsuarioRegistrado(usuario.getIdUsuario());
		

		if (!productos.isEmpty()) {
			this.getTramitarPedidoButton().setEnabled(true);
		} else {
			this.getTramitarPedidoButton().setEnabled(false);
		}
		
		cargarProductosCarrito();
		actualizarButton();
		tramitarPedido();
		rellenarDatos(bdp.obtenerUsuarioRegistrado(usuario.getIdUsuario()));

		this.getEditarPagoDireccionButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				irVerCuenta();

			}
		});

		this.getInicioButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				irUsuarioRegistrado();

			}
		});

		this.getContinuarComprandoButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				irUsuarioRegistrado();

			}
		});

		this.getMiCuentaButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				irVerCuenta();

			}

		});
		
	}
	
	public void tramitarPedido() {
		this.getTramitarPedidoButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if(comprobarPagoyDireccion()) {
					//TODO
					Producto[] ps = new Producto[productos.size()];
					productos.toArray(ps);
					
					
					bdp.crearPedido(usuario, ps, precioTotal);
					productos.removeAll(productos);
					layoutPrincipal.removeAll();
					layoutPrincipal.add(new Ver_cuenta__Usuario_registrado_(usuario, layoutPrincipal));
				} else {
					Notification.show("Ha ocurrido un error, comprueba tus datos de envio y pago.").setPosition(Position.BOTTOM_END);
				}
				
			}
		});
	}
	
	public boolean comprobarPagoyDireccion() {
		return (usuario.getCiudad()!=null&&
				usuario.getCodigoPostal()!=null&&
				usuario.getProvincia()!=null&&
				usuario.getDireccionUsuario()!=null&&
				usuario.getNumeroTarjeta()!=null&&
				usuario.getFechaVencimientoTarjeta()!=null&&
				usuario.getCvv()!=0)  ?  true : false;
	}

	public void cargarProductosCarrito() {
		if (productos != null) {
			for (Producto producto : productos) {
				Ver_producto_en_carrito vpc = new Ver_producto_en_carrito(producto);

//				vpc.getAumentarButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
//
//					@Override
//					public void onComponentEvent(ClickEvent<Button> event) {
//						
//						System.out.println("prueba ur");
//						if(session!=null) {
//							ArrayList<Producto> arr = (ArrayList<Producto>) session.getAttribute("carrito");
//							arr.add(producto);
//							
//							System.out.println(arr.toString());
//							actualizarCarrito();
//						}
//					}
//				});

				productosCarritoLayout.add(vpc);
			}
		}
	}

	public void actualizarButton() {
		this.getActualizarButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				actualizarCarrito();
			}
		});
		asignarPrecioTotal();
	}

	public void actualizarCarrito() {
		if (!productos.isEmpty()) {
			this.getTramitarPedidoButton().setEnabled(true);
		} else {
			this.getTramitarPedidoButton().setEnabled(false);
		}
		if (productos != null) {
			productosCarritoLayout.removeAll();
			for (Producto producto : productos) {
				Ver_producto_en_carrito vpc = new Ver_producto_en_carrito(producto);

				productosCarritoLayout.add(vpc);
			}
		}
		asignarPrecioTotal();
	}

	public void rellenarDatos(UsuarioRegistrado us) {
		// metodo de pago
		if(us.getNumeroTarjeta()!=null) {
			String numbers = us.getNumeroTarjeta().substring(Math.max(0, us.getNumeroTarjeta().length() - 4));
			this.getMetodoDePagoButton().setText("Tarjeta con el número: " + "****-****-****-" + numbers);
		}
		
		// direccion
		if(us.getDireccionUsuario()!=null)
			this.getDireccionUsuarioButton().setText("Calle: " + us.getDireccionUsuario());
		if(us.getCiudad()!=null)
			this.getCiudadLabel().setText("Ciudad: " + us.getCiudad());
		if(us.getCodigoPostal()!=null)
			this.getCpLabel().setText("CP: " + us.getCodigoPostal());
		if(us.getProvincia()!=null)
			this.getProvinciaLabel().setText("Provincia: " + us.getProvincia());
		// gastos de envio
		this.getGastosEnvioLabel().setText("Tarifa fija: 4,99€");

		this.getPrecioTotalLabel().setText("");
	}

	public void asignarPrecioTotal() {

		precioTotal = 4.99;

		for (Producto producto : productos) {
			if (producto.getOferta().getPorcentaje() != 0) {
				Double a = producto.getOferta().getPorcentaje();
				Double precioConOferta = producto.getPrecio() - (producto.getPrecio() * a / 100);

				precioTotal += precioConOferta;
			} else {
				precioTotal += producto.getPrecio();
			}
		}

		this.getPrecioTotalLabel().setText(Double.toString(Math.round(precioTotal * 100.0) / 100.0) + " €");
	}

	public void irVerCuenta() {
		layoutPrincipal.removeAll();
		layoutPrincipal.add(new Ver_cuenta__Usuario_registrado_(usuario, layoutPrincipal));
	}

	public void irUsuarioRegistrado() {
		layoutPrincipal.removeAll();
		layoutPrincipal.add(new Usuario_registrado(usuario, layoutPrincipal));
	}
}