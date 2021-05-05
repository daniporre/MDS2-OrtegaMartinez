package basededatos;

import java.util.Arrays;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.vaadin.flow.component.notification.Notification;

import basededatosorm.Administrador;
import basededatosorm.Encargado;
import basededatosorm.Transportista;
import basededatosorm.Usuario;

public class BDTransportistas {
	public BDPrincipal _unnamed_BDPrincipal_;
	public Vector<Transportista> _contiene_transportista = new Vector<Transportista>();

	public void crearUsuario(String aMail, String aContraseña) throws PersistentException {
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession()
				.beginTransaction();
		try {
			Transportista a = basededatosorm.TransportistaDAO.createTransportista();
			a.setMail(aMail);
			a.setContraseña(aContraseña);
			basededatosorm.TransportistaDAO.save(a);
			t.commit();
		} catch (PersistentException e) {
			// TODO: handle exception
			System.out.println("Error en BDAdministradores crearUsuario");
			t.rollback();
		}
	}

	public Usuario[] cargarUsuarios() throws PersistentException {
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession()
				.beginTransaction();
		try {

			Transportista[] tr = basededatosorm.TransportistaDAO.listTransportistaByQuery(null, null);

			System.out.println("Transportistas");
			System.out.println(Arrays.toString(tr));
			t.commit();
			return tr;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			t.rollback();
			return null;
		}

	}

	public void cambiarContraseniaAdmin(String aMail, String aNuevaContrasenia) throws PersistentException {
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession()
				.beginTransaction();
		try {

			Transportista[] ads = basededatosorm.TransportistaDAO.listTransportistaByQuery(null, null);
			int idUsuario = 0;

			for (Transportista transportista : ads) {
				if (transportista.getMail().equals(aMail)) {
					idUsuario = transportista.getIdUsuario();
					break;
				}

			}

			if (idUsuario == 0) {
				Notification.show("El usuario no existe");
			}

			Transportista ad = basededatosorm.TransportistaDAO.loadTransportistaByORMID(idUsuario);
			Notification.show("La contraseña se ha cambiado correctamente");
			ad.setContraseña(aNuevaContrasenia);

			t.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			t.rollback();
		}
	}

	public Usuario iniciarSesion(String aCorreo, String aContrasenia) throws PersistentException {
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession()
				.beginTransaction();
		try {

			Transportista[] ads = basededatosorm.TransportistaDAO.listTransportistaByQuery(null, null);
			int idUsuario = 0;

			for (Transportista transportista : ads) {
				if (transportista.getMail().equals(aCorreo)) {
					idUsuario = transportista.getIdUsuario();
					break;
				}

			}

			if (idUsuario == 0) {
				Notification.show("El usuario no existe");
			}
			
			Transportista ad = basededatosorm.TransportistaDAO.loadTransportistaByORMID(idUsuario);
			
			if(ad.getContraseña().equals(aContrasenia)) {
				return ad;
			} else {
				Notification.show("La contraseña es incorrecta");
			}

			t.commit();
			return new Usuario();
		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
			return null;
		}
	}
}