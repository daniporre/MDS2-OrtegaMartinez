package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-administradorinicio template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-administradorinicio")
@JsModule("./src/main/java/vistas/vista-administradorinicio.js")
public class VistaAdministradorinicio extends PolymerTemplate<VistaAdministradorinicio.VistaAdministradorinicioModel> {

    /**
     * Creates a new VistaAdministradorinicio.
     */
    public VistaAdministradorinicio() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAdministradorinicio and vista-administradorinicio
     */
    public interface VistaAdministradorinicioModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
