package interfaz;

import vistas.VistaAdministrador;
import vistas.VistaGestionarusuarios;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;

public class Administrador extends VistaAdministrador {

	public VerticalLayout layoutPrincipal = this.getVaadinVerticalLayout().as(VerticalLayout.class);
	public VerticalLayout catalogoVLayout = this.getPrincipalVLayout().as(VerticalLayout.class);
	public Ver_catálogo vc = new Ver_catálogo();
	public BDPrincipal bdp;
	
	
	public Administrador() {
		
		VerticalLayout p = vc.getProductosEnCatalogoVLayout().as(VerticalLayout.class);
		//aqui se añade la lista de productos que se muestran en el catalogo
		//p.add());
		bdp = new BDPrincipal();
		catalogoVLayout.add(vc);
		
		this.getNuevaCategoriaButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				if (!getNuevaCategoriaTF().getValue().isEmpty()) {
					bdp.crearNuevaCategoria(getNuevaCategoriaTF().getValue());
				}
			}
		});
		
		this.getCrearOfertaButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				int descuento = Integer.parseInt(getDescuentoTF().getValue());
				
				if(!getNombreOfertaTF().getValue().isEmpty()) {
					bdp.crearNuevaOferta(getNombreOfertaTF().getValue(), descuento);
				}
				
			}
		});
		
		this.getSalirButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub

				Usuario_no_registrado unr = new Usuario_no_registrado();

				layoutPrincipal.removeAll();
				layoutPrincipal.add(unr);
			}
		});


		this.getGestionarUsuariosButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				VistaGestionarusuarios gu = new Gestionar_usuarios();

				layoutPrincipal.removeAll();
				layoutPrincipal.add(gu);
			}
		});

		this.getVerListadoComprasButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Ver_listado_de_compras__Administrador_ vlc = new Ver_listado_de_compras__Administrador_();
				
				layoutPrincipal.removeAll();
				layoutPrincipal.add(vlc);;
			}
		});
		
		this.getAniadirProductoButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub

				Añadir_producto ap = new Añadir_producto();

				layoutPrincipal.removeAll();
				layoutPrincipal.add(ap);

			}
		});
	}

}