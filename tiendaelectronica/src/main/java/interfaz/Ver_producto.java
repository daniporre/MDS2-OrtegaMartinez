package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatosorm.Producto;
import basededatosorm.Usuario;
import vistas.VistaVerproducto;

public class Ver_producto extends VistaVerproducto {

	public HorizontalLayout layoutPrincipalVerProducto = this.getVaadinHorizontalLayout();

	public Ver_producto(Producto p, Usuario usuario, VerticalLayout layoutprincipal) {
		this.getNombreProducto().setText(p.getNombre());
		this.getDescripcionProducto().setText(p.getDescripcion());

		layoutPrincipalVerProducto.setClassName("styled");

		if (p.getOferta().getPorcentaje() != 0) {
			Double a = p.getOferta().getPorcentaje();
			Double precioConOferta = p.getPrecio() - (p.getPrecio() * a / 100);
			this.getPrecioProducto()
					.setText(p.getOferta().getNombreOferta() + ": " + Double.toString(precioConOferta) + "€");
		} else {
			this.getPrecioProducto().setText(Double.toString(p.getPrecio()) + "€");
		}

		this.getVaadinHorizontalLayout().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {

			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				System.out.println("Producto pulsado: " + p.getNombre());
				if (usuario.getMail().contains("administrador")) {

					Modificar_producto mp = new Modificar_producto(p, usuario, layoutprincipal);
					layoutprincipal.removeAll();
					layoutprincipal.add(mp);
				} else if (usuario != null) {
					Visualizar_producto vp = new Visualizar_producto(p, usuario, layoutprincipal);
					layoutprincipal.removeAll();
					layoutprincipal.add(vp);
				} else {
					Visualizar_producto vp = new Visualizar_producto(p, layoutprincipal);
					layoutprincipal.removeAll();
					layoutprincipal.add(vp);
				}
			}
		});

	}

	public Ver_producto(Producto p, VerticalLayout layoutPincipal) {
		// TODO Auto-generated constructor stub
		this.getNombreProducto().setText(p.getNombre());
		this.getDescripcionProducto().setText(p.getDescripcion());

		layoutPrincipalVerProducto.setClassName("styled");

		if (p.getOferta().getPorcentaje() != 0) {
			Double a = p.getOferta().getPorcentaje();
			Double precioConOferta = p.getPrecio() - (p.getPrecio() * a / 100);
			this.getPrecioProducto()
					.setText(p.getOferta().getNombreOferta() + ": " + Double.toString(precioConOferta) + "€");
		} else {
			this.getPrecioProducto().setText(Double.toString(p.getPrecio()) + "€");
		}

		this.getVaadinHorizontalLayout().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {

			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				System.out.println("Producto pulsado: " + p.getNombre());

				Visualizar_producto vp = new Visualizar_producto(p, layoutPincipal);
				layoutPincipal.removeAll();
				layoutPincipal.add(vp);

			}
		});
	}
}