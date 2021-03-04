package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-vermensajeenviado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-vermensajeenviado")
@JsModule("./src/vista-vermensajeenviado.js")
public class VistaVermensajeenviado extends PolymerTemplate<VistaVermensajeenviado.VistaVermensajeenviadoModel> {

    /**
     * Creates a new VistaVermensajeenviado.
     */
    public VistaVermensajeenviado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVermensajeenviado and vista-vermensajeenviado
     */
    public interface VistaVermensajeenviadoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
