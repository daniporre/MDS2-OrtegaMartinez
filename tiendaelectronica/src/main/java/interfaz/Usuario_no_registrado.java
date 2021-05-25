package interfaz;

import java.util.ArrayList;
import java.util.Arrays;

import org.orm.PersistentException;

import basededatos.BDPrincipal;
import basededatos.iUsuario_no_registrado;
import basededatosorm.Producto;
import basededatosorm.Usuario;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.VaadinSession;

import vistas.VistaUsuarionoregistrado;
import vistas.VistaVercatalogo;

@SuppressWarnings("serial")
public class Usuario_no_registrado extends VistaUsuarionoregistrado {

	public VerticalLayout layoutCatalogo;
	public VerticalLayout layoutPrincipal;
	public Ver_catálogo vc;
	public Iniciar_sesión lg;
	public Ver_carrito carrito;
	public BDPrincipal bdp = new BDPrincipal();

	VaadinSession session = VaadinSession.getCurrent();

	public Usuario_no_registrado() {
		super();
		if (layoutPrincipal == null) {
			layoutPrincipal = this.getPrimerVerticalLayout().as(VerticalLayout.class);
		}
		inicializarUNR();
		inicio();
	}

	@SuppressWarnings("unchecked")
	public Usuario_no_registrado(VerticalLayout layoutPrincipal) {
		super();
		this.layoutPrincipal = layoutPrincipal;
		if (layoutPrincipal == null) {
			layoutPrincipal = this.getPrimerVerticalLayout().as(VerticalLayout.class);
		}
		inicializarUNR();
		inicio();
		
	}
	
	public void inicio() {
		this.getInicioUNR().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layoutCatalogo.removeAll();
				actualizarCatalogo();
			}
		});
	}
	

	public void inicializarUNR() {

		if (session.getAttribute("carrito") == null)
			session.setAttribute("carrito", new ArrayList<String>());

		try {
			lg = new Iniciar_sesión(layoutPrincipal);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		actualizarCatalogo();
		buscarEnCatalogo();
		iniciarSesionUNR();
		verCarrito();
	}

	public void actualizarCatalogo() {
		vc = new Ver_catálogo(layoutPrincipal);
		layoutCatalogo = this.getCatalogoVLayout().as(VerticalLayout.class);
		layoutCatalogo.add(vc);
	}

	public void buscarEnCatalogo() {
		this.getSearchIconUNR().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if (!getSearchBarUNR().getValue().isEmpty()) {
					Producto[] productos = new Producto[bdp.buscarProducto(getSearchBarUNR().getValue()).length];

					productos = bdp.buscarProducto(getSearchBarUNR().getValue());

					Productos_buscados pb = new Productos_buscados(productos, layoutCatalogo, layoutPrincipal);

					layoutPrincipal.removeAll();
					layoutPrincipal.add(pb);
				}

			}
		});
	}

	public void iniciarSesionUNR() {
		this.getIniciarSesionUNR().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				layoutPrincipal.removeAll();
				layoutPrincipal.add(lg);

			}

		});
	}

	public void verCarrito() {
		carrito = new Ver_carrito__Usuario_no_registrado_(layoutPrincipal);

		this.getCarritoUNR().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				layoutPrincipal.removeAll();
				layoutPrincipal.add(carrito);

			}

		});
	}

}