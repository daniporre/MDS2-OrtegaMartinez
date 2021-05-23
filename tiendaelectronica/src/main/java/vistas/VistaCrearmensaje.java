package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-crearmensaje template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-crearmensaje")
@JsModule("./src/vista-crearmensaje.js")
public class VistaCrearmensaje extends PolymerTemplate<VistaCrearmensaje.VistaCrearmensajeModel> {

    @Id("asuntoTF")
	private TextField asuntoTF;
	@Id("mensajeTF")
	private TextArea mensajeTF;
	@Id("enviarMensajeButton")
	private Button enviarMensajeButton;
	@Id("cancelarButton")
	private Button cancelarButton;
	@Id("aceptarButton")
	private Button aceptarButton;

	/**
     * Creates a new VistaCrearmensaje.
     */
    public VistaCrearmensaje() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCrearmensaje and vista-crearmensaje
     */
    public interface VistaCrearmensajeModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public TextField getAsuntoTF() {
		return asuntoTF;
	}

	public void setAsuntoTF(TextField asuntoTF) {
		this.asuntoTF = asuntoTF;
	}

	public TextArea getMensajeTF() {
		return mensajeTF;
	}

	public void setMensajeTF(TextArea mensajeTF) {
		this.mensajeTF = mensajeTF;
	}

	public Button getEnviarMensajeButton() {
		return enviarMensajeButton;
	}

	public void setEnviarMensajeButton(Button enviarMensajeButton) {
		this.enviarMensajeButton = enviarMensajeButton;
	}

	public Button getCancelarButton() {
		return cancelarButton;
	}

	public void setCancelarButton(Button cancelarButton) {
		this.cancelarButton = cancelarButton;
	}


	public Button getAceptarButton() {
		return aceptarButton;
	}

	public void setAceptarButton(Button aceptarButton) {
		this.aceptarButton = aceptarButton;
	}
}
