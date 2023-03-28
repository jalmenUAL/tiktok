package interfaz;

import tiktok2.Video;
import vistas.VistaPublicacion;

public class Lista_publicaciones_item extends VistaPublicacion{

	public Lista_publicaciones_item(String usuario, String hashtag, String foto, String video, String megusta,
			String comentarios, String compartido){
		
		this.getLabel().setText(compartido);
		this.getDiv().add(new Video(video));
		this.getMeGusta().addClickListener(event->{
			this.getLabel2().setText("346");
			
			
		});
	}
	
}
