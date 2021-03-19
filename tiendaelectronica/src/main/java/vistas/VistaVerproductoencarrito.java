package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-verproductoencarrito template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-verproductoencarrito")
@JsModule("./src/vista-verproductoencarrito.js")
public class VistaVerproductoencarrito extends PolymerTemplate<VistaVerproductoencarrito.VistaVerproductoencarritoModel> {

    @Id("imagenProductoButton")
	private Button imagenProductoButton;
	@Id("nombreProductoLabel")
	private Label nombreProductoLabel;
	@Id("decrementarButton")
	private Button decrementarButton;
	@Id("cantidadProductosLabel")
	private Label cantidadProductosLabel;
	@Id("aumentarButton")
	private Button aumentarButton;
	@Id("precioLabel")
	private Label precioLabel;
	@Id("totalLabel")
	private Label totalLabel;

	/**
     * Creates a new VistaVerproductoencarrito.
     */
    public VistaVerproductoencarrito() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVerproductoencarrito and vista-verproductoencarrito
     */
    public interface VistaVerproductoencarritoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Label getNombreProductoLabel() {
		return nombreProductoLabel;
	}

	public void setNombreProductoLabel(Label nombreProductoLabel) {
		this.nombreProductoLabel = nombreProductoLabel;
	}

	public Button getDecrementarButton() {
		return decrementarButton;
	}

	public void setDecrementarButton(Button decrementarButton) {
		this.decrementarButton = decrementarButton;
	}

	public Label getCantidadProductosLabel() {
		return cantidadProductosLabel;
	}

	public void setCantidadProductosLabel(Label cantidadProductosLabel) {
		this.cantidadProductosLabel = cantidadProductosLabel;
	}

	public Button getAumentarButton() {
		return aumentarButton;
	}

	public void setAumentarButton(Button aumentarButton) {
		this.aumentarButton = aumentarButton;
	}

	public Label getPrecioLabel() {
		return precioLabel;
	}

	public void setPrecioLabel(Label precioLabel) {
		this.precioLabel = precioLabel;
	}

	public Label getTotalLabel() {
		return totalLabel;
	}

	public void setTotalLabel(Label totalLabel) {
		this.totalLabel = totalLabel;
	}
}
