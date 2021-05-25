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
import com.vaadin.flow.component.html.H3;

/**
 * A Designer generated component for the vista-vercatalogo template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-vercatalogo")
@JsModule("./src/vista-vercatalogo.js")
public class VistaVercatalogo extends PolymerTemplate<VistaVercatalogo.VistaVercatalogoModel> {

    
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
	@Id("categoriaLabel")
	private H3 categoriaLabel;
	

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

	public H3 getCategoriaLabel() {
		return categoriaLabel;
	}

	public void setCategoriaLabel(H3 categoriaLabel) {
		this.categoriaLabel = categoriaLabel;
	}

	
}
