package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.H3;

/**
 * A Designer generated component for the vista-vercarrito template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-vercarrito")
@JsModule("./src/vista-vercarrito.js")
public class VistaVercarrito extends PolymerTemplate<VistaVercarrito.VistaVercarritoModel> {

    @Id("productosEnCarritoVLayout")
	private Element productosEnCarritoVLayout;
	@Id("inicioButton")
	private Button inicioButton;
	@Id("searchBar")
	private TextField searchBar;
	@Id("buscarButton")
	private Button buscarButton;
	@Id("carritoButton")
	private Button carritoButton;
	@Id("miCuentaButton")
	private Button miCuentaButton;
	@Id("iniciarSesionButton")
	private Button iniciarSesionButton;
	@Id("continuarComprandoButton")
	private Button continuarComprandoButton;
	@Id("metodoDePagoButton")
	private Label metodoDePagoButton;
	@Id("direccionUsuarioButton")
	private Label direccionUsuarioButton;
	@Id("editarPagoDireccionButton")
	private Button editarPagoDireccionButton;
	@Id("ofertaProductoLabel")
	private Label ofertaProductoLabel;
	@Id("gastosEnvioLabel")
	private Label gastosEnvioLabel;
	@Id("precioTotalLabel")
	private H3 precioTotalLabel;
	@Id("tramitarPedidoButton")
	private Button tramitarPedidoButton;
	@Id("primerVlayout")
	private Element primerVlayout;
	@Id("metodoYdireccionVLayout")
	private Element metodoYdireccionVLayout;

	/**
     * Creates a new VistaVercarrito.
     */
    public VistaVercarrito() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVercarrito and vista-vercarrito
     */
    public interface VistaVercarritoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getProductosEnCarritoVLayout() {
		return productosEnCarritoVLayout;
	}

	public void setProductosEnCarritoVLayout(Element productosEnCarritoVLayout) {
		this.productosEnCarritoVLayout = productosEnCarritoVLayout;
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

	public Button getContinuarComprandoButton() {
		return continuarComprandoButton;
	}

	public void setContinuarComprandoButton(Button continuarComprandoButton) {
		this.continuarComprandoButton = continuarComprandoButton;
	}

	public Label getMetodoDePagoButton() {
		return metodoDePagoButton;
	}

	public void setMetodoDePagoButton(Label metodoDePagoButton) {
		this.metodoDePagoButton = metodoDePagoButton;
	}

	public Label getDireccionUsuarioButton() {
		return direccionUsuarioButton;
	}

	public void setDireccionUsuarioButton(Label direccionUsuarioButton) {
		this.direccionUsuarioButton = direccionUsuarioButton;
	}

	public Button getEditarPagoDireccionButton() {
		return editarPagoDireccionButton;
	}

	public void setEditarPagoDireccionButton(Button editarPagoDireccionButton) {
		this.editarPagoDireccionButton = editarPagoDireccionButton;
	}

	public Label getOfertaProductoLabel() {
		return ofertaProductoLabel;
	}

	public void setOfertaProductoLabel(Label ofertaProductoLabel) {
		this.ofertaProductoLabel = ofertaProductoLabel;
	}

	public Label getGastosEnvioLabel() {
		return gastosEnvioLabel;
	}

	public void setGastosEnvioLabel(Label gastosEnvioLabel) {
		this.gastosEnvioLabel = gastosEnvioLabel;
	}

	public H3 getPrecioTotalLabel() {
		return precioTotalLabel;
	}

	public void setPrecioTotalLabel(H3 precioTotalLabel) {
		this.precioTotalLabel = precioTotalLabel;
	}

	public Button getTramitarPedidoButton() {
		return tramitarPedidoButton;
	}

	public void setTramitarPedidoButton(Button tramitarPedidoButton) {
		this.tramitarPedidoButton = tramitarPedidoButton;
	}

	public Element getPrimerVlayout() {
		return primerVlayout;
	}

	public void setPrimerVlayout(Element primerVlayout) {
		this.primerVlayout = primerVlayout;
	}

	public Element getMetodoYdireccionVLayout() {
		return metodoYdireccionVLayout;
	}

	public void setMetodoYdireccionVLayout(Element metodoYdireccionVLayout) {
		this.metodoYdireccionVLayout = metodoYdireccionVLayout;
	}
}
