package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

import basededatos.BDPrincipal;
import basededatosorm.Usuario;
import vistas.VistaVercuentausuarioregistrado;
import interfaz.Usuario_no_registrado;

public class Ver_cuenta__Usuario_registrado_ extends VistaVercuentausuarioregistrado {
	public static Usuario usuarioActivo;
	
	public VerticalLayout layoutPrincipal = this.getVaadinVerticalLayout1().as(VerticalLayout.class);

	public Ver_cuenta__Usuario_registrado_() {
		
		BDPrincipal bdp = new BDPrincipal();
		
		
		usuarioActivo = Iniciar_sesión.usuarioActivo();
		System.out.println(usuarioActivo);
		Cerrar_sesión();
		mostrarCorreo();
		inicio();
//		System.out.println(usuarioActivo.getMail()+" usuario");
		
	}
	
	public void Cerrar_sesión() {
		this.getLogoutButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Usuario_no_registrado a = new Usuario_no_registrado();
				layoutPrincipal.removeAll();
				layoutPrincipal.add(a);
				
			}
		});
	}
	
	
	public void inicio() {
		this.getInicioButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Usuario_registrado a = new Usuario_registrado();
				layoutPrincipal.removeAll();
				layoutPrincipal.add(a);
			}
		});
	}

	public void mostrarCorreo() {
				
	}
	
//	public Usuario getUsuarioActivo() {
//		return usuarioActivo;
//	}
//
//	public void setUsuarioActivo(Usuario usuarioActivo) {
//		this.usuarioActivo = usuarioActivo;
//	}
}