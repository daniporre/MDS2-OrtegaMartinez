package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-visualizarpedido template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-visualizarpedido")
@JsModule("./src/vista-visualizarpedido.js")
public class VistaVisualizarpedido extends PolymerTemplate<VistaVisualizarpedido.VistaVisualizarpedidoModel> {

    /**
     * Creates a new VistaVisualizarpedido.
     */
    public VistaVisualizarpedido() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVisualizarpedido and vista-visualizarpedido
     */
    public interface VistaVisualizarpedidoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
