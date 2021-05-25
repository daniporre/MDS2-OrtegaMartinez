package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.VaadinSession;

import basededatos.BDPrincipal;
import basededatosorm.Item;
import basededatosorm.Producto;
import basededatosorm.Usuario;
import basededatosorm.UsuarioRegistrado;
import vistas.VistaVerlistadodecompras;

@SuppressWarnings("serial")
public class Ver_listado_de_compras__Administrador_ extends VistaVerlistadodecompras {
	public Administrador _administrador;
	BDPrincipal bdp = new BDPrincipal();
	VaadinSession session = VaadinSession.getCurrent();
	VerticalLayout pedidosLayout = this.getLayoutPrincipal().as(VerticalLayout.class);

	public Ver_listado_de_compras__Administrador_(Usuario administrador, VerticalLayout principalLayout) {

		this.getActualizarListaDeComprasButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				pedidosLayout.removeAll();
				actualizarCompras(administrador, principalLayout);
			}
		});
		
		this.getCerrarSesionButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Usuario_no_registrado unr = new Usuario_no_registrado(principalLayout);
				session.close();
				principalLayout.removeAll();
				principalLayout.add(unr);
			}
		});
		this.getInicioButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				principalLayout.removeAll();
				principalLayout.add(new Administrador(administrador, principalLayout));
			}
		});
		actualizarCompras(administrador, principalLayout);
	}

	public void actualizarCompras(Usuario administrador, VerticalLayout principalLayout) {
		for (basededatosorm.Pendiente pendiente : bdp.cargarTodosPendientes()) {
			Item[] item = pendiente.items.toArray();
			for (int i = 0; i < item.length; i++) {

				Producto producto = item[i].getProducto();

				Ver_compra vc = new Ver_compra(producto, pendiente.getUsuarioRegistrado(), pendiente, principalLayout);

				vc.getEstadoPedidoLabel().setText("Pendiente");
				ocultarBotones(vc);

				pedidosLayout.add(vc);
			}
		}
		for (basededatosorm.Enviado enviado : bdp.cargarTodosEnviados()) {
			Item[] item = enviado.items.toArray();
			for (int i = 0; i < item.length; i++) {
				Producto producto = item[i].getProducto();
				Ver_compra vc = new Ver_compra(producto, enviado.getUsuarioRegistrado(), enviado, principalLayout);

				vc.getEstadoPedidoLabel().setText("Enviado");
				ocultarBotones(vc);
				pedidosLayout.add(vc);
			}
		}
		for (basededatosorm.Entregado entregado : bdp.cargarTodosEntregado()) {
			Item[] item = entregado.items.toArray();
			for (int i = 0; i < item.length; i++) {
				Producto producto = item[i].getProducto();
				Ver_compra vc = new Ver_compra(producto, entregado.getUsuarioRegistrado(), entregado, principalLayout);

				vc.getEstadoPedidoLabel().setText("Entregado");
				ocultarBotones(vc);
				pedidosLayout.add(vc);
			}
		}
	}
	
	public void ocultarBotones(Ver_compra vc) {
		vc.getEnviarPedidoButton().setVisible(false);
		vc.getRecibidoButton().setVisible(false);
		vc.getVerFichaUsuarioButton().setVisible(false);
	}

}