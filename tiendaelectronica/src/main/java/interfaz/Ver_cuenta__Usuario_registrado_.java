package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.CompositionStartEvent;
import com.vaadin.flow.component.CompositionUpdateEvent;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

import basededatos.BDPrincipal;
import basededatosorm.Usuario;
import basededatosorm.UsuarioRegistrado;
import vistas.VistaVercuentausuarioregistrado;
import interfaz.Usuario_no_registrado;

public class Ver_cuenta__Usuario_registrado_ extends VistaVercuentausuarioregistrado {
	public static Usuario usuarioActivo;

	public VerticalLayout layoutPrincipal = this.getVaadinVerticalLayout1().as(VerticalLayout.class);

	public Ver_cuenta__Usuario_registrado_(UsuarioRegistrado usuario) {

		BDPrincipal bdp = new BDPrincipal();

		System.out.println("Usuario registrado dentro: " + usuario.getMail());

		usuarioActivo = Iniciar_sesión.usuarioActivo();
		System.out.println(usuarioActivo);
		Cerrar_sesión();
		mostrarCorreo();
		inicio();
		rellenarDatos(usuario);

		
		
		desactivarActivarTextFieldsDireccion(true);
		desactivarActivarTextFieldsMetodoPago(true);
		desactivarActivarTextFieldsDatosPersonales(true);
		this.getGuardarDireccionButton().setEnabled(false);
		this.getGuardarNuevaTarjetaButton().setEnabled(false);
		this.getGuardarDatosPersonalesButton().setEnabled(false);
//		this.getCambiarContraseñaButton().setEnabled(false);
		
		this.getEditarDireccionButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				desactivarActivarTextFieldsDireccion(false);
				getEditarDireccionButton().setEnabled(false);
				getGuardarDireccionButton().setEnabled(true);
				
			}
		});
		
		
		this.getGuardarDireccionButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				desactivarActivarTextFieldsDireccion(true);
				
				
				String calle = getCalleTF().getValue();
				String ciudad = getCiudadTF().getValue();
				String cp = getCodigoPostalTF().getValue();
				String provincia = getProvinciaTF().getValue();
				
				if (calle!="" && ciudad != "" && cp!="" && provincia!="") {
					bdp.guardarDireccionEntrega(usuario, calle, cp, ciudad, provincia);
				} else {
					Notification.show("Rellena todos los datos para editarlos");
				}
				getGuardarDireccionButton().setEnabled(false);
				getEditarDireccionButton().setEnabled(true);
				
			}
		});
		
		this.getEditarTarjetaButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				desactivarActivarTextFieldsMetodoPago(false);
				getEditarTarjetaButton().setEnabled(false);
				getGuardarNuevaTarjetaButton().setEnabled(true);
				
			}
		});
		
		this.getGuardarNuevaTarjetaButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				desactivarActivarTextFieldsMetodoPago(true);
				
				String numero = getNumeroTarjetaTF().getValue();
				String fechaVencimiento = getFechaVencimientoTTF().getValue();
				String cvv = getCvsTF().getValue();
				String titular = getTitularTarjeta().getValue();
				
				if(numero!="" && fechaVencimiento!="" && cvv!="") {
					bdp.guardarFormaPago(usuario,titular, numero, fechaVencimiento, Integer.parseInt(cvv));
				} else {
					Notification.show("Rellena todos los datos para editarlos");
				}
				getGuardarNuevaTarjetaButton().setEnabled(false);
				getEditarTarjetaButton().setEnabled(true);
			}
		});
		
		this.getEditarDatosPersonalesButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				desactivarActivarTextFieldsDatosPersonales(false);
				getEditarDatosPersonalesButton().setEnabled(false);
				getGuardarDatosPersonalesButton().setEnabled(true);
				
			}
		});
		
		this.getGuardarDatosPersonalesButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				desactivarActivarTextFieldsDatosPersonales(true);
				
				String nombre = getNombreTF().getValue();
				String nombreUsuario = getNombreDeUsuario().getValue();
				String apellidos = getApellidosTF().getValue();
				String mail = getEmailTF().getValue();
				
				if(nombre!="" && nombreUsuario!="" && apellidos!="" && mail!="") {
					bdp.guardarDatosPersonales(usuario, nombre, apellidos, nombreUsuario, mail);
				} else {
					Notification.show("Rellena todos los datos para editarlos");
				}
				getGuardarDatosPersonalesButton().setEnabled(false);
				getEditarDatosPersonalesButton().setEnabled(true);
			}
		});
		
		this.getCambiarContraseñaButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				if(getNuevaContraseñaTF().getValue()!=null) {
					if(getNuevaContraseñaTF().getValue().toString().length()>10) {
						bdp.cambiarContrasenia(usuario, getNuevaContraseñaTF().getValue());
						Usuario_no_registrado unr = new Usuario_no_registrado();
						layoutPrincipal.removeAll();
						layoutPrincipal.add(unr);
					} else {
						Notification.show("La contraseña debe tener al menos 10 caracteres").setPosition(Position.BOTTOM_END);;
					}
				} else {
					Notification.show("Introduce una contraseña válida");
				}
			}
		});
		
		this.getDarmeDeBajaButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				
				bdp.darBajaUsuario(usuario.getIdUsuario());
				Usuario_no_registrado unr = new Usuario_no_registrado();
				layoutPrincipal.removeAll();
				layoutPrincipal.add(unr);
			}
		});
		
		
	}
	
	public void desactivarActivarTextFieldsDireccion(Boolean condicion) {
		this.getCiudadTF().setReadOnly(condicion);
		this.getCalleTF().setReadOnly(condicion);
		this.getCodigoPostalTF().setReadOnly(condicion);
		this.getProvinciaTF().setReadOnly(condicion);
	}
	public void desactivarActivarTextFieldsMetodoPago(Boolean condicion) {
		this.getFechaVencimientoTTF().setReadOnly(condicion);
		this.getCvsTF().setReadOnly(condicion);
		this.getNumeroTarjetaTF().setReadOnly(condicion);
		this.getTitularTarjeta().setReadOnly(condicion);
	}
	public void desactivarActivarTextFieldsDatosPersonales(Boolean condicion) {
		this.getNombreDeUsuario().setReadOnly(condicion);
		this.getNombreTF().setReadOnly(condicion);
		this.getApellidosTF().setReadOnly(condicion);
		this.getEmailTF().setReadOnly(condicion);
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
//				Usuario_registrado a = new Usuario_registrado();
//				layoutPrincipal.removeAll();
//				layoutPrincipal.add(a);
			}
		});
	}

	public void mostrarCorreo() {

	}

	
	public void rellenarDatos(UsuarioRegistrado usuario) {
		if (usuario.getDireccionUsuario()!=null)
			this.getCalleTF().setValue(usuario.getDireccionUsuario());
		if(usuario.getCodigoPostal()!=null)
			this.getCodigoPostalTF().setValue(usuario.getCodigoPostal());
		if(usuario.getCiudad()!=null)
			this.getCiudadTF().setValue(usuario.getCiudad());
		if(usuario.getProvincia()!=null)
			this.getProvinciaTF().setValue(usuario.getProvincia());
		if(usuario.getFechaVencimientoTarjeta()!=null)
			this.getFechaVencimientoTTF().setValue(usuario.getFechaVencimientoTarjeta());
		if(usuario.getCvv()!=0)
			this.getCvsTF().setValue(String.valueOf(usuario.getCvv()));
		if(usuario.getNombre()!=null)
			this.getNombreTF().setValue(usuario.getNombre());
		if(usuario.getMail()!=null)	
			this.getEmailTF().setValue(usuario.getMail());
		if(usuario.getNumeroTarjeta()!=0)
			getNumeroTarjetaTF().setValue(String.valueOf(usuario.getNumeroTarjeta()));
		if(usuario.getTitularTarjeta()!=null)
			getTitularTarjeta().setValue(usuario.getTitularTarjeta());
		if(usuario.getApellidos()!=null)
			getApellidosTF().setValue(usuario.getApellidos());
		if(usuario.getNombreUsuario()!=null)
			getNombreDeUsuario().setValue(usuario.getNombreUsuario());
		
	}
	
	
	
	
	
	
	
	
}