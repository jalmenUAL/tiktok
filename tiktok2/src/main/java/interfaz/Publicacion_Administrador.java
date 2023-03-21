package interfaz;

public class Publicacion_Administrador extends Publicacion {

	Publicacion_Administrador(String usuario, String hashtag, String foto, String video, String megusta,
			String comentarios, String compartido) {
		super(usuario, hashtag, foto, video, megusta, comentarios, compartido);
		// TODO Auto-generated constructor stub
		this.getMeGusta().setVisible(false);
	}

}
