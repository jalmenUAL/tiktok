package interfaz;

import tiktok2.Video;
import vistas.VistaPublicacion;

public class Publicacion extends VistaPublicacion{

	Publicacion(String usuario, String hashtag, String foto, String video, String megusta,
			String comentarios, String compartido){
		
		this.getLabel().setText(compartido);
		this.getDiv().add(new Video(video));
		
	}
	
}
