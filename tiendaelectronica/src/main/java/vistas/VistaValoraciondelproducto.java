package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.html.H3;

/**
 * A Designer generated component for the vista-valoraciondelproducto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-valoraciondelproducto")
@JsModule("./src/vista-valoraciondelproducto.js")
public class VistaValoraciondelproducto extends PolymerTemplate<VistaValoraciondelproducto.VistaValoraciondelproductoModel> {


	@Id("valoracionProductoLabel")
	private Label valoracionProductoLabel;
	@Id("comentarioValoracionTArea")
	private TextArea comentarioValoracionTArea;
	@Id("nombreUsuarioValoracionLabel1")
	private H3 nombreUsuarioValoracionLabel1;

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

	public H3 getNombreUsuarioValoracionLabel1() {
		return nombreUsuarioValoracionLabel1;
	}

	public void setNombreUsuarioValoracionLabel1(H3 nombreUsuarioValoracionLabel1) {
		this.nombreUsuarioValoracionLabel1 = nombreUsuarioValoracionLabel1;
	}
}
