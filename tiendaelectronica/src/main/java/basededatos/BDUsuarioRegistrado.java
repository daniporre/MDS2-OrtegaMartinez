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
			ur.setNumeroTarjeta("");
			
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

	public UsuarioRegistrado iniciarSesion(String aCorreo, String aContrasenia) throws PersistentException {
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
			return new UsuarioRegistrado();
		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
			return null;
		}
	}
	
	public Usuario recuperarContrasenia(String aMail) throws PersistentException {
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession()
				.beginTransaction();
		try {

			UsuarioRegistrado[] ads = basededatosorm.UsuarioRegistradoDAO.listUsuarioRegistradoByQuery(null, null);
			int idUsuario = 0;

			for (UsuarioRegistrado usuarioRegistrado : ads) {
				if (usuarioRegistrado.getMail().equals(aMail)) {
					idUsuario = usuarioRegistrado.getIdUsuario();
					break;
				}

			}
			System.out.println("idusuario; "+idUsuario);
			if (idUsuario == 0) {
				Notification.show("El usuario no existe");
			}
			
			UsuarioRegistrado ad = basededatosorm.UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(idUsuario);
			
			t.commit();
			return ad;
		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
			return null;
		}
	}

	public void guardarDireccionEntrega(UsuarioRegistrado usuario, String aDireccionUsuario, String aCodigoPostal, String aCiudad, String aProvincia) throws PersistentException {
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession()
				.beginTransaction();
		try {

			UsuarioRegistrado[] ads = basededatosorm.UsuarioRegistradoDAO.listUsuarioRegistradoByQuery(null, null);
			int idUsuario = 0;

			for (UsuarioRegistrado ur : ads) {
				if (ur.getMail().toLowerCase().equals(usuario.getMail().toLowerCase()) && ur.getContraseña().equals(usuario.getContraseña())) {
					idUsuario = ur.getIdUsuario();
					break;
				}

			}
			
			UsuarioRegistrado ad = basededatosorm.UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(idUsuario);
			ad.setDireccionUsuario(aDireccionUsuario);
			ad.setCiudad(aCiudad);
			ad.setProvincia(aProvincia);
			ad.setCodigoPostal(aCodigoPostal);
			
			t.commit();
		} catch (PersistentException e) {
			e.printStackTrace();
			t.rollback();
		}
		basededatosorm.ProyectoWebPersistentManager.instance().disposePersistentManager();

	}

	public void guardarFormaPago(UsuarioRegistrado usuario, String titular, String aNumeroTarjeta, String aFechaVencimiento, int aCvv) throws PersistentException {
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession()
				.beginTransaction();
		try {

			UsuarioRegistrado[] ads = basededatosorm.UsuarioRegistradoDAO.listUsuarioRegistradoByQuery(null, null);
			int idUsuario = 0;

			for (UsuarioRegistrado ur : ads) {
				if (ur.getMail().toLowerCase().equals(usuario.getMail().toLowerCase()) && ur.getContraseña().equals(usuario.getContraseña())) {
					idUsuario = ur.getIdUsuario();
					break;
				}

			}
			
			UsuarioRegistrado ad = basededatosorm.UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(idUsuario);
			ad.setNumeroTarjeta(aNumeroTarjeta);
			ad.setTitularTarjeta(titular);
			ad.setFechaVencimientoTarjeta(aFechaVencimiento);
			ad.setCvv(aCvv);
			
			
			t.commit();
		} catch (PersistentException e) {
			e.printStackTrace();
			t.rollback();
		}
		basededatosorm.ProyectoWebPersistentManager.instance().disposePersistentManager();
	}

	public void guardarDatosPersonales(UsuarioRegistrado usuario, String aNombre, String aApellidos, String aNombreUsuario, String aEmail) throws PersistentException {
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession()
				.beginTransaction();
		try {

			UsuarioRegistrado[] ads = basededatosorm.UsuarioRegistradoDAO.listUsuarioRegistradoByQuery(null, null);
			int idUsuario = 0;

			for (UsuarioRegistrado ur : ads) {
				if (ur.getMail().toLowerCase().equals(usuario.getMail().toLowerCase()) && ur.getContraseña().equals(usuario.getContraseña())) {
					idUsuario = ur.getIdUsuario();
					break;
				}

			}
			
			UsuarioRegistrado ad = basededatosorm.UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(idUsuario);
			ad.setNombre(aNombre);
			ad.setMail(aEmail);
			ad.setNombreUsuario(aNombreUsuario);
			ad.setApellidos(aApellidos);
			
			t.commit();
		} catch (PersistentException e) {
			e.printStackTrace();
			t.rollback();
		}
		basededatosorm.ProyectoWebPersistentManager.instance().disposePersistentManager();
	}

	public void cambiarContrasenia(UsuarioRegistrado usuario, String aNuevaContrasenia) throws PersistentException {
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession()
				.beginTransaction();
		try {

			UsuarioRegistrado[] ads = basededatosorm.UsuarioRegistradoDAO.listUsuarioRegistradoByQuery(null, null);
			int idUsuario = 0;

			for (UsuarioRegistrado ur : ads) {
				if (ur.getMail().toLowerCase().equals(usuario.getMail().toLowerCase()) && ur.getContraseña().equals(usuario.getContraseña())) {
					idUsuario = ur.getIdUsuario();
					break;
				}

			}
			
			UsuarioRegistrado ad = basededatosorm.UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(idUsuario);
			ad.setContraseña(aNuevaContrasenia);
			
			t.commit();
		} catch (PersistentException e) {
			e.printStackTrace();
			t.rollback();
		}
		basededatosorm.ProyectoWebPersistentManager.instance().disposePersistentManager();
	}

	public void darBajaUsuario(int aIdUsuario) throws PersistentException {
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession()
				.beginTransaction();
		try {
			
			UsuarioRegistrado ad = basededatosorm.UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aIdUsuario);
			ad.setEstaOperativo(false);
			
			t.commit();
		} catch (PersistentException e) {
			e.printStackTrace();
			t.rollback();
		}
		basededatosorm.ProyectoWebPersistentManager.instance().disposePersistentManager();
	}
	
	public UsuarioRegistrado[] obtenerUsuariosRegistrados() throws PersistentException {
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession()
				.beginTransaction();

		try {
			UsuarioRegistrado[] o = basededatosorm.UsuarioRegistradoDAO.listUsuarioRegistradoByQuery(null, null);

			t.commit();
			return o;
		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
			return null;
		}
	}
	public void cancelarPedido(int aIdPedido) {
		
	}

	public void valorarProducto(int aIdProducto, String aValoracion) {
		
	}
	
	public UsuarioRegistrado obtenerFormaPagoDireccion(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public UsuarioRegistrado obtenerUsuarioRegistrado(int aIdUsuario) throws PersistentException {
		UsuarioRegistrado us = basededatosorm.UsuarioRegistradoDAO.getUsuarioRegistradoByORMID(aIdUsuario);
		
		return us;
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