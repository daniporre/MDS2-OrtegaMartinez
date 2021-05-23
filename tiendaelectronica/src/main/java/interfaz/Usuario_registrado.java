package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatosorm.Producto;
import basededatosorm.Usuario;
import basededatosorm.UsuarioRegistrado;
import vistas.VistaUsuarioregistrado;
import vistas.VistaVercatalogo;

//import basededatos.iUsuario_registrado;

@SuppressWarnings("serial")
public class Usuario_registrado extends VistaUsuarioregistrado {

	public VistaVercatalogo vc;
	public VerticalLayout layoutCatalogo;
	public BDPrincipal bdp = new BDPrincipal();
	
	public Usuario_registrado(UsuarioRegistrado usuario, VerticalLayout principalLayout) {
		vc = new Ver_catálogo(usuario, principalLayout);
		layoutCatalogo = this.getPrincipalVLayout().as(VerticalLayout.class);
		layoutCatalogo.add(vc);
		miCuenta(usuario, principalLayout);
		buscar(usuario, principalLayout);
	}
	
	public void miCuenta(UsuarioRegistrado usuario, VerticalLayout principalLayout) {
		this.getMiCuentaURButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Ver_cuenta__Usuario_registrado_ v = new Ver_cuenta__Usuario_registrado_(usuario, principalLayout);
				
				principalLayout.removeAll();
				principalLayout.add(v);
				
			}
		});
	}
	
	public void buscar(UsuarioRegistrado usuario, VerticalLayout principalLayout) {
		this.getBuscarNRButton().addClickListener(new ComponentEventListener() {

			@Override
			public void onComponentEvent(ComponentEvent event) {
				if(!getSearchBarUR().getValue().isEmpty()) {
					Producto[] productos = new Producto[bdp.buscarProducto(getSearchBarUR().getValue()).length];
					
					productos = bdp.buscarProducto(getSearchBarUR().getValue());
					
					Productos_buscados pb = new Productos_buscados(usuario, productos, layoutCatalogo, principalLayout);
					
					principalLayout.removeAll();
					principalLayout.add(pb);
				}
				
				
			}
		});
	}
	
	
	
}