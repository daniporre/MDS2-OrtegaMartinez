package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-descripcionproducto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-descripcionproducto")
@JsModule("./src/main/java/vistas/vista-descripcionproducto.js")
public class VistaDescripcionproducto extends PolymerTemplate<VistaDescripcionproducto.VistaDescripcionproductoModel> {

    /**
     * Creates a new VistaDescripcionproducto.
     */
    public VistaDescripcionproducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaDescripcionproducto and vista-descripcionproducto
     */
    public interface VistaDescripcionproductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
