package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-editarproducto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-editarproducto")
@JsModule("./src/vista-editarproducto.js")
public class VistaEditarproducto extends PolymerTemplate<VistaEditarproducto.VistaEditarproductoModel> {

    /**
     * Creates a new VistaEditarproducto.
     */
    public VistaEditarproducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEditarproducto and vista-editarproducto
     */
    public interface VistaEditarproductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
