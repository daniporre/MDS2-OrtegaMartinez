package interfaz;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.VaadinSession;

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
	VaadinSession session = VaadinSession.getCurrent();
	public VerticalLayout principalLayout;
	public UsuarioRegistrado usuario;
	
	public Usuario_registrado(UsuarioRegistrado usuario, VerticalLayout principalLayout) {
		this.principalLayout = principalLayout;
		this.usuario = usuario;

		if(session.getAttribute("carrito")!=null)
			System.out.println("Desde ur; "+session.getAttribute("carrito").toString());
		
		actualizarCatalogo();
		miCuenta();
		buscar();
		carrito();
		inicio();
	}
	
	public void inicio() {
		this.getInicioURButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layoutCatalogo.removeAll();
				actualizarCatalogo();
				
			}
		});
	}
	
	public void actualizarCatalogo() {
		vc = new Ver_catálogo(usuario, principalLayout);
		layoutCatalogo = this.getPrincipalVLayout().as(VerticalLayout.class);
		layoutCatalogo.add(vc);
	}
	
	public void miCuenta() {
		this.getMiCuentaURButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Ver_cuenta__Usuario_registrado_ v = new Ver_cuenta__Usuario_registrado_(usuario, principalLayout);
				
				principalLayout.removeAll();
				principalLayout.add(v);
				
			}
		});
	}
	
	public void buscar() {
		this.getBuscarNRButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
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
	
	public void carrito() {
		Ver_carrito carrito;
		
		carrito = new Ver_carrito(usuario, principalLayout);

		this.getCarritoURButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				principalLayout.removeAll();
				principalLayout.add(carrito);

			}

		});
	}
	
	
	
}