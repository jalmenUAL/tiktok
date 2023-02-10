package tiktok;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.IFrame;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

import vistas.VistaNoregistrado;
import vistas.VistaPublicacion;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * A sample Vaadin view class.
 * <p>
 * To implement a Vaadin view just extend any Vaadin component and
 * use @Route annotation to announce it in a URL as a Spring managed
 * bean.
 * Use the @PWA annotation make the application installable on phones,
 * tablets and some desktop browsers.
 * <p>
 * A new instance of this class is created for every new user and every
 * browser tab/window.
 */
@Route
@PWA(name = "Vaadin Application",
        shortName = "Vaadin App",
        description = "This is an example Vaadin application.",
        enableInstallPrompt = false)
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
public class MainView extends VerticalLayout {

    /**
     * Construct a new Vaadin view.
     * <p>
     * Build the initial UI state for the user accessing the application.
     *
     * @param service The message service. Automatically injected Spring managed bean.
     */
    public MainView(@Autowired GreetService service) {
    	
    	
        VistaNoregistrado nr = new VistaNoregistrado();
        nr.getImg().getStyle().set("src", "resources/imagenes/tiktok.png");
    	
    	 VistaPublicacion vp = new VistaPublicacion();
    	 
    	
    	 Video video = new Video("videos/video_tiktok.mp4");
    	 video.setClassName("videoInsert"); 
    	 vp.getDiv().add(video);
    	 vp.getDiv().setClassName("wrapper");
    	 vp.setClassName("wrapper");
    	  
    	
         nr.getVaadinVerticalLayout3().as(VerticalLayout.class).add(vp); 	 	 
    	 nr.getStyle().set("width","100%");
    	 nr.getStyle().set("height","100%");
    	 
    	 this.setSizeFull();  
    	 add(nr);	 
    }

}
