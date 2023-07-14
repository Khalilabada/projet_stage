package sample.ares;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Home {
    @FXML
    private Button btnlogout;
    @FXML
    private Button btngestionL;
    public void userlogout(ActionEvent event)throws IOException{
        HelloApplication m=new HelloApplication();
        m.changescene("hello-view.fxml");
    }
    public void gestionL(ActionEvent event) throws IOException{
        HelloApplication m=new HelloApplication();
        m.changescene("gestionListe.fxml");
    }
}
