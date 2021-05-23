package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatosorm.UsuarioRegistrado;

public class Ver_carrito__Usuario_no_registrado_ extends Ver_carrito {
//	private Button _tramitarPedido;
//	public Usuario_no_registrado _usuario_no_registrado;
//	public Tramitar_pedido__Usuario_no_registrado_ _tramitar_pedido__Usuario_no_registrado_;

	public Ver_carrito__Usuario_no_registrado_(VerticalLayout layoutPrincipal) {
		this.getInicioButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				layoutPrincipal.removeAll();
				layoutPrincipal.add(new Usuario_no_registrado());
				
			}
		});
	}
	
	
	public boolean tramitarPedido() {
		throw new UnsupportedOperationException();
	}
	
	
	
	
}