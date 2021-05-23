package interfaz;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatosorm.Usuario;
import basededatosorm.UsuarioRegistrado;
import vistas.VistaRespondermensaje;

public class Responder_mensaje extends VistaRespondermensaje {
	public Ver_mensaje_recibido _ver_mensaje_recibido;
	BDPrincipal bdp = new BDPrincipal();

	
	public Responder_mensaje(UsuarioRegistrado usuario, Usuario administrador, basededatosorm.Correo correo, VerticalLayout principalLayout) {
		this.getAsuntoTF().setValue(correo.getAsunto());
		this.getMailUsuarioTF().setValue(usuario.getMail());
		this.getMensajeTF().setValue(correo.getMensaje());
		
		this.getAceptarButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				
				if(administrador==null) {
					principalLayout.removeAll();
					principalLayout.add(new Correo__General_(usuario, principalLayout));
				} else {
					principalLayout.removeAll();
					principalLayout.add(new Correo__General_(administrador, principalLayout));
				}
				
			}
		});
		
		this.getResponderMensajeButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				Calendar c2 = new GregorianCalendar();
				String dia = Integer.toString(c2.get(Calendar.DATE));
				String mes = Integer.toString(c2.get(Calendar.MONTH));
				String anio = Integer.toString(c2.get(Calendar.YEAR));
				String fecha = dia+"/"+mes+"/"+anio;
				
				if(administrador==null) {
					if (!getMensajeTF().getValue().isEmpty()) {
						bdp.responderMensaje(correo, "Re:"+getAsuntoTF().getValue(), getMensajeTF().getValue(), usuario.getMail(), "administrador", fecha);
						principalLayout.removeAll();
						principalLayout.add(new Correo__General_(usuario, principalLayout));
					}
				} else {
					if (!getMensajeTF().getValue().isEmpty()) {
						bdp.responderMensaje(correo, "Re:"+getAsuntoTF().getValue(), getMensajeTF().getValue(), "administrador", usuario.getMail(), fecha);
						principalLayout.removeAll();
						principalLayout.add(new Correo__General_(administrador, principalLayout));
					}
				}
				
				
				
			}
		});
		
	}
	
	
	
	
	
}