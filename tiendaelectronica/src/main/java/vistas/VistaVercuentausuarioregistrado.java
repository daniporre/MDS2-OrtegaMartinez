package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-vercuentausuarioregistrado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-vercuentausuarioregistrado")
@JsModule("./src/vista-vercuentausuarioregistrado.js")
public class VistaVercuentausuarioregistrado extends PolymerTemplate<VistaVercuentausuarioregistrado.VistaVercuentausuarioregistradoModel> {

   

	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("inicio-button")
	private Button inicioButton;
	@Id("carrito-button")
	private Button carritoButton;
	@Id("logout-button")
	private Button logoutButton;
	@Id("codigoPostalTF")
	private TextField codigoPostalTF;
	@Id("ciudadTF")
	private TextField ciudadTF;
	@Id("provinciaTF")
	private TextField provinciaTF;
	@Id("calleTF")
	private TextField calleTF;
	

	@Id("editarDireccionButton")
	private Button editarDireccionButton;
	@Id("guardarDireccionButton")
	private Button guardarDireccionButton;
	@Id("fechaVencimientoTTF")
	private TextField fechaVencimientoTTF;
	@Id("cvsTF")
	private TextField cvsTF;
	@Id("editarTarjetaButton")
	private Button editarTarjetaButton;
	@Id("guardarNuevaTarjetaButton")
	private Button guardarNuevaTarjetaButton;
	@Id("nombreTF")
	private TextField nombreTF;
	@Id("emailTF")
	private TextField emailTF;
	@Id("editarDatosPersonalesButton")
	private Button editarDatosPersonalesButton;
	@Id("guardarDatosPersonalesButton")
	private Button guardarDatosPersonalesButton;
	@Id("numeroTarjetaTF")
	private TextField numeroTarjetaTF;
	@Id("titularTarjeta")
	private TextField titularTarjeta;
	@Id("apellidosTF")
	private TextField apellidosTF;
	@Id("nombreDeUsuario")
	private TextField nombreDeUsuario;
	@Id("darmeDeBajaButton")
	private Button darmeDeBajaButton;
	@Id("cambiarContraseñaButton")
	private Button cambiarContraseñaButton;
	@Id("nuevaContraseñaTF")
	private TextField nuevaContraseñaTF;
	@Id("correoButton")
	private Button correoButton;
	@Id("listaPedidosLayout")
	private Element listaPedidosLayout;
	/**
     * Creates a new VistaVercuentausuarioregistrado.
     */
    public VistaVercuentausuarioregistrado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVercuentausuarioregistrado and vista-vercuentausuarioregistrado
     */
    public interface VistaVercuentausuarioregistradoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public Button getInicioButton() {
		return inicioButton;
	}

	public void setInicioButton(Button inicioButton) {
		this.inicioButton = inicioButton;
	}

	public Button getCarritoButton() {
		return carritoButton;
	}

	public void setCarritoButton(Button carritoButton) {
		this.carritoButton = carritoButton;
	}

	public Button getLogoutButton() {
		return logoutButton;
	}

	public void setLogoutButton(Button logoutButton) {
		this.logoutButton = logoutButton;
	}

	public TextField getCodigoPostalTF() {
		return codigoPostalTF;
	}

	public void setCodigoPostalTF(TextField codigoPostalTF) {
		this.codigoPostalTF = codigoPostalTF;
	}

	public TextField getCiudadTF() {
		return ciudadTF;
	}

	public void setCiudadTF(TextField ciudadTF) {
		this.ciudadTF = ciudadTF;
	}

	public TextField getProvinciaTF() {
		return provinciaTF;
	}

	public void setProvinciaTF(TextField provinciaTF) {
		this.provinciaTF = provinciaTF;
	}

	public TextField getCalleTF() {
		return calleTF;
	}

	public void setCalleTF(TextField calleTF) {
		this.calleTF = calleTF;
	}

	public Button getEditarDireccionButton() {
		return editarDireccionButton;
	}

	public void setEditarDireccionButton(Button editarDireccionButton) {
		this.editarDireccionButton = editarDireccionButton;
	}

