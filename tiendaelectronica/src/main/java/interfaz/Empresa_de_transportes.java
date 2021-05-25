package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.VaadinSession;

import basededatos.BDPrincipal;
import basededatosorm.Item;
import basededatosorm.Usuario;
import vistas.VistaEmpresadetransportes;

//import basededatos.iEmpresa_de_transportes;

public class Empresa_de_transportes extends VistaEmpresadetransportes {
//	public iEmpresa_de_transportes _iEmpresa_de_transportes;
//	public Ver_listado_de_compras__Empresa_transportes_ _ver_listado_de_compras__Empresa_transportes_;

	BDPrincipal bdp = new BDPrincipal();
	VerticalLayout comprasLayout = this.getVaadinVerticalLayout1().as(VerticalLayout.class);
	VerticalLayout principalLayout;
	VaadinSession session = VaadinSession.getCurrent();
	Usuario transporte;
	
	public Empresa_de_transportes(Usuario transporte, VerticalLayout principalLayout) {
		this.principalLayout = principalLayout;
		this.transporte = transporte;
		actualizarCompras();
		cerrarSesion();
		recargarComprasButton();
	}
	
	public void recargarComprasButton() {
		this.getReloadButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				comprasLayout.removeAll();
				actualizarCompras();
			}
		});
	}
	
	public void actualizarCompras() {
		for (basededatosorm.Enviado enviado : bdp.cargarTodosEnviados()) {
			Item[] item = enviado.items.toArray();
			for (int i = 0; i < item.length; i++) {
				System.out.println("Producto: "+item[i].getProducto().getNombre());
				
				Ver_compra vc = new Ver_compra(item[i].getProducto(), transporte, enviado.getUsuarioRegistrado(), enviado, principalLayout);
				vc.getEnviarPedidoButton().setVisible(false);
				comprasLayout.add(vc);
				
			}
		}
	}
	public void cerrarSesion() {
		this.getLogOutButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
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