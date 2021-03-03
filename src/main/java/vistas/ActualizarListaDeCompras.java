package vistas;
// modificacion
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the actualizar-lista-de-compras template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("actualizar-lista-de-compras")
@JsModule("./src/main/java/vistas/actualizar-lista-de-compras.js")
public class ActualizarListaDeCompras extends PolymerTemplate<ActualizarListaDeCompras.ActualizarListaDeComprasModel> {

    @Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("ironIcon")
	private Element ironIcon;
	/**
     * Creates a new ActualizarListaDeCompras.
     */
    public ActualizarListaDeCompras() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between ActualizarListaDeCompras and actualizar-lista-de-compras
     */
    public interface ActualizarListaDeComprasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
