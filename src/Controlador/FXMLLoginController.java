/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author arqtoshi
 */
public class FXMLLoginController implements Initializable {

    @FXML
    private ImageView imglogo;

    @FXML
    private TextField txtusuario;

    @FXML
    private PasswordField txtcontraseña;

    @FXML
    private Button btningresar;

    @FXML
    void ingresar(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader (getClass().getResource("/Vista/FXMLheroes.fxml"));
            Parent root = loader.load();
            FXMLheroesController controlador = loader.getController();
            Scene scene = new Scene(root);
            
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
        } catch (IOException ex) {
            Logger.getLogger(FXMLheroesController.class.getName()).log(Level.ALL.SEVERE, null, ex);
        }

    }
 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    } 
   
}