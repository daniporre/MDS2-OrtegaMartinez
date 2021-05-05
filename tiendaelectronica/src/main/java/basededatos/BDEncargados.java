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

public class BDEncargados {
	public BDPrincipal _unnamed_BDPrincipal_;
	public Vector<Encargado> _contiene_encargado = new Vector<Encargado>();

	public void crearUsuario(String aMail, String aContraseña) throws PersistentException {
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession().beginTransaction();
		try {
			Encargado a = basededatosorm.EncargadoDAO.createEncargado();
			a.setMail(aMail);
			a.setContraseña(aContraseña);
			basededatosorm.EncargadoDAO.save(a);
			t.commit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error en BDAdministradores crearUsuario");
			t.rollback();
		}
	}
	
	public Usuario[] cargarUsuarios() throws PersistentException {
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession().beginTransaction();
		try {
			
			Encargado[] en = basededatosorm.EncargadoDAO.listEncargadoByQuery(null, null);
			System.out.println("Encargados");
			System.out.println(Arrays.toString(en));
			t.commit();
			return en;
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

			Encargado[] ads = basededatosorm.EncargadoDAO.listEncargadoByQuery(null, null);
			int idUsuario = 0;

			for (Encargado encargado : ads) {
				if (encargado.getMail().equals(aMail)) {
					idUsuario = encargado.getIdUsuario();
					break;
				}

			}

			if (idUsuario == 0) {
				Notification.show("El usuario no existe");
			}
			
			Encargado ad = basededatosorm.EncargadoDAO.loadEncargadoByORMID(idUsuario);
			Notification.show("La contraseña se ha cambiado correctamente");
			ad.setContraseña(aNuevaContrasenia);

			t.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			t.rollback();
		}
	}
}