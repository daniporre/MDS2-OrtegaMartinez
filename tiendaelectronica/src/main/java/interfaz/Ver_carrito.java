package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVercarrito;

public class Ver_carrito extends VistaVercarrito {
//	private Button _continuarComprando;
//	public Productos_en_carrito _productos_en_carrito;
//	public Continuar_comprando _continuar_comprando;
	public VerticalLayout layoutPrincipal;
	public Iniciar_sesión lg;
	public boolean isSesionOn;


	
	public Ver_carrito() {
		
		super();
		layoutPrincipal = this.getPrimerVlayout().as(VerticalLayout.class);
		
		try {
			lg = new Iniciar_sesión();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		isSesionOn = true;
		
		if (!isSesionOn) {
			this.getIniciarSesionButton().setVisible(false);
			this.getMiCuentaButton().setVisible(false);
			this.getMetodoYdireccionVLayout().setVisible(false);
		}

		this.getIniciarSesionButton().addClickListener(new ComponentEventListener() {

			@Override
			public void onComponentEvent(ComponentEvent event) {

				layoutPrincipal.removeAll();
				layoutPrincipal.add(lg);
				
			}
		
		
		
		});
		
//		Ver_cuenta__Usuario_registrado_ verCuentaUR = new Ver_cuenta__Usuario_registrado_(usuario);
		
//		this.getMiCuentaButton().addClickListener(new ComponentEventListener() {
//
//			@Override
//			public void onComponentEvent(ComponentEvent event) {
//
//				layoutPrincipal.removeAll();
//				layoutPrincipal.add(verCuentaUR);
//				
//			}
//		
//		
//		
//		});
		
	}
}