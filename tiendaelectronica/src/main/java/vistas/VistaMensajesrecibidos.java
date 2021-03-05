package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-mensajesrecibidos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-mensajesrecibidos")
@JsModule("./src/vista-mensajesrecibidos.js")
public class VistaMensajesrecibidos extends PolymerTemplate<VistaMensajesrecibidos.VistaMensajesrecibidosModel> {

    /**
     * Creates a new VistaMensajesrecibidos.
     */
    public VistaMensajesrecibidos() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaMensajesrecibidos and vista-mensajesrecibidos
     */
    public interface VistaMensajesrecibidosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
