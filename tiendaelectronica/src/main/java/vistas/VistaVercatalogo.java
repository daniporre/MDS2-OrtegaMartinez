package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-vercatalogo template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-vercatalogo")
@JsModule("./src/vista-vercatalogo.js")
public class VistaVercatalogo extends PolymerTemplate<VistaVercatalogo.VistaVercatalogoModel> {

    /**
     * Creates a new VistaVercatalogo.
     */
    public VistaVercatalogo() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVercatalogo and vista-vercatalogo
     */
    public interface VistaVercatalogoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
