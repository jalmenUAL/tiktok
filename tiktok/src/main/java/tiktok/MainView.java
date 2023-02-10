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
import com.vaadin.flow.server.StreamResource;

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
         
       /* StreamResource imageResource = new StreamResource("tiktok.png",
                () -> getClass().getResourceAsStream("/imagenes/tiktok.png"));
        
        nr.getImg().setSrc(imageResource);*/
    	
    	 VistaPublicacion vp = new VistaPublicacion();
    	 VistaPublicacion vp2 = new VistaPublicacion();
    	 VistaPublicacion vp3 = new VistaPublicacion();
    	
    	 
    	 Video video = new Video("videos/tiktok.mp4");
    	 Video video2 = new Video("videos/tiktok2.mp4");
    	 Video video3 = new Video("videos/tiktok3.mp4");
    	  
    	 vp.getDiv().add(video);
    	 vp2.getDiv().add(video2);
    	 vp3.getDiv().add(video3);
    	  
    	
         nr.getVaadinVerticalLayout3().as(VerticalLayout.class).add(vp);
         nr.getVaadinVerticalLayout3().as(VerticalLayout.class).add(vp2);
         nr.getVaadinVerticalLayout3().as(VerticalLayout.class).add(vp3);
         
    	 nr.getStyle().set("width","100%");
    	 nr.getStyle().set("height","100%");
    	 
    	 this.setSizeFull();  
    	 add(nr);	 
    }

}
