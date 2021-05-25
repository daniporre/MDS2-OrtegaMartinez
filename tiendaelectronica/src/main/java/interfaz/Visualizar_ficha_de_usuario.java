package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatosorm.UsuarioRegistrado;
import vistas.VistaVerfichadeusuario;

public class Visualizar_ficha_de_usuario extends VistaVerfichadeusuario {

	
	public Visualizar_ficha_de_usuario(UsuarioRegistrado usuarioRegistrado, VerticalLayout principalLayout) {
		this.getCalleUsuarioLabel().setText(usuarioRegistrado.getDireccionUsuario());
		this.getCodigoPostalUsuarioLabel().setText(usuarioRegistrado.getCodigoPostal());
		this.getCuidadUsuarioLabel().setText(usuarioRegistrado.getCiudad());
		this.getNombreUsuarioLabel().setText(usuarioRegistrado.getMail());
		this.getProvinciaUsuarioLabel().setText(usuarioRegistrado.getProvincia());
		
		this.getAtrasButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Empresa_de_transportes et = new Empresa_de_transportes(usuarioRegistrado, principalLayout);
				principalLayout.removeAll();
				principalLayout.add(et);
			}
		});
	}
	
}