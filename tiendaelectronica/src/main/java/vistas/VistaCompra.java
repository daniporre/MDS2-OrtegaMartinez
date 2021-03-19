package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-compra template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-compra")
@JsModule("./src/vista-compra.js")
public class VistaCompra extends PolymerTemplate<VistaCompra.VistaCompraModel> {

    @Id("name-header")
	private HorizontalLayout nameHeader;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("product-name")
	private Label productName;
	@Id("vaadinTab")
	private Tab vaadinTab;
	@Id("product-id")
	private Label productId;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("product-img")
	private Image productImg;
	@Id("product-data")
	private Element productData;
	@Id("pedido-realizado")
	private Label pedidoRealizado;
	@Id("pedido-fecha")
	private Label pedidoFecha;
	@Id("pedido-precio")
	private Label pedidoPrecio;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("verperfilusuario-button")
	private Button verperfilusuarioButton;
	@Id("recibido-button")
	private Label recibidoButton;
	@Id("recibidp-button")
	private Button recibidpButton;

	/**
     * Creates a new VistaCompra.
     */
    public VistaCompra() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCompra and vista-compra
     */
    public interface VistaCompraModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
