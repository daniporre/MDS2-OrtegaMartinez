package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.CompositionStartEvent;
import com.vaadin.flow.component.CompositionUpdateEvent;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.server.VaadinSession;

import basededatos.BDPrincipal;
import basededatosorm.Item;
import basededatosorm.Usuario;
import basededatosorm.UsuarioRegistrado;
import vistas.VistaVercuentausuarioregistrado;
import interfaz.Usuario_no_registrado;

@SuppressWarnings("serial")
public class Ver_cuenta__Usuario_registrado_ extends VistaVercuentausuarioregistrado {

	VaadinSession session = VaadinSession.getCurrent();
	VerticalLayout layoutPedidos = this.getListaPedidosLayout().as(VerticalLayout.class);
	BDPrincipal bdp = new BDPrincipal();

	public Ver_cuenta__Usuario_registrado_(UsuarioRegistrado usuario, VerticalLayout layoutPrincipal) {

		BDPrincipal bdp = new BDPrincipal();

		// Botones
		Cerrar_sesión(layoutPrincipal);
		mostrarCorreo(usuario, layoutPrincipal);
		inicio(usuario, layoutPrincipal);
		carrito(usuario, layoutPrincipal);
		layoutPedidos.setAlignSelf(Alignment.STRETCH);

		rellenarDatos(bdp.obtenerUsuarioRegistrado(usuario.getIdUsuario()));
		actualizarCompras(usuario, layoutPrincipal);

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

				if (calle != "" && ciudad != "" && cp != "" && provincia != "") {
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
				desactivarActivarTextFieldsMetodoPago(true);

				String numero = getNumeroTarjetaTF().getValue();
				String fechaVencimiento = getFechaVencimientoTTF().getValue();
				String cvv = getCvsTF().getValue();
				String titular = getTitularTarjeta().getValue();

				if (numero != "" && fechaVencimiento != "" && cvv != "") {
					bdp.guardarFormaPago(usuario, titular, numero, fechaVencimiento, Integer.parseInt(cvv));
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
				desactivarActivarTextFieldsDatosPersonales(true);

				String nombre = getNombreTF().getValue();
				String nombreUsuario = getNombreDeUsuario().getValue();
				String apellidos = getApellidosTF().getValue();
				String mail = getEmailTF().getValue();

				if (nombre != "" && nombreUsuario != "" && apellidos != "" && mail != "") {
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
				if (getNuevaContraseñaTF().getValue() != null) {
					if (getNuevaContraseñaTF().getValue().toString().length() > 10) {
						bdp.cambiarContrasenia(usuario, getNuevaContraseñaTF().getValue());
						Usuario_no_registrado unr = new Usuario_no_registrado(layoutPrincipal);
						layoutPrincipal.removeAll();
						layoutPrincipal.add(unr);
					} else {
						Notification.show("La contraseña debe tener al menos 10 caracteres")
								.setPosition(Position.BOTTOM_END);
					}
				} else {
					Notification.show("Introduce una contraseña válida");
				}
			}
		});

		this.getDarmeDeBajaButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				Notification notification = new Notification();
				notification.addThemeVariants(NotificationVariant.LUMO_CONTRAST);

				Span label = new Span(
						"¿Estás seguro de que quieres darte de baja? Esta operación no se puede deshacer");

				Button botonEliminar = new Button("Darme de baja", e -> {
					bdp.darBajaUsuario(usuario.getIdUsuario());
					Usuario_no_registrado unr = new Usuario_no_registrado(layoutPrincipal);
					layoutPrincipal.removeAll();
					layoutPrincipal.add(unr);
					notification.close();
				});
				Button botonCancelar = new Button("Cancelar", e -> {
					notification.close();
				});
				botonEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);
				botonCancelar.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

				notification.add(label,botonCancelar , botonEliminar);

				label.getStyle().set("margin-right", "0.5rem");
				botonEliminar.getStyle().set("margin-left", "10rem");
				botonCancelar.getStyle().set("margin-left", "10rem");

