package basededatos;

import basededatosorm.Correo;
import basededatosorm.Producto;
import basededatosorm.UsuarioRegistrado;

public interface iUsuario_registrado extends iUsuario_no_registrado {

	public Correo[] obtenerMensajesRecibidos();

	public Correo[] obtenerMensajesEnviados();

	public void crearMensaje(String aAsunto, String aMensaje, String aRemitente, String aDestinatario, String aFechaEnvio);

	public Correo obtenerMensaje(String aId);

	public Producto[] buscarProducto(String aNombre);

	public UsuarioRegistrado obtenerFormaPagoDireccion(int aIdUsuario);

	public UsuarioRegistrado obtenerUsuarioRegistrado(int aIdUsuario);

	public void guardarDireccionEntrega(String aDireccionUsuario, String aCodigoPostal, String aCiudad, String aProvincia);

	public void guardarFormaPago(String aNumeroTarjeta, String aFechaVencimiento, int aCvv);

	public void guardarDatosPersonales(String aNombre, String aEmail);

	public void cambiarContrasenia(String aNuevaContrasenia);

	public void darBajaUsuario(int aIdUsuario);

	public void cancelarPedido(int aIdPedido);

	public void valorarProducto(int aIdProducto, String aValoracion);
}