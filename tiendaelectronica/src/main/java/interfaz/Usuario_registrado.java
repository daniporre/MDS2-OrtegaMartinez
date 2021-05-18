package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatosorm.Usuario;
import basededatosorm.UsuarioRegistrado;
import vistas.VistaUsuarioregistrado;
import vistas.VistaVercatalogo;

//import basededatos.iUsuario_registrado;

public class Usuario_registrado extends VistaUsuarioregistrado {

	public VerticalLayout layoutPrincipal = this.getVaadinVerticalLayout().as(VerticalLayout.class);
	public VistaVercatalogo vc;
	public VerticalLayout layoutCatalogo;
	
	public Usuario_registrado(UsuarioRegistrado usuario) {
		vc = new Ver_catálogo(usuario, layoutPrincipal);
		layoutCatalogo = this.getPrincipalVLayout().as(VerticalLayout.class);
		layoutCatalogo.add(vc);
		miCuenta(usuario);
		
	}
	
	public void miCuenta(UsuarioRegistrado usuario) {
		this.getMiCuentaURButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Ver_cuenta__Usuario_registrado_ v = new Ver_cuenta__Usuario_registrado_(usuario);
				
				layoutPrincipal.removeAll();
				layoutPrincipal.add(v);
				
			}
		});
	}
	
	
	
}