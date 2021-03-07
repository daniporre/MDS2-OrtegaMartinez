package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-administrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-administrador")
@JsModule("./src/vista-administrador.js")
public class VistaAdministrador extends PolymerTemplate<VistaAdministrador.VistaAdministradorModel> {

    @Id("inicioButton")
	private Button inicioButton;
	@Id("aniadirProductoButton")
	private Button aniadirProductoButton;
	@Id("gestionarProductoButton")
	private Button gestionarProductoButton;
	@Id("verListadoComprasButton")
	private Button verListadoComprasButton;
	@Id("salirButton")
	private Button salirButton;
	@Id("correoButton")
	private Button correoButton;
	@Id("nombreOfertaTF")
	private TextField nombreOfertaTF;
	@Id("descuentoTF")
	private TextField descuentoTF;
	@Id("crearOfertaButton")
	private Button crearOfertaButton;
	@Id("darDeBajaComboBox")
	private ComboBox<String> darDeBajaComboBox;
	@Id("darBajaButton")
	private Button darBajaButton;
	@Id("nuevaCategoriaTF")
	private TextField nuevaCategoriaTF;
	@Id("nuevaCategoriaButton")
	private Button nuevaCategoriaButton;
	@Id("principalVLayout")
	private Element principalVLayout;

	/**
     * Creates a new VistaAdministrador.
     */
    public VistaAdministrador() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAdministrador and vista-administrador
     */
    public interface VistaAdministradorModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Button getInicioButton() {
		return inicioButton;
	}

	public void setInicioButton(Button inicioButton) {
		this.inicioButton = inicioButton;
	}

	public Button getAniadirProductoButton() {
		return aniadirProductoButton;
	}

	public void setAniadirProductoButton(Button aniadirProductoButton) {
		this.aniadirProductoButton = aniadirProductoButton;
	}

	public Button getGestionarProductoButton() {
		return gestionarProductoButton;
	}

	public void setGestionarProductoButton(Button gestionarProductoButton) {
		this.gestionarProductoButton = gestionarProductoButton;
	}

	public Button getVerListadoComprasButton() {
		return verListadoComprasButton;
	}

	public void setVerListadoComprasButton(Button verListadoComprasButton) {
		this.verListadoComprasButton = verListadoComprasButton;
	}

	public Button getSalirButton() {
		return salirButton;
	}

	public void setSalirButton(Button salirButton) {
		this.salirButton = salirButton;
	}

	public Button getCorreoButton() {
		return correoButton;
	}

	public void setCorreoButton(Button correoButton) {
		this.correoButton = correoButton;
	}

	public TextField getNombreOfertaTF() {
		return nombreOfertaTF;
	}

	public void setNombreOfertaTF(TextField nombreOfertaTF) {
		this.nombreOfertaTF = nombreOfertaTF;
	}

	public TextField getDescuentoTF() {
		return descuentoTF;
	}

	public void setDescuentoTF(TextField descuentoTF) {
		this.descuentoTF = descuentoTF;
	}

	public Button getCrearOfertaButton() {
		return crearOfertaButton;
	}

	public void setCrearOfertaButton(Button crearOfertaButton) {
		this.crearOfertaButton = crearOfertaButton;
	}

	public ComboBox<String> getDarDeBajaComboBox() {
		return darDeBajaComboBox;
	}

	public void setDarDeBajaComboBox(ComboBox<String> darDeBajaComboBox) {
		this.darDeBajaComboBox = darDeBajaComboBox;
	}

	public Button getDarBajaButton() {
		return darBajaButton;
	}

	public void setDarBajaButton(Button darBajaButton) {
		this.darBajaButton = darBajaButton;
	}

	public TextField getNuevaCategoriaTF() {
		return nuevaCategoriaTF;
	}

	public void setNuevaCategoriaTF(TextField nuevaCategoriaTF) {
		this.nuevaCategoriaTF = nuevaCategoriaTF;
	}

	public Button getNuevaCategoriaButton() {
		return nuevaCategoriaButton;
	}

	public void setNuevaCategoriaButton(Button nuevaCategoriaButton) {
		this.nuevaCategoriaButton = nuevaCategoriaButton;
	}

	public Element getPrincipalVLayout() {
		return principalVLayout;
	}

	public void setPrincipalVLayout(Element principalVLayout) {
		this.principalVLayout = principalVLayout;
	}
}