				notification.setPosition(Position.MIDDLE);
				notification.open();

			}
		});

	}

	public void actualizarCompras(UsuarioRegistrado usuario, VerticalLayout principalLayout) {
		for (basededatosorm.Pendiente pendiente : bdp.cargarPendientesUsuario(usuario)) {
			Item[] item = pendiente.items.toArray();
			for (int i = 0; i < item.length; i++) {

				Ver_pedido vp = new Ver_pedido(usuario, pendiente, principalLayout);
				layoutPedidos.add(vp);
			}
		}
		for (basededatosorm.Enviado enviado : bdp.cargarEnviadosUsuario(usuario)) {
			Item[] item = enviado.items.toArray();
			for (int i = 0; i < item.length; i++) {

				Ver_pedido vp = new Ver_pedido(usuario, enviado, principalLayout);
				layoutPedidos.add(vp);
			}
		}
		for (basededatosorm.Entregado entregado : bdp.cargarEntregadosUsuario(usuario)) {
			Item[] item = entregado.items.toArray();
			for (int i = 0; i < item.length; i++) {

				Ver_pedido vp = new Ver_pedido(usuario, entregado, principalLayout);
				layoutPedidos.add(vp);
			}
		}
	}

	public void mostrarPedidos() {

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

	public void Cerrar_sesión(VerticalLayout layoutPrincipal) {
		this.getLogoutButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				session.close();
				Usuario_no_registrado a = new Usuario_no_registrado(layoutPrincipal);
				layoutPrincipal.removeAll();
				layoutPrincipal.add(a);

			}
		});
	}

	public void inicio(UsuarioRegistrado usuario, VerticalLayout layoutPrincipal) {
		this.getInicioButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layoutPrincipal.removeAll();
				layoutPrincipal.add(new Usuario_registrado(usuario, layoutPrincipal));

			}
		});
	}

	public void mostrarCorreo(UsuarioRegistrado usuario, VerticalLayout layoutPrincipal) {
		this.getCorreoButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				layoutPrincipal.removeAll();
				layoutPrincipal.add(new Correo__General_(usuario, layoutPrincipal));

			}
		});
	}

	public void carrito(UsuarioRegistrado usuario, VerticalLayout layoutPrincipal) {
		Ver_carrito carrito;

		carrito = new Ver_carrito(usuario, layoutPrincipal);

		this.getCarritoButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				layoutPrincipal.removeAll();
				layoutPrincipal.add(carrito);

			}

		});
	}

	public void rellenarDatos(UsuarioRegistrado usuario) {
		if (usuario.getDireccionUsuario() != null)
			this.getCalleTF().setValue(usuario.getDireccionUsuario());
		if (usuario.getCodigoPostal() != null)
			this.getCodigoPostalTF().setValue(usuario.getCodigoPostal());
		if (usuario.getCiudad() != null)
			this.getCiudadTF().setValue(usuario.getCiudad());
		if (usuario.getProvincia() != null)
			this.getProvinciaTF().setValue(usuario.getProvincia());
		if (usuario.getFechaVencimientoTarjeta() != null)
			this.getFechaVencimientoTTF().setValue(usuario.getFechaVencimientoTarjeta());
		if (usuario.getCvv() != 0)
			this.getCvsTF().setValue(String.valueOf(usuario.getCvv()));
		if (usuario.getNombre() != null)
			this.getNombreTF().setValue(usuario.getNombre());
		if (usuario.getMail() != null)
			this.getEmailTF().setValue(usuario.getMail());
		if (!usuario.getNumeroTarjeta().isEmpty())
			getNumeroTarjetaTF().setValue(String.valueOf(usuario.getNumeroTarjeta()));
		if (usuario.getTitularTarjeta() != null)
			getTitularTarjeta().setValue(usuario.getTitularTarjeta());
		if (usuario.getApellidos() != null)
			getApellidosTF().setValue(usuario.getApellidos());
		if (usuario.getNombreUsuario() != null)
			getNombreDeUsuario().setValue(usuario.getNombreUsuario());

	}

}