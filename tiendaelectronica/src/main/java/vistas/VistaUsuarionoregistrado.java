package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-usuarionoregistrado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-usuarionoregistrado")
@JsModule("./src/vista-usuarionoregistrado.js")
public class VistaUsuarionoregistrado extends PolymerTemplate<VistaUsuarionoregistrado.VistaUsuarionoregistradoModel> {

    /**
     * Creates a new VistaUsuarionoregistrado.
     */
    public VistaUsuarionoregistrado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaUsuarionoregistrado and vista-usuarionoregistrado
     */
    public interface VistaUsuarionoregistradoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}