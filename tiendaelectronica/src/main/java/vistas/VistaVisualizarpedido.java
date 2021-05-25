package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.combobox.ComboBox;

/**
 * A Designer generated component for the vista-visualizarpedido template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-visualizarpedido")
@JsModule("./src/vista-visualizarpedido.js")
public class VistaVisualizarpedido extends PolymerTemplate<VistaVisualizarpedido.VistaVisualizarpedidoModel> {

    @Id("fechaPedidoLabel")
	private Label label;
	@Id("nombreUsuarioPedidoLabel")
	private Label label1;
	@Id("numeroPedidoLabel")
	private Label label2;
	@Id("inicioButton")
	private Button inicioButton;
	@Id("carritoButton")
	private Button carritoButton;
	@Id("miCuentaButton")
	private Button miCuentaButton;
	@Id("nombreProductoPedido")
	private H3 nombreProductoPedido;
	@Id("imagenPedido")
	private Button imagenPedido;
	@Id("descripcionTextArea")
	private TextArea descripcionTextArea;
	@Id("precioPedidoLabel")
	private Label precioPedidoLabel;
	@Id("valorarProductoButton")
	private Button valorarProductoButton;
	@Id("valoracionCombo")
	private ComboBox<String> valoracionCombo;

	/**
     * Creates a new VistaVisualizarpedido.
     */
    public VistaVisualizarpedido() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVisualizarpedido and vista-visualizarpedido
     */
    public interface VistaVisualizarpedidoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

    
    
	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}

	public Label getLabel1() {
		return label1;
	}

	public void setLabel1(Label label1) {
		this.label1 = label1;
	}

	public Label getLabel2() {
		return label2;
	}

	public void setLabel2(Label label2) {
		this.label2 = label2;
	}

	public Button getInicioButton() {
		return inicioButton;
	}

	public void setInicioButton(Button inicioButton) {
		this.inicioButton = inicioButton;
	}

	public Button getCarritoButton() {
		return carritoButton;
	}

	public void setCarritoButton(Button carritoButton) {
		this.carritoButton = carritoButton;
	}

	public Button getMiCuentaButton() {
		return miCuentaButton;
	}

	public void setMiCuentaButton(Button miCuentaButton) {
		this.miCuentaButton = miCuentaButton;
	}

	public H3 getNombreProductoPedido() {
		return nombreProductoPedido;
	}

	public void setNombreProductoPedido(H3 nombreProductoPedido) {
		this.nombreProductoPedido = nombreProductoPedido;
	}

	public Button getImagenPedido() {
		return imagenPedido;
	}

	public void setImagenPedido(Button imagenPedido) {
		this.imagenPedido = imagenPedido;
	}

	public TextArea getDescripcionTextArea() {
		return descripcionTextArea;
	}

	public void setDescripcionTextArea(TextArea descripcionTextArea) {
		this.descripcionTextArea = descripcionTextArea;
	}

	public Label getPrecioPedidoLabel() {
		return precioPedidoLabel;
	}

	public void setPrecioPedidoLabel(Label precioPedidoLabel) {
		this.precioPedidoLabel = precioPedidoLabel;
	}

	public Button getValorarProductoButton() {
		return valorarProductoButton;
	}

	public void setValorarProductoButton(Button valorarProductoButton) {
		this.valorarProductoButton = valorarProductoButton;
	}

	public ComboBox<String> getValoracionCombo() {
		return valoracionCombo;
	}

	public void setValoracionCombo(ComboBox<String> valoracionCombo) {
		this.valoracionCombo = valoracionCombo;
	}
}
