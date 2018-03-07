package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import javafx.event.ActionEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.prefs.Preferences;


public class Controller {

    Preferences preferences;

    @FXML
    private Label lb;

    @FXML
    private TextField username  ;

    @FXML
    private TextField password;

    @FXML
    private RadioButton rememberMe;


    @FXML
    public void Login(ActionEvent event) throws Exception {
        if (username.getText().equals("peppe") && password.getText().equals("ruggio")) {

            lb.setText("Login success");
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("vivailruggio.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setTitle("Gestisci anagrafica");
            primaryStage.setScene(scene);
            primaryStage.show();

        } else {
            lb.setText("Login failed");
        }


    }


}