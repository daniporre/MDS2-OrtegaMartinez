package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import basededatosorm.Categoria;
import basededatosorm.Producto;
import basededatosorm.Usuario;
import vistas.VistaVercategoria;

public class Ver_categoría extends VistaVercategoria {
//	private Button _categoria;
//	public Categorías _categorías;

	public HorizontalLayout layoutPrincipal = this.getVaadinHorizontalLayout();

	public Ver_categoría(Categoria c) {
		super();
		this.getCategoriaButton().setText(c.getNombre());

		this.getVaadinHorizontalLayout().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {

			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				// TODO Auto-generated method stub
				System.out.println("Categoría pulsada: " + c.getNombre());
				if(getCategoriaButton().isEnabled()==true) {
					getCategoriaButton().setEnabled(false);
				} 
				if(getCategoriaButton().isEnabled()==false) {
					getCategoriaButton().setEnabled(true);
				} 
			}
		});
	}

	public void mostrarCategoria() {
		throw new UnsupportedOperationException();
	}
}