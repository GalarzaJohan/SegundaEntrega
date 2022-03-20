/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author arqtoshi
 */
public class FXMLEditorController implements Initializable {

    @FXML
    private Label labE;

    @FXML
    private Label labN;

    @FXML
    private Button btnguardar;

    @FXML
    private Label labAlter;

    @FXML
    private Label labApa;

    @FXML
    private TextField txtAlter;

    @FXML
    private TextField txtApa;

    @FXML
    private ComboBox<?> comb;

    @FXML
    private TextField txtN;

    @FXML
    void Select(ActionEvent event) {
        String s =comb.getSelectionModel().getSelectedItem().toString();
        txtN.setText(s);

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList list = FXCollections.observableArrayList("BARRY ALLEN","Frank Castle","Richard Rider","Roberto \"Bobby\"","Billy Batson");
        comb.setItems(list);
    }    
    
}
