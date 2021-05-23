package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatosorm.Oferta;
import basededatosorm.Usuario;
import vistas.VistaAniadirproducto;
import vistas.VistaGestionarusuarios;

@SuppressWarnings("serial")
public class Añadir_producto extends VistaAniadirproducto {
	
	BDPrincipal bdp;
	

	
	String nombre;
	Double precio;
	String marca;
	Oferta oferta = null;
	String descripcion;
	private String[] nombreOfertas;
	private String nombreOferta;
	
	
	public Añadir_producto(Usuario usuario, VerticalLayout layoutPrincipal) {
		inicio(usuario, layoutPrincipal);
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
				if(getDescripcionProductoTF().getValue().length()<=1000) {
					nombre = getNombreProductoTF().getValue();
					precio = Double.parseDouble(getPrecioProductoTF().getValue().replace(',', '.'));
					marca = getMarcaProductoTF().getValue();
					if(!getOfertasProductoTF().getValue().isEmpty())
						nombreOferta = getOfertasProductoTF().getValue();
						oferta = bdp.obtenerOferta(nombreOferta);
						
					descripcion = getDescripcionProductoTF().getValue();
					
					if(!nombre.isEmpty() && !precio.toString().isEmpty() && !marca.isEmpty() && !descripcion.isEmpty())
						bdp.guardarCambios(nombre, precio, marca, oferta, descripcion);
//						Administrador a = new Administrador();
//						
//						layoutPrincipal.removeAll();
//						layoutPrincipal.add(a);
						Notification.show("Producto con nombre "+nombre+" creado correctamente");
				} else {
					Notification.show("La descripcion es demasiado larga, no puede tener mas de 1000 caracteres");
				}
				
			}
		});
	}
	
	public void inicio(Usuario administrador, VerticalLayout layoutPrincipal) {
		this.getInicioButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layoutPrincipal.removeAll();
				layoutPrincipal.add(new Administrador(administrador, layoutPrincipal));
			}
		});
	}
}