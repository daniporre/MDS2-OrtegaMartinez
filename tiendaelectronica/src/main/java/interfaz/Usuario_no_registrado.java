package interfaz;

import java.util.Arrays;

import org.orm.PersistentException;

import basededatos.BDPrincipal;
import basededatos.iUsuario_no_registrado;
import basededatosorm.Producto;
import basededatosorm.Usuario;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaUsuarionoregistrado;
import vistas.VistaVercatalogo;

public class Usuario_no_registrado extends VistaUsuarionoregistrado {
	
	 
	public VerticalLayout layoutCatalogo;
	public VerticalLayout layoutPrincipal = this.getPrimerVerticalLayout().as(VerticalLayout.class);
	public Ver_catálogo vc = new Ver_catálogo(layoutPrincipal);
	public Iniciar_sesión lg;
	public Ver_carrito carrito;
	public BDPrincipal bdp = new BDPrincipal();
	
	@SuppressWarnings("unchecked")
	public Usuario_no_registrado() {
		
		super();
		
		layoutCatalogo = this.getCatalogoVLayout().as(VerticalLayout.class);
		layoutCatalogo.add(vc);
		
		
		
		try {
			lg = new Iniciar_sesión();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.getSearchIconUNR().addClickListener(new ComponentEventListener() {

			@Override
			public void onComponentEvent(ComponentEvent event) {
				
				Producto[] productos = new Producto[bdp.buscarProducto(getSearchBarUNR().getValue()).length];
				
				productos = bdp.buscarProducto(getSearchBarUNR().getValue());
				
				System.out.println("productos buscados: "+Arrays.toString(productos));
				Productos_buscados pb = new Productos_buscados(productos, layoutCatalogo);
				
				layoutPrincipal.removeAll();
				layoutPrincipal.add(pb);
				
			}
		});
		
		this.getIniciarSesionUNR().addClickListener(new ComponentEventListener() {

			@Override
			public void onComponentEvent(ComponentEvent event) {
				
				layoutPrincipal.removeAll();
				layoutPrincipal.add(lg);
				
			}
		
		
		
		});
		
		carrito = new Ver_carrito();
		
		this.getCarritoUNR().addClickListener(new ComponentEventListener() {

			@Override
			public void onComponentEvent(ComponentEvent event) {

				layoutPrincipal.removeAll();
				layoutPrincipal.add(carrito);
				
			}
		
		
		
		});
		
	
	}

//	public Usuario_no_registrado() {
//		
////		 layout = this.getLayoutCibernauta().as(VerticalLayout.class);
////		 lg = new Login();
////		 
////		 this.getLogin().addClickListener(new ComponentEventListener() {
////			@Override
////			public void onComponentEvent(ComponentEvent event) {
////				 
////				layout.remove(ccbn);				
////				layout.add(lg);
////				
////			}
////		});
//		  
//		 
//	}
	
	
}