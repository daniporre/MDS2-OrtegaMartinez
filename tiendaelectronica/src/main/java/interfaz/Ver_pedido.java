package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;

import basededatosorm.Entregado;
import basededatosorm.Enviado;
import basededatosorm.Pendiente;
import vistas.VistaMispedidos;

public class Ver_pedido extends VistaMispedidos {
	public Pedido _pedido;
	public Visualizar_pedido _visualizar_pedido;

	public Ver_pedido(Pendiente pedido) {
		this.getEstadoLabel().setText("Pendiente");
		this.getFechaLabel().setText(pedido.getFechaEnvio());
		this.getReferenciaLabel().setText(Integer.toString(pedido.getIdPedido()));
		this.getTotalLabel().setText(Double.toString(pedido.getTotalPagado()));
		
		visualizarPedido();
		this.getCancelarPedidoButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	public Ver_pedido(Enviado pedido) {
		this.getEstadoLabel().setText("Enviado");
		this.getFechaLabel().setText(pedido.getFechaEnvio());
		this.getReferenciaLabel().setText(Integer.toString(pedido.getIdPedido()));
		this.getTotalLabel().setText(Double.toString(pedido.getTotalPagado()));
		this.getCancelarPedidoButton().setVisible(false);
	}

	public Ver_pedido(Entregado pedido) {
		this.getEstadoLabel().setText("Entregado");
		this.getFechaLabel().setText(pedido.getFechaEnvio());
		this.getReferenciaLabel().setText(Integer.toString(pedido.getIdPedido()));
		this.getTotalLabel().setText(Double.toString(pedido.getTotalPagado()));
		this.getCancelarPedidoButton().setVisible(false);
	}

	public void visualizarPedido() {
		this.getVerPedidoButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub

			}
		});
	}

}