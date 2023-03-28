package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.formlayout.FormLayout.FormItem;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-login template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-login")
@JsModule("./src/vista-login.ts")
public class VistaLogin extends LitTemplate {

    @Id("vaadinFormLayout")
	private FormLayout vaadinFormLayout;
	@Id("vaadinFormItem")
	private FormItem vaadinFormItem;
	@Id("label")
	private Label label;
	@Id("vaadinTextField")
	private TextField vaadinTextField;
	@Id("vaadinFormItem1")
	private FormItem vaadinFormItem1;
	@Id("label1")
	private Label label1;
	@Id("vaadinTextField1")
	private TextField vaadinTextField1;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("vaadinButton1")
	private Button vaadinButton1;

	/**
     * Creates a new VistaLogin.
     */
    public VistaLogin() {
        // You can initialise any data required for the connected UI components here.
    }

	public FormLayout getVaadinFormLayout() {
		return vaadinFormLayout;
	}

	public void setVaadinFormLayout(FormLayout vaadinFormLayout) {
		this.vaadinFormLayout = vaadinFormLayout;
	}

	public FormItem getVaadinFormItem() {
		return vaadinFormItem;
	}

	public void setVaadinFormItem(FormItem vaadinFormItem) {
		this.vaadinFormItem = vaadinFormItem;
	}

	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}

	public TextField getVaadinTextField() {
		return vaadinTextField;
	}

	public void setVaadinTextField(TextField vaadinTextField) {
		this.vaadinTextField = vaadinTextField;
	}

	public FormItem getVaadinFormItem1() {
		return vaadinFormItem1;
	}

	public void setVaadinFormItem1(FormItem vaadinFormItem1) {
		this.vaadinFormItem1 = vaadinFormItem1;
	}

	public Label getLabel1() {
		return label1;
	}

	public void setLabel1(Label label1) {
		this.label1 = label1;
	}

	public TextField getVaadinTextField1() {
		return vaadinTextField1;
	}

	public void setVaadinTextField1(TextField vaadinTextField1) {
		this.vaadinTextField1 = vaadinTextField1;
	}

	public Button getVaadinButton() {
		return vaadinButton;
	}

	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}

	public Button getVaadinButton1() {
		return vaadinButton1;
	}

	public void setVaadinButton1(Button vaadinButton1) {
		this.vaadinButton1 = vaadinButton1;
	}

}
