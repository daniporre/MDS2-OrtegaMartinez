package interfaz;

//import basededatos.iUsuario_no_registrado;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaUsuarionoregistrado;
import vistas.VistaVercatalogo;

public class Usuario_no_registrado extends VistaUsuarionoregistrado {
	
	
	
	public Usuario_no_registrado() {
		
		
		this.getIniciarSesionUNR().addClickListener(new ComponentEventListener() {

			@Override
			public void onComponentEvent(ComponentEvent event) {
//				principalLayout.remove();
//				principalLayout.add(lg);
				Notification.show("He pulsado el boton");
				
			}
		
		
		
		});
		
	
	}

//	public Usuario_no_registrado() {
//		
////		 layout = this.getLayoutCibernauta().as(VerticalLayout.class);
////		 lg = new Login();
////		 
////		 this.getLogin().addClickListener(new ComponentEventListener() {
////			@Override
////			public void onComponentEvent(ComponentEvent event) {
////				 
////				layout.remove(ccbn);				
////				layout.add(lg);
////				
////			}
////		});
//		  
//		 
//	}
	
	
}