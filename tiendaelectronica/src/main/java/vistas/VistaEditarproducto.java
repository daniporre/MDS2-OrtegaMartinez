package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.textfield.TextArea;

/**
 * A Designer generated component for the vista-editarproducto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-editarproducto")
@JsModule("./src/vista-editarproducto.js")
public class VistaEditarproducto extends PolymerTemplate<VistaEditarproducto.VistaEditarproductoModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("inicioButton")
	private Button inicioButton;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("foto1Image")
	private Image foto1Image;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("foto2Image")
	private Button foto2Image;
	@Id("foto3Image")
	private Button foto3Image;
	@Id("vaadinTab")
	private Tab vaadinTab;
	@Id("vaadinVerticalLayout3")
	private Element vaadinVerticalLayout3;
	@Id("nombreProductoTF")
	private TextField nombreProductoTF;
	@Id("precioProductoTF")
	private TextField precioProductoTF;
	@Id("marcaProductoTF")
	private TextField marcaProductoTF;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("h2")
	private H2 h2;
	@Id("ofertasProductoTF")
	private ComboBox<String> ofertasProductoTF;
	@Id("vaadinVerticalLayout4")
	private Element vaadinVerticalLayout4;
	@Id("descripcionProductoTF")
	private TextArea descripcionProductoTF;
	@Id("guardarCambiosButton")
	private Button guardarCambiosButton;

	/**
     * Creates a new VistaEditarproducto.
     */
    public VistaEditarproducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEditarproducto and vista-editarproducto
     */
    public interface VistaEditarproductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
