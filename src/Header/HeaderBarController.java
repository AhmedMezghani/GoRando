/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Header;

import GestionEquipement.CategoryEquipement.CategoryequipementController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Circle;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class HeaderBarController implements Initializable {

    @FXML
    private TextArea searchInput;
    @FXML
    private ComboBox<?> searchCombo;
    @FXML
    private Circle messageNonlu;
    @FXML
    private BorderPane mainPane;
    @FXML
    private AnchorPane PanePrincipale;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        AnchorPane pane=getBody("/GestionEquipement/CategoryEquipement/Categoryequipement.fxml");
        mainPane.setCenter(pane);
    
    
    }    
    public AnchorPane getBody(String path){
        try{
            URL fileUrl=CategoryequipementController.class.getResource(path);
            PanePrincipale = new FXMLLoader().load(fileUrl);
        }
        catch (Exception e){
            System.err.println("no page");
        }
        return PanePrincipale;
    }

    @FXML
    private void GoRandoClick(ActionEvent event) {
    }

    @FXML
    private void ParametreClick(ActionEvent event) {
    }

    @FXML
    private void SearchClick(ActionEvent event) {
    }

    @FXML
    private void EntryKeyPressed(KeyEvent event) {
    }

    @FXML
    private void ProfilProduit(ActionEvent event) {
    }

    @FXML
    private void Message(ActionEvent event) {
    }
    
}
