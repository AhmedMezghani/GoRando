/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionUtilisateur.Login;

import GestionEquipement.AffichageEquipement.AfficherProduitsController;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class LoginController implements Initializable {

    private JFXTextField usernameText;
    private JFXTextField passwordText;
    @FXML
    private AnchorPane panePrincipal;
    @FXML
    private JFXTextField UserEntry;
    @FXML
    private JFXPasswordField PswEntry;
    @FXML
    private Line LineEye1;
    @FXML
    private JFXButton EyeButton1;
    @FXML
    private AnchorPane LoginPane;
    @FXML
    private AnchorPane MotDePasseOubliePane;
    @FXML
    private JFXTextField UserEntry1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void PasswordVisibility(ActionEvent event) {
    }

    private void LoginValidation(ActionEvent event) {
        String user = usernameText.getText();
        String pwd = passwordText.getText();
        Service.utilisateur S=new Service.utilisateur();
        if (S.VerifLogin(user, pwd)){
            try {
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            
            Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/GestionEquipement/CategoryEquipement/Categoryequipement.fxml")));
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(AfficherProduitsController.class.getName()).log(Level.SEVERE, null, ex);
    }
        }
    }


    @FXML
    private void IncriptionClick(ActionEvent event) {
    }

    @FXML
    private void ContinuerGoogle(ActionEvent event) {
    }

    @FXML
    private void ContinuerFacebook(ActionEvent event) {
    }

    @FXML
    private void GoToIdentifier(ActionEvent event) {
        try {
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            
            Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/GestionUtilisateur/Inscription/inscription.fxml")));
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(AfficherProduitsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
