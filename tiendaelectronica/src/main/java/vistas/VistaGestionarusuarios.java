package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-gestionarusuarios template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-gestionarusuarios")
@JsModule("./src/vista-gestionarusuarios.js")
public class VistaGestionarusuarios extends PolymerTemplate<VistaGestionarusuarios.VistaGestionarusuariosModel> {

    /**
     * Creates a new VistaGestionarusuarios.
     */
    public VistaGestionarusuarios() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaGestionarusuarios and vista-gestionarusuarios
     */
    public interface VistaGestionarusuariosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
