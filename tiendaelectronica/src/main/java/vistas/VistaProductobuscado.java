package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-productobuscado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productobuscado")
@JsModule("./src/vista-productobuscado.js")
public class VistaProductobuscado extends PolymerTemplate<VistaProductobuscado.VistaProductobuscadoModel> {

    /**
     * Creates a new VistaProductobuscado.
     */
    public VistaProductobuscado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductobuscado and vista-productobuscado
     */
    public interface VistaProductobuscadoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
