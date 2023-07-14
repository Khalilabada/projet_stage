package sample.ares;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;

import java.io.IOException;

public class register {
    @FXML
    private Hyperlink login1;
    public void logIn(ActionEvent event)throws IOException {
        HelloApplication m=new HelloApplication();
        m.changescene("hello-view.fxml");
    }
}
