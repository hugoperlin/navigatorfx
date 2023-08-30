package io.github.hugoperlin.navigatorfx;

import java.net.URL;

import javafx.scene.Parent;
import javafx.util.Callback;

public class ScreenRegistryFXML implements ScreenRegistry{
    
    private final Class classe;
    private final String fxml;
    private  Callback controler;
    
    public ScreenRegistryFXML(Class classe, String fxml, Callback controler) {
        this.classe = classe;
        this.fxml = fxml;
        this.controler = controler;
    }

    public void setControler(Callback controler){
        this.controler = controler;
    }

    public Parent getRoot(){
        return LoaderFXML.loadFxml(classe.getResource(fxml), controler);
    }
    
}
