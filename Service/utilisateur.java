/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class utilisateur {
    private String cin;
    private String user;
    private String nom;
    private String prenom;
    private String pwd;
    private Date dateInscription;
    public utilisateur() {
    }

    public utilisateur(String cin, String user, String nom, String prenom, String pwd, Date dateInscription) {
        this.cin = cin;
        this.user = user;
        this.nom = nom;
        this.prenom = prenom;
        this.pwd = pwd;
        this.dateInscription = dateInscription;
    }
    
    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Date getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }
    public boolean VerifLogin(String u,String p){
        Service.ProduitService S=new Service.ProduitService();
        Connection cnx=S.cnx;
        String sql="select Cin_Participant from participant where Username_Participant='"+u+"' and Password_Participant='"+p+"'";
        ResultSet rs;
        try {
            PreparedStatement ste=cnx.prepareStatement(sql);
            rs = ste.executeQuery();
            while (rs.next()){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(utilisateur.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
