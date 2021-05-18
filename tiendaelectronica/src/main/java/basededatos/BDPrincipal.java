package basededatos;

import basededatosorm.Producto;
import basededatosorm.UsuarioRegistrado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.persistence.PersistenceException;

import org.orm.PersistentException;

import basededatosorm.Categoria;
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

public class BDPrincipal
		implements iUsuario_no_identificado, iUsuario_registrado, iAdministrador, iEmpresa_de_transportes,
		iEncargado_de_compras, iCorreo, iUsuario_no_registrado, iEmpresa_anunciadora, iComún_Usuarios {
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
			System.out.println("Error en crearCuenta BDprincipal");
			e.printStackTrace();
		}
	}
	
	public UsuarioRegistrado iniciarSesionUR(String aCorreo, String aContrasenia) {
		try {
			return _bDUsuarioRegistrado.iniciarSesion(aCorreo, aContrasenia);
		} catch (PersistentException e) {
			e.printStackTrace();
			return null;
		}
	}

	public Usuario iniciarSesion(String aCorreo, String aContrasenia) {
		if (aCorreo.contains("administrador")) {
			try {
				return _bDAdministradores.iniciarSesion(aCorreo, aContrasenia);
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		} else if (aCorreo.contains("encargado")) {
			try {
				return _bDEncargados.iniciarSesion(aCorreo, aContrasenia);
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		} else if (aCorreo.contains("transporte")) {
			try {
				return _bDTransportistas.iniciarSesion(aCorreo, aContrasenia);
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		}
		return null;

	}

	public Producto[] verCatalogo() {
		try {
			return this._bDProductos.obtenerProductos();
		} catch (PersistentException e) {
						e.printStackTrace();
			return null;
		}
	}

	public Producto[] buscarProducto(String aNombre) {
		try {
			return _bDProductos.obtenerProductos(aNombre);
		} catch (PersistentException e) {
			e.printStackTrace();
			return null;
		}
	}

	public Producto visualizarProducto(int aIdProducto) {
		throw new UnsupportedOperationException();
	}

	public void crearMensaje(String aAsunto, String aMensaje, String aRemitente, String aDestinatario,
			String aFechaEnvio) {
		_bDCorreo.crearMensaje(aAsunto, aMensaje, aRemitente, aDestinatario, aFechaEnvio);
	}

	public UsuarioRegistrado obtenerFormaPagoDireccion(int aIdUsuario) {
		return _bDUsuarioRegistrado.obtenerFormaPagoDireccion(aIdUsuario);
	}

	public UsuarioRegistrado obtenerUsuarioRegistrado(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void guardarDireccionEntrega(UsuarioRegistrado aUsuario, String aDireccionUsuario, String aCodigoPostal, String aCiudad,
			String aProvincia) {
		try {
			_bDUsuarioRegistrado.guardarDireccionEntrega(aUsuario, aDireccionUsuario, aCodigoPostal, aCiudad, aProvincia);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void guardarFormaPago(UsuarioRegistrado usuario, String titular, String aNumeroTarjeta, String aFechaVencimiento, int aCvv) {
		try {
			_bDUsuarioRegistrado.guardarFormaPago(usuario,titular,  aNumeroTarjeta, aFechaVencimiento, aCvv);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void guardarDatosPersonales(UsuarioRegistrado usuario, String aNombre, String aApellidos, String aNombreUsuario, String aEmail) {
		try {
			_bDUsuarioRegistrado.guardarDatosPersonales(usuario, aNombre, aApellidos, aNombreUsuario, aEmail);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void cambiarContrasenia(UsuarioRegistrado usuario, String aNuevaContrasenia) {
		try {
			_bDUsuarioRegistrado.cambiarContrasenia(usuario, aNuevaContrasenia);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void darBajaUsuario(int aIdUsuario) {
		try {
			_bDUsuarioRegistrado.darBajaUsuario(aIdUsuario);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void cancelarPedido(int aIdPedido) {
		_bDUsuarioRegistrado.cancelarPedido(aIdPedido);
	}

	public void valorarProducto(int aIdProducto, String aValoracion) {
		_bDUsuarioRegistrado.valorarProducto(aIdProducto, aValoracion);
	}

	public Oferta seleccionarOferta(String aNombreOferta) {
		// return _bDAdministradores.seleccionarOferta(aNombreOferta);
		// TODO
		return null;
	}

	public void guardarCambios(String aNombre, double aPrecio, String aMarca, Oferta aOferta, String aDescripcion) {
		try {
			_bDProductos.aniadirProducto(aNombre, aPrecio, aMarca, aOferta, aDescripcion);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public Pedido[] actualizarListadoDeCompras() {
		// _bDAdministradores.actualizarListadoDeCompras();
		// TODO
		return null;
	}

	public void editarProducto(Producto producto,String aNombre, double aPrecio, String aMarca, Oferta aOferta, String aDescripcion) {
		try {
			_bDProductos.editarProducto(producto,aNombre, aPrecio, aMarca, aOferta, aDescripcion);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void crearUsuario(String aMail, String aContraseña) {
		try {
			if (aMail.contains("administrador")) {
				_bDAdministradores.crearUsuario(aMail, aContraseña);
			}
			if (aMail.contains("encargado")) {
				_bDEncargados.crearUsuario(aMail, aContraseña);
			}
			if (aMail.contains("transporte")) {
				_bDTransportistas.crearUsuario(aMail, aContraseña);
			}
		} catch (PersistentException e) {
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
				usuarios[i + administradores.length] = encargados[i];
			}
			for (int i = 0; i < transportistas.length; i++) {
				usuarios[i + administradores.length + encargados.length] = transportistas[i];
			}

			return usuarios;

		} catch (PersistentException e) {
			e.printStackTrace();

			return null;
		}

	}

	public void cambiarContraseniaAdmin(String aMail, String aNuevaContrasenia) {

		if (aMail.contains("administrador")) {
			try {
				_bDAdministradores.cambiarContraseniaAdmin(aMail, aNuevaContrasenia);
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		}
		if (aMail.contains("encargado")) {
			try {
				_bDEncargados.cambiarContraseniaAdmin(aMail, aNuevaContrasenia);
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		}
		if (aMail.contains("transporte")) {
			try {
				_bDTransportistas.cambiarContraseniaAdmin(aMail, aNuevaContrasenia);
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		}

	}

	public void responderMensaje(String aAsunto, String aMensaje, String aRemitente, String aDestinatario,
			String aFechaEnvio) {
		_bDCorreo.responderMensaje(aAsunto, aMensaje, aRemitente, aDestinatario, aFechaEnvio);
	}

	public void crearNuevaOferta(String aNombreOferta, int aDescuento) {
		try {
			_bDOfertas.crearNuevaOferta(aNombreOferta, aDescuento);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public Oferta[] obtenerOfertas() {
		try {
			return _bDOfertas.obtenerOfertas();
		} catch (PersistentException e) {
			e.printStackTrace();
			return null;
		}
	}

	public Oferta obtenerOferta(String aNombreOferta) {
		try {
			return _bDOfertas.obtenerOferta(aNombreOferta);
		} catch (PersistentException e) {
			e.printStackTrace();
			System.out.println("Error en bdprincipal obtenerOferta");
			return null;
		}
	}

	public void crearNuevaCategoria(String aNombreCategoria) {
		try {
			_bDCategorias.crearNuevaCategoria(aNombreCategoria);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}
	
	public Categoria[] obtenerCategorias() {
		try {
			return _bDCategorias.obtenerCategorias();
		} catch (PersistentException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Categoria obtenerCategoria(String aNombreCategoria) {
		try {
			return _bDCategorias.obtenerCategoria(aNombreCategoria);
		} catch (PersistentException e) {
			e.printStackTrace();
			return null;
		}
	}

	public void darBajaOferta(String aNombreOferta) {
		try {
			_bDOfertas.darBajaOferta(aNombreOferta);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void guardarFotos(Fotos aFotos) {
		// Cambiado timpo de parametro de Fotos a Fotos[]
		// _bDFotos.guardarFotos(aFotos);
	}

	public Producto obtenerProducto(String aNombreProducto) {
		try {
			return _bDProductos.obtenerProducto(aNombreProducto);
		} catch (PersistentException e) {
			e.printStackTrace();
			return null;
		}
	}

	public Usuario obtenerUsuario(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Pedido[] actualizarListadoCompras() {
		throw new UnsupportedOperationException();
	}

	public void marcarRecibido(int aId) {
		// TODO
	}

	public void marcarEntregado(int aId) {
		// TODO
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
//		_bDUsuarioRegistrado.obtenerUsuarioRegistrado(0);
		return null;
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

	@Override
	public Usuario recuperarContrasenia(String aMail) {
		try {
			_bDUsuarioRegistrado.recuperarContrasenia(aMail);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void asignarCategoriaAProducto(Producto producto, Categoria categoria) {
		try {
			_bDProductos.asignarCategoriaAProducto(producto, categoria);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}
}