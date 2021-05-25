package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.VaadinSession;

import basededatosorm.Usuario;
import vistas.VistaVerlistadodecompras;

@SuppressWarnings("serial")
public class Ver_listado_de_compras__Administrador_ extends VistaVerlistadodecompras {
	public Administrador _administrador;
	VaadinSession session = VaadinSession.getCurrent();
	

	public Ver_listado_de_compras__Administrador_(Usuario administrador, VerticalLayout principalLayout) {

		this.getCerrarSesionButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Usuario_no_registrado unr = new Usuario_no_registrado(principalLayout);
				session.close();
				principalLayout.removeAll();
				principalLayout.add(unr);
			}
		});
		this.getInicioButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				principalLayout.removeAll();
				principalLayout.add(new Administrador(administrador, principalLayout));
			}
		});
	}

}