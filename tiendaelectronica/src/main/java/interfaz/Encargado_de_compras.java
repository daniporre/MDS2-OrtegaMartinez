package interfaz;

import java.util.Arrays;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.VaadinSession;

import basededatos.BDPrincipal;
import basededatosorm.Item;
import basededatosorm.Usuario;
import vistas.VistaEncargadodecompras;
import vistas.VistaVerlistadodecompras;

//import basededatos.iEncargado_de_compras;

public class Encargado_de_compras extends VistaVerlistadodecompras {
//	public iEncargado_de_compras _iEncargado_de_compras;
//	public Ver_listado_de_compras__Encargado_de_compras_ _ver_listado_de_compras__Encargado_de_compras_;

	BDPrincipal bdp = new BDPrincipal();
	VerticalLayout comprasLayout = this.getLayoutPrincipal().as(VerticalLayout.class);
	VerticalLayout principalLayout;
	VaadinSession session = VaadinSession.getCurrent();
	Usuario encargado;
	
	public Encargado_de_compras(Usuario usuario, VerticalLayout principalLayout) {
		this.principalLayout = principalLayout;
		this.encargado = usuario;
		
		actualizarComprasButton();
		actualizarCompras();
		cerrarSesion();
		
		System.out.println("hello"+Arrays.toString(bdp.cargarTodosPendientes()));
	}
	
	public void actualizarComprasButton() {
		this.getActualizarListaDeComprasButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				comprasLayout.removeAll();
				actualizarCompras();
				
			}
		});
		
	}
	public void actualizarCompras() {
		for (basededatosorm.Pendiente pendiente : bdp.cargarTodosPendientes()) {
			Item[] item = pendiente.items.toArray();
			for (int i = 0; i < item.length; i++) {
				System.out.println("Producto: "+item[i].getProducto().getNombre());
				
				Ver_compra vc = new Ver_compra(item[i].getProducto(), encargado, pendiente.getUsuarioRegistrado(), pendiente);
				vc.getRecibidoButton().setVisible(false);
				vc.getVerFichaUsuarioButton().setVisible(false);
				vc.getEstadoPedidoLabel().setText("Pendiente");
				comprasLayout.add(vc);
			}
		}
	}
	
	public void cerrarSesion() {
		this.getCerrarSesionButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Usuario_no_registrado unr = new Usuario_no_registrado(principalLayout);
				session.close();
				principalLayout.removeAll();
				principalLayout.add(unr);
			}
		});
		
	}

}