package basededatos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.vaadin.flow.component.notification.Notification;

import basededatosorm.Administrador;
import basededatosorm.Categoria;
import basededatosorm.Encargado;
import basededatosorm.Oferta;
import basededatosorm.ProyectoWebPersistentManager;

public class BDOfertas {
	public BDPrincipal _unnamed_BDPrincipal_;
	public Vector<Oferta> _contiene_oferta = new Vector<Oferta>();

	public Oferta obtenerOferta(String aNombreOferta) throws PersistentException {

		Oferta[] ads = basededatosorm.OfertaDAO.listOfertaByQuery(null, null);
		int idOferta = 0;

		for (Oferta oferta : ads) {
			if (oferta.getNombreOferta().toLowerCase().equals(aNombreOferta.toLowerCase())) {
				idOferta = oferta.getIdOferta();
				break;
			}

		}

		if (idOferta == 0) {
			Notification.show("La oferta no existe");
		}

		Oferta ad = basededatosorm.OfertaDAO.loadOfertaByORMID(idOferta);

		return ad;

	}

	public Oferta[] obtenerOfertas() throws PersistentException {

		Oferta[] o = basededatosorm.OfertaDAO.listOfertaByQuery(null, null);

		return o;

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
		ProyectoWebPersistentManager.instance().disposePersistentManager();
	}

	public void darBajaOferta(String aNombreOferta) throws PersistentException {
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession()
				.beginTransaction();
		try {

			Oferta[] ads = basededatosorm.OfertaDAO.listOfertaByQuery(null, null);

			for (Oferta oferta : ads) {

				if (oferta.getNombreOferta().toLowerCase().equals(aNombreOferta.toLowerCase())) {
					basededatosorm.OfertaDAO.delete(oferta);
					break;
				}

			}
			t.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			t.rollback();
		}
		ProyectoWebPersistentManager.instance().disposePersistentManager();
	}
}