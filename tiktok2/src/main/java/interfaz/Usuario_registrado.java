package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Usuario_registrado extends Usuario {

	
	
	public Usuario_registrado(basededatos.Usuario u){
		this.getVaadinButton1().setVisible(false);		
		
		Lista_publicaciones lp = new Lista_publicaciones(u.publicaciones);
		
		
		
	}
}
