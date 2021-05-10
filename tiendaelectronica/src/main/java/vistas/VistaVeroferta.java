package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-veroferta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-veroferta")
@JsModule("./src/vista-veroferta.js")
public class VistaVeroferta extends PolymerTemplate<VistaVeroferta.VistaVerofertaModel> {

	@Id("imagenProductoOferta")
	private Image imagenProductoOferta;
	@Id("precioOferta")
	private Label precioOferta;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;

	/**
     * Creates a new VistaVeroferta.
     */
    public VistaVeroferta() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVeroferta and vista-veroferta
     */
    public interface VistaVerofertaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Image getImagenProductoOferta() {
		return imagenProductoOferta;
	}

	public void setImagenProductoOferta(Image imagenProductoOferta) {
		this.imagenProductoOferta = imagenProductoOferta;
	}

	public Label getPrecioOferta() {
		return precioOferta;
	}

	public void setPrecioOferta(Label precioOferta) {
		this.precioOferta = precioOferta;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}
}
