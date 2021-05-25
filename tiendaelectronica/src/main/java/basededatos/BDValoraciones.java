package basededatos;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatosorm.Pendiente;
import basededatosorm.ProyectoWebPersistentManager;
import basededatosorm.Valoracion;

public class BDValoraciones {
	public BDPrincipal _unnamed_BDPrincipal_;
	public Vector<Valoracion> _contiene_valoracion = new Vector<Valoracion>();

	public Valoracion[] obtenerValoraciones(int aIdProducto) {
		throw new UnsupportedOperationException();
	}

	public void valorarProducto(int aIdProducto, String aValoracion) throws PersistentException {
		
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession()
				.beginTransaction();
		try {
			Valoracion p = basededatosorm.ValoracionDAO.createValoracion();

			
			
			basededatosorm.ValoracionDAO.save(p);
			t.commit();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error en BDPe");
			t.rollback();
		}
		ProyectoWebPersistentManager.instance().disposePersistentManager();
		
	}
}