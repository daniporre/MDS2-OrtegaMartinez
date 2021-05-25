package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.tabs.Tab;

/**
 * A Designer generated component for the vista-empresadetransportes template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-empresadetransportes")
@JsModule("./src/vista-empresadetransportes.js")
public class VistaEmpresadetransportes extends PolymerTemplate<VistaEmpresadetransportes.VistaEmpresadetransportesModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("header")
	private HorizontalLayout header;
	@Id("log-out-button")
	private Button logOutButton;
	@Id("vaadinTab")
	private Tab vaadinTab;
	@Id("inicio-button")
	private Button inicioButton;
	@Id("vaadinTab1")
	private Tab vaadinTab1;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("reload-button")
	private Button reloadButton;

	/**
     * Creates a new VistaEmpresadetransportes.
     */
    public VistaEmpresadetransportes() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEmpresadetransportes and vista-empresadetransportes
     */
    public interface VistaEmpresadetransportesModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public HorizontalLayout getHeader() {
		return header;
	}

	public void setHeader(HorizontalLayout header) {
		this.header = header;
	}

	public Button getLogOutButton() {
		return logOutButton;
	}

	public void setLogOutButton(Button logOutButton) {
		this.logOutButton = logOutButton;
	}

	public Tab getVaadinTab() {
		return vaadinTab;
	}

	public void setVaadinTab(Tab vaadinTab) {
		this.vaadinTab = vaadinTab;
	}

	public Button getInicioButton() {
		return inicioButton;
	}

	public void setInicioButton(Button inicioButton) {
		this.inicioButton = inicioButton;
	}

	public Tab getVaadinTab1() {
		return vaadinTab1;
	}

	public void setVaadinTab1(Tab vaadinTab1) {
		this.vaadinTab1 = vaadinTab1;
	}

	public Button getReloadButton() {
		return reloadButton;
	}

	public void setReloadButton(Button reloadButton) {
		this.reloadButton = reloadButton;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}
}
