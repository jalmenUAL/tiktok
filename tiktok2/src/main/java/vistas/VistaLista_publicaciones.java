package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-lista_publicaciones template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista_publicaciones")
@JsModule("./src/vista-lista_publicaciones.ts")
public class VistaLista_publicaciones extends LitTemplate {

    @Id("lista")
	private Element lista;

	/**
     * Creates a new VistaLista_publicaciones.
     */
    public VistaLista_publicaciones() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLista() {
		return lista;
	}

	public void setLista(Element lista) {
		this.lista = lista;
	}

}
