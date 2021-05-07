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
	@Id("categoriasHLayout")
	private HorizontalLayout categoriasHLayout;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("categoria7Button")
	private Button categoria7Button;
	@Id("categoria8Button")
	private Button categoria8Button;
	@Id("categoria9Button")
	private Button categoria9Button;
	@Id("categoria10Button")
	private Button categoria10Button;

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

	public HorizontalLayout getCategoriasHLayout() {
		return categoriasHLayout;
	}

	public void setCategoriasHLayout(HorizontalLayout categoriasHLayout) {
		this.categoriasHLayout = categoriasHLayout;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Button getCategoria7Button() {
		return categoria7Button;
	}

	public void setCategoria7Button(Button categoria7Button) {
		this.categoria7Button = categoria7Button;
	}

	public Button getCategoria8Button() {
		return categoria8Button;
	}

	public void setCategoria8Button(Button categoria8Button) {
		this.categoria8Button = categoria8Button;
	}

	public Button getCategoria9Button() {
		return categoria9Button;
	}

	public void setCategoria9Button(Button categoria9Button) {
		this.categoria9Button = categoria9Button;
	}

	public Button getCategoria10Button() {
		return categoria10Button;
	}

	public void setCategoria10Button(Button categoria10Button) {
		this.categoria10Button = categoria10Button;
	}
}
