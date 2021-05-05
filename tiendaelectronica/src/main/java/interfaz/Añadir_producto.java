package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatosorm.Oferta;
import vistas.VistaAniadirproducto;
import vistas.VistaGestionarusuarios;

public class Añadir_producto extends VistaAniadirproducto {
	
	BDPrincipal bdp;
	
	public VerticalLayout layoutPrincipal = this.getVaadinVerticalLayout().as(VerticalLayout.class);
	
	String nombre;
	String precio;
	String marca;
	Oferta oferta = null;
	String descripcion;
	
	
	public Añadir_producto() {
		inicio();
		bdp = new BDPrincipal();
		
		guardarNuevoProducto();
		
		
		//traer ofertas de bd
//		Oferta[] ofertas = new Oferta[bdp.obtenerOfertas().length];
//		
//		if(ofertas != null)
//			ofertas = bdp.obtenerOfertas();
//		
//		for (Oferta oferta : ofertas) {
//			System.out.println(oferta.getNombreOferta()+"***");
//		}
		
		
	}

	public void guardarNuevoProducto() {
		
		this.getGuardarCambiosButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				nombre = getNombreProductoTF().getValue();
				precio = getPrecioProductoTF().getValue();
				marca = getMarcaProductoTF().getValue();
//				if(!getOfertasProductoTF().getValue().isEmpty())
//					oferta = getOfertasProductoTF().getValue();
				descripcion = getDescripcionProductoTF().getValue();
				
				if(!nombre.isEmpty() && !precio.isEmpty() && !marca.isEmpty() && !descripcion.isEmpty())
					bdp.guardarCambios(nombre, Integer.parseInt(precio), marca, oferta, descripcion);
			}
		});
	}
	
	public void inicio() {
		this.getInicioButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Administrador ad = new Administrador();

				layoutPrincipal.removeAll();
				layoutPrincipal.add(ad);
			}
		});
	}
}