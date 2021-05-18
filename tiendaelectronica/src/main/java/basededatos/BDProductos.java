package basededatos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.vaadin.flow.component.notification.Notification;

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
			p.setOferta(aOferta);

			basededatosorm.ProductoDAO.save(p);
			t.commit();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error en BDProducto crearProducto");
			t.rollback();
		}
		
		
	}

	public void editarProducto(Producto producto,String aNombre, double aPrecio, String aMarca, Oferta aOferta, String aDescripcion) throws PersistentException{
		//NO PROBADO
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession()
				.beginTransaction();
		
		try {

			
			Producto p = basededatosorm.ProductoDAO.getProductoByORMID(producto.getIdProducto());
			
			p.setNombre(aNombre);
			p.setPrecio(aPrecio);
			p.setMarca(aMarca);
			p.setOferta(aOferta);
			p.setDescripcion(aDescripcion);
			
			
			t.commit();
		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
		}
		
	}

	public Producto obtenerProducto(String aNombreProducto) throws PersistentException {
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession()
				.beginTransaction();
		try {

			Producto[] ads = basededatosorm.ProductoDAO.listProductoByQuery(null, null);
			int idProducto = 0;

			for (Producto producto : ads) {
				if (producto.getNombre().toLowerCase().equals(aNombreProducto.toLowerCase())) {
					idProducto = producto.getIdProducto();
					break;
				}
			}

			if (idProducto == 0) {
				Notification.show("El producto no existe");
			}
			
			Producto ad = basededatosorm.ProductoDAO.loadProductoByORMID(idProducto);
			
			t.commit();
			System.out.println("este es el producto nombre: "+ad.getNombre());
			return ad;
		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
			return null;
		}
	}

	public Producto[] obtenerProductos() throws PersistentException {
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession()
				.beginTransaction();

		try {
			Producto[] o = basededatosorm.ProductoDAO.listProductoByQuery(null, null);

			t.commit();
			return o;
		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
			return null;
		}
	}

	public Producto[] obtenerProductos(String aNombre) throws PersistentException {
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession()
				.beginTransaction();

		try {
			Producto[] o = basededatosorm.ProductoDAO.listProductoByQuery(null, null);
			ArrayList<Producto> listaProductos = new ArrayList<Producto>();
			
			for (Producto producto : o) {
				if(producto.getNombre().toLowerCase().contains(aNombre.toLowerCase())) {
					listaProductos.add(producto);
				}
			}
			Producto[] productos = new Producto[listaProductos.size()];
			
			listaProductos.toArray(productos);
			t.commit();
			return productos;
		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
			return null;
		}
	}
	
	public void asignarCategoriaAProducto(Producto producto, Categoria categoria) throws PersistentException {
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession()
				.beginTransaction();
		
		try {
			Producto o = basededatosorm.ProductoDAO.getProductoByORMID(producto.getIdProducto());
			
			o.categorias.add(categoria);
			
			t.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
		}
	}
}