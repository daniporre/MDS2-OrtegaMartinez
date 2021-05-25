package interfaz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;

import basededatos.BDPrincipal;
import basededatosorm.Producto;
import basededatosorm.Usuario;
import basededatosorm.UsuarioRegistrado;
import interfaz.Producto_buscado;
import vistas.VistaProductosbuscados;

public class Productos_buscados extends VistaProductosbuscados {

	public Ver_producto vp;
	public BDPrincipal bdp = new BDPrincipal();
	public VerticalLayout v = this.getProductosVerticalLayout().as(VerticalLayout.class);
	public String[] comboOrdenar = { "Más caros primero", "Más baratos primero" };
	public Filtrar f;
	VerticalLayout marcasLayout = this.getMarcaVerticalLayout().as(VerticalLayout.class);

	public Productos_buscados(UsuarioRegistrado usuario, Producto[] productos, VerticalLayout layout, VerticalLayout layoutPrincipal) {
		this.getIniciarSesionButton().setVisible(false);

		actualizarCatalogo(usuario, productos, layoutPrincipal);
		ordenarComboBox(productos, usuario, layout);
		ordenarPorPrecio(productos, layout);
		filtrarPorMarca(productos, layout);
		barraBusqueda(usuario, layout);
		
		this.getInicioButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				layoutPrincipal.removeAll();
				layoutPrincipal.add(new Usuario_registrado(usuario, layoutPrincipal));

				
			}
		});
		
		this.getMiCuentaButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				layoutPrincipal.removeAll();
				layoutPrincipal.add(new Ver_cuenta__Usuario_registrado_(usuario, layoutPrincipal));
				
			}
		});
		
		this.getCarritoButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				layoutPrincipal.removeAll();
				layoutPrincipal.add(new Ver_carrito(usuario, layoutPrincipal));
				
			}
		});
	}

	public Productos_buscados(Producto[] productos, VerticalLayout layout,VerticalLayout layoutPrincipal) {
		this.getMiCuentaButton().setVisible(false);

		actualizarCatalogoUNR(productos, layoutPrincipal);
		ordenarComboBox(productos, null, layout);
		ordenarPorPrecio(productos, layout);
		filtrarPorMarca(productos, layout);
		barraBusqueda(null, layout);
		iniciarSesionButton(layoutPrincipal);
		this.getInicioButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				layoutPrincipal.removeAll();
				layoutPrincipal.add(new Usuario_no_registrado(layoutPrincipal));
				
			}
		});
		
		this.getCarritoButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				layoutPrincipal.removeAll();
				layoutPrincipal.add(new Ver_carrito__Usuario_no_registrado_(layoutPrincipal));
				
			}
		});
	}
	
	public void iniciarSesionButton(VerticalLayout layoutPrincipal) {
		this.getIniciarSesionButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				try {
					Iniciar_sesión in = new Iniciar_sesión(layoutPrincipal);
					layoutPrincipal.removeAll();
					layoutPrincipal.add(in);
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		});
	}
	
	public void barraBusqueda(Usuario usuario, VerticalLayout layout){
				
		this.getBuscarButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if(!getBuscarTF().getValue().isEmpty()) {
					Producto[] productos = new Producto[bdp.buscarProducto(getBuscarTF().getValue()).length];
					
					productos = bdp.buscarProducto(getBuscarTF().getValue());
					v.removeAll();
					if(usuario!=null) {
						actualizarCatalogo(usuario, productos, layout);
					} else {
						actualizarCatalogoUNR(productos, layout);
					}
					marcasLayout.removeAll();
					ordenarPorPrecio(productos, layout);
					filtrarPorMarca(productos, layout);
					
				}
			}
		});
		
	}
	public void filtrarPorMarca(Producto[] productos, VerticalLayout layout) {
		
		f = new Filtrar(productos);
		ArrayList<Producto> arr = new ArrayList<Producto>();
		marcasLayout.add(f);

		f.getRadioGroup().addValueChangeListener(event -> {
			Producto[] ordenadoPorMarca;
			String marca = event.getValue();
			arr.clear();
			
			for (Producto producto: productos) {
				
				if(producto.getMarca().toLowerCase().trim().equals(marca.toLowerCase().trim())) {
					arr.add(producto);
				}
			}

			ordenadoPorMarca = new Producto[arr.size()];
			arr.toArray(ordenadoPorMarca);
			v.removeAll();
			actualizarCatalogo(null, ordenadoPorMarca, layout);
			
		});
		

		

	}

	public void ordenarPorPrecio(Producto[] productos, VerticalLayout layout) {
		this.getRadioGroup().setItems("Hasta 20€", "Hasta 50€", "Hasta 100€", "Más de 100€");
		ArrayList<Producto> arr = new ArrayList<Producto>();
		this.getRadioGroup().addValueChangeListener(event -> {
			
			Producto[] ordenadoPorPrecio;

			if (event.getValue() == "Hasta 20€") {
				arr.clear();
				for (Producto producto : productos) {
					if (producto.getPrecio() <= 20) {
						arr.add(producto);
					}
				}
//				System.out.println("Productos de hasta 20€" + arr.toString());
			}
			if (event.getValue() == "Hasta 50€") {
				arr.clear();
				for (Producto producto : productos) {
					if (producto.getPrecio() <= 50) {
						arr.add(producto);
					}
				}
//				System.out.println("Productos de hasta 50€" + arr.toString());
			}
			if (event.getValue() == "Hasta 100€") {
				arr.clear();
				for (Producto producto : productos) {
					if (producto.getPrecio() <= 100) {
						arr.add(producto);
					}
				}
//				System.out.println("Productos de menos de 100€" + arr.toString());
			}
			if (event.getValue() == "Más de 100€") {
				arr.clear();
				for (Producto producto : productos) {
					if (producto.getPrecio() > 100) {
						arr.add(producto);
					}
				}
//				System.out.println("Productos de mas de 100€" + arr.toString());
			}

			ordenadoPorPrecio = new Producto[arr.size()];
			arr.toArray(ordenadoPorPrecio);
			v.removeAll();
			actualizarCatalogo(null, ordenadoPorPrecio, layout);

		});

	}

	public void actualizarCatalogoUNR(Producto[] productos, VerticalLayout layoutPincipal) {
		for (int i = 0; i < productos.length; i++) {
			vp = new Ver_producto(productos[i], layoutPincipal);
			vp.getVaadinHorizontalLayout().setAlignItems(Alignment.STRETCH);
			v.setAlignItems(Alignment.STRETCH);
			// Aqui hay que acceder a la bd para obtener las imagenes del producto con su id
			// en p[i]
			v.add(vp);
		}
	}

	public void actualizarCatalogo(Usuario usuario, Producto[] productos, VerticalLayout layoutPincipal) {
		for (int i = 0; i < productos.length; i++) {
			vp = new Ver_producto(productos[i], usuario, layoutPincipal);
			vp.getVaadinHorizontalLayout().setAlignItems(Alignment.STRETCH);
			v.setAlignItems(Alignment.STRETCH);
			// Aqui hay que acceder a la bd para obtener las imagenes del producto con su id
			// en p[i]
			v.add(vp);
		}
	}

	public void ordenarComboBox(Producto[] productos, Usuario usuario, VerticalLayout layoutPincipal) {
		this.getOrdenarComboBox().setItems(comboOrdenar);
		this.getOrdenarComboBox().addValueChangeListener(event -> {
			if (getOrdenarComboBox().getValue() == "Más baratos primero") {
				Arrays.sort(productos);
				getProductosVerticalLayout().removeAllChildren();
				if (usuario != null) {
					actualizarCatalogo(usuario, productos, layoutPincipal);
				} else {
					actualizarCatalogoUNR(productos, layoutPincipal);
				}

			}

			if (getOrdenarComboBox().getValue() == "Más caros primero") {
				Arrays.sort(productos);
				Ver_catálogo.invArray(productos);
				getProductosVerticalLayout().removeAllChildren();
				if (usuario != null) {
					actualizarCatalogo(usuario, productos, layoutPincipal);
				} else {
					actualizarCatalogoUNR(productos, layoutPincipal);
				}
			}
		});
	}

}