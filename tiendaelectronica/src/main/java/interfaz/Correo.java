package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatosorm.Usuario;
import basededatosorm.UsuarioRegistrado;
import vistas.VistaCorreogeneral;
import vistas.VistaMensajesenviados;

//import bassededatos.iCorreo;

public class Correo extends VistaMensajesenviados {
//	public Enviar_correo _correo;
//	public Tramitar_pedido__Usuario_Identificado_ _correo;
//	public iCorreo _iCorreo;
//	public Enviar_correo_de_confirmación _enviar_correo_de_confirmación;
	
	BDPrincipal bdp = new BDPrincipal();
	
	public Correo(UsuarioRegistrado usuario, basededatosorm.Correo correo, VerticalLayout principalLayout) {
		this.getAsuntoMensajeLabel().setText(correo.getAsunto());
		this.getCuerpoMensajeLabel().setText(correo.getMensaje());
		this.getFechaMensajeLabel().setText(correo.getFechaEnvio());
		pulsarMensaje(correo, usuario, principalLayout);
		
	}
	
	public Correo(Usuario administrador, basededatosorm.Correo correo, VerticalLayout principalLayout) {
		this.getAsuntoMensajeLabel().setText(correo.getAsunto());
		this.getCuerpoMensajeLabel().setText(correo.getMensaje());
		this.getFechaMensajeLabel().setText(correo.getFechaEnvio());
		pulsarMensaje(correo, administrador, principalLayout);
	}
	
	public void pulsarMensaje(basededatosorm.Correo correo,Usuario administrador, VerticalLayout principalLayout) {
		this.getVaadinHorizontalLayout().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {

			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				// TODO Auto-generated method stub
				System.out.println("mensaje pulsado desde admin: "+ correo.getAsunto());
				principalLayout.removeAll();
				principalLayout.add(new Responder_mensaje(correo.getUsuarioRegistrado(), administrador, correo, principalLayout));
				
				
			}
		});
	}
	
	public void pulsarMensaje(basededatosorm.Correo correo,UsuarioRegistrado usuario, VerticalLayout principalLayout) {
		this.getVaadinHorizontalLayout().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {

			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				// TODO Auto-generated method stub
				System.out.println("mensaje pulsado: "+ correo.getAsunto());
				
				
				if(correo.getRemitente().equals("administrador")) {
					principalLayout.removeAll();
					principalLayout.add(new Responder_mensaje(correo.getUsuarioRegistrado(), null, correo, principalLayout));
				} else {
					principalLayout.removeAll();
					principalLayout.add(new Ver_mensaje_enviado(correo, usuario, principalLayout));
				}
				
			}
		});
	}
	

	
}