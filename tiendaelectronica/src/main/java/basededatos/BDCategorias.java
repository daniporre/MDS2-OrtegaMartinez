package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatosorm.Categoria;

public class BDCategorias {
	public BDPrincipal _unnamed_BDPrincipal_;
	public Vector<Categoria> _contiene_categoria = new Vector<Categoria>();

	public Categoria[] obtenerCategorias() {
		throw new UnsupportedOperationException();
	}

	public void crearNuevaCategoria(String aNombreCategoria) throws PersistentException {
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession().beginTransaction();
	
		try {
			Categoria c = basededatosorm.CategoriaDAO.createCategoria();
			c.setNombre(aNombreCategoria);
			basededatosorm.CategoriaDAO.save(c);
			t.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			t.rollback();
		}
		
	}
}