package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-empresadetransportes template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-empresadetransportes")
@JsModule("./src/vista-empresadetransportes.js")
public class VistaEmpresadetransportes extends PolymerTemplate<VistaEmpresadetransportes.VistaEmpresadetransportesModel> {

    /**
     * Creates a new VistaEmpresadetransportes.
     */
    public VistaEmpresadetransportes() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEmpresadetransportes and vista-empresadetransportes
     */
    public interface VistaEmpresadetransportesModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
