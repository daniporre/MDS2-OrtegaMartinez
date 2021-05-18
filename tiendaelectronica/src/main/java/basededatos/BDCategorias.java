package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.vaadin.flow.component.notification.Notification;

import basededatosorm.Categoria;
import basededatosorm.Oferta;

public class BDCategorias {
	public BDPrincipal _unnamed_BDPrincipal_;
	public Vector<Categoria> _contiene_categoria = new Vector<Categoria>();

	public Categoria[] obtenerCategorias() throws PersistentException {
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession()
				.beginTransaction();

		try {
			Categoria[] o = basededatosorm.CategoriaDAO.listCategoriaByQuery(null, null);
			
			t.commit();
			return o;
		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
			return null;
		}
	}

	public void crearNuevaCategoria(String aNombreCategoria) throws PersistentException {
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession().beginTransaction();
	
		try {
			Categoria c = basededatosorm.CategoriaDAO.createCategoria();
			c.setNombre(aNombreCategoria);
			basededatosorm.CategoriaDAO.save(c);
			t.commit();
		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
		}
		
	}
	
	public Categoria obtenerCategoria(String aNombreCategoria) throws PersistentException {
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession()
				.beginTransaction();
		try {

			Categoria[] ads = basededatosorm.CategoriaDAO.listCategoriaByQuery(null, null);
			int idCategoria = 0;

			for (Categoria categoria : ads) {
				if (categoria.getNombre().toLowerCase().equals(aNombreCategoria.toLowerCase())) {
					idCategoria = categoria.getIdCategoria();
					break;
				}

			}

			if (idCategoria == 0) {
				Notification.show("La categoria no existe");
			}
			
			Categoria ad = basededatosorm.CategoriaDAO.loadCategoriaByORMID(idCategoria);
			
			t.commit();
			return ad;
		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
			return null;
		}
	}
}