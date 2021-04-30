package basededatos;

import basededatosorm.UsuarioRegistrado;

public class BDUsuarioRegistrado {
	public BDPrincipal _unnamed_BDPrincipal_;
	public UsuarioRegistrado _contiene_usuarioRegistrado;

	public void crearCuenta(String aCorreo, String aContrasenia) {
		throw new UnsupportedOperationException();
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
}