package interfaz;

import java.util.Arrays;

import basededatos.BDPrincipal;
import vistas.VistaVerlistadodecompras;

public class Ver_listado_de_compras__Encargado_de_compras_ extends VistaVerlistadodecompras {
	public Encargado_de_compras _encargado_de_compras;
	public Pedidos__Encargado_de_compras_ _pedidos__Encargado_de_compras_;
	BDPrincipal bdp = new BDPrincipal();
	
	public Ver_listado_de_compras__Encargado_de_compras_() {
		System.out.println(Arrays.toString(bdp.cargarTodosPendientes()));
	}
	
}