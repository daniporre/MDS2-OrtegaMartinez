package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatosorm.Producto;
import basededatosorm.Usuario;
import vistas.VistaVisualizarproducto;

//import Diagrama_de_clases_correcto.Valoraciones_del_producto;

public class Visualizar_producto extends VistaVisualizarproducto {

	VerticalLayout estelayout = this.getVaadinVerticalLayout().as(VerticalLayout.class);

	public Visualizar_producto(Producto p, Usuario usuario, VerticalLayout layoutprincipal) {
		this.getNombreProductoTitulo().setText(p.getNombre());
		this.getDecuentoProductoLabel().setText((p.getOferta().getPorcentaje()+"%"));
		this.getDescripcionProductoTArea().setValue(p.getDescripcion());
		if(p.getOferta().getPorcentaje() != 0) {
			Double a = p.getOferta().getPorcentaje();
			Double precioConOferta = p.getPrecio() - (p.getPrecio() * a/100);
			this.getPrecioProductoLabel().setText(p.getOferta().getNombreOferta()+": "+Double.toString(precioConOferta)+"€");
		} else {
			this.getPrecioProductoLabel().setText(Double.toString(p.getPrecio())+"€");
		}
		this.getReferenciaProductoLabel().setText(String.valueOf(p.getIdProducto()));
		//TODO Acceder a bd valoraciones y buscar este producto, mostrar las suyas
//		this.getValoracionProductoLabel().setText();
		this.getInicioButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				estelayout.removeAll();
				estelayout.add(layoutprincipal);
			}
		});
	}
	
	public Visualizar_producto(Producto p, VerticalLayout layoutprincipal) {
		this.getNombreProductoTitulo().setText(p.getNombre());
		this.getDecuentoProductoLabel().setText((p.getOferta().getPorcentaje()+"%"));
		this.getDescripcionProductoTArea().setValue(p.getDescripcion());
		if(p.getOferta().getPorcentaje() != 0) {
			Double a = p.getOferta().getPorcentaje();
			Double precioConOferta = p.getPrecio() - (p.getPrecio() * a/100);
			this.getPrecioProductoLabel().setText(p.getOferta().getNombreOferta()+": "+Double.toString(precioConOferta)+"€");
		} else {
			this.getPrecioProductoLabel().setText(Double.toString(p.getPrecio())+"€");
		}
		this.getReferenciaProductoLabel().setText(String.valueOf(p.getIdProducto()));
		//TODO Acceder a bd valoraciones y buscar este producto, mostrar las suyas
//		this.getValoracionProductoLabel().setText();
		this.getInicioButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				estelayout.removeAll();
				estelayout.add(layoutprincipal);
			}
		});
	}
	
	public void añadirAlCarrito() {
		throw new UnsupportedOperationException();
	}
}