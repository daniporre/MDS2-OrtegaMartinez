package basededatos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.vaadin.flow.component.notification.Notification;

import basededatosorm.Correo;
import basededatosorm.Producto;
import basededatosorm.ProyectoWebPersistentManager;
import basededatosorm.UsuarioRegistrado;

public class BDCorreo {
	public BDPrincipal _unnamed_BDPrincipal_;
	public Vector<Correo> _contiene_correo = new Vector<Correo>();
	public BDUsuarioRegistrado bdur = new BDUsuarioRegistrado();

	public Correo[] obtenerTodosMensajes() throws PersistentException {
		Correo[] o = basededatosorm.CorreoDAO.listCorreoByQuery(null, null);
		return o;
	}

	public Correo[] obtenerMensajesRecibidos(UsuarioRegistrado usuario) throws PersistentException {
		System.out.println("obtener mensajes recibidos");

		Correo[] p = basededatosorm.CorreoDAO.listCorreoByQuery("destinatario = '" + usuario.getMail()+ "'", null);
		
		return p;

	}

	public Correo[] obtenerMensajesEnviados(UsuarioRegistrado usuario) throws PersistentException {
		System.out.println("obtener mensajes enviados");

		Correo[] o = basededatosorm.CorreoDAO.listCorreoByQuery("remitente = '" + usuario.getMail()+ "'", null);
		
		return o;

	}

	public void responderMensaje(Correo correo, String aAsunto, String aMensaje, String aRemitente,
			String aDestinatario, String aFechaEnvio) throws PersistentException {
		basededatosorm.CorreoDAO.deleteAndDissociate(basededatosorm.CorreoDAO.loadCorreoByORMID(correo.getIdCorreo()));
		
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession()
				.beginTransaction();
		
		
		try {

			Correo c = basededatosorm.CorreoDAO.createCorreo();

			c.setAsunto(aAsunto);
			c.setMensaje(aMensaje);
			c.setRemitente(aRemitente);
			c.setDestinatario(aDestinatario);
			c.setFechaEnvio(aFechaEnvio);
			c.setUsuarioRegistrado(correo.getUsuarioRegistrado());
			
			basededatosorm.CorreoDAO.save(c);
			
			t.commit();
		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
		}
		
		ProyectoWebPersistentManager.instance().disposePersistentManager();

	}

	public void crearMensaje(UsuarioRegistrado usuario, String aAsunto, String aMensaje, String aRemitente,
			String aDestinatario, String aFechaEnvio) throws PersistentException {
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession()
				.beginTransaction();
		try {
			Correo c = basededatosorm.CorreoDAO.createCorreo();

			c.setAsunto(aAsunto);
			c.setMensaje(aMensaje);
			c.setRemitente(aRemitente);
			c.setDestinatario(aDestinatario);
			c.setFechaEnvio(aFechaEnvio);
			c.setUsuarioRegistrado(usuario);
			
			basededatosorm.CorreoDAO.save(c);

			t.commit();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error en BDCOrreo crearMensaje");
			t.rollback();
		}
		
		ProyectoWebPersistentManager.instance().disposePersistentManager();
	}

//	public Correo obtenerMensaje(String aId) {
//		throw new UnsupportedOperationException();
//	}
}