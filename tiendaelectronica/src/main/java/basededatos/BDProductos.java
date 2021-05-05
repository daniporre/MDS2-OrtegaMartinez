package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatosorm.Producto;
import basededatosorm.Administrador;
import basededatosorm.Categoria;
import basededatosorm.Oferta;

public class BDProductos {
	public BDPrincipal _unnamed_BDPrincipal_;
	public Vector<Producto> _contiene_producto = new Vector<Producto>();

	public void aniadirProducto(String aNombre, double aPrecio, String aMarca, Oferta aOferta, String aDescripcion) throws PersistentException {
		
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession()
				.beginTransaction();
		try {
			Producto p = basededatosorm.ProductoDAO.createProducto();
			p.setNombre(aNombre);
			p.setPrecio(aPrecio);
			p.setMarca(aMarca);
			p.setDescripcion(aDescripcion);
			//Acceder a categorias en la bd y ponerla aqui
//			BDCategorias c = new BDCategorias();
//			Categoria a = new Categoria();
//			
//			
//			for (Categoria cat : c.obtenerCategorias()) {
//				a = cat;
//			}
//			
//			
//			p.setCategoria(a);
			basededatosorm.ProductoDAO.save(p);
			t.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Error en BDProducto crearProducto");
			t.rollback();
		}
		
		
	}

	public Producto editarProducto(String aNombre, double aPrecio, String aMarca, Oferta aOferta, String aDescripcion) {
		throw new UnsupportedOperationException();
	}

	public Producto obtenerProducto(String aNombreProducto) {
		throw new UnsupportedOperationException();
	}

	public Producto[] obtenerProductos() {
		throw new UnsupportedOperationException();
	}

	public Producto[] obtenerProductos(String aNombre) {
		throw new UnsupportedOperationException();
	}
}