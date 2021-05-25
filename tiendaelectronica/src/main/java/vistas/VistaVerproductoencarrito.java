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

	@Id("nombreProductoLabel")
	private Label nombreProductoLabel;
	@Id("aumentarButton")
	private Button aumentarButton;
	@Id("precioLabel")
	private Label precioLabel;
	@Id("eliminarProductoButton")
	private Button eliminarProductoButton;

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

	public Button getEliminarProductoButton() {
		return eliminarProductoButton;
	}

	public void setEliminarProductoButton(Button eliminarProductoButton) {
		this.eliminarProductoButton = eliminarProductoButton;
	}
}
