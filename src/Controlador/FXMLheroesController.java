/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package Controlador;

import DAO.HeroesDaoIMPL;
import Modelo.Heroes;
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
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.SwipeEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;

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
    private TableView<Heroes> tlbHeroes;

    @FXML
    private TableColumn<Heroes, Integer> colCodigo;

         @FXML
    private Button btnconfi;

     @FXML
    void ingresar1(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader (getClass().getResource("/Vista/FXMLEditor.fxml"));
            Parent root = loader.load();
            FXMLEditorController controlador = loader.getController();
            Scene scene = new Scene(root);
            
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
        } catch (IOException ex) {
            Logger.getLogger(FXMLEditorController.class.getName()).log(Level.ALL.SEVERE, null, ex);
        }

    }
    @FXML
    private TableColumn<Heroes, String> colNombre;

    @FXML
    private TableColumn<Heroes, String> colDescripcion;
    
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
    
    

    public void consultar(){
        
        HeroesDaoIMPL heroesDao= new HeroesDaoIMPL();
        this.tlbHeroes.setItems(heroesDao.readAll());
        this.tlbHeroes.refresh();
 
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
         this.colCodigo.setCellValueFactory(new PropertyValueFactory<Heroes, Integer>("codigo"));
        this.colNombre.setCellValueFactory(new PropertyValueFactory<Heroes, String>("nombre"));
        this.colDescripcion.setCellValueFactory(new PropertyValueFactory<Heroes, String>("descripcion"));
    }
}
    
