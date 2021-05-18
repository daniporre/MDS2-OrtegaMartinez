package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;

/**
 * A Designer generated component for the vista-productosbuscados template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productosbuscados")
@JsModule("./src/vista-productosbuscados.js")
public class VistaProductosbuscados extends PolymerTemplate<VistaProductosbuscados.VistaProductosbuscadosModel> {

    @Id("inicioButton")
	private Button inicioButton;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("buscarTF")
	private TextField buscarTF;
	@Id("buscarButton")
	private Button buscarButton;
	@Id("carritoButton")
	private Button carritoButton;
	@Id("miCuentaButton")
	private Button miCuentaButton;
	@Id("iniciarSesionButton")
	private Button iniciarSesionButton;
	@Id("marcaVerticalLayout")
	private Element marcaVerticalLayout;
	@Id("ordenarComboBox")
	private ComboBox<String> ordenarComboBox;
	@Id("productosVerticalLayout")
	private Element productosVerticalLayout;
	@Id("radioGroup")
	private RadioButtonGroup<String> radioGroup;

	/**
     * Creates a new VistaProductosbuscados.
     */
    public VistaProductosbuscados() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductosbuscados and vista-productosbuscados
     */
    public interface VistaProductosbuscadosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Button getInicioButton() {
		return inicioButton;
	}

	public void setInicioButton(Button inicioButton) {
		this.inicioButton = inicioButton;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public TextField getBuscarTF() {
		return buscarTF;
	}

	public void setBuscarTF(TextField buscarTF) {
		this.buscarTF = buscarTF;
	}

	public Button getBuscarButton() {
		return buscarButton;
	}

	public void setBuscarButton(Button buscarButton) {
		this.buscarButton = buscarButton;
	}

	public Button getCarritoButton() {
		return carritoButton;
	}

	public void setCarritoButton(Button carritoButton) {
		this.carritoButton = carritoButton;
	}

	public Button getMiCuentaButton() {
		return miCuentaButton;
	}

	public void setMiCuentaButton(Button miCuentaButton) {
		this.miCuentaButton = miCuentaButton;
	}

	public Button getIniciarSesionButton() {
		return iniciarSesionButton;
	}

	public void setIniciarSesionButton(Button iniciarSesionButton) {
		this.iniciarSesionButton = iniciarSesionButton;
	}

	public Element getMarcaVerticalLayout() {
		return marcaVerticalLayout;
	}

	public void setMarcaVerticalLayout(Element marcaVerticalLayout) {
		this.marcaVerticalLayout = marcaVerticalLayout;
	}

	public ComboBox<String> getOrdenarComboBox() {
		return ordenarComboBox;
	}

	public void setOrdenarComboBox(ComboBox<String> ordenarComboBox) {
		this.ordenarComboBox = ordenarComboBox;
	}

	public Element getProductosVerticalLayout() {
		return productosVerticalLayout;
	}

	public void setProductosVerticalLayout(Element productosVerticalLayout) {
		this.productosVerticalLayout = productosVerticalLayout;
	}

	public RadioButtonGroup<String> getRadioGroup() {
		return radioGroup;
	}

	public void setRadioGroup(RadioButtonGroup<String> radioGroup) {
		this.radioGroup = radioGroup;
	}
}
