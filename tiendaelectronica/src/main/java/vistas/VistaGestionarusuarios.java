package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-gestionarusuarios template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-gestionarusuarios")
@JsModule("./src/vista-gestionarusuarios.js")
public class VistaGestionarusuarios extends PolymerTemplate<VistaGestionarusuarios.VistaGestionarusuariosModel> {

    @Id("nuevoUsuarioEmailTF")
	private TextField nuevoUsuarioEmailTF;
	@Id("nuevoUsuarioContraseñaTF")
	private TextField nuevoUsuarioContraseñaTF;
	@Id("rolNuevoUsuarioComboBox")
	private ComboBox<String> rolNuevoUsuarioComboBox;
	@Id("nuevoUsuarioButton")
	private Button nuevoUsuarioButton;
	@Id("seleccionarUsuarioComboBox")
	private ComboBox<String> seleccionarUsuarioComboBox;
	@Id("contraseñaUsuarioModificadaTF")
	private TextField contraseñaUsuarioModificadaTF;
	@Id("cambiarContraseñaButton")
	private Button cambiarContraseñaButton;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;

	/**
     * Creates a new VistaGestionarusuarios.
     */
    public VistaGestionarusuarios() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaGestionarusuarios and vista-gestionarusuarios
     */
    public interface VistaGestionarusuariosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public TextField getNuevoUsuarioEmailTF() {
		return nuevoUsuarioEmailTF;
	}

	public void setNuevoUsuarioEmailTF(TextField nuevoUsuarioEmailTF) {
		this.nuevoUsuarioEmailTF = nuevoUsuarioEmailTF;
	}

	public TextField getNuevoUsuarioContraseñaTF() {
		return nuevoUsuarioContraseñaTF;
	}

	public void setNuevoUsuarioContraseñaTF(TextField nuevoUsuarioContraseñaTF) {
		this.nuevoUsuarioContraseñaTF = nuevoUsuarioContraseñaTF;
	}

	public ComboBox<String> getRolNuevoUsuarioComboBox() {
		return rolNuevoUsuarioComboBox;
	}

	public void setRolNuevoUsuarioComboBox(ComboBox<String> rolNuevoUsuarioComboBox) {
		this.rolNuevoUsuarioComboBox = rolNuevoUsuarioComboBox;
	}

	public Button getNuevoUsuarioButton() {
		return nuevoUsuarioButton;
	}

	public void setNuevoUsuarioButton(Button nuevoUsuarioButton) {
		this.nuevoUsuarioButton = nuevoUsuarioButton;
	}

	public ComboBox<String> getSeleccionarUsuarioComboBox() {
		return seleccionarUsuarioComboBox;
	}

	public void setSeleccionarUsuarioComboBox(ComboBox<String> seleccionarUsuarioComboBox) {
		this.seleccionarUsuarioComboBox = seleccionarUsuarioComboBox;
	}

	public TextField getContraseñaUsuarioModificadaTF() {
		return contraseñaUsuarioModificadaTF;
	}

	public void setContraseñaUsuarioModificadaTF(TextField contraseñaUsuarioModificadaTF) {
		this.contraseñaUsuarioModificadaTF = contraseñaUsuarioModificadaTF;
	}

	public Button getCambiarContraseñaButton() {
		return cambiarContraseñaButton;
	}

	public void setCambiarContraseñaButton(Button cambiarContraseñaButton) {
		this.cambiarContraseñaButton = cambiarContraseñaButton;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}
}
