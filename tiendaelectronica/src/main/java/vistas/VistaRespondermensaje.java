package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-respondermensaje template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-respondermensaje")
@JsModule("./src/vista-respondermensaje.js")
public class VistaRespondermensaje extends PolymerTemplate<VistaRespondermensaje.VistaRespondermensajeModel> {

    @Id("mailUsuarioTF")
	private TextField mailUsuarioTF;
	@Id("asuntoTF")
	private TextField asuntoTF;
	@Id("mensajeTF")
	private TextArea mensajeTF;
	@Id("aceptarButton")
	private Button aceptarButton;
	@Id("responderMensajeButton")
	private Button responderMensajeButton;

	/**
     * Creates a new VistaRespondermensaje.
     */
    public VistaRespondermensaje() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaRespondermensaje and vista-respondermensaje
     */
    public interface VistaRespondermensajeModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public TextField getMailUsuarioTF() {
		return mailUsuarioTF;
	}

	public void setMailUsuarioTF(TextField mailUsuarioTF) {
		this.mailUsuarioTF = mailUsuarioTF;
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

	public Button getAceptarButton() {
		return aceptarButton;
	}

	public void setAceptarButton(Button aceptarButton) {
		this.aceptarButton = aceptarButton;
	}

	public Button getResponderMensajeButton() {
		return responderMensajeButton;
	}

	public void setResponderMensajeButton(Button responderMensajeButton) {
		this.responderMensajeButton = responderMensajeButton;
	}
}
