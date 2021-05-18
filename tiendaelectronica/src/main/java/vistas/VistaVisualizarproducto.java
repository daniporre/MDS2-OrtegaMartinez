package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-visualizarproducto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-visualizarproducto")
@JsModule("./src/vista-visualizarproducto.js")
public class VistaVisualizarproducto extends PolymerTemplate<VistaVisualizarproducto.VistaVisualizarproductoModel> {

    @Id("inicioButton")
	private Button inicioButton;
	@Id("searchBar")
	private TextField searchBar;
	@Id("buscarButton")
	private Button buscarButton;
	@Id("verCarritoButton")
	private Button verCarritoButton;
	@Id("iniciarSesionButton")
	private Button iniciarSesionButton;
	@Id("imagen1Button")
	private Button imagen1Button;
	@Id("nombreProductoTitulo")
	private H2 nombreProductoTitulo;
	@Id("precioProductoLabel")
	private Label precioProductoLabel;
	@Id("decuentoProductoLabel")
	private Label decuentoProductoLabel;
	@Id("valoracionProductoLabel")
	private Label valoracionProductoLabel;
	@Id("referenciaProductoLabel")
	private Label referenciaProductoLabel;
	@Id("imagen2Button")
	private Button imagen2Button;
	@Id("imagen3Button")
	private Button imagen3Button;
	@Id("aniadirAlCarritoButton")
	private Button aniadirAlCarritoButton;
	@Id("descripcionProductoTArea")
	private TextArea descripcionProductoTArea;
	@Id("valoracionesProductoVLayout")
	private Element valoracionesProductoVLayout;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	/**
     * Creates a new VistaVisualizarproducto.
     */
    public VistaVisualizarproducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVisualizarproducto and vista-visualizarproducto
     */
    public interface VistaVisualizarproductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Button getInicioButton() {
		return inicioButton;
	}

	public void setInicioButton(Button inicioButton) {
		this.inicioButton = inicioButton;
	}

	public TextField getSearchBar() {
		return searchBar;
	}

	public void setSearchBar(TextField searchBar) {
		this.searchBar = searchBar;
	}

	public Button getBuscarButton() {
		return buscarButton;
	}

	public void setBuscarButton(Button buscarButton) {
		this.buscarButton = buscarButton;
	}

	public Button getVerCarritoButton() {
		return verCarritoButton;
	}

	public void setVerCarritoButton(Button verCarritoButton) {
		this.verCarritoButton = verCarritoButton;
	}

	public Button getIniciarSesionButton() {
		return iniciarSesionButton;
	}

	public void setIniciarSesionButton(Button iniciarSesionButton) {
		this.iniciarSesionButton = iniciarSesionButton;
	}

	public Button getImagen1Button() {
		return imagen1Button;
	}

	public void setImagen1Button(Button imagen1Button) {
		this.imagen1Button = imagen1Button;
	}

	public H2 getNombreProductoTitulo() {
		return nombreProductoTitulo;
	}

	public void setNombreProductoTitulo(H2 nombreProductoTitulo) {
		this.nombreProductoTitulo = nombreProductoTitulo;
	}

	public Label getPrecioProductoLabel() {
		return precioProductoLabel;
	}

	public void setPrecioProductoLabel(Label precioProductoLabel) {
		this.precioProductoLabel = precioProductoLabel;
	}

	public Label getDecuentoProductoLabel() {
		return decuentoProductoLabel;
	}

	public void setDecuentoProductoLabel(Label decuentoProductoLabel) {
		this.decuentoProductoLabel = decuentoProductoLabel;
	}

	public Label getValoracionProductoLabel() {
		return valoracionProductoLabel;
	}

	public void setValoracionProductoLabel(Label valoracionProductoLabel) {
		this.valoracionProductoLabel = valoracionProductoLabel;
	}

	public Label getReferenciaProductoLabel() {
		return referenciaProductoLabel;
	}

	public void setReferenciaProductoLabel(Label referenciaProductoLabel) {
		this.referenciaProductoLabel = referenciaProductoLabel;
	}

	public Button getImagen2Button() {
		return imagen2Button;
	}

	public void setImagen2Button(Button imagen2Button) {
		this.imagen2Button = imagen2Button;
	}

	public Button getImagen3Button() {
		return imagen3Button;
	}

	public void setImagen3Button(Button imagen3Button) {
		this.imagen3Button = imagen3Button;
	}

	public Button getAniadirAlCarritoButton() {
		return aniadirAlCarritoButton;
	}

	public void setAniadirAlCarritoButton(Button aniadirAlCarritoButton) {
		this.aniadirAlCarritoButton = aniadirAlCarritoButton;
	}

	public TextArea getDescripcionProductoTArea() {
		return descripcionProductoTArea;
	}

	public void setDescripcionProductoTArea(TextArea descripcionProductoTArea) {
		this.descripcionProductoTArea = descripcionProductoTArea;
	}

	public Element getValoracionesProductoVLayout() {
		return valoracionesProductoVLayout;
	}

	public void setValoracionesProductoVLayout(Element valoracionesProductoVLayout) {
		this.valoracionesProductoVLayout = valoracionesProductoVLayout;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}
}
