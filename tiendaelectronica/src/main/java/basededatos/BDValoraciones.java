package basededatos;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;

import org.hibernate.Session;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatosorm.Pendiente;
import basededatosorm.Producto;
import basededatosorm.ProyectoWebPersistentManager;
import basededatosorm.Valoracion;

public class BDValoraciones {
	public BDPrincipal _unnamed_BDPrincipal_;
	public Vector<Valoracion> _contiene_valoracion = new Vector<Valoracion>();

	public Valoracion[] obtenerValoraciones(int aIdProducto) {
		throw new UnsupportedOperationException();
	}

	public void valorarProducto(Producto aProducto, basededatosorm.Valoracion aValoracion) throws PersistentException {

		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession()
				.beginTransaction();
		try {
			Valoracion v = basededatosorm.ValoracionDAO.createValoracion();

			v.setComentario(aValoracion.getComentario());
			v.setValor(aValoracion.getValor());
			v.setUsuarioRegistrado(aValoracion.getUsuarioRegistrado());
			Producto p= basededatosorm.ProductoDAO.loadProductoByORMID(aProducto.getIdProducto());
			p.valoracions.add(v);
			
			basededatosorm.ValoracionDAO.save(v);
			t.commit();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error en BDPe");
			t.rollback();
		}
		ProyectoWebPersistentManager.instance().disposePersistentManager();
		
	}
	
}