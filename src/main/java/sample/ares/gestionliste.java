package sample.ares;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class gestionliste {
    @FXML
    private Button btnlogout;
    @FXML
    private Button btnhome;
    public void userlogout(ActionEvent event)throws IOException {
        HelloApplication m=new HelloApplication();
        m.changescene("hello-view.fxml");
    }
    public void userhome(ActionEvent event)throws IOException {
        HelloApplication m=new HelloApplication();
        m.changescene("Home.fxml");
    }
}
