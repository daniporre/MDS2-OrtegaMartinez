package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-vercatalogo template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-vercatalogo")
@JsModule("./src/vista-vercatalogo.js")
public class VistaVercatalogo extends PolymerTemplate<VistaVercatalogo.VistaVercatalogoModel> {

    @Id("categoria1Button")
	private Button categoria1Button;
	@Id("categoria2Button")
	private Button categoria2Button;
	@Id("categoria3Button")
	private Button categoria3Button;
	@Id("categoria4Button")
	private Button categoria4Button;
	@Id("categoria5Button")
	private Button categoria5Button;
	@Id("categoria6Button")
	private Button categoria6Button;
	@Id("ofertasHLayout")
	private HorizontalLayout ofertasHLayout;
	@Id("ordenarPorCombobox")
	private ComboBox<String> ordenarPorCombobox;
	@Id("filtrarPorCombobox")
	private ComboBox<String> filtrarPorCombobox;
	@Id("productosEnCatalogoVLayout")
	private Element productosEnCatalogoVLayout;

	/**
     * Creates a new VistaVercatalogo.
     */
    public VistaVercatalogo() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVercatalogo and vista-vercatalogo
     */
    public interface VistaVercatalogoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Button getCategoria1Button() {
		return categoria1Button;
	}

	public void setCategoria1Button(Button categoria1Button) {
		this.categoria1Button = categoria1Button;
	}

	public Button getCategoria2Button() {
		return categoria2Button;
	}

	public void setCategoria2Button(Button categoria2Button) {
		this.categoria2Button = categoria2Button;
	}

	public Button getCategoria3Button() {
		return categoria3Button;
	}

	public void setCategoria3Button(Button categoria3Button) {
		this.categoria3Button = categoria3Button;
	}

	public Button getCategoria4Button() {
		return categoria4Button;
	}

	public void setCategoria4Button(Button categoria4Button) {
		this.categoria4Button = categoria4Button;
	}

	public Button getCategoria5Button() {
		return categoria5Button;
	}

	public void setCategoria5Button(Button categoria5Button) {
		this.categoria5Button = categoria5Button;
	}

	public Button getCategoria6Button() {
		return categoria6Button;
	}

	public void setCategoria6Button(Button categoria6Button) {
		this.categoria6Button = categoria6Button;
	}

	public HorizontalLayout getOfertasHLayout() {
		return ofertasHLayout;
	}

	public void setOfertasHLayout(HorizontalLayout ofertasHLayout) {
		this.ofertasHLayout = ofertasHLayout;
	}

	public ComboBox<String> getOrdenarPorCombobox() {
		return ordenarPorCombobox;
	}

	public void setOrdenarPorCombobox(ComboBox<String> ordenarPorCombobox) {
		this.ordenarPorCombobox = ordenarPorCombobox;
	}

	public ComboBox<String> getFiltrarPorCombobox() {
		return filtrarPorCombobox;
	}

	public void setFiltrarPorCombobox(ComboBox<String> filtrarPorCombobox) {
		this.filtrarPorCombobox = filtrarPorCombobox;
	}

	public Element getProductosEnCatalogoVLayout() {
		return productosEnCatalogoVLayout;
	}

	public void setProductosEnCatalogoVLayout(Element productosEnCatalogoVLayout) {
		this.productosEnCatalogoVLayout = productosEnCatalogoVLayout;
	}
}
