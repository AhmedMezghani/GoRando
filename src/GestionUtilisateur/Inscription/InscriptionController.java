/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionUtilisateur.Inscription;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class InscriptionController implements Initializable {

    @FXML
    private AnchorPane panePrincipal;
    @FXML
    private JFXTextField PrenomEntry;
    @FXML
    private JFXTextField UserEntry;
    @FXML
    private JFXTextField NumeroEntry;
    @FXML
    private JFXTextField NomEntry;
    @FXML
    private JFXTextField GmailEntry;
    @FXML
    private JFXPasswordField PswEntry;
    @FXML
    private JFXPasswordField ConfirmEntry;
    @FXML
    private Line LineEye1;
    @FXML
    private JFXButton EyeButton1;
    @FXML
    private Line LineEye2;
    @FXML
    private JFXButton EyeButton2;
    @FXML
    private JFXTextField pswEntry2;
    @FXML
    private JFXTextField ConfirmEntry2;
    @FXML
    private JFXTextField CinEntry;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void IncriptionClick(ActionEvent event) {
        Service.UtilisateurService S=new Service.UtilisateurService();
        String nom=NomEntry.getText();
        String prenom=PrenomEntry.getText();
        String username=UserEntry.getText();
        String psw,confirmPsw;
        if (PswEntry.isVisible()){
            psw=PswEntry.getText();
        }
        else {
            psw=pswEntry2.getText();
        }
        if (ConfirmEntry.isVisible()){
            confirmPsw=ConfirmEntry.getText();
        }
        else {
            confirmPsw=ConfirmEntry2.getText();
        }
        String gmail=GmailEntry.getText();
        String numero=NumeroEntry.getText();
        String cin=CinEntry.getText();
        String resultat=S.VerifInscription(nom, prenom, username, psw, confirmPsw, gmail, numero, cin);
        System.out.println(resultat);
    }

    @FXML
    private void ContinuerGoogle(ActionEvent event) {
    }

    @FXML
    private void ContinuerFacebook(ActionEvent event) {
    }

    @FXML
    private void PasswordVisibility(ActionEvent event) {
      if (PswEntry.isVisible())
      {
          PswEntry.setVisible(false);
          pswEntry2.setVisible(true);
          pswEntry2.setText(PswEntry.getText());
      }
      else{
          PswEntry.setVisible(true);
          pswEntry2.setVisible(false);
          PswEntry.setText(pswEntry2.getText());
      }
    }

    @FXML
    private void GoToIdentifier(ActionEvent event) {
    }

    @FXML
    private void PasswordVisibility2(ActionEvent event) {
        if (ConfirmEntry.isVisible())
      {
          ConfirmEntry.setVisible(false);
          ConfirmEntry2.setVisible(true);
          ConfirmEntry2.setText(ConfirmEntry.getText());
      }
      else{
          ConfirmEntry.setVisible(true);
          ConfirmEntry2.setVisible(false);
          ConfirmEntry.setText(ConfirmEntry2.getText());
      }
    }
    
}
