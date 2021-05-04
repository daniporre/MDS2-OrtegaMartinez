package basededatos;

import basededatosorm.Producto;
import basededatosorm.UsuarioRegistrado;

import javax.persistence.PersistenceException;

import org.orm.PersistentException;

import basededatosorm.Correo;
import basededatosorm.Fotos;
import basededatosorm.Oferta;
import interfaz.Pedido;
import basededatosorm.Usuario;
import interfaz.Usuario_no_identificado;
import interfaz.Usuario_no_registrado;
import interfaz.Común_Usuarios;
import interfaz.Usuario_registrado;
import interfaz.Administrador;
import interfaz.Empresa_de_transportes;
import interfaz.Encargado_de_compras;
import interfaz.Empresa_anunciadora;

public class BDPrincipal implements iUsuario_no_identificado, iUsuario_registrado, iAdministrador, iEmpresa_de_transportes, iEncargado_de_compras, iCorreo, iUsuario_no_registrado, iEmpresa_anunciadora, iComún_Usuarios {
	public BDCorreo _bDCorreo = new BDCorreo();
	public BDTransportistas _bDTransportistas = new BDTransportistas();
	public BDEncargados _bDEncargados = new BDEncargados();
	public BDAdministradores _bDAdministradores = new BDAdministradores();
	public BDEntregados _bDEntregados = new BDEntregados();
	public BDEnviados _bDEnviados = new BDEnviados();
	public BDPendientes _bDPendientes = new BDPendientes();
	public BDProductos _bDProductos = new BDProductos();
	public BDCategorias _bDCategorias = new BDCategorias();
	public BDOfertas _bDOfertas = new BDOfertas();
	public BDValoraciones _bDValoraciones = new BDValoraciones();
	public BDUsuarioRegistrado _bDUsuarioRegistrado = new BDUsuarioRegistrado();
	public BDItems _bDItems = new BDItems();
	public BDFotos _bDFotos = new BDFotos();

	public void crearCuenta(String aCorreo, String aContrasenia) {
		try {
			_bDUsuarioRegistrado.crearCuenta(aCorreo, aContrasenia);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			System.out.println("Error en crearCuenta BDprincipal");
			e.printStackTrace();
		}
	}

	public void iniciarSesion(String aCorreo, String aContrasenia) {
		throw new UnsupportedOperationException();
	}

	public Producto[] verCatalogo() {
		Producto [] ps = null;
		try {
			ps = this._bDProductos.obtenerProductos();
		} catch (PersistenceException e) {
			// TODO Auto-generated catch block
			System.out.println("error en verCatalogo BDPrincipal");
			e.printStackTrace();
		}
		
		return ps;
	}

	public Producto[] buscarProducto(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public Producto visualizarProducto(int aIdProducto) {
		throw new UnsupportedOperationException();
	}


	public void crearMensaje(String aAsunto, String aMensaje, String aRemitente, String aDestinatario, String aFechaEnvio) {
		_bDCorreo.crearMensaje(aAsunto, aMensaje, aRemitente, aDestinatario, aFechaEnvio);
	}

	public UsuarioRegistrado obtenerFormaPagoDireccion(int aIdUsuario) {
		return _bDUsuarioRegistrado.obtenerFormaPagoDireccion(aIdUsuario);
	}

	public UsuarioRegistrado obtenerUsuarioRegistrado(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void guardarDireccionEntrega(String aDireccionUsuario, String aCodigoPostal, String aCiudad, String aProvincia) {
		_bDUsuarioRegistrado.guardarDireccionEntrega(aDireccionUsuario, aCodigoPostal, aCiudad, aProvincia);
	}

	public void guardarFormaPago(String aNumeroTarjeta, String aFechaVencimiento, int aCvv) {
		_bDUsuarioRegistrado.guardarFormaPago(aNumeroTarjeta, aFechaVencimiento, aCvv);
	}

	public void guardarDatosPersonales(String aNombre, String aEmail) {
		_bDUsuarioRegistrado.guardarDatosPersonales(aNombre, aEmail);
	}

	public void cambiarContrasenia(String aNuevaContrasenia) {
		_bDUsuarioRegistrado.cambiarContrasenia(aNuevaContrasenia);
	}

	public void darBajaUsuario(int aIdUsuario) {
		_bDUsuarioRegistrado.darBajaUsuario(aIdUsuario);
	}

	public void cancelarPedido(int aIdPedido) {
		//_bDUsuarioRegistrado.cancelarPedido(aIdPedido);
	}

	public void valorarProducto(int aIdProducto, String aValoracion) {
		throw new UnsupportedOperationException();
	}

	public Oferta seleccionarOferta(String aNombreOferta) {
		throw new UnsupportedOperationException();
	}

	public void guardarCambios(String aNombre, double aPrecio, String aMarca, Oferta aOferta, String aDescripcion) {
		
	}

	public Pedido[] actualizarListadoDeCompras() {
		throw new UnsupportedOperationException();
	}

	public void editarProducto(String aNombre, double aPrecio, String aMarca, Oferta aOferta, String aDescripcion) {
		throw new UnsupportedOperationException();
	}

	public void crearUsuario(String aMail, String aContraseña) {
		try {
			_bDAdministradores.crearUsuario(aMail, aContraseña);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void responderMensaje(String aAsunto, String aMensaje, String aRemitente, String aDestinatario, String aFechaEnvio) {
		throw new UnsupportedOperationException();
	}

	public void crearNuevaOferta(String aNombreOferta, int aDescuento) {
		_bDOfertas.crearNuevaOferta(aNombreOferta, aDescuento);
	}

	public void crearNuevaCategoria(String aNombreCategoria) {
		throw new UnsupportedOperationException();
	}

	public void darBajaOferta(String aNombreOferta) {
		throw new UnsupportedOperationException();
	}

	public void guardarFotos(Fotos aFotos) {
		throw new UnsupportedOperationException();
	}

	public Producto obtenerProducto(String aNombreProducto) {
		throw new UnsupportedOperationException();
	}

	public Usuario obtenerUsuario(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Pedido[] actualizarListadoCompras() {
		throw new UnsupportedOperationException();
	}

	public void marcarRecibido(int aId) {
		throw new UnsupportedOperationException();
	}

	public void marcarEntregado(int aId) {
		throw new UnsupportedOperationException();
	}

	public UsuarioRegistrado visualizarUsuario(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Usuario_no_identificado get_Usuario_no_identificado() {
		throw new UnsupportedOperationException();
	}

	public Usuario_no_registrado get_Usuario_no_registrado() {
		throw new UnsupportedOperationException();
	}

	public Común_Usuarios get_Común_Usuarios() {
		throw new UnsupportedOperationException();
	}

	public Usuario_registrado get_Usuario_registrado() {
		throw new UnsupportedOperationException();
	}

	public Administrador get_Administrador() {
		throw new UnsupportedOperationException();
	}

	public Empresa_de_transportes get_Empresa_de_transportes() {
		throw new UnsupportedOperationException();
	}

	public Encargado_de_compras get_Encargado_de_compras() {
		throw new UnsupportedOperationException();
	}

	public interfaz.Correo get_Correo() {
		throw new UnsupportedOperationException();
	}

	public Empresa_anunciadora get_Empresa_anunciadora() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Correo[] obtenerMensajesRecibidos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Correo[] obtenerMensajesEnviados() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Correo obtenerMensaje(String aId) {
		// TODO Auto-generated method stub
		return null;
	}
}