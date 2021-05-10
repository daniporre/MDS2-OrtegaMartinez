package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatosorm.Producto;
import vistas.VistaVerproducto;

public class Ver_producto extends VistaVerproducto {

	
	public HorizontalLayout layoutPrincipal = this.getVaadinHorizontalLayout();
	
	public Ver_producto(Producto p) {
		this.getNombreProducto().setText(p.getNombre());
		this.getDescripcionProducto().setText(p.getDescripcion());
		
		layoutPrincipal.setClassName("styled");
		
		if(p.getOferta().getPorcentaje() != 0) {
			Double a = p.getOferta().getPorcentaje();
			Double precioConOferta = p.getPrecio() - (p.getPrecio() * a/100);
			this.getPrecioProducto().setText(p.getOferta().getNombreOferta()+": "+Double.toString(precioConOferta)+"€");
		} else {
			this.getPrecioProducto().setText(Double.toString(p.getPrecio())+"€");
		}
		
		
		this.getVaadinHorizontalLayout().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				// TODO Auto-generated method stub
				System.out.println("Producto pulsado: " + p.getNombre());
			}
		});
		
	}
}