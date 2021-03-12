package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaUsuarioregistrado;
import vistas.VistaVercatalogo;

//import basededatos.iUsuario_registrado;

public class Usuario_registrado extends VistaUsuarioregistrado {

	public VistaVercatalogo vc;
	public VerticalLayout layoutCatalogo;
	
	public Usuario_registrado() {
		vc = new VistaVercatalogo();
		layoutCatalogo = this.getPrincipalVLayout().as(VerticalLayout.class);
		layoutCatalogo.add(vc);
	
	}
	
}