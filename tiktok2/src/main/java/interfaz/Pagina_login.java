package interfaz;

import vistas.VistaLogin;
import basededatos.BD_principal;
import basededatos.Usuario;
import basededatos.iUsuarioNoRegistrado;

public class Pagina_login extends VistaLogin {
	
    iUsuarioNoRegistrado unr = new BD_principal();
	
	
	public Usuario login() {
	
		return unr.login(this.getVaadinTextField().getValue(),this.getVaadinTextField1().getValue());
		
	}

}
