package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatosorm.Administrador;
import basededatosorm.UsuarioRegistrado;

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
}