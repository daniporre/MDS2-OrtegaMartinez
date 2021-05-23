package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatosorm.Usuario;
import basededatosorm.UsuarioRegistrado;
import vistas.VistaCorreogeneral;

@SuppressWarnings("serial")
public class Correo__General_ extends VistaCorreogeneral {
//	private Button _mensajesRecibidos;
//	private Button _mensajesEnviados;
//	public Mensajes_enviados _mensajes_enviados;
//	public Mensajes_recibidos _mensajes_recibidos;
//
//	public void mostrarMensajesEnviados() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void mostrarMensajesRecibidos() {
//		throw new UnsupportedOperationException();
//	}
	BDPrincipal bdp = new BDPrincipal();
	VerticalLayout v = this.getTablaMensajesVLayout().as(VerticalLayout.class);
	basededatosorm.Correo[] todosLosMensajes;
	UsuarioRegistrado usuarioRegistrado;

	public Correo__General_(UsuarioRegistrado usuario, VerticalLayout layoutPrincipal) {

		this.usuarioRegistrado = usuario;
		this.getNuevoCorreoButton().setVisible(true);
		this.getPestañaEnviados().setVisible(true);
		this.getPestañaRecibidos().setVisible(true);
		inicioUR(usuario, layoutPrincipal);
		nuevoCorreo(usuario, layoutPrincipal);
		mostrarMensajesEnviadosPrimero(usuario, layoutPrincipal);

		this.getPestañaEnviados().getElement().addEventListener("click", event -> {
			System.out.println("pestaña enviados pulsada");
			v.removeAll();
			mostrarMensajesEnviados(usuario, layoutPrincipal);
		});

		this.getPestañaRecibidos().getElement().addEventListener("click", event -> {
			System.out.println("pestaña recibidos pulsada");
			v.removeAll();
			mostrarMensajesRecibidos(usuario, layoutPrincipal);
		});

	}

	public Correo__General_(Usuario usuario, VerticalLayout layoutPrincipal) {
		todosLosMensajes = bdp.obtenerTodosMensajes();
		inicioAdmin(usuario, layoutPrincipal);
		this.getPestañaEnviados().setLabel("Mensajes");
		this.getPestañaRecibidos().setVisible(false);
		this.getNuevoCorreoButton().setVisible(false);
		v.removeAll();
		recargarMensajesAdmin(usuario, layoutPrincipal);

	}

	public void recargarMensajesAdmin(Usuario usuario, VerticalLayout layoutPrincipal) {
		System.out.println("Recargado");
		for (basededatosorm.Correo c : todosLosMensajes) {
			v.add(new Correo(usuario, c, layoutPrincipal));
		}
	}

	public void mostrarMensajesRecibidos(UsuarioRegistrado usuario, VerticalLayout layoutPrincipal) {

		basededatos.iUsuario_registrado ur = new BDPrincipal();

		basededatosorm.Correo[] mensajesRecibidos;
		mensajesRecibidos = ur.obtenerMensajesRecibidos(usuarioRegistrado);
		for (basededatosorm.Correo c : mensajesRecibidos) {

			v.add(new Correo(usuario, c, layoutPrincipal));
		}
	}

	public void mostrarMensajesEnviados(UsuarioRegistrado usuario, VerticalLayout layoutPrincipal) {

		basededatos.iUsuario_registrado ur = new BDPrincipal();
		basededatosorm.Correo[] mensajesEnviados;
		mensajesEnviados = ur.obtenerMensajesEnviados(usuarioRegistrado);
		for (basededatosorm.Correo c : mensajesEnviados) {
			v.add(new Correo(usuario, c, layoutPrincipal));
		}
	}

	public void mostrarMensajesEnviadosPrimero(UsuarioRegistrado usuario, VerticalLayout layoutPrincipal) {

		basededatos.iUsuario_registrado ur = new BDPrincipal();
		basededatosorm.Correo[] mensajesEnviados;
		mensajesEnviados = ur.obtenerMensajesEnviados(usuarioRegistrado);
		for (basededatosorm.Correo c : mensajesEnviados) {
			v.add(new Correo(usuario, c, layoutPrincipal));
		}
	}

	public void nuevoCorreo(UsuarioRegistrado usuario, VerticalLayout layoutPrincipal) {
		this.getNuevoCorreoButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				Crear_mensaje cm = new Crear_mensaje(usuario, layoutPrincipal);

				layoutPrincipal.removeAll();
				layoutPrincipal.add(cm);

			}
		});
	}

	public void inicioAdmin(Usuario usuario, VerticalLayout layoutPrincipal) {

		this.getInicioButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layoutPrincipal.removeAll();
				layoutPrincipal.add(new Administrador(usuario, layoutPrincipal));
			}
		});

	}

	public void inicioUR(UsuarioRegistrado usuario, VerticalLayout layoutPrincipal) {

		this.getInicioButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layoutPrincipal.removeAll();
				layoutPrincipal.add(new Usuario_registrado(usuario, layoutPrincipal));
			}
		});

	}
}