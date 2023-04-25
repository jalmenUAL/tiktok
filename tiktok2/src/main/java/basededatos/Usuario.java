package basededatos;

import java.util.HashSet;
import java.util.Set;

public class Usuario {
	
	public String nick;
	public String login;
	public String password;
	public String foto;
	
    public	Set<Publicacion> publicaciones = new HashSet<Publicacion>();
	

}
