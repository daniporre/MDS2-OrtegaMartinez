package basededatos;

import java.util.Vector;
import basededatosorm.Producto;
import basededatosorm.Oferta;

public class BDProductos {
	public BDPrincipal _unnamed_BDPrincipal_;
	public Vector<Producto> _contiene_producto = new Vector<Producto>();

	public void aniadirProducto(String aNombre, double aPrecio, String aMarca, Oferta aOferta, String aDescripcion) {
		throw new UnsupportedOperationException();
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