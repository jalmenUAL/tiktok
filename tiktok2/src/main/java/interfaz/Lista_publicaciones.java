package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaLista_publicaciones;

public class Lista_publicaciones extends VistaLista_publicaciones {
	
	public void anadir_publicacion(Lista_publicaciones_item i) {
		
		this.getLista().as(VerticalLayout.class).add(i);
		i.getBorrar().addClickListener(event->{ this.getLista().as(VerticalLayout.class).remove(i); });
		
	}

}
