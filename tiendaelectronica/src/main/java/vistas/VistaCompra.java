package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-compra template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-compra")
@JsModule("./src/vista-compra.js")
public class VistaCompra extends PolymerTemplate<VistaCompra.VistaCompraModel> {

    /**
     * Creates a new VistaCompra.
     */
    public VistaCompra() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCompra and vista-compra
     */
    public interface VistaCompraModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
