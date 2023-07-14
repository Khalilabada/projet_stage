package sample.ares;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class Login {
    public Login(){

    }
    @FXML
    private Button button;
    @FXML
    private Label wrongLogin;
    @FXML
    private TextField user;
    @FXML
    private PasswordField password;
    @FXML
    private Hyperlink signup;
    public void userlogin(ActionEvent event) throws IOException{
        checklogin();
    }
    private void checklogin()throws IOException{
        HelloApplication m=new HelloApplication();
        if(user.getText().toString().equals("khalil") && password.getText().toString().equals("2002")){
            m.changescene("Home.fxml");
        }
        else if(user.getText().isEmpty() || password.getText().isEmpty()){
            wrongLogin.setText("please entrer your data");
        }
        else{
            wrongLogin.setText("! username ou password invalid");
        }
    }
    public void register(ActionEvent event)throws IOException{
        HelloApplication m=new HelloApplication();
        m.changescene("creerLogin.fxml");
    }
}
