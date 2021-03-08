package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.TextArea;

/**
 * A Designer generated component for the vista-valoraciondelproducto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-valoraciondelproducto")
@JsModule("./src/vista-valoraciondelproducto.js")
public class VistaValoraciondelproducto extends PolymerTemplate<VistaValoraciondelproducto.VistaValoraciondelproductoModel> {

    @Id("nombreUsuarioValoracionLabel")
	private Label nombreUsuarioValoracionLabel;
	@Id("valoracionProductoLabel")
	private Label valoracionProductoLabel;
	@Id("comentarioValoracionTArea")
	private TextArea comentarioValoracionTArea;

	/**
     * Creates a new VistaValoraciondelproducto.
     */
    public VistaValoraciondelproducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaValoraciondelproducto and vista-valoraciondelproducto
     */
    public interface VistaValoraciondelproductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Label getNombreUsuarioValoracionLabel() {
		return nombreUsuarioValoracionLabel;
	}

	public void setNombreUsuarioValoracionLabel(Label nombreUsuarioValoracionLabel) {
		this.nombreUsuarioValoracionLabel = nombreUsuarioValoracionLabel;
	}

	public Label getValoracionProductoLabel() {
		return valoracionProductoLabel;
	}

	public void setValoracionProductoLabel(Label valoracionProductoLabel) {
		this.valoracionProductoLabel = valoracionProductoLabel;
	}

	public TextArea getComentarioValoracionTArea() {
		return comentarioValoracionTArea;
	}

	public void setComentarioValoracionTArea(TextArea comentarioValoracionTArea) {
		this.comentarioValoracionTArea = comentarioValoracionTArea;
	}
}
