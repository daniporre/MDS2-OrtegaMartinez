package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-mensajesenviados template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-mensajesenviados")
@JsModule("./src/vista-mensajesenviados.js")
public class VistaMensajesenviados extends PolymerTemplate<VistaMensajesenviados.VistaMensajesenviadosModel> {

    /**
     * Creates a new VistaMensajesenviados.
     */
    public VistaMensajesenviados() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaMensajesenviados and vista-mensajesenviados
     */
    public interface VistaMensajesenviadosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
