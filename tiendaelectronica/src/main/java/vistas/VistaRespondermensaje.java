package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-respondermensaje template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-respondermensaje")
@JsModule("./src/vista-respondermensaje.js")
public class VistaRespondermensaje extends PolymerTemplate<VistaRespondermensaje.VistaRespondermensajeModel> {

    /**
     * Creates a new VistaRespondermensaje.
     */
    public VistaRespondermensaje() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaRespondermensaje and vista-respondermensaje
     */
    public interface VistaRespondermensajeModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
