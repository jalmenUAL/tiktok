package interfaz;

public class Lista_publicaciones_administrador_item extends Lista_publicaciones_item {

	Lista_publicaciones_administrador_item(String usuario, String hashtag, String foto, String video, Integer megusta,
			Integer comentarios, Integer compartido) {
		super(usuario, hashtag, foto, video, megusta, comentarios, compartido);
		// TODO Auto-generated constructor stub
		this.getMeGusta().setVisible(false);
	}

}
