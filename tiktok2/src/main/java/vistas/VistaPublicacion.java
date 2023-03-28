package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-publicacion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-publicacion")
@JsModule("./src/vista-publicacion.ts")
public class VistaPublicacion extends LitTemplate {

    @Id("vaadinVerticalLayoutM")
	private Element vaadinVerticalLayoutM;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinAvatar")
	private Avatar vaadinAvatar;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("label3")
	private Label label3;
	@Id("label4")
	private Label label4;
	@Id("div")
	private Div div;
	@Id("vaadinVerticalLayout4")
	private Element vaadinVerticalLayout4;
	@Id("vaadinVerticalLayout3")
	private Element vaadinVerticalLayout3;
	 
	@Id("label2")
	private Label label2;
	 
	@Id("ironIcon")
	private Element ironIcon;
	@Id("label")
	private Label label;
	 
	@Id("ironIcon1")
	private Element ironIcon1;
	@Id("label1")
	private Label label1;
	@Id("ironIcon2")
	private Element ironIcon2;
	@Id("meGusta")
	private Button meGusta;
	@Id("comentario")
	private Button comentario;
	@Id("compartir")
	private Button compartir;
	@Id("borrar")
	private Button borrar;
	@Id("denunciar")
	private Button denunciar;

	/**
     * Creates a new VistaPublicacion.
     */
    public VistaPublicacion() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVaadinVerticalLayoutM() {
		return vaadinVerticalLayoutM;
	}

	public void setVaadinVerticalLayoutM(Element vaadinVerticalLayoutM) {
		this.vaadinVerticalLayoutM = vaadinVerticalLayoutM;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}

	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public Avatar getVaadinAvatar() {
		return vaadinAvatar;
	}

	public void setVaadinAvatar(Avatar vaadinAvatar) {
		this.vaadinAvatar = vaadinAvatar;
	}

	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}

	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}

	public Label getLabel3() {
		return label3;
	}

	public void setLabel3(Label label3) {
		this.label3 = label3;
	}

	public Label getLabel4() {
		return label4;
	}

	public void setLabel4(Label label4) {
		this.label4 = label4;
	}

	public Div getDiv() {
		return div;
	}

	public void setDiv(Div div) {
		this.div = div;
	}

	public Element getVaadinVerticalLayout4() {
		return vaadinVerticalLayout4;
	}

	public void setVaadinVerticalLayout4(Element vaadinVerticalLayout4) {
		this.vaadinVerticalLayout4 = vaadinVerticalLayout4;
	}

	public Element getVaadinVerticalLayout3() {
		return vaadinVerticalLayout3;
	}

	public void setVaadinVerticalLayout3(Element vaadinVerticalLayout3) {
		this.vaadinVerticalLayout3 = vaadinVerticalLayout3;
	}

	 
	public Element getIronIcon2() {
		return ironIcon2;
	}

	public void setIronIcon2(Element ironIcon2) {
		this.ironIcon2 = ironIcon2;
	}

	public Label getLabel2() {
		return label2;
	}

	public void setLabel2(Label label2) {
		this.label2 = label2;
	}

	 

	public Element getIronIcon() {
		return ironIcon;
	}

	public void setIronIcon(Element ironIcon) {
		this.ironIcon = ironIcon;
	}

	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}

	 

	public Element getIronIcon1() {
		return ironIcon1;
	}

	public void setIronIcon1(Element ironIcon1) {
		this.ironIcon1 = ironIcon1;
	}

	public Label getLabel1() {
		return label1;
	}

	public void setLabel1(Label label1) {
		this.label1 = label1;
	}

	public Button getMeGusta() {
		return meGusta;
	}

	public void setMeGusta(Button meGusta) {
		this.meGusta = meGusta;
	}

	public Button getComentario() {
		return comentario;
	}

	public void setComentario(Button comentario) {
		this.comentario = comentario;
	}

	public Button getCompartir() {
		return compartir;
	}

	public void setCompartir(Button compartir) {
		this.compartir = compartir;
	}

	public Button getBorrar() {
		return borrar;
	}

	public void setBorrar(Button borrar) {
		this.borrar = borrar;
	}

	public Button getDenunciar() {
		return denunciar;
	}

	public void setDenunciar(Button denunciar) {
		this.denunciar = denunciar;
	}

	 

}
