package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatosorm.UsuarioRegistrado;
import vistas.VistaVermensajeenviado;

public class Ver_mensaje_enviado extends VistaVermensajeenviado {
//	private Label _mensajeEnviadoTitulo;
//	private Label _asunto;
//	private Label _asuntoL;
//	private Label _mensajeL;
//	private TextView _mensajeTV;
//	private Button _aceptar;
//	public Mensajes_enviados _mensajes_enviados;
//

	public Ver_mensaje_enviado(basededatosorm.Correo correo, UsuarioRegistrado usuario,
			VerticalLayout principalLayout) {
		this.getAsuntoTF().setValue(correo.getAsunto());
		this.getMensajeTF().setValue(correo.getMensaje());
		aceptar(usuario, principalLayout);
	}

	public void aceptar(UsuarioRegistrado usuario, VerticalLayout principalLayout) {

		

		this.getAceptarButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				principalLayout.removeAll();
				principalLayout.add(new Correo__General_(usuario, principalLayout));
			}
		});
	}
}