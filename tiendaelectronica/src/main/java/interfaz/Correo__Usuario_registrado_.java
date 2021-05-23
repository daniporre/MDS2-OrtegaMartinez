package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatosorm.UsuarioRegistrado;

public class Correo__Usuario_registrado_ extends Correo__General_ {
	public Correo__Usuario_registrado_(UsuarioRegistrado usuario, VerticalLayout layoutPrincipal) {
		super(usuario, layoutPrincipal);
		// TODO Auto-generated constructor stub
	}
	public Ver_cuenta__Usuario_registrado_ _ver_cuenta__Usuario_registrado_;
	public Crear_mensaje _crear_mensaje;
}