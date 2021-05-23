package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import basededatos.BDPrincipal;
import basededatosorm.Usuario;
import basededatosorm.UsuarioRegistrado;
import vistas.VistaCrearmensaje;

@SuppressWarnings("serial")
public class Crear_mensaje extends VistaCrearmensaje {
//	private event _enviar_mensaje;
//	private Label _nuevoMensajeTitulo;
//	private Label _asuntoL;
//	private TexField _asuntoTF;
//	private Label _mensajeL;
//	private TextView _mensajeTV;
//	private Button _cancelar;
//	private Button _enviarMensaje;
//	public Correo__Usuario_registrado_ _correo__Usuario_registrado_;
	public BDPrincipal bdp = new BDPrincipal();


	public Crear_mensaje(UsuarioRegistrado usuario, VerticalLayout layoutPrincipal) {
		cancelarButton(usuario, layoutPrincipal);
		System.out.println("crear mensaje usuario registrado");
		enviarMensajeUser(usuario, layoutPrincipal);

	}

	public Crear_mensaje(Usuario administrador, VerticalLayout layoutPrincipal) {
		System.out.println("crear mensaje admin");
		cancelarAdmin(administrador, layoutPrincipal);
	}

	public void enviarMensajeUser(UsuarioRegistrado usuario, VerticalLayout layoutPrincipal) {
		
		
		
		this.getEnviarMensajeButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				String asunto = getAsuntoTF().getValue();
				String mensaje = getMensajeTF().getValue();
				String remitente = usuario.getMail();
				String destinatario = "administrador";
				
				Calendar c2 = new GregorianCalendar();
				
				String dia = Integer.toString(c2.get(Calendar.DATE));
				String mes = Integer.toString(c2.get(Calendar.MONTH));
				String anio = Integer.toString(c2.get(Calendar.YEAR));
				String fecha = dia+"/"+mes+"/"+anio;
				
				bdp.crearMensaje(usuario, asunto, mensaje, remitente, destinatario, fecha);
				cancelar(usuario, layoutPrincipal);
			}
		});
		
		
		
	
		
	}

	public void cancelarButton(UsuarioRegistrado usuario, VerticalLayout layoutPrincipal) {

		this.getCancelarButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				cancelar(usuario, layoutPrincipal);
			}
		});

	}
	
	public void cancelar(UsuarioRegistrado usuario, VerticalLayout layoutPrincipal) {
		layoutPrincipal.removeAll();
		layoutPrincipal.add(new Correo__General_(usuario, layoutPrincipal));
	}

	public void cancelarAdmin(Usuario usuario, VerticalLayout layoutPrincipal) {

		this.getCancelarButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layoutPrincipal.removeAll();
				layoutPrincipal.add(new Correo__General_(usuario, layoutPrincipal));
			}
		});

	}
}