package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatosorm.Producto;
import basededatosorm.Usuario;
import basededatosorm.UsuarioRegistrado;
import vistas.VistaVercompra;

public class Ver_compra extends VistaVercompra {

	public Ver_compra(Producto producto, Usuario usuario, UsuarioRegistrado usuarioRegistrado,
			basededatosorm.Pendiente pedido) {

		BDPrincipal bdp = new BDPrincipal();
		rellenarDatos(producto, usuarioRegistrado, pedido);

		if (usuario.getMail().contains("encargado")) {
			this.getEnviarPedidoButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

				@Override
				public void onComponentEvent(ClickEvent<Button> event) {
					bdp.crearEnviado(usuarioRegistrado, producto, pedido);
					getEnviarPedidoButton().setEnabled(false);
					Notification.show("Pedido enviado, actualiza la lista de los pedidos")
							.setPosition(Position.BOTTOM_END);
				}
			});
		}

	}

	public Ver_compra(Producto producto, Usuario usuario, UsuarioRegistrado usuarioRegistrado,
			basededatosorm.Enviado pedido, VerticalLayout principalLayout) {

		BDPrincipal bdp = new BDPrincipal();
		rellenarDatos(producto, usuarioRegistrado, pedido);
		this.getEstadoPedidoLabel().setText("Enviado");

		if (usuario.getMail().contains("transporte")) {
			this.getRecibidoButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

				@Override
				public void onComponentEvent(ClickEvent<Button> event) {
					System.out.println("Boton recibido pulsado");
					bdp.crearEntregado(usuarioRegistrado, producto, pedido);
					getRecibidoButton().setEnabled(false);
				}
			});
		}

		this.getVerFichaUsuarioButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Visualizar_ficha_de_usuario vf = new Visualizar_ficha_de_usuario(usuarioRegistrado, principalLayout);
				principalLayout.removeAll();
				principalLayout.add(vf);

			}
		});

	}

	public Ver_compra(Producto producto, UsuarioRegistrado usuarioRegistrado, basededatosorm.Pedido pedido,VerticalLayout principalLayout) {

		BDPrincipal bdp = new BDPrincipal();
		rellenarDatos(producto, usuarioRegistrado, pedido);
		this.getEstadoPedidoLabel().setText("Entregado");

		


	}

	public void rellenarDatos(Producto producto, UsuarioRegistrado usuarioRegistrado, basededatosorm.Pedido pedido) {
		this.getNombreProductoLabel().setText(producto.getNombre());
		this.getFechaPedidoLabel().setText(pedido.getFechaEnvio());
		this.getEnviadoALabel().setText(usuarioRegistrado.getMail());
		this.getPrecioPedidoLabel().setText(Double.toString(pedido.getTotalPagado()));
		this.getNumeroPedidoLabel().setText(Integer.toString(pedido.getIdPedido()));
	}

}