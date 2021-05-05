package basededatos;

import basededatosorm.Producto;
import basededatosorm.UsuarioRegistrado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.persistence.PersistenceException;

import org.orm.PersistentException;

import basededatosorm.Correo;
import basededatosorm.Fotos;
import basededatosorm.Oferta;
import basededatosorm.Encargado;
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
		_bDUsuarioRegistrado.cancelarPedido(aIdPedido);
	}

	public void valorarProducto(int aIdProducto, String aValoracion) {
		_bDUsuarioRegistrado.valorarProducto(aIdProducto, aValoracion);
	}

	public Oferta seleccionarOferta(String aNombreOferta) {
		//return _bDAdministradores.seleccionarOferta(aNombreOferta);
		//TODO
		return null;
	}

	public void guardarCambios(String aNombre, double aPrecio, String aMarca, Oferta aOferta, String aDescripcion) {
		_bDAdministradores.guardarCambios(aNombre, aPrecio, aMarca, aOferta, aDescripcion);
	}

	public Pedido[] actualizarListadoDeCompras() {
		//_bDAdministradores.actualizarListadoDeCompras();
		//TODO 
		return null;
	}

	public void editarProducto(String aNombre, double aPrecio, String aMarca, Oferta aOferta, String aDescripcion) {
		_bDAdministradores.editarProducto(aNombre, aPrecio, aMarca, aOferta, aDescripcion);
	}

	public void crearUsuario(String aMail, String aContraseña) {
		try {
			if(aMail.contains("administrador")) {
				_bDAdministradores.crearUsuario(aMail, aContraseña);
			}
			if(aMail.contains("encargado")) {
				_bDEncargados.crearUsuario(aMail, aContraseña);
			}
			if(aMail.contains("transporte")) {
				_bDTransportistas.crearUsuario(aMail, aContraseña);
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Usuario[] cargarUsuarios() {
		try {
			
			Usuario[] administradores = _bDAdministradores.cargarUsuarios();
			Usuario[] encargados = _bDEncargados.cargarUsuarios();
			Usuario[] transportistas = _bDTransportistas.cargarUsuarios();

			
			int tam = administradores.length + encargados.length + transportistas.length;
			Usuario[] usuarios = new Usuario[tam];
			
			for (int i = 0; i < administradores.length; i++) {
				usuarios[i] = administradores[i];
			}
			for (int i = 0; i < encargados.length; i++) {
				usuarios[i+administradores.length] = encargados[i];
			}
			for (int i = 0; i < transportistas.length; i++) {
				usuarios[i+administradores.length+encargados.length] = transportistas[i];
			}
			
			return usuarios;
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return null;
		}
		
		
	}

	public void responderMensaje(String aAsunto, String aMensaje, String aRemitente, String aDestinatario, String aFechaEnvio) {
		_bDCorreo.responderMensaje(aAsunto, aMensaje, aRemitente, aDestinatario, aFechaEnvio);
	}

	public void crearNuevaOferta(String aNombreOferta, int aDescuento) {
		_bDOfertas.crearNuevaOferta(aNombreOferta, aDescuento);
	}

	public void crearNuevaCategoria(String aNombreCategoria) {
		_bDAdministradores.crearNuevaCategoria(aNombreCategoria);
	}

	public void darBajaOferta(String aNombreOferta) {
		_bDAdministradores.darBajaOferta(aNombreOferta);
	}

	public void guardarFotos(Fotos aFotos) {
		//Cambiado timpo de parametro de Fotos a Fotos[]
		//_bDFotos.guardarFotos(aFotos);
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
		//TODO	
	}

	public void marcarEntregado(int aId) {
		//TODO	
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