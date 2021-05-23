package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-mensajesenviados template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-mensajesenviados")
@JsModule("./src/vista-mensajesenviados.js")
public class VistaMensajesenviados extends PolymerTemplate<VistaMensajesenviados.VistaMensajesenviadosModel> {

    @Id("estadoLabel")
	private Label estadoLabel;
	@Id("cuerpoMensajeLabel")
	private Label cuerpoMensajeLabel;
	@Id("asuntoMensajeLabel")
	private Label asuntoMensajeLabel;
	@Id("fechaMensajeLabel")
	private Label fechaMensajeLabel;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;

	/**
     * Creates a new VistaMensajesenviados.
     */
    public VistaMensajesenviados() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaMensajesenviados and vista-mensajesenviados
     */
    public interface VistaMensajesenviadosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Label getEstadoLabel() {
		return estadoLabel;
	}

	public void setEstadoLabel(Label estadoLabel) {
		this.estadoLabel = estadoLabel;
	}

	public Label getCuerpoMensajeLabel() {
		return cuerpoMensajeLabel;
	}

	public void setCuerpoMensajeLabel(Label cuerpoMensajeLabel) {
		this.cuerpoMensajeLabel = cuerpoMensajeLabel;
	}

	public Label getAsuntoMensajeLabel() {
		return asuntoMensajeLabel;
	}

	public void setAsuntoMensajeLabel(Label asuntoMensajeLabel) {
		this.asuntoMensajeLabel = asuntoMensajeLabel;
	}

	public Label getFechaMensajeLabel() {
		return fechaMensajeLabel;
	}

	public void setFechaMensajeLabel(Label fechaMensajeLabel) {
		this.fechaMensajeLabel = fechaMensajeLabel;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}
}
