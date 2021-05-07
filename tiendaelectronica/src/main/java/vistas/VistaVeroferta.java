package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-veroferta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-veroferta")
@JsModule("./src/vista-veroferta.js")
public class VistaVeroferta extends PolymerTemplate<VistaVeroferta.VistaVerofertaModel> {

    /**
     * Creates a new VistaVeroferta.
     */
    public VistaVeroferta() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVeroferta and vista-veroferta
     */
    public interface VistaVerofertaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
