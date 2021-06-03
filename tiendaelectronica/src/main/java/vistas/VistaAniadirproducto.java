package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;

/**
 * A Designer generated component for the vista-aniadirproducto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-aniadirproducto")
@JsModule("./src/vista-aniadirproducto.js")
public class VistaAniadirproducto extends PolymerTemplate<VistaAniadirproducto.VistaAñadirproductoModel> {

    @Id("nombreProductoTF")
	private TextField nombreProductoTF;
	@Id("precioProductoTF")
	private TextField precioProductoTF;
	@Id("marcaProductoTF")
	private TextField marcaProductoTF;
	@Id("ofertasProductoTF")
	private ComboBox<String> ofertasProductoTF;
	@Id("descripcionProductoTF")
	private TextArea descripcionProductoTF;
	@Id("guardarCambiosButton")
	private Button guardarCambiosButton;
	@Id("inicioButton")
	private Button inicioButton;
	@Id("foto1Image")
	private Image foto1Image;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("foto2Image")
	private Image foto2Image;
	@Id("foto3Image")
	private Image foto3Image;
	@Id("foto4Image")
	private Image foto4Image;
	@Id("imagen1TFsrc")
	private TextField imagen1TFsrc;
	@Id("imagen2TFsrc")
	private TextField imagen2TFsrc;
	@Id("imagen3TFsrc")
	private TextField imagen3TFsrc;
	@Id("imagen4TFsrc")
	private TextField imagen4TFsrc;
	/**
     * Creates a new VistaAniadirproducto.
     */
    public VistaAniadirproducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAñadirproducto and vista-aniadirproducto
     */
    public interface VistaAñadirproductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public TextField getNombreProductoTF() {
		return nombreProductoTF;
	}

	public void setNombreProductoTF(TextField nombreProductoTF) {
		this.nombreProductoTF = nombreProductoTF;
	}

	public TextField getPrecioProductoTF() {
		return precioProductoTF;
	}

	public void setPrecioProductoTF(TextField precioProductoTF) {
		this.precioProductoTF = precioProductoTF;
	}

	public TextField getMarcaProductoTF() {
		return marcaProductoTF;
	}

	public void setMarcaProductoTF(TextField marcaProductoTF) {
		this.marcaProductoTF = marcaProductoTF;
	}

	public ComboBox<String> getOfertasProductoTF() {
		return ofertasProductoTF;
	}

	public void setOfertasProductoTF(ComboBox<String> ofertasProductoTF) {
		this.ofertasProductoTF = ofertasProductoTF;
	}

	public TextArea getDescripcionProductoTF() {
		return descripcionProductoTF;
	}

	public void setDescripcionProductoTF(TextArea descripcionProductoTF) {
		this.descripcionProductoTF = descripcionProductoTF;
	}

	public Button getGuardarCambiosButton() {
		return guardarCambiosButton;
	}

	public void setGuardarCambiosButton(Button guardarCambiosButton) {
		this.guardarCambiosButton = guardarCambiosButton;
	}

	public Button getInicioButton() {
		return inicioButton;
	}

	public void setInicioButton(Button inicioButton) {
		this.inicioButton = inicioButton;
	}

	public Image getFoto1Image() {
		return foto1Image;
	}

	public void setFoto1Image(Image foto1Image) {
		this.foto1Image = foto1Image;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Image getFoto2Image() {
		return foto2Image;
	}

	public void setFoto2Image(Image foto2Image) {
		this.foto2Image = foto2Image;
	}

	public Image getFoto3Image() {
		return foto3Image;
	}

	public void setFoto3Image(Image foto3Image) {
		this.foto3Image = foto3Image;
	}

	public Image getFoto4Image() {
		return foto4Image;
	}

	public void setFoto4Image(Image foto4Image) {
		this.foto4Image = foto4Image;
	}

	public TextField getImagen1TFsrc() {
		return imagen1TFsrc;
	}

	public void setImagen1TFsrc(TextField imagen1tFsrc) {
		imagen1TFsrc = imagen1tFsrc;
	}

	public TextField getImagen2TFsrc() {
		return imagen2TFsrc;
	}

	public void setImagen2TFsrc(TextField imagen2tFsrc) {
		imagen2TFsrc = imagen2tFsrc;
	}

	public TextField getImagen3TFsrc() {
		return imagen3TFsrc;
	}

	public void setImagen3TFsrc(TextField imagen3tFsrc) {
		imagen3TFsrc = imagen3tFsrc;
	}

	public TextField getImagen4TFsrc() {
		return imagen4TFsrc;
	}

	public void setImagen4TFsrc(TextField imagen4tFsrc) {
		imagen4TFsrc = imagen4tFsrc;
	}
}
