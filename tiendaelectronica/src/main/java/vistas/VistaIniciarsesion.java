package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.login.LoginForm;

/**
 * A Designer generated component for the vista-iniciarsesion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-iniciarsesion")
@JsModule("./vista-iniciarsesion.js")
public class VistaIniciarsesion extends PolymerTemplate<VistaIniciarsesion.VistaIniciarsesionModel> {

	@Id("logIn")
	private LoginForm logIn;
	@Id("newAccount")
	private LoginForm newAccount;

	/**
     * Creates a new VistaIniciarsesion.
     */
    public VistaIniciarsesion() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAdministrador and vista-Iniciarsesion
     */
    public interface VistaIniciarsesionModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
