package interfaz;

import java.util.ArrayList;
import java.util.Iterator;

import basededatosorm.Producto;
import vistas.VistaFiltrarpormarca;

public class Filtrar extends VistaFiltrarpormarca {


//	public void Filtrar_por_precio() {
//		throw new UnsupportedOperationException();
//	}

	public Filtrar(Producto[] productos) {
		String[] marcas;
		
		
		ArrayList<Producto> arr = new ArrayList<Producto>();
		ArrayList<String> marcasAL = new ArrayList<String>();
		
		for (int i = 0; i < productos.length; i++) {
			arr.add(productos[i]);
		}
		
		for (Producto producto : arr) {
			if(!marcasAL.contains(producto.getMarca())) {
				marcasAL.add(producto.getMarca());
			}
		}
		marcas  = new String[marcasAL.size()];
		marcasAL.toArray(marcas);
		
		this.getRadioGroup().setItems(marcas);
	}
}