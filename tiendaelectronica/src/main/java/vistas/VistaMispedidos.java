package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-mispedidos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-mispedidos")
@JsModule("./src/vista-mispedidos.js")
public class VistaMispedidos extends PolymerTemplate<VistaMispedidos.VistaMispedidosModel> {

    @Id("fechaLabel")
	private H4 fechaLabel;
	@Id("referenciaLabel")
	private H4 referenciaLabel;
	@Id("totalLabel")
	private H4 totalLabel;
	@Id("estadoLabel")
	private H4 estadoLabel;
	@Id("verPedidoButton")
	private Button verPedidoButton;
	@Id("cancelarPedidoButton")
	private Button cancelarPedidoButton;

	/**
     * Creates a new VistaMispedidos.
     */
    public VistaMispedidos() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaMispedidos and vista-mispedidos
     */
    public interface VistaMispedidosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public H4 getFechaLabel() {
		return fechaLabel;
	}

	public void setFechaLabel(H4 fechaLabel) {
		this.fechaLabel = fechaLabel;
	}

	public H4 getReferenciaLabel() {
		return referenciaLabel;
	}

	public void setReferenciaLabel(H4 referenciaLabel) {
		this.referenciaLabel = referenciaLabel;
	}

	public H4 getTotalLabel() {
		return totalLabel;
	}

	public void setTotalLabel(H4 totalLabel) {
		this.totalLabel = totalLabel;
	}

	public H4 getEstadoLabel() {
		return estadoLabel;
	}

	public void setEstadoLabel(H4 estadoLabel) {
		this.estadoLabel = estadoLabel;
	}

	public Button getVerPedidoButton() {
		return verPedidoButton;
	}

	public void setVerPedidoButton(Button verPedidoButton) {
		this.verPedidoButton = verPedidoButton;
	}

	public Button getCancelarPedidoButton() {
		return cancelarPedidoButton;
	}

	public void setCancelarPedidoButton(Button cancelarPedidoButton) {
		this.cancelarPedidoButton = cancelarPedidoButton;
	}
}
