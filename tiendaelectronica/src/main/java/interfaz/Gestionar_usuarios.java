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
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatosorm.Usuario;
import vistas.VistaGestionarusuarios;

public class Gestionar_usuarios extends VistaGestionarusuarios {
//	private Panel _crearNuevoUsuario;
//	private Panel _editarContraseñaUsuario;
//	public Administrador _administrador;
//	public Crear_usuario _crear_usuario;
//	public Cambiar_contraseña_a_usuario _cambiar_contraseña_a_usuario;

	public VerticalLayout principalHLayout;
	private String[] comboItems = { "Encargado de compras", "Empresa transportes", "Administrador"};
	public BDPrincipal bdprincipal;
	private String[] usuarios;
	public Usuario usuarioActivo;

	public Gestionar_usuarios(Usuario administrador, VerticalLayout layoutPrincipal) {
		principalHLayout = layoutPrincipal;

		bdprincipal = new BDPrincipal();
		usuarioActivo = administrador;
		usuarios = new String[bdprincipal.cargarUsuarios().length];
		cargarCombo();	
		crearUsuario();
		
		

		this.getCambiarContraseñaButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if (!getContraseñaUsuarioModificadaTF().getValue().isEmpty() && !getSeleccionarUsuarioComboBox().getValue().isEmpty()) {
								
					
					bdprincipal.cambiarContraseniaAdmin(getSeleccionarUsuarioComboBox().getValue(),getContraseñaUsuarioModificadaTF().getValue());
					
				}
			}
		});

	}

	public void volverAdmin(Usuario us, VerticalLayout ad) {
		
		principalHLayout.removeAll();
		principalHLayout.add(new Administrador(us, principalHLayout));
	}
	public void cargarCombo() {
		
		this.getRolNuevoUsuarioComboBox().setItems(comboItems);
		
		for (int i = 0; i < bdprincipal.cargarUsuarios().length; i++) {
			usuarios[i] = bdprincipal.cargarUsuarios()[i].getMail();
		}
		
		getSeleccionarUsuarioComboBox().setItems(usuarios);
	}
	public void crearUsuario() {
		this.getNuevoUsuarioButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				if (!getNuevoUsuarioEmailTF().getValue().isEmpty()
						&& !getNuevoUsuarioContraseñaTF().getValue().isEmpty()) {
					if (getRolNuevoUsuarioComboBox().getValue().toString() == "Administrador") {
						try {
							

							String correo = getNuevoUsuarioEmailTF().getValue().toLowerCase() + ".administrador@tiendavirtual.com";

							bdprincipal.crearUsuario(correo, getNuevoUsuarioContraseñaTF().getValue());

							Notification.show("Se ha creado un administrador con mail: "
									+ getTranslation(getNuevoUsuarioEmailTF().getValue(), comboItems));

							volverAdmin(usuarioActivo, principalHLayout);

						} catch (PersistenceException e) {
							e.printStackTrace();
						}

					}
					if (getRolNuevoUsuarioComboBox().getValue().toString() == "Empresa transportes") {

						try {

							String correo = getNuevoUsuarioEmailTF().getValue().toLowerCase() + ".transporte@tiendavirtual.com";

							bdprincipal.crearUsuario(correo, getNuevoUsuarioContraseñaTF().getValue());

							Notification.show("Se ha creado un usuario Empresa transportes con mail: "
									+ getTranslation(getNuevoUsuarioEmailTF().getValue(), comboItems));

							volverAdmin(usuarioActivo, principalHLayout);
						} catch (PersistenceException e) {
							e.printStackTrace();
						}

					}
					if (getRolNuevoUsuarioComboBox().getValue().toString() == "Encargado de compras") {

						try {

							String correo = getNuevoUsuarioEmailTF().getValue().toLowerCase() + ".encargado@tiendavirtual.com";

							bdprincipal.crearUsuario(correo, getNuevoUsuarioContraseñaTF().getValue());

							Notification.show("Se ha creado un Encargado de compras con mail: "
									+ getTranslation(getNuevoUsuarioEmailTF().getValue(), comboItems));

							volverAdmin(usuarioActivo, principalHLayout);
						} catch (PersistenceException e) {
							e.printStackTrace();
						}

					}
				}
			}
		});
	}
}