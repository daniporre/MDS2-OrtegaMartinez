package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatosorm.Administrador;
import basededatosorm.Correo;
import basededatosorm.Fotos;
import basededatosorm.Oferta;
import basededatosorm.Producto;
import basededatosorm.UsuarioRegistrado;
import interfaz.Pedido;

public class BDAdministradores {
	public BDPrincipal _unnamed_BDPrincipal_;
	public Vector<Administrador> _contiene_administrador = new Vector<Administrador>();

	public void crearUsuario(String aMail, String aContraseña) throws PersistentException {
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession().beginTransaction();
		
		Administrador a = basededatosorm.AdministradorDAO.createAdministrador();
		a.setMail(aMail);
		a.setContraseña(aContraseña);
		basededatosorm.AdministradorDAO.save(a);
	}
	public Oferta seleccionarOferta(String aNombreOferta) {
		return null;
		
	}

	public void guardarCambios(String aNombre, double aPrecio, String aMarca, Oferta aOferta, String aDescripcion) {
		
	}

	public Pedido[] actualizarListadoDeCompras() {
		return null;
		
	}

	public void editarProducto(String aNombre, double aPrecio, String aMarca, Oferta aOferta, String aDescripcion) {
		
	}

	public Correo[] obtenerMensajesRecibidos() {
		return null;
		
	}

	public Correo[] obtenerMensajesEnviados() {
		return null;
		
	}

	public void responderMensaje(String aAsunto, String aMensaje, String aRemitente, String aDestinatario, String aFechaEnvio) {
		
	}

	public Correo obtenerMensaje(String aId) {
		return null;
		
	}

	public Producto[] verCatalogo() {
		return null;
		
	}

	public void crearNuevaOferta(String aNombreOferta, int aDescuento) {
		
	}

	public void crearNuevaCategoria(String aNombreCategoria) {
		
	}

	public void darBajaOferta(String aNombreOferta) {
		
	}

	public Producto visualizarProducto(int aIdProducto) {
		return null;
		
	}

	public void guardarFotos(Fotos aFotos) {
		
	}

	public Producto obtenerProducto(String aNombreProducto) {
		return null;
		
	}
}