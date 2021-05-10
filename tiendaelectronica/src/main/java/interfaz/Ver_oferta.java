package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatosorm.Producto;
import vistas.VistaVeroferta;

public class Ver_oferta extends VistaVeroferta {

	public HorizontalLayout layoutPrincipal = this.getVaadinHorizontalLayout();

	public Ver_oferta(Producto p) {
		super();

		Double a = p.getOferta().getPorcentaje();
		Double precioConOferta = p.getPrecio() - (p.getPrecio() * a / 100);
		this.getPrecioOferta().setText(p.getOferta().getNombreOferta() + ": " + Double.toString(precioConOferta) + "€");

		
		

		this.getVaadinHorizontalLayout().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				// TODO Auto-generated method stub
				System.out.println("Oferta pulsada: " + p.getNombre());
			}
		});
	}
}