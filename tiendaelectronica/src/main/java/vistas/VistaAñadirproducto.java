package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-añadirproducto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-añadirproducto")
@JsModule("./src/vista-añadirproducto.js")
public class VistaAñadirproducto extends PolymerTemplate<VistaAñadirproducto.VistaAñadirproductoModel> {

    @Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;

	/**
     * Creates a new VistaAñadirproducto.
     */
    public VistaAñadirproducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAñadirproducto and vista-añadirproducto
     */
    public interface VistaAñadirproductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
