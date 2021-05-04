package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import vistas.VistaGestionarusuarios;

public class Gestionar_usuarios extends VistaGestionarusuarios {
//	private Panel _crearNuevoUsuario;
//	private Panel _editarContraseñaUsuario;
//	public Administrador _administrador;
//	public Crear_usuario _crear_usuario;
//	public Cambiar_contraseña_a_usuario _cambiar_contraseña_a_usuario;

	public HorizontalLayout principalHLayout = this.getVaadinHorizontalLayout();
	private String[] comboItems = { "Encargado de compras", "Empresa transportes", "Administrador" };

	public Gestionar_usuarios() {

		this.getRolNuevoUsuarioComboBox().setItems(comboItems);
		
		this.getNuevoUsuarioButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				if (!getNuevoUsuarioEmailTF().getValue().isEmpty()
						&& !getNuevoUsuarioContraseñaTF().getValue().isEmpty()) {
					if (getRolNuevoUsuarioComboBox().getValue().toString() == "Administrador") {
						Notification.show("Se ha creado un administrador con mail: "+ getTranslation(getNuevoUsuarioEmailTF().getValue(), comboItems));
					}
					if (getRolNuevoUsuarioComboBox().getValue().toString() == "Empresa transportes") {
						Notification.show("Se ha creado un usuario Empresa transportes con mail: "+ getTranslation(getNuevoUsuarioEmailTF().getValue(), comboItems));
					}
					if (getRolNuevoUsuarioComboBox().getValue().toString() == "Encargado de compras") {
						Notification.show("Se ha creado un Encargado de compras con mail: "+ getTranslation(getNuevoUsuarioEmailTF().getValue(), comboItems));
					}
				}
			}
		});

		

	}

}