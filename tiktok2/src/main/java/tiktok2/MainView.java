package tiktok2;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.IFrame;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.server.StreamResource;

import basededatos.Usuario;
import interfaz.Lista_publicaciones;
import interfaz.Lista_publicaciones_item;
import interfaz.Pagina_login;
import interfaz.Usuario_no_registrado;
import interfaz.Usuario_registrado;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * A sample Vaadin view class.
 * <p>
 * To implement a Vaadin view just extend any Vaadin component and use @Route
 * annotation to announce it in a URL as a Spring managed bean. Use the @PWA
 * annotation make the application installable on phones, tablets and some
 * desktop browsers.
 * <p>
 * A new instance of this class is created for every new user and every browser
 * tab/window.
 */

@Route
@PWA(name = "Vaadin Application", shortName = "Vaadin App", description = "This is an example Vaadin application.", enableInstallPrompt = false)
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
public class MainView extends VerticalLayout {

	/**
	 * Construct a new Vaadin view.
	 * <p>
	 * Build the initial UI state for the user accessing the application.
	 *
	 * @param service The message service. Automatically injected Spring managed
	 *                bean.
	 */
	public MainView() {
		
		getStyle().set("width", "100%");
	    getStyle().set("height", "100%");
		
		Usuario_no_registrado nr = new Usuario_no_registrado();
		nr.getStyle().set("width", "100%");
		nr.getStyle().set("height", "100%");
		
		
		
		add(nr);
		
		Pagina_login pl = new Pagina_login();
		pl.getStyle().set("width", "100%");
		pl.getStyle().set("height", "100%");
		
		
		nr.getVaadinButton1().addClickListener(event->{remove(nr);add(pl);});
		
		
		pl.getVaadinButton().addClickListener(event->{
												basededatos.Usuario u = pl.login();
												Usuario_registrado r = new Usuario_registrado(u);
												r.getStyle().set("width", "100%");
												r.getStyle().set("height", "100%");
												remove(pl); 
												add(r); 
												});
		/*
		Lista_publicaciones_item pb = 
				new Lista_publicaciones_item("Jesus Almendros", "#mds", "tiktok.png", 
						"videos/tiktok.mp4", 0, 0, 0);
		
		Lista_publicaciones_item pb2 = 
				new Lista_publicaciones_item("Jesus Almendros", "#mds", "tiktok.png", 
						"videos/tiktok.mp4", 0, 0, 0);
		
		Lista_publicaciones l = new Lista_publicaciones();
		
		l.anadir_publicacion(pb);
		l.anadir_publicacion(pb2);
		nr.getVaadinVerticalLayout3().as(VerticalLayout.class).add(l);
		*/

		

	}

}
