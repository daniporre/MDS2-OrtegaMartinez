package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-verfichadeusuario template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-verfichadeusuario")
@JsModule("./src/vista-verfichadeusuario.js")
public class VistaVerfichadeusuario extends PolymerTemplate<VistaVerfichadeusuario.VistaVerfichadeusuarioModel> {

    @Id("nombreUsuarioLabel")
	private Label nombreUsuarioLabel;
	@Id("calleUsuarioLabel")
	private Label calleUsuarioLabel;
	@Id("codigoPostalUsuarioLabel")
	private Label codigoPostalUsuarioLabel;
	@Id("cuidadUsuarioLabel")
	private Label cuidadUsuarioLabel;
	@Id("provinciaUsuarioLabel")
	private Label provinciaUsuarioLabel;
	@Id("atrasButton")
	private Button atrasButton;

	/**
     * Creates a new VistaVerfichadeusuario.
     */
    public VistaVerfichadeusuario() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVerfichadeusuario and vista-verfichadeusuario
     */
    public interface VistaVerfichadeusuarioModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Label getNombreUsuarioLabel() {
		return nombreUsuarioLabel;
	}

	public void setNombreUsuarioLabel(Label nombreUsuarioLabel) {
		this.nombreUsuarioLabel = nombreUsuarioLabel;
	}

	public Label getCalleUsuarioLabel() {
		return calleUsuarioLabel;
	}

	public void setCalleUsuarioLabel(Label calleUsuarioLabel) {
		this.calleUsuarioLabel = calleUsuarioLabel;
	}

	public Label getCodigoPostalUsuarioLabel() {
		return codigoPostalUsuarioLabel;
	}

	public void setCodigoPostalUsuarioLabel(Label codigoPostalUsuarioLabel) {
		this.codigoPostalUsuarioLabel = codigoPostalUsuarioLabel;
	}

	public Label getCuidadUsuarioLabel() {
		return cuidadUsuarioLabel;
	}

	public void setCuidadUsuarioLabel(Label cuidadUsuarioLabel) {
		this.cuidadUsuarioLabel = cuidadUsuarioLabel;
	}

	public Label getProvinciaUsuarioLabel() {
		return provinciaUsuarioLabel;
	}

	public void setProvinciaUsuarioLabel(Label provinciaUsuarioLabel) {
		this.provinciaUsuarioLabel = provinciaUsuarioLabel;
	}

	public Button getAtrasButton() {
		return atrasButton;
	}

	public void setAtrasButton(Button atrasButton) {
		this.atrasButton = atrasButton;
	}
}
