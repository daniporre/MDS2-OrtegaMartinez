package interfaz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.mapping.Component;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.AbstractField.ComponentValueChangeEvent;
import com.vaadin.flow.component.HasValue.ValueChangeListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexLayout.ContentAlignment;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatosorm.Producto;
import vistas.VistaVercatalogo;

public class Ver_catálogo extends VistaVercatalogo {

	public VerticalLayout layoutPrincipal = this.getVaadinVerticalLayout().as(VerticalLayout.class);
	public VerticalLayout v = this.getProductosEnCatalogoVLayout().as(VerticalLayout.class);
	public Ver_producto vp;
	public BDPrincipal bdp = new BDPrincipal();
	public String[] comboOrdenar = { "Más caros primero", "Más baratos primero"};
	public Producto[] p = new Producto[bdp.verCatalogo().length];
	public ArrayList<Producto> arr = new ArrayList<Producto>();

	public Ver_catálogo() {

		this.getOrdenarPorCombobox().setItems(comboOrdenar);
		
		for (int i = 0; i < bdp.verCatalogo().length; i++) {
			p[i] = bdp.verCatalogo()[i];
		}
		
		this.getOrdenarPorCombobox().addValueChangeListener(event -> {
			if (getOrdenarPorCombobox().getValue() == "Más baratos primero") {
				for (int i = 0; i < bdp.verCatalogo().length; i++) {
					p[i] = bdp.verCatalogo()[i];
				}
				Arrays.sort(p);
				getProductosEnCatalogoVLayout().removeAllChildren();
				actualizarCatalogo();
			}
			
			if (getOrdenarPorCombobox().getValue() == "Más caros primero") {
				for (int i = 0; i < bdp.verCatalogo().length; i++) {
					p[i] = bdp.verCatalogo()[i];
				}
				Arrays.sort(p);
				invArray(p);
				getProductosEnCatalogoVLayout().removeAllChildren();
				actualizarCatalogo();
			}
		});
		actualizarCatalogo();
	}

	public void verCarrito() {

	}
	
	public void actualizarCatalogo() {
		
		for (int i = 0; i < p.length; i++) {
			vp = new Ver_producto(p[i]);
			vp.getVaadinHorizontalLayout().setAlignItems(Alignment.STRETCH);
			v.setAlignItems(Alignment.STRETCH);
			//Aqui hay que acceder a la bd para obtener las imagenes del producto con su id en p[i]
			v.add(vp);
		}
	}
	
	public void actualizarListaOfertas() {
		
	}

	public void buscarProducto() {
		throw new UnsupportedOperationException();
	}
	
	public static Producto[] invArray(Producto[] n) {
	    Producto aux;
	    for (int i = 0; i < n.length / 2; i++) {
	        aux = n[i];
	        n[i] = n[n.length - 1 - i];
	        n[n.length - 1 - i] = aux;
	    }

	    return n;
	}

}