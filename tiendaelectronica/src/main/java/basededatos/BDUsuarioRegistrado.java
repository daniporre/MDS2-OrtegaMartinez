package basededatos;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatosorm.Correo;
import basededatosorm.Producto;
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
			basededatosorm.UsuarioRegistradoDAO.save(ur);
			
			t.commit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error en BDUsuarioRegistrado crearCuenta");
			t.rollback();
		}
		
		
		
	}

	public void iniciarSesion(String aCorreo, String aContrasenia) {
		throw new UnsupportedOperationException();
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