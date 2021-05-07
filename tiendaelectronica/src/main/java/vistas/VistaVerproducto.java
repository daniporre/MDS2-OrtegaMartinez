package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-verproducto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-verproducto")
@JsModule("./src/vista-verproducto.js")
public class VistaVerproducto extends PolymerTemplate<VistaVerproducto.VistaVerproductoModel> {

    @Id("imagenProducto")
	private Image imagenProducto;
	@Id("nombreProducto")
	private H2 nombreProducto;
	@Id("descripcionProducto")
	private Label descripcionProducto;
	@Id("valoracionProducto")
	private Image valoracionProducto;
	@Id("precioProducto")
	private Label precioProducto;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;

	/**
     * Creates a new VistaVerproducto.
     */
    public VistaVerproducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVerproducto and vista-verproducto
     */
    public interface VistaVerproductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Image getImagenProducto() {
		return imagenProducto;
	}

	public void setImagenProducto(Image imagenProducto) {
		this.imagenProducto = imagenProducto;
	}

	public H2 getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(H2 nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Label getDescripcionProducto() {
		return descripcionProducto;
	}

	public void setDescripcionProducto(Label descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}

	public Image getValoracionProducto() {
		return valoracionProducto;
	}

	public void setValoracionProducto(Image valoracionProducto) {
		this.valoracionProducto = valoracionProducto;
	}

	public Label getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(Label precioProducto) {
		this.precioProducto = precioProducto;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}
}
