package interfaz;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.VaadinSession;

import basededatosorm.Producto;
import basededatosorm.Usuario;
import vistas.VistaVeroferta;

@SuppressWarnings("serial")
public class Ver_oferta extends VistaVeroferta {

	public HorizontalLayout layoutPrincipal = this.getVaadinHorizontalLayout();
	VaadinSession session = VaadinSession.getCurrent();

	public Ver_oferta(Producto p, Usuario usuario, VerticalLayout layoutprincipal) {
		setUp(p);
		this.getVaadinHorizontalLayout().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {

			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				System.out.println("Producto pulsado: " + p.getNombre());
				if (usuario.getMail().contains("administrador")) {

					Modificar_producto mp = new Modificar_producto(p, usuario, layoutprincipal);
					layoutprincipal.removeAll();
					layoutprincipal.add(mp);
				} else if (usuario != null) {
					
					goToVisualizarProducto(p, usuario, layoutprincipal);
					
				}
			}
		});
	}

	public Ver_oferta(Producto p, VerticalLayout layoutprincipal) {

		setUp(p);
		this.getVaadinHorizontalLayout().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {

			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				
				goToVisualizarProducto(p, null, layoutprincipal);

			}
		});
	}
	public void goToVisualizarProducto(Producto p, Usuario usuario, VerticalLayout layoutprincipal) {
		if(usuario==null) {
			Visualizar_producto vp = new Visualizar_producto(p, layoutprincipal);

			layoutprincipal.removeAll();
			layoutprincipal.add(vp);
		} else {
			Visualizar_producto vp = new Visualizar_producto(p, usuario, layoutprincipal);

			layoutprincipal.removeAll();
			layoutprincipal.add(vp);
		}
	}
	
	public void setUp(Producto p) {
		Double a = p.getOferta().getPorcentaje();
		Double precioConOferta = p.getPrecio() - (p.getPrecio() * a / 100);
		this.getPrecioOferta().setText(p.getOferta().getNombreOferta() + ": " + formatearNumero(precioConOferta) + "€");
//		this.getImagenProductoOferta().setSrc("");
	}

	public static BigDecimal formatearNumero(Double numero) {
		BigDecimal formatNumber = new BigDecimal(numero);
		formatNumber = formatNumber.setScale(2, RoundingMode.DOWN);
		return formatNumber;
	}
}