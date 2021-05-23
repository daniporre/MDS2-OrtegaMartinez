package interfaz;

import vistas.VistaAdministrador;
import vistas.VistaGestionarusuarios;

import java.util.ArrayList;
import java.util.Arrays;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import basededatosorm.Producto;
import basededatosorm.Usuario;

public class Administrador extends VistaAdministrador {

	public VerticalLayout catalogoVLayout = this.getPrincipalVLayout().as(VerticalLayout.class);
	public Ver_producto vp;
	public Ver_catálogo vc;
	public BDPrincipal bdp;
	private String[] nombreOfertas;

	public Administrador(Usuario administrador, VerticalLayout principalLayout) {
		vc = new Ver_catálogo(administrador, principalLayout);
		bdp = new BDPrincipal();
		recargarOfertas();

		catalogoVLayout.add(vc);
		
		System.out.println(administrador.getMail()+" admin");
		
		this.getCorreoButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				principalLayout.removeAll();
				principalLayout.add(new Correo__General_(administrador, principalLayout));
				
			}
		});
		

		this.getDarBajaButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if(bdp.obtenerOferta(getDarDeBajaComboBox().getValue()) == null){
					//TODO
					//IMplementar en la bd un metodo para traerme los productos que tiene una oferta
				}
				bdp.darBajaOferta(getDarDeBajaComboBox().getValue());
				recargarOfertas();
			}
		});

		this.getNuevaCategoriaButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if (!getNuevaCategoriaTF().getValue().isEmpty()) {
					bdp.crearNuevaCategoria(getNuevaCategoriaTF().getValue());
					vc = new Ver_catálogo(administrador, principalLayout);
					catalogoVLayout.removeAll();
					catalogoVLayout.add(vc);
				}
				
				
			}
		});

		this.getCrearOfertaButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				int descuento = Integer.parseInt(getDescuentoTF().getValue());

				if (!getNombreOfertaTF().getValue().isEmpty()) {
					bdp.crearNuevaOferta(getNombreOfertaTF().getValue(), descuento);
					recargarOfertas();
				}
			}
		});

		this.getSalirButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				Usuario_no_registrado unr = new Usuario_no_registrado();

				principalLayout.removeAll();
				principalLayout.add(unr);
			}
		});

		this.getGestionarUsuariosButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				VistaGestionarusuarios gu = new Gestionar_usuarios(administrador, principalLayout);

				principalLayout.removeAll();
				principalLayout.add(gu);
			}
		});

		this.getVerListadoComprasButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Ver_listado_de_compras__Administrador_ vlc = new Ver_listado_de_compras__Administrador_(administrador, principalLayout);

				principalLayout.removeAll();
				principalLayout.add(vlc);
				
			}
		});

		this.getAniadirProductoButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				Añadir_producto ap = new Añadir_producto(administrador, principalLayout);

				principalLayout.removeAll();
				principalLayout.add(ap);

			}
		});
	}

	public void recargarOfertas() {
		nombreOfertas = new String[bdp.obtenerOfertas().length];
		ArrayList<String> arr = new ArrayList<String>();
		
		
		for (int i = 0; i < bdp.obtenerOfertas().length; i++) {
			nombreOfertas[i] = bdp.obtenerOfertas()[i].getNombreOferta();
		}
		System.out.println("ofertas con ninguna: "+Arrays.toString(nombreOfertas));
		for (int i = 0; i < nombreOfertas.length; i++) {
			if(!nombreOfertas[i].toLowerCase().contains("ninguna")) {
				arr.add(nombreOfertas[i]);
			}
		}
		String[] lista = new String[arr.size()];
		arr.toArray(lista);

		System.out.println("ofertas sin ninguna: "+Arrays.toString(lista));
		this.getDarDeBajaComboBox().setItems(lista);
	}

}