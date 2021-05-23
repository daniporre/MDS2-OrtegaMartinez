package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-correogeneral template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-correogeneral")
@JsModule("./src/vista-correogeneral.js")
public class VistaCorreogeneral extends PolymerTemplate<VistaCorreogeneral.VistaCorreogeneralModel> {

    @Id("inicioButton")
	private Button inicioButton;
	@Id("pestañaEnviados")
	private Tab pestañaEnviados;
	@Id("pestañaRecibidos")
	private Tab pestañaRecibidos;
	@Id("tablaMensajesVLayout")
	private Element tablaMensajesVLayout;
	@Id("nuevoCorreoButton")
	private Button nuevoCorreoButton;

	/**
     * Creates a new VistaCorreogeneral.
     */
    public VistaCorreogeneral() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCorreogeneral and vista-correogeneral
     */
    public interface VistaCorreogeneralModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Button getInicioButton() {
		return inicioButton;
	}

	public void setInicioButton(Button inicioButton) {
		this.inicioButton = inicioButton;
	}

	public Tab getPestañaEnviados() {
		return pestañaEnviados;
	}

	public void setPestañaEnviados(Tab pestañaEnviados) {
		this.pestañaEnviados = pestañaEnviados;
	}

	public Tab getPestañaRecibidos() {
		return pestañaRecibidos;
	}

	public void setPestañaRecibidos(Tab pestañaRecibidos) {
		this.pestañaRecibidos = pestañaRecibidos;
	}

	public Element getTablaMensajesVLayout() {
		return tablaMensajesVLayout;
	}

	public void setTablaMensajesVLayout(Element tablaMensajesVLayout) {
		this.tablaMensajesVLayout = tablaMensajesVLayout;
	}

	public Button getNuevoCorreoButton() {
		return nuevoCorreoButton;
	}

	public void setNuevoCorreoButton(Button nuevoCorreoButton) {
		this.nuevoCorreoButton = nuevoCorreoButton;
	}
}
