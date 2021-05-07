package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-usuarioregistrado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-usuarioregistrado")
@JsModule("./src/vista-usuarioregistrado.js")
public class VistaUsuarioregistrado extends PolymerTemplate<VistaUsuarioregistrado.VistaUsuarioregistradoModel> {

    @Id("inicioURButton")
	private Button inicioURButton;
	@Id("searchBarUR")
	private TextField searchBarUR;
	@Id("buscarNRButton")
	private Button buscarNRButton;
	@Id("carritoURButton")
	private Button carritoURButton;
	@Id("miCuentaURButton")
	private Button miCuentaURButton;
	@Id("principalVLayout")
	private Element principalVLayout;
	@Id("adsVLayout")
	private Element adsVLayout;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;

	/**
     * Creates a new VistaUsuarioregistrado.
     */
    public VistaUsuarioregistrado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaUsuarioregistrado and vista-usuarioregistrado
     */
    public interface VistaUsuarioregistradoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Button getInicioURButton() {
		return inicioURButton;
	}

	public void setInicioURButton(Button inicioURButton) {
		this.inicioURButton = inicioURButton;
	}

	public TextField getSearchBarUR() {
		return searchBarUR;
	}

	public void setSearchBarUR(TextField searchBarUR) {
		this.searchBarUR = searchBarUR;
	}

	public Button getBuscarNRButton() {
		return buscarNRButton;
	}

	public void setBuscarNRButton(Button buscarNRButton) {
		this.buscarNRButton = buscarNRButton;
	}

	public Button getCarritoURButton() {
		return carritoURButton;
	}

	public void setCarritoURButton(Button carritoURButton) {
		this.carritoURButton = carritoURButton;
	}

	public Button getMiCuentaURButton() {
		return miCuentaURButton;
	}

	public void setMiCuentaURButton(Button miCuentaURButton) {
		this.miCuentaURButton = miCuentaURButton;
	}

	public Element getPrincipalVLayout() {
		return principalVLayout;
	}

	public void setPrincipalVLayout(Element principalVLayout) {
		this.principalVLayout = principalVLayout;
	}

	public Element getAdsVLayout() {
		return adsVLayout;
	}

	public void setAdsVLayout(Element adsVLayout) {
		this.adsVLayout = adsVLayout;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}
}
