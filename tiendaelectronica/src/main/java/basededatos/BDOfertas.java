package basededatos;

import java.util.Arrays;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.vaadin.flow.component.notification.Notification;

import basededatosorm.Categoria;
import basededatosorm.Encargado;
import basededatosorm.Oferta;

public class BDOfertas {
	public BDPrincipal _unnamed_BDPrincipal_;
	public Vector<Oferta> _contiene_oferta = new Vector<Oferta>();

	public Oferta obtenerOferta(String aNombreOferta) {
		throw new UnsupportedOperationException();
	}

	public Oferta[] obtenerOfertas() throws PersistentException {
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession()
				.beginTransaction();

		try {
			Oferta[] o = basededatosorm.OfertaDAO.listOfertaByQuery(null, null);

			t.commit();
			return o;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			t.rollback();
			return null;
		}

	}

	public void crearNuevaOferta(String aNombreOferta, int aDescuento) throws PersistentException {
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession()
				.beginTransaction();
		try {

			Oferta a = basededatosorm.OfertaDAO.createOferta();
			a.setNombreOferta(aNombreOferta);
			a.setPorcentaje(aDescuento);
			
			basededatosorm.OfertaDAO.save(a);

			t.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			t.rollback();
		}
	}

	public void darBajaOferta(String aNombreOferta) {
		throw new UnsupportedOperationException();
	}
}