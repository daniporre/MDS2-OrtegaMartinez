package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatosorm.Entregado;
import basededatosorm.Enviado;
import basededatosorm.Pendiente;
import basededatosorm.Producto;
import basededatosorm.UsuarioRegistrado;
import basededatosorm.Valoracion;
import vistas.VistaVisualizarpedido;

public class Visualizar_pedido extends VistaVisualizarpedido {

	String[] combo = { "1", "2", "3", "4", "5" };
	public BDPrincipal bdp = new BDPrincipal();

	public Visualizar_pedido(UsuarioRegistrado usuario, Pendiente pedido, VerticalLayout principalLayout) {
		this.getValoracionCombo().setItems(combo);
		this.getLabel().setText(pedido.getFechaEnvio());
		this.getLabel1().setText(pedido.getUsuarioRegistrado().getMail());
		this.getLabel2().setText(Integer.toString(pedido.getIdPedido()));
		
		atras(usuario, principalLayout);
		verCuenta(usuario, principalLayout);
		carrito(usuario, principalLayout);
		
		this.getValorarProductoButton().setVisible(false);
		this.getDescripcionTextArea().setVisible(false);
		this.getValoracionCombo().setVisible(false);
		this.getDalePuntuacionLabel().setVisible(false);
		
		for (int i = 0; i < pedido.items.toArray().length; i++) {
			String nombre = pedido.items.toArray()[i].getProducto().getNombre();
			String precio = Double.toString(pedido.items.toArray()[i].getProducto().getPrecio());
			this.getNombreProductoPedido().setText(nombre);
			this.getPrecioPedidoLabel().setText(precio);

		}

	}

	public Visualizar_pedido(UsuarioRegistrado usuario, Enviado pedido, VerticalLayout principalLayout) {
		this.getValoracionCombo().setItems(combo);
		this.getLabel().setText(pedido.getFechaEnvio());
		this.getLabel1().setText(pedido.getUsuarioRegistrado().getMail());
		this.getLabel2().setText(Integer.toString(pedido.getIdPedido()));
		this.getValorarProductoButton().setVisible(false);
		this.getDescripcionTextArea().setVisible(false);
		this.getValoracionCombo().setVisible(false);
		this.getDalePuntuacionLabel().setVisible(false);
		
		atras(usuario, principalLayout);
		verCuenta(usuario, principalLayout);
		carrito(usuario, principalLayout);
		
		for (int i = 0; i < pedido.items.toArray().length; i++) {
			String nombre = pedido.items.toArray()[i].getProducto().getNombre();
			String precio = Double.toString(pedido.items.toArray()[i].getProducto().getPrecio());
			this.getNombreProductoPedido().setText(nombre);
			this.getPrecioPedidoLabel().setText(precio);
		}
		
	}

	public Visualizar_pedido(UsuarioRegistrado usuario, Entregado pedido, VerticalLayout principalLayout) {
		this.getValoracionCombo().setItems(combo);
		this.getLabel().setText(pedido.getFechaEnvio());
		this.getLabel1().setText(pedido.getUsuarioRegistrado().getMail());
		this.getLabel2().setText(Integer.toString(pedido.getIdPedido()));
		atras(usuario, principalLayout);
		verCuenta(usuario, principalLayout);
		carrito(usuario, principalLayout);
		for (int i = 0; i < pedido.items.toArray().length; i++) {
			String nombre = pedido.items.toArray()[i].getProducto().getNombre();
			String precio = Double.toString(pedido.items.toArray()[i].getProducto().getPrecio());
			this.getNombreProductoPedido().setText(nombre);
			this.getPrecioPedidoLabel().setText(precio);
			valorarProducto(pedido.items.toArray()[i].getProducto(), usuario);
		}
		
	}
	
	public void atras(UsuarioRegistrado usuario, VerticalLayout principalLayout) {
		this.getInicioButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				principalLayout.removeAll();
				principalLayout.add(new Usuario_registrado(usuario, principalLayout));
			}
		});

	}

	public void carrito(UsuarioRegistrado usuario, VerticalLayout principalLayout) {
		this.getCarritoButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				principalLayout.removeAll();
				principalLayout.add(new Ver_carrito(usuario, principalLayout));
			}
		});
	}

	public void verCuenta(UsuarioRegistrado usuario, VerticalLayout principalLayout) {
		this.getMiCuentaButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				principalLayout.removeAll();
				principalLayout.add(new Ver_cuenta__Usuario_registrado_(usuario, principalLayout));
			}
		});
	}

	public void valorarProducto(Producto producto, UsuarioRegistrado usuario) {

		this.getValorarProductoButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if (!getDescripcionTextArea().isEmpty() && !getValoracionCombo().isEmpty()) {

					String comentario = getDescripcionTextArea().getValue();
					String valor = getValoracionCombo().getValue();

					basededatosorm.Valoracion valoracion = new Valoracion();
					valoracion.setComentario(comentario);
					valoracion.setUsuarioRegistrado(usuario);
					valoracion.setValor(Integer.parseInt(getValoracionCombo().getValue()));

					bdp.valorarProducto(producto, valoracion);
					Notification.show("Valoración enviada").setPosition(Position.BOTTOM_END);

				}
			}
		});

	}

}