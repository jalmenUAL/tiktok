package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Usuario_registrado extends Usuario {

	
	public Usuario_registrado(){
		this.getVaadinButton1().setVisible(false);
		nueva_publicacion np = new nueva_publicacion();
		this.getVaadinButton().addClickListener(event->{
			this.getVaadinVerticalLayout3().as(VerticalLayout.class).removeAll();
				this.getVaadinVerticalLayout3().as(VerticalLayout.class).add(np);
		});
	}
}
