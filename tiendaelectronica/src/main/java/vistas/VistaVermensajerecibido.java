package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-vermensajerecibido template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-vermensajerecibido")
@JsModule("./src/vista-vermensajerecibido.js")
public class VistaVermensajerecibido extends PolymerTemplate<VistaVermensajerecibido.VistaVermensajerecibidoModel> {

    /**
     * Creates a new VistaVermensajerecibido.
     */
    public VistaVermensajerecibido() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVermensajerecibido and vista-vermensajerecibido
     */
    public interface VistaVermensajerecibidoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
