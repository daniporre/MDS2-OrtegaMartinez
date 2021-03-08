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
 * A Designer generated component for the vista-usuarionoregistrado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-usuarionoregistrado")
@JsModule("./src/vista-usuarionoregistrado.js")
public class VistaUsuarionoregistrado extends PolymerTemplate<VistaUsuarionoregistrado.VistaUsuarionoregistradoModel> {

    @Id("inicioUNR")
	private Button inicioUNR;
	@Id("searchBarUNR")
	private TextField searchBarUNR;
	@Id("searchIconUNR")
	private Button searchIconUNR;
	@Id("carritoUNR")
	private Button carritoUNR;
	@Id("iniciarSesionUNR")
	private Button iniciarSesionUNR;
	@Id("adsUNR")
	private Element adsUNR;
	/**
     * Creates a new VistaUsuarionoregistrado.
     */
    public VistaUsuarionoregistrado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaUsuarionoregistrado and vista-usuarionoregistrado
     */
    public interface VistaUsuarionoregistradoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Button getInicioUNR() {
		return inicioUNR;
	}

	public void setInicioUNR(Button inicioUNR) {
		this.inicioUNR = inicioUNR;
	}

	public TextField getSearchBarUNR() {
		return searchBarUNR;
	}

	public void setSearchBarUNR(TextField searchBarUNR) {
		this.searchBarUNR = searchBarUNR;
	}

	public Button getSearchIconUNR() {
		return searchIconUNR;
	}

	public void setSearchIconUNR(Button searchIconUNR) {
		this.searchIconUNR = searchIconUNR;
	}

	public Button getCarritoUNR() {
		return carritoUNR;
	}

	public void setCarritoUNR(Button carritoUNR) {
		this.carritoUNR = carritoUNR;
	}

	public Button getIniciarSesionUNR() {
		return iniciarSesionUNR;
	}

	public void setIniciarSesionUNR(Button iniciarSesionUNR) {
		this.iniciarSesionUNR = iniciarSesionUNR;
	}

	public Element getAdsUNR() {
		return adsUNR;
	}

	public void setAdsUNR(Element adsUNR) {
		this.adsUNR = adsUNR;
	}
}
