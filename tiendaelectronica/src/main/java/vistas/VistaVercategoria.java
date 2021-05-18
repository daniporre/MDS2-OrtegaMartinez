package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-vercategoria template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-vercategoria")
@JsModule("./src/vista-vercategoria.js")
public class VistaVercategoria extends PolymerTemplate<VistaVercategoria.VistaVercategoriaModel> {

    @Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("categoriaButton")
	private Button categoriaButton;

	/**
     * Creates a new VistaVercategoria.
     */
    public VistaVercategoria() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVercategoria and vista-vercategoria
     */
    public interface VistaVercategoriaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Button getCategoriaButton() {
		return categoriaButton;
	}

	public void setCategoriaButton(Button categoriaButton) {
		this.categoriaButton = categoriaButton;
	}
}
