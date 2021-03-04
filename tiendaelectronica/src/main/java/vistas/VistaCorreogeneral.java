package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-correogeneral template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-correogeneral")
@JsModule("./src/vista-correogeneral.js")
public class VistaCorreogeneral extends PolymerTemplate<VistaCorreogeneral.VistaCorreogeneralModel> {

    /**
     * Creates a new VistaCorreogeneral.
     */
    public VistaCorreogeneral() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCorreogeneral and vista-correogeneral
     */
    public interface VistaCorreogeneralModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
