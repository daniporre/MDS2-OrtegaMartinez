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
	public static Usuario usuarioActivo;
	
	public Usuario_registrado() {
		usuarioActivo = Iniciar_sesión.usuarioActivo();
		vc = new Ver_catálogo();
		layoutCatalogo = this.getPrincipalVLayout().as(VerticalLayout.class);
		layoutCatalogo.add(vc);
		System.out.println(usuarioActivo.getMail()+" usuario");
		miCuenta();
		
	}
	
	public void miCuenta() {
		this.getMiCuentaURButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Ver_cuenta__Usuario_registrado_ v = new Ver_cuenta__Usuario_registrado_();
				
				layoutPrincipal.removeAll();
				layoutPrincipal.add(v);
				
			}
		});
	}
	
	public static Usuario getUsuarioActivo() {
		return usuarioActivo;
	}
	
}