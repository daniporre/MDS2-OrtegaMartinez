package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-vercompra template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-vercompra")
@JsModule("./src/vista-vercompra.js")
public class VistaVercompra extends PolymerTemplate<VistaVercompra.VistaVercompraModel> {

    @Id("nombreProductoLabel")
	private H3 nombreProductoLabel;
	@Id("fechaPedidoLabel")
	private Label fechaPedidoLabel;
	@Id("enviadoALabel")
	private Label enviadoALabel;
	@Id("precioPedidoLabel")
	private Label precioPedidoLabel;
	@Id("numeroPedidoLabel")
	private Label numeroPedidoLabel;
	@Id("verFichaUsuarioButton")
	private Button verFichaUsuarioButton;
	@Id("recibidoButton")
	private Button recibidoButton;
	@Id("enviarPedidoButton")
	private Button enviarPedidoButton;
	@Id("estadoPedidoLabel")
	private Label estadoPedidoLabel;

	/**
     * Creates a new VistaVercompra.
     */
    public VistaVercompra() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVercompra and vista-vercompra
     */
    public interface VistaVercompraModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public H3 getNombreProductoLabel() {
		return nombreProductoLabel;
	}

	public void setNombreProductoLabel(H3 nombreProductoLabel) {
		this.nombreProductoLabel = nombreProductoLabel;
	}

	public Label getFechaPedidoLabel() {
		return fechaPedidoLabel;
	}

	public void setFechaPedidoLabel(Label fechaPedidoLabel) {
		this.fechaPedidoLabel = fechaPedidoLabel;
	}

	public Label getEnviadoALabel() {
		return enviadoALabel;
	}

	public void setEnviadoALabel(Label enviadoALabel) {
		this.enviadoALabel = enviadoALabel;
	}

	public Label getPrecioPedidoLabel() {
		return precioPedidoLabel;
	}

	public void setPrecioPedidoLabel(Label precioPedidoLabel) {
		this.precioPedidoLabel = precioPedidoLabel;
	}

	public Label getNumeroPedidoLabel() {
		return numeroPedidoLabel;
	}

	public void setNumeroPedidoLabel(Label numeroPedidoLabel) {
		this.numeroPedidoLabel = numeroPedidoLabel;
	}

	public Button getVerFichaUsuarioButton() {
		return verFichaUsuarioButton;
	}

	public void setVerFichaUsuarioButton(Button verFichaUsuarioButton) {
		this.verFichaUsuarioButton = verFichaUsuarioButton;
	}

	public Button getRecibidoButton() {
		return recibidoButton;
	}

	public void setRecibidoButton(Button recibidoButton) {
		this.recibidoButton = recibidoButton;
	}

	public Button getEnviarPedidoButton() {
		return enviarPedidoButton;
	}

	public void setEnviarPedidoButton(Button enviarPedidoButton) {
		this.enviarPedidoButton = enviarPedidoButton;
	}

	public Label getEstadoPedidoLabel() {
		return estadoPedidoLabel;
	}

	public void setEstadoPedidoLabel(Label estadoPedidoLabel) {
		this.estadoPedidoLabel = estadoPedidoLabel;
	}
}
