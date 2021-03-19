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

    @Id("label")
	private Label label;
	@Id("label1")
	private Label label1;
	@Id("label2")
	private Label label2;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("label3")
	private Label label3;
	@Id("label4")
	private Label label4;
	@Id("label5")
	private Label label5;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("vaadinButton1")
	private Button vaadinButton1;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;

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
