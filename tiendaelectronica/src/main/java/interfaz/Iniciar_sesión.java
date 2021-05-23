package interfaz;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.persistence.PersistenceException;

import org.orm.PersistentException;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.login.AbstractLogin;
import com.vaadin.flow.component.login.AbstractLogin.ForgotPasswordEvent;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatosorm.Usuario;
import basededatosorm.UsuarioRegistrado;
import vistas.VistaIniciarsesion;

public class Iniciar_sesión extends VistaIniciarsesion {

	public BDPrincipal bdp;
	public String mail;
	public String contraseña;
	public Usuario us = new Usuario();
	public static Usuario usuario;

	public Iniciar_sesión(VerticalLayout principalLayout) throws PersistentException {
		super();

		iniciarSesion(principalLayout);
		crearCuenta();

	}
	
	

	public void iniciarSesion(VerticalLayout principalLayout) {
		this.getLogIn().addLoginListener(e -> {
			bdp = new BDPrincipal();

//			us = bdp.recuperarContrasenia(e.getUsername());
//			System.out.println(us.getMail()+"****");
//			enviarConGMail(us.getMail(), "Tu contraseña de tiendaVirtual", us.getContraseña());

			UI.getCurrent().getPage().setTitle("Iniciar sesion");

			if (e.getUsername().contains("administrador")) {

				us = bdp.iniciarSesion(e.getUsername(), e.getPassword());
				usuario = us;
				System.out.println(us.getMail());

				if (us.getMail() != null) {
					Administrador ad = new Administrador(us, principalLayout);

					principalLayout.removeAll();
					principalLayout.add(ad);
				}

			} else if (e.getUsername().contains("transporte")) {

				us = bdp.iniciarSesion(e.getUsername(), e.getPassword());
				usuario = us;
				System.out.println(us.getMail());

				if (us.getMail() != null) {
					Empresa_de_transportes et = new Empresa_de_transportes(principalLayout);

					principalLayout.removeAll();
					principalLayout.add(et);
				}

			} else if (e.getUsername().contains("encargado")) {

				us = bdp.iniciarSesion(e.getUsername(), e.getPassword());
				usuario = us;
				System.out.println(us.getMail());

				if (us.getMail() != null) {
					Encargado_de_compras et = new Encargado_de_compras(principalLayout);

					principalLayout.removeAll();
					principalLayout.add(et);
				}

			} else if (!e.getUsername().contains("encargado") && !e.getUsername().contains("transporte")
					&& !e.getUsername().contains("administrador")) {

				UsuarioRegistrado usre = bdp.iniciarSesionUR(e.getUsername(), e.getPassword());
				usuario = usre;
				System.out.println(usre.getMail()+" ha iniciado sesion");

				if (usre.getMail() != null && usre.getEstaOperativo()==true) {
					Usuario_registrado et = new Usuario_registrado(usre, principalLayout);

					principalLayout.removeAll();
					principalLayout.add(et);
				} else {
					Notification.show("El usuario no existe o se ha dado de baja");
				}
			} else {
				Notification.show("El usuario no existe o se ha dado de baja");
			}

		});

//		this.getLogIn().addForgotPasswordListener(new ComponentEventListener<AbstractLogin.ForgotPasswordEvent>() {
//
//			@Override
//			public void onComponentEvent(ForgotPasswordEvent event) {
//				
//				System.out.println("hello");
//				
//				if (!) {
//					bdp = new BDPrincipal();
//					
//					us = bdp.recuperarContrasenia(e.getUsername());
//					System.out.println(us.getMail()+"****");
//					enviarConGMail(us.getMail(), "Tu contraseña de tiendaVirtual", us.getContraseña());
//
//					
//				} else {
//					Notification.show("Introduce un correo del que quieras recuperar la contraseña");
//				}
//
//			}
//		});
	}
	

	public static Usuario usuarioActivo() {
		return usuario;
	}

	@SuppressWarnings("serial")
	public void crearCuenta() {
		this.getCrearNuevaCuentaButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				bdp = new BDPrincipal();
				
				if (!getMailNuevaCuentaTF().getValue().isEmpty()
						&& !getContraseñaNuevaCuentaTF().getValue().isEmpty() && getMailNuevaCuentaTF().getValue().contains("")) {

					try {
						bdp = new BDPrincipal();

						bdp.crearCuenta(getMailNuevaCuentaTF().getValue(), getContraseñaNuevaCuentaTF().getValue());

					} catch (PersistenceException e) {
						e.printStackTrace();
					}

				} else {
					Notification.show("Introduce un mail y una contraseña para crear una cuenta.").setPosition(Position.MIDDLE);;
				}
			}
		});
	}

//	private static void enviarConGMail(String destinatario, String asunto, String cuerpo) {
//		// Esto es lo que va delante de @gmail.com en tu cuenta de correo. Es el
//		// remitente también.
//		String remitente = "daniporre"; // Para la dirección nomcuenta@gmail.com
//		String clave = "20071997Dani";
//
//		Properties props = System.getProperties();
//		props.put("mail.smtp.host", "smtp.gmail.com"); // El servidor SMTP de Google
//		props.put("mail.smtp.user", remitente);
//		props.put("mail.smtp.clave", clave); // La clave de la cuenta
//		props.put("mail.smtp.auth", "true"); // Usar autenticación mediante usuario y clave
//		props.put("mail.smtp.starttls.enable", "true"); // Para conectar de manera segura al servidor SMTP
//		props.put("mail.smtp.port", "587"); // El puerto SMTP seguro de Google
//
//		Session session = Session.getDefaultInstance(props);
//		MimeMessage message = new MimeMessage(session);
//
//		try {
//			message.setFrom(new InternetAddress(remitente));
//			message.addRecipients(Message.RecipientType.TO, destinatario); // Se podrían añadir varios de la misma
//																			// manera
//			message.setSubject(asunto);
//			message.setText(cuerpo);
//			Transport transport = session.getTransport("smtp");
//			transport.connect("smtp.gmail.com", remitente, clave);
//			transport.sendMessage(message, message.getAllRecipients());
//			transport.close();
//		} catch (MessagingException me) {
//			me.printStackTrace(); // Si se produce un error
//		}
//	}

}
