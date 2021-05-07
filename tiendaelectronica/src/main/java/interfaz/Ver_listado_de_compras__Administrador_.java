package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerlistadodecompras;

public class Ver_listado_de_compras__Administrador_ extends VistaVerlistadodecompras {
	public Administrador _administrador;

	public VerticalLayout principalVlayout = this.getVaadinVerticalLayout().as(VerticalLayout.class);

	public Ver_listado_de_compras__Administrador_() {

		this.getCerrarSesionButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Usuario_no_registrado unr = new Usuario_no_registrado();

				principalVlayout.removeAll();
				principalVlayout.add(unr);
			}
		});
		this.getInicioButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
//				Administrador ad = new Administrador();
//
//				principalVlayout.removeAll();
//				principalVlayout.add(ad);
			}
		});
	}

}