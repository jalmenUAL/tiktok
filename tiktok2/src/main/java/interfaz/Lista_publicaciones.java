package interfaz;

import java.util.Set;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Publicacion;
import vistas.VistaLista_publicaciones;

public class Lista_publicaciones extends VistaLista_publicaciones {
	
	
	
	public Lista_publicaciones(Set<Publicacion> p) {
		
	}
	
	
	
	public void anadir_publicacion(Lista_publicaciones_item i) {
		
		this.getLista().as(VerticalLayout.class).add(i);
		i.getBorrar().addClickListener(event->{ this.getLista().as(VerticalLayout.class).remove(i); });
		
	}

}