	public Button getGuardarDireccionButton() {
		return guardarDireccionButton;
	}

	public void setGuardarDireccionButton(Button guardarDireccionButton) {
		this.guardarDireccionButton = guardarDireccionButton;
	}

	public TextField getFechaVencimientoTTF() {
		return fechaVencimientoTTF;
	}

	public void setFechaVencimientoTTF(TextField fechaVencimientoTTF) {
		this.fechaVencimientoTTF = fechaVencimientoTTF;
	}

	public TextField getCvsTF() {
		return cvsTF;
	}

	public void setCvsTF(TextField cvsTF) {
		this.cvsTF = cvsTF;
	}

	public Button getEditarTarjetaButton() {
		return editarTarjetaButton;
	}

	public void setEditarTarjetaButton(Button editarTarjetaButton) {
		this.editarTarjetaButton = editarTarjetaButton;
	}

	public Button getGuardarNuevaTarjetaButton() {
		return guardarNuevaTarjetaButton;
	}

	public void setGuardarNuevaTarjetaButton(Button guardarNuevaTarjetaButton) {
		this.guardarNuevaTarjetaButton = guardarNuevaTarjetaButton;
	}

	public TextField getNombreTF() {
		return nombreTF;
	}

	public void setNombreTF(TextField nombreTF) {
		this.nombreTF = nombreTF;
	}

	public TextField getEmailTF() {
		return emailTF;
	}

	public void setEmailTF(TextField emailTF) {
		this.emailTF = emailTF;
	}

	public Button getEditarDatosPersonalesButton() {
		return editarDatosPersonalesButton;
	}

	public void setEditarDatosPersonalesButton(Button editarDatosPersonalesButton) {
		this.editarDatosPersonalesButton = editarDatosPersonalesButton;
	}

	public Button getGuardarDatosPersonalesButton() {
		return guardarDatosPersonalesButton;
	}

	public void setGuardarDatosPersonalesButton(Button guardarDatosPersonalesButton) {
		this.guardarDatosPersonalesButton = guardarDatosPersonalesButton;
	}

	public TextField getNumeroTarjetaTF() {
		return numeroTarjetaTF;
	}

	public void setNumeroTarjetaTF(TextField numeroTarjetaTF) {
		this.numeroTarjetaTF = numeroTarjetaTF;
	}
	public TextField getTitularTarjeta() {
		return titularTarjeta;
	}

	public void setTitularTarjeta(TextField titularTarjeta) {
		this.titularTarjeta = titularTarjeta;
	}

	public TextField getApellidosTF() {
		return apellidosTF;
	}

	public void setApellidosTF(TextField apellidosTF) {
		this.apellidosTF = apellidosTF;
	}

	public TextField getNombreDeUsuario() {
		return nombreDeUsuario;
	}

	public void setNombreDeUsuario(TextField nombreDeUsuario) {
		this.nombreDeUsuario = nombreDeUsuario;
	}

	public Button getDarmeDeBajaButton() {
		return darmeDeBajaButton;
	}

	public void setDarmeDeBajaButton(Button darmeDeBajaButton) {
		this.darmeDeBajaButton = darmeDeBajaButton;
	}

	public Button getCambiarContraseñaButton() {
		return cambiarContraseñaButton;
	}

	public void setCambiarContraseñaButton(Button cambiarContraseñaButton) {
		this.cambiarContraseñaButton = cambiarContraseñaButton;
	}

	public TextField getNuevaContraseñaTF() {
		return nuevaContraseñaTF;
	}

	public void setNuevaContraseñaTF(TextField nuevaContraseñaTF) {
		this.nuevaContraseñaTF = nuevaContraseñaTF;
	}

	public Button getCorreoButton() {
		return correoButton;
	}

	public void setCorreoButton(Button correoButton) {
		this.correoButton = correoButton;
	}

	public Element getListaPedidosLayout() {
		return listaPedidosLayout;
	}

	public void setListaPedidosLayout(Element listaPedidosLayout) {
		this.listaPedidosLayout = listaPedidosLayout;
	}

}
