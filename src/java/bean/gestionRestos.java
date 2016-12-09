/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import classe.Membre;
import classe.MembreUtil;
import classe.Restaurant;
import classe.Typecuisine;
import classe.Typemembre;
import classe.restaurantUtil;
import java.io.File;
import static java.util.Collections.list;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.IOException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.servlet.http.Part;



@ManagedBean
@RequestScoped
public class gestionRestos {

     private restaurantUtil restoUti;
     private Typecuisine typecuisine;
     private String nom;
     private String description;
     private String siteweb;
     private int idMembre;
     private long prixmoyen;
     private Part image;
     private String message;
     private String infoRestoRecherche;
    /**
     * Creates a new instance of ajouterClient
     */
    public gestionRestos() {
        restoUti = new restaurantUtil();
    }
    
    public void ajouterResto()
    {
       
        restoUti.ajouterResto(description, nom, siteweb, idMembre, image);
        message = "Le client a bien été ajouté!";
    }
    public Restaurant getResto(int id)
    {
       
       Restaurant unResto = restoUti.getRestoId(id);
        return unResto;
    }
    
    public List<Restaurant> AfficherRestosRecents(){
        List<Restaurant> lstResto;
        lstResto = restoUti.RestosRécents();
        return lstResto;
    }
    
    public List<Restaurant> ListResto(int id)
    {
         List<Restaurant> lstResto;
        lstResto =restoUti.listeRestaurant();
        return lstResto;
    }
    
    public void supprimerResto(int id)
    {
        message = restoUti.supResto(id);
    }
    
    public List<Restaurant> RechercherRestos(){
        List<Restaurant> lstResto;
        lstResto = restoUti.RechercherRestos(infoRestoRecherche);
        return lstResto;
    }
   
    public void setNom(String nom) {
        this.nom= nom;
    }
    public void setDescription(String Description) {
        this.description = Description;
    }
     public void setSiteWeb(String siteweb) {
        this.siteweb = siteweb;
    }
    public void setPrixMoyen(long prixmoyen) {
        this.prixmoyen = prixmoyen;
    }
     public void setImage(Part image) {
        this.image = image;
    }
      public String getNom() {
        return this.nom ;
    }
    public String getDescription() {
       return this.description;
    }
     public Part getImage() {
       return this.image;
    }
       public String getMessage() {
        return message;
    }
   
  
     public String  getSiteWeb() {
        return this.siteweb;
    }

    /**
     * @return the infoRestoRecherche
     */
    public String getInfoRestoRecherche() {
        return infoRestoRecherche;
    }

    /**
     * @param infoRestoRecherche the infoRestoRecherche to set
     */
    public void setInfoRestoRecherche(String infoRestoRecherche) {
        this.infoRestoRecherche = infoRestoRecherche;
    }

}
