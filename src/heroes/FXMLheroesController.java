/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package heroes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;   
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.SwipeEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;

/**
 *
 * @author arqtoshi
 */
public class FXMLheroesController implements Initializable {
    
    
 @FXML
    private ScrollPane ScrollPane1;

    @FXML
    private AnchorPane AnchorPane1;

    @FXML
    private Label Label1;

    @FXML
    private MenuButton FLASH;

    @FXML
    private MenuButton PUNISHER;

    @FXML
    private MenuButton NOVA;

    @FXML
    private MenuButton SONSPONT;

    @FXML
    private MenuButton SHAZAM;

    @FXML
    private MenuButton NIGHTCORE;

    @FXML
    private MenuButton MAGIK;

    @FXML
    private MenuButton DOMINO;

    @FXML
    private MenuButton WONDERWOMAN;

    @FXML
    private MenuButton AQUAMAN;

    @FXML
    private Label Label2;

    @FXML
    private Pane paneView;

    @FXML
    private TextField Txtbusqueda;

    @FXML
    private void displayImage(ActionEvent event) {
        paneView.getChildren().clear();
        String name=Txtbusqueda.getText();
        Image image=new Image("/imagenes/"+name+".jpg");
        javafx.scene.image.ImageView imageview=new javafx.scene.image.ImageView(image);
        imageview.setFitWidth(200);
        imageview.setFitHeight(300);
        paneView.getChildren().add(imageview);
    }
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
    
