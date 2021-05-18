package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.textfield.TextArea;

/**
 * A Designer generated component for the vista-editarproducto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-editarproducto")
@JsModule("./src/vista-editarproducto.js")
public class VistaEditarproducto extends PolymerTemplate<VistaEditarproducto.VistaEditarproductoModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("inicioButton")
	private Button inicioButton;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("foto1Image")
	private Image foto1Image;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("foto2Image")
	private Button foto2Image;
	@Id("foto3Image")
	private Button foto3Image;
	@Id("vaadinTab")
	private Tab vaadinTab;
	@Id("vaadinVerticalLayout3")
	private Element vaadinVerticalLayout3;
	@Id("nombreProductoTF")
	private TextField nombreProductoTF;
	@Id("precioProductoTF")
	private TextField precioProductoTF;
	@Id("marcaProductoTF")
	private TextField marcaProductoTF;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("h2")
	private H2 h2;
	@Id("ofertasProductoTF")
	private ComboBox<String> ofertasProductoTF;
	@Id("vaadinVerticalLayout4")
	private Element vaadinVerticalLayout4;
	@Id("descripcionProductoTF")
	private TextArea descripcionProductoTF;
	@Id("guardarCambiosButton")
	private Button guardarCambiosButton;
	@Id("categoriaProductoComboBox")
	private ComboBox<String> categoriaProductoComboBox;
	@Id("categoriasLayout")
	private HorizontalLayout categoriasLayout;

	/**
     * Creates a new VistaEditarproducto.
     */
    public VistaEditarproducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEditarproducto and vista-editarproducto
     */
    public interface VistaEditarproductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Button getInicioButton() {
		return inicioButton;
	}

	public void setInicioButton(Button inicioButton) {
		this.inicioButton = inicioButton;
	}

	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}

	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}

	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}

	public Image getFoto1Image() {
		return foto1Image;
	}

	public void setFoto1Image(Image foto1Image) {
		this.foto1Image = foto1Image;
	}

	public HorizontalLayout getVaadinHorizontalLayout2() {
		return vaadinHorizontalLayout2;
	}

	public void setVaadinHorizontalLayout2(HorizontalLayout vaadinHorizontalLayout2) {
		this.vaadinHorizontalLayout2 = vaadinHorizontalLayout2;
	}

	public Button getFoto2Image() {
		return foto2Image;
	}

	public void setFoto2Image(Button foto2Image) {
		this.foto2Image = foto2Image;
	}

	public Button getFoto3Image() {
		return foto3Image;
	}

	public void setFoto3Image(Button foto3Image) {
		this.foto3Image = foto3Image;
	}

	public Tab getVaadinTab() {
		return vaadinTab;
	}

	public void setVaadinTab(Tab vaadinTab) {
		this.vaadinTab = vaadinTab;
	}

	public Element getVaadinVerticalLayout3() {
		return vaadinVerticalLayout3;
	}

	public void setVaadinVerticalLayout3(Element vaadinVerticalLayout3) {
		this.vaadinVerticalLayout3 = vaadinVerticalLayout3;
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

	public HorizontalLayout getVaadinHorizontalLayout3() {
		return vaadinHorizontalLayout3;
	}

	public void setVaadinHorizontalLayout3(HorizontalLayout vaadinHorizontalLayout3) {
		this.vaadinHorizontalLayout3 = vaadinHorizontalLayout3;
	}

	public H2 getH2() {
		return h2;
	}

	public void setH2(H2 h2) {
		this.h2 = h2;
	}

	public ComboBox<String> getOfertasProductoTF() {
		return ofertasProductoTF;
	}

	public void setOfertasProductoTF(ComboBox<String> ofertasProductoTF) {
		this.ofertasProductoTF = ofertasProductoTF;
	}

	public Element getVaadinVerticalLayout4() {
		return vaadinVerticalLayout4;
	}

	public void setVaadinVerticalLayout4(Element vaadinVerticalLayout4) {
		this.vaadinVerticalLayout4 = vaadinVerticalLayout4;
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

	public ComboBox<String> getCategoriaProductoComboBox() {
		return categoriaProductoComboBox;
	}

	public void setCategoriaProductoComboBox(ComboBox<String> categoriaProductoComboBox) {
		this.categoriaProductoComboBox = categoriaProductoComboBox;
	}

	public HorizontalLayout getCategoriasLayout() {
		return categoriasLayout;
	}

	public void setCategoriasLayout(HorizontalLayout categoriasLayout) {
		this.categoriasLayout = categoriasLayout;
	}
}
