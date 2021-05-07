package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatosorm.Oferta;
import vistas.VistaAniadirproducto;
import vistas.VistaGestionarusuarios;

public class Añadir_producto extends VistaAniadirproducto {
	
	BDPrincipal bdp;
	
	public VerticalLayout layoutPrincipal = this.getVaadinVerticalLayout().as(VerticalLayout.class);
	
	String nombre;
	Double precio;
	String marca;
	Oferta oferta = null;
	String descripcion;
	private String[] nombreOfertas;
	private String nombreOferta;
	private Oferta ofertaSeleccionada;
	
	
	public Añadir_producto() {
		inicio();
		bdp = new BDPrincipal();
		
		guardarNuevoProducto();
		
		nombreOfertas = new String[bdp.obtenerOfertas().length];
		
		for (int i = 0; i < bdp.obtenerOfertas().length; i++) {
			nombreOfertas[i] = bdp.obtenerOfertas()[i].getNombreOferta();
		}
		
		this.getOfertasProductoTF().setItems(nombreOfertas);
		
		
	}

	public void guardarNuevoProducto() {
		
		this.getGuardarCambiosButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				nombre = getNombreProductoTF().getValue();
				precio = Double.parseDouble(getPrecioProductoTF().getValue().replace(',', '.'));
				marca = getMarcaProductoTF().getValue();
				if(!getOfertasProductoTF().getValue().isEmpty())
					nombreOferta = getOfertasProductoTF().getValue();
					oferta = bdp.obtenerOferta(nombreOferta);
					
				descripcion = getDescripcionProductoTF().getValue();
				
				if(!nombre.isEmpty() && !precio.toString().isEmpty() && !marca.isEmpty() && !descripcion.isEmpty())
					bdp.guardarCambios(nombre, precio, marca, oferta, descripcion);
//					Administrador a = new Administrador();
//					
//					layoutPrincipal.removeAll();
//					layoutPrincipal.add(a);
					Notification.show("Producto con nombre "+nombre+" creado correctamente");
			}
		});
	}
	
	public void inicio() {
		this.getInicioButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
//				Administrador ad = new Administrador();
//
//				layoutPrincipal.removeAll();
//				layoutPrincipal.add(ad);
			}
		});
	}
}