package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;

/**
 * A Designer generated component for the vista-filtrarpormarca template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-filtrarpormarca")
@JsModule("./src/vista-filtrarpormarca.js")
public class VistaFiltrarpormarca extends PolymerTemplate<VistaFiltrarpormarca.VistaFiltrarpormarcaModel> {

    @Id("checkBoxVerticalLayout")
	private Element checkBoxVerticalLayout;
	@Id("radioGroup")
	private RadioButtonGroup<String> radioGroup;
	/**
     * Creates a new VistaFiltrarpormarca.
     */
    public VistaFiltrarpormarca() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaFiltrarpormarca and vista-filtrarpormarca
     */
    public interface VistaFiltrarpormarcaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getCheckBoxVerticalLayout() {
		return checkBoxVerticalLayout;
	}

	public void setCheckBoxVerticalLayout(Element checkBoxVerticalLayout) {
		this.checkBoxVerticalLayout = checkBoxVerticalLayout;
	}

	public RadioButtonGroup<String> getRadioGroup() {
		return radioGroup;
	}

	public void setRadioGroup(RadioButtonGroup<String> radioGroup) {
		this.radioGroup = radioGroup;
	}

}
