package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-vercuentausuarioregistrado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-vercuentausuarioregistrado")
@JsModule("./src/vista-vercuentausuarioregistrado.js")
public class VistaVercuentausuarioregistrado extends PolymerTemplate<VistaVercuentausuarioregistrado.VistaVercuentausuarioregistradoModel> {

   

	/**
     * Creates a new VistaVercuentausuarioregistrado.
     */
    public VistaVercuentausuarioregistrado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVercuentausuarioregistrado and vista-vercuentausuarioregistrado
     */
    public interface VistaVercuentausuarioregistradoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

}
