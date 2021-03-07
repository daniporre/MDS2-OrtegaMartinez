package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-verlistadodecompras template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-verlistadodecompras")
@JsModule("./src/vista-verlistadodecompras.js")
public class VistaVerlistadodecompras extends PolymerTemplate<VistaVerlistadodecompras.VistaVerlistadodecomprasModel> {

    @Id("inicioButton")
	private Button inicioButton;
	@Id("actualizarListaDeComprasButton")
	private Button actualizarListaDeComprasButton;
	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("cerrarSesionButton")
	private Button cerrarSesionButton;

	/**
     * Creates a new VistaVerlistadodecompras.
     */
    public VistaVerlistadodecompras() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVerlistadodecompras and vista-verlistadodecompras
     */
    public interface VistaVerlistadodecomprasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
