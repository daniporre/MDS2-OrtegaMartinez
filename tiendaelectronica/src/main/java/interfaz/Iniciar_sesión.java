package interfaz;

import javax.persistence.PersistenceException;

import org.orm.PersistentException;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.login.AbstractLogin;
import com.vaadin.flow.component.login.AbstractLogin.ForgotPasswordEvent;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatosorm.Usuario;
import vistas.VistaIniciarsesion;

public class Iniciar_sesión extends VistaIniciarsesion {

	public BDPrincipal bdp;
	public String mail;
	public String contraseña;
	public VerticalLayout layoutPrincipal;

	public Iniciar_sesión() throws PersistentException {
		super();

		layoutPrincipal = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		iniciarSesion();
		crearCuenta();

	}

	public void iniciarSesion() {
		this.getLogIn().addLoginListener(e -> {

			bdp = new BDPrincipal();

			if (e.getUsername().contains("administrador")) {

				Usuario us = new Usuario();

				us = bdp.iniciarSesion(e.getUsername(), e.getPassword());

				System.out.println(us.getMail());

				if (us.getMail() != null) {
					Administrador ad = new Administrador();

					layoutPrincipal.removeAll();
					layoutPrincipal.add(ad);
				}

			}

			if (e.getUsername().contains("transporte")) {

				Usuario us = new Usuario();

				us = bdp.iniciarSesion(e.getUsername(), e.getPassword());

				System.out.println(us.getMail());

				if (us.getMail() != null) {
					Empresa_de_transportes et = new Empresa_de_transportes();

					layoutPrincipal.removeAll();
					layoutPrincipal.add(et);
				}

			}
			if (e.getUsername().contains("encargado")) {

				Usuario us = new Usuario();

				us = bdp.iniciarSesion(e.getUsername(), e.getPassword());

				System.out.println(us.getMail());

				if (us.getMail() != null) {
					Encargado_de_compras et = new Encargado_de_compras();

					layoutPrincipal.removeAll();
					layoutPrincipal.add(et);
				}

			}

			this.getLogIn().addForgotPasswordListener(new ComponentEventListener<AbstractLogin.ForgotPasswordEvent>() {

				@Override
				public void onComponentEvent(ForgotPasswordEvent event) {

					if (!e.getUsername().isEmpty()) {
						// enviar por correo la contraseña
					} else {
						Notification.show("Introduce un correo del que quieras recuperar la contraseña");
					}

				}
			});

		});
	}

	@SuppressWarnings("serial")
	public void crearCuenta() {
		this.getCrearNuevaCuentaButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				if (!getMailNuevaCuentaTF().getValue().isEmpty()
						&& !getContraseñaNuevaCuentaTF().getValue().isEmpty()) {

					try {
						bdp = new BDPrincipal();

						bdp.crearCuenta(getMailNuevaCuentaTF().getValue(), getContraseñaNuevaCuentaTF().getValue());

					} catch (PersistenceException e) {
						e.printStackTrace();
					}

				} else {
					Notification.show("Introduce un mail y una contraseña para crear una cuenta.");
				}
			}
		});
	}

}
