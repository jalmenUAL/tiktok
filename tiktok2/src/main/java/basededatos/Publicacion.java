package basededatos;

import java.util.HashSet;
import java.util.Set;

public class Publicacion {

	
	String titulo;
	String video;
	Integer megusta;
	Integer comentario;
	Integer compartido;
	Usuario es_de;
	Set<Comentario> comentarios = new HashSet<Comentario>();
}
