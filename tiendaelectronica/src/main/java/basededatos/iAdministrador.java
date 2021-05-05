package basededatos;

import basededatosorm.Oferta;
import interfaz.Pedido;

import java.util.List;

import basededatosorm.Correo;
import basededatosorm.Fotos;
import basededatosorm.Producto;
import basededatosorm.Usuario;

public interface iAdministrador extends iComún_Usuarios {

	public Oferta seleccionarOferta(String aNombreOferta);

	public void guardarCambios(String aNombre, double aPrecio, String aMarca, Oferta aOferta, String aDescripcion);

	public Pedido[] actualizarListadoDeCompras();

	public void editarProducto(String aNombre, double aPrecio, String aMarca, Oferta aOferta, String aDescripcion);

	public void crearUsuario(String aMail, String aContraseña);

	public Correo[] obtenerMensajesRecibidos();

	public Correo[] obtenerMensajesEnviados();

	public void responderMensaje(String aAsunto, String aMensaje, String aRemitente, String aDestinatario, String aFechaEnvio);

	public Correo obtenerMensaje(String aId);

	public Producto[] verCatalogo();

	public void crearNuevaOferta(String aNombreOferta, int aDescuento);

	public void crearNuevaCategoria(String aNombreCategoria);

	public void darBajaOferta(String aNombreOferta);

	public Producto visualizarProducto(int aIdProducto);

	public void guardarFotos(Fotos aFotos);

	public Producto obtenerProducto(String aNombreProducto);
	
	public Usuario[] cargarUsuarios();
	
	public void cambiarContraseniaAdmin(String aMail, String aNuevaContrasenia);
}