package interfaz;

public class Publicacion_Ajena extends Publicacion {

	Publicacion_Ajena(String usuario, String hashtag, String foto, String video, String megusta, String comentarios,
			String compartido) {
		super(usuario, hashtag, foto, video, megusta, comentarios, compartido);
		// TODO Auto-generated constructor stub
		this.getBorrar().setVisible(false);
	}
	
	

}
