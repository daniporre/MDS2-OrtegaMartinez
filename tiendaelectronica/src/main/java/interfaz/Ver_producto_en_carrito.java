package interfaz;

import java.util.ArrayList;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.server.VaadinSession;

import basededatosorm.Producto;
import vistas.VistaVerproductoencarrito;
import interfaz.Ver_carrito;

public class Ver_producto_en_carrito extends VistaVerproductoencarrito {

	Double unidades = 0.0;
	VaadinSession session = VaadinSession.getCurrent();

	public Ver_producto_en_carrito(Producto producto) {
		this.getNombreProductoLabel().setText(producto.getNombre());
		Double precioUnidad = producto.getPrecio();
		ArrayList<Producto> productos = (ArrayList<Producto>) session.getAttribute("carrito");
		

		Double precioConOferta = 0.0;

		if (producto.getOferta().getPorcentaje() != 0) {
			Double a = producto.getOferta().getPorcentaje();
			precioConOferta = producto.getPrecio() - (producto.getPrecio() * a / 100);
			this.getPrecioLabel()
					.setText(producto.getOferta().getNombreOferta() + ": " + Double.toString(precioConOferta) + "€");
		} else {
			this.getPrecioLabel().setText(Double.toString(producto.getPrecio()) + "€");
		}

		this.getAumentarButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				System.out.println("prueba ur");
				if(session!=null) {
					ArrayList<Producto> arr = (ArrayList<Producto>) session.getAttribute("carrito");
					arr.add(producto);
					Notification.show("Producto añadido, pulsa en actualizar el carrito").setPosition(Position.BOTTOM_END);
				}
			}
		});
		
		
		this.getEliminarProductoButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				System.out.println("prueba ur");
				if(session!=null) {
					ArrayList<Producto> arr = (ArrayList<Producto>) session.getAttribute("carrito");
					arr.remove(producto);
					getEliminarProductoButton().setEnabled(false);
					
					Notification.show("Producto eliminado, pulsa en actualizar el carrito").setPosition(Position.BOTTOM_END);
				}
			}
		});

	}
}