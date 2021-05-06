package basededatos;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.vaadin.flow.component.notification.Notification;

import basededatosorm.Administrador;
import basededatosorm.Correo;
import basededatosorm.Producto;
import basededatosorm.Usuario;
import basededatosorm.UsuarioRegistrado;

public class BDUsuarioRegistrado {
	public BDPrincipal _unnamed_BDPrincipal_;
	public UsuarioRegistrado _contiene_usuarioRegistrado;

	public void crearCuenta(String aCorreo, String aContrasenia) throws PersistentException {
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession().beginTransaction();
		
		try {
			UsuarioRegistrado ur = basededatosorm.UsuarioRegistradoDAO.createUsuarioRegistrado();
			ur.setMail(aCorreo);
			ur.setContraseña(aContrasenia);
			ur.setEstaOperativo(true);
			
			
			basededatosorm.UsuarioRegistradoDAO.save(ur);
			Notification.show("Nueva cuenta creada:\nMail: " + ur.getMail()
					+ "\nContraseña: " + ur.getContraseña());
			t.commit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error en BDUsuarioRegistrado crearCuenta");
			t.rollback();
		}
		
		
		
	}

	public Usuario iniciarSesion(String aCorreo, String aContrasenia) throws PersistentException {
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession()
				.beginTransaction();
		try {

			UsuarioRegistrado[] ads = basededatosorm.UsuarioRegistradoDAO.listUsuarioRegistradoByQuery(null, null);
			int idUsuario = 0;

			for (UsuarioRegistrado usuarioRegistrado : ads) {
				if (usuarioRegistrado.getMail().equals(aCorreo)) {
					idUsuario = usuarioRegistrado.getIdUsuario();
					break;
				}

			}

			if (idUsuario == 0) {
				Notification.show("El usuario no existe");
			}
			
			UsuarioRegistrado ad = basededatosorm.UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(idUsuario);
			
			if(ad.getContraseña().equals(aContrasenia)) {
				return ad;
			} else {
				Notification.show("La contraseña es incorrecta");
			}

			t.commit();
			return new Usuario();
		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
			return null;
		}
	}

	public UsuarioRegistrado obtenerFormaPagoDireccion(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public UsuarioRegistrado obtenerUsuarioRegistrado(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void guardarDireccionEntrega(String aDireccionUsuario, String aCodigoPostal, String aCiudad, String aProvincia) {
		throw new UnsupportedOperationException();
	}

	public void guardarFormaPago(String aNumeroTarjeta, String aFechaVencimiento, int aCvv) {
		throw new UnsupportedOperationException();
	}

	public void guardarDatosPersonales(String aNombre, String aEmail) {
		throw new UnsupportedOperationException();
	}

	public void cambiarContrasenia(String aNuevaContrasenia) {
		throw new UnsupportedOperationException();
	}

	public void darBajaUsuario(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}
	public void cancelarPedido(int aIdPedido) {
		
	}

	public void valorarProducto(int aIdProducto, String aValoracion) {
		
	}
	public Producto[] buscarProducto(String aNombre) {
		return null;
		
	}
	
	public Correo[] obtenerMensajesRecibidos() {
		return null;
		
	}

	public Correo[] obtenerMensajesEnviados() {
		return null;
		
	}

	public void crearMensaje(String aAsunto, String aMensaje, String aRemitente, String aDestinatario, String aFechaEnvio) {
		
	}

	public Correo obtenerMensaje(String aId) {
		return null;
		
	}
	
}