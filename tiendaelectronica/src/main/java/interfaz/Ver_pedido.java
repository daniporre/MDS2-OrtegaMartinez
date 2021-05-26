package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatosorm.Entregado;
import basededatosorm.Enviado;
import basededatosorm.Pendiente;
import basededatosorm.UsuarioRegistrado;
import vistas.VistaMispedidos;

public class Ver_pedido extends VistaMispedidos {
	public Pedido _pedido;
	public Visualizar_pedido _visualizar_pedido;
	BDPrincipal bdp = new BDPrincipal();

	public Ver_pedido(UsuarioRegistrado usuario, Pendiente pedido, VerticalLayout principalLayout) {
		this.getEstadoLabel().setText("Pendiente");
		this.getFechaLabel().setText(pedido.getFechaEnvio());
		this.getReferenciaLabel().setText("Referencia: "+Integer.toString(pedido.getIdPedido()));
		this.getTotalLabel().setText(Double.toString(pedido.getTotalPagado()));
		
		this.getCancelarPedidoButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Notification notification = new Notification();
				notification.addThemeVariants(NotificationVariant.LUMO_CONTRAST);

				Span label = new Span("¿Estás seguro de que quieres cancelar el pedido?");


				Button botonEliminar = new Button("Cancelar pedido", e -> {
					
					bdp.cancelarPedido(pedido);
					getCancelarPedidoButton().setEnabled(false);
					getCancelarPedidoButton().setText("Pedido cancelado");
					getVerPedidoButton().setEnabled(false);
					notification.close();
				});
				botonEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

				notification.add(label, botonEliminar);

				label.getStyle().set("margin-right", "0.5rem");
				botonEliminar.getStyle().set("margin-left", "10rem");
				
				notification.setPosition(Position.MIDDLE);
				notification.open();
			}
		});
		this.getVerPedidoButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				principalLayout.removeAll();
				principalLayout.add(new Visualizar_pedido(usuario, pedido, principalLayout));
			}
		});
	}

	public Ver_pedido(UsuarioRegistrado usuario, Enviado pedido, VerticalLayout principalLayout) {
		this.getEstadoLabel().setText("Enviado");
		this.getFechaLabel().setText(pedido.getFechaEnvio());
		this.getReferenciaLabel().setText("Referencia: "+Integer.toString(pedido.getIdPedido()));
		this.getTotalLabel().setText(Double.toString(pedido.getTotalPagado()));
		this.getCancelarPedidoButton().setVisible(false);
		this.getVerPedidoButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				principalLayout.removeAll();
				principalLayout.add(new Visualizar_pedido(usuario, pedido, principalLayout));
			}
		});
	}

	public Ver_pedido(UsuarioRegistrado usuario, Entregado pedido, VerticalLayout principalLayout) {
		this.getEstadoLabel().setText("Entregado");
		this.getFechaLabel().setText(pedido.getFechaEnvio());
		this.getReferenciaLabel().setText("Referencia: "+Integer.toString(pedido.getIdPedido()));
		this.getTotalLabel().setText(Double.toString(pedido.getTotalPagado()));
		this.getCancelarPedidoButton().setVisible(false);
		this.getVerPedidoButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				principalLayout.removeAll();
				principalLayout.add(new Visualizar_pedido(usuario, pedido, principalLayout));
			}
		});
	}


}