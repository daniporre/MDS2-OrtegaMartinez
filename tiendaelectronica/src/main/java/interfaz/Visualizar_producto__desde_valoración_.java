package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatosorm.Producto;
import basededatosorm.Usuario;

public class Visualizar_producto__desde_valoración_ extends Visualizar_producto {
	public Visualizar_producto__desde_valoración_(Producto p, Usuario usuario, VerticalLayout layoutprincipal) {
		super(p,usuario,layoutprincipal);
		// TODO Auto-generated constructor stub
	}

	

	public Valoración _valoración;
}