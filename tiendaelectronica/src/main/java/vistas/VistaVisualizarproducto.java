package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-visualizarproducto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-visualizarproducto")
@JsModule("./src/vista-visualizarproducto.js")
public class VistaVisualizarproducto extends PolymerTemplate<VistaVisualizarproducto.VistaVisualizarproductoModel> {

    /**
     * Creates a new VistaVisualizarproducto.
     */
    public VistaVisualizarproducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVisualizarproducto and vista-visualizarproducto
     */
    public interface VistaVisualizarproductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
