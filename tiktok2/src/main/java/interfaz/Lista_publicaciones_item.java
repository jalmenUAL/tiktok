package interfaz;

import tiktok2.Video;
import vistas.VistaPublicacion;

public class Lista_publicaciones_item extends VistaPublicacion{

	public Lista_publicaciones_item(String usuario, String hashtag, String foto, String video, Integer megusta,
			Integer comentarios, Integer compartido){
		
		this.getLabel().setText(Integer.toString(compartido));
		this.getDiv().add(new Video(video));
		 
			
			
		 
	}
	
}
