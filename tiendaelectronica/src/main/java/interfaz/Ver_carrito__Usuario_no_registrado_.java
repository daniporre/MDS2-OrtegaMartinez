package interfaz;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.VaadinSession;

import basededatosorm.Producto;
import basededatosorm.UsuarioRegistrado;

public class Ver_carrito__Usuario_no_registrado_ extends Ver_carrito {
//	private Button _tramitarPedido;
//	public Usuario_no_registrado _usuario_no_registrado;
//	public Tramitar_pedido__Usuario_no_registrado_ _tramitar_pedido__Usuario_no_registrado_;
	
	VerticalLayout layoutPrincipal;
	VaadinSession session = VaadinSession.getCurrent();

	public Ver_carrito__Usuario_no_registrado_(VerticalLayout layoutPrincipal) {
		this.getCarritoButton().setVisible(false);
		this.layoutPrincipal = layoutPrincipal;
		this.getMiCuentaButton().setVisible(false);
		this.getIniciarSesionButton().setVisible(true);
		// gastos de envio
		this.getGastosEnvioLabel().setText("Tarifa fija: 4,99€");

		ArrayList<Producto> productos = (ArrayList<Producto>) session.getAttribute("carrito");
		
		
		tramitarPedido();
		cargarProductosCarrito();
		
		
		this.getMetodoDePagoButton().setText("");
		this.getDireccionUsuarioButton().setText("");
		this.getCiudadLabel().setText("");
		this.getCpLabel().setText("");
		this.getProvinciaLabel().setText("");
		
		if(!productos.isEmpty()) {
			this.getTramitarPedidoButton().setEnabled(true);
		} else {
			this.getTramitarPedidoButton().setEnabled(false);
		}
		
		this.getContinuarComprandoButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				layoutPrincipal.removeAll();
				layoutPrincipal.add(new Usuario_no_registrado(layoutPrincipal));
			}
		});
		
		this.getIniciarSesionButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layoutPrincipal.removeAll();
				try {
					layoutPrincipal.add(new Iniciar_sesión(layoutPrincipal));
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});

		this.getInicioButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				layoutPrincipal.removeAll();
				layoutPrincipal.add(new Usuario_no_registrado(layoutPrincipal));

			}
		});
		actualizarButton();
	}
	
	
	
	public void cargarProductosCarrito() {
		if(!productos.isEmpty()) {
			this.getTramitarPedidoButton().setEnabled(true);
		} else {
			this.getTramitarPedidoButton().setEnabled(false);
		}
		if (productos != null) {
			for (Producto producto : productos) {
				Ver_producto_en_carrito vpc = new Ver_producto_en_carrito(producto);
							
				
				vpc.getAumentarButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						// TODO Auto-generated method stub
						System.out.println("prueba unr");
					}
				});
				
				
				productosCarritoLayout.add(vpc);
			}
		}
	}

	public void tramitarPedido() {
		
		this.getTramitarPedidoButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				if(productos!=null) {
					layoutPrincipal.removeAll();
					try {
						layoutPrincipal.add(new Iniciar_sesión(layoutPrincipal));
					} catch (PersistentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
			}
		});
		asignarPrecioTotal();
		
		
	}

}