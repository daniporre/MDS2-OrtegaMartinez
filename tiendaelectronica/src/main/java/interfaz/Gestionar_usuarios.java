package interfaz;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.PersistenceException;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import basededatos.BDPrincipal;
import basededatosorm.Usuario;
import vistas.VistaGestionarusuarios;

public class Gestionar_usuarios extends VistaGestionarusuarios {
//	private Panel _crearNuevoUsuario;
//	private Panel _editarContraseñaUsuario;
//	public Administrador _administrador;
//	public Crear_usuario _crear_usuario;
//	public Cambiar_contraseña_a_usuario _cambiar_contraseña_a_usuario;

	public HorizontalLayout principalHLayout = this.getVaadinHorizontalLayout();
	private String[] comboItems = { "Encargado de compras", "Empresa transportes", "Administrador"};
	public BDPrincipal bdprincipal;
	private String[] usuarios;

	public Gestionar_usuarios() {

		bdprincipal = new BDPrincipal();
		usuarios = new String[bdprincipal.cargarUsuarios().length];
		cargarCombo();	
				

		this.getNuevoUsuarioButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				if (!getNuevoUsuarioEmailTF().getValue().isEmpty()
						&& !getNuevoUsuarioContraseñaTF().getValue().isEmpty()) {
					if (getRolNuevoUsuarioComboBox().getValue().toString() == "Administrador") {
						try {
							

							String correo = getNuevoUsuarioEmailTF().getValue() + ".administrador@gmail.com";

							bdprincipal.crearUsuario(correo, getNuevoUsuarioContraseñaTF().getValue());

							Notification.show("Se ha creado un administrador con mail: "
									+ getTranslation(getNuevoUsuarioEmailTF().getValue(), comboItems));

							volverAdmin();

						} catch (PersistenceException e) {
							e.printStackTrace();
						}

					}
					if (getRolNuevoUsuarioComboBox().getValue().toString() == "Empresa transportes") {

						try {

							String correo = getNuevoUsuarioEmailTF().getValue() + ".transporte@gmail.com";

							bdprincipal.crearUsuario(correo, getNuevoUsuarioContraseñaTF().getValue());

							Notification.show("Se ha creado un usuario Empresa transportes con mail: "
									+ getTranslation(getNuevoUsuarioEmailTF().getValue(), comboItems));

							volverAdmin();
						} catch (PersistenceException e) {
							e.printStackTrace();
						}

					}
					if (getRolNuevoUsuarioComboBox().getValue().toString() == "Encargado de compras") {

						try {

							String correo = getNuevoUsuarioEmailTF().getValue() + ".encargado@gmail.com";

							bdprincipal.crearUsuario(correo, getNuevoUsuarioContraseñaTF().getValue());

							Notification.show("Se ha creado un Encargado de compras con mail: "
									+ getTranslation(getNuevoUsuarioEmailTF().getValue(), comboItems));

							volverAdmin();
						} catch (PersistenceException e) {
							e.printStackTrace();
						}

					}
				}
			}
		});

	}

	public void volverAdmin() {
		Administrador ad = new Administrador();
		principalHLayout.removeAll();
		principalHLayout.add(ad);
	}
	public void cargarCombo() {
		
		this.getRolNuevoUsuarioComboBox().setItems(comboItems);
		
		
		for (int i = 0; i < bdprincipal.cargarUsuarios().length; i++) {
			
			usuarios[i] = bdprincipal.cargarUsuarios()[i].getMail();
			System.out.println(bdprincipal.cargarUsuarios()[i].getMail());
		}
		
		getSeleccionarUsuarioComboBox().setItems(usuarios);
	}
}