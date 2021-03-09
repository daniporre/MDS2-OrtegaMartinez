package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-resultadodebusqueda template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-resultadodebusqueda")
@JsModule("./src/vista-resultadodebusqueda.js")
public class VistaResultadodebusqueda extends PolymerTemplate<VistaResultadodebusqueda.VistaResultadodebusquedaModel> {

    /**
     * Creates a new VistaResultadodebusqueda.
     */
    public VistaResultadodebusqueda() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaResultadodebusqueda and vista-resultadodebusqueda
     */
    public interface VistaResultadodebusquedaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
