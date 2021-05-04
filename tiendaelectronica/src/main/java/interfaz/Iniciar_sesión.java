package interfaz;

import javax.persistence.PersistenceException;

import org.orm.PersistentException;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.login.AbstractLogin;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import vistas.VistaIniciarsesion;

public class Iniciar_sesión extends VistaIniciarsesion {
	
	public BDPrincipal bdp;
	public String mail;
	public String contraseña;
	public VerticalLayout layoutPrincipal;

	public Iniciar_sesión() throws PersistentException {
		super();
		
		layoutPrincipal = this.getVaadinVerticalLayout().as(VerticalLayout.class);

		this.getCrearNuevaCuentaButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				if (!getMailNuevaCuentaTF().getValue().isEmpty() && !getContraseñaNuevaCuentaTF().getValue().isEmpty()) {
					
					
					try {
						bdp = new BDPrincipal();
						bdp.crearUsuario(getMailNuevaCuentaTF().getValue(), getContraseñaNuevaCuentaTF().getValue());
						
						
						Notification.show("Nueva cuenta creada:\nMail: "+getMailNuevaCuentaTF().getValue() + "\nContraseña: " + getContraseñaNuevaCuentaTF().getValue());
					} catch (PersistenceException e) {
						e.printStackTrace();
					}
					
					
				
				} else {
					Notification.show("Introduce un mail y una contraseña para crear una cuenta.");
				}
			}
		});
		
		this.getLogIn().addLoginListener(e -> {
			
			bdp = new BDPrincipal();
			
			
			if (e.getUsername().contains("a") && e.getPassword().equals("a")) {
				
				Administrador ad = new Administrador();
				
				layoutPrincipal.removeAll();
				layoutPrincipal.add(ad);
				
			}
			
			
			
		});

	}

	public void recuperarContraseña() {

	}

	public void iniciarSesion() {

	}
	

}
