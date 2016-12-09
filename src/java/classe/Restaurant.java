package classe;
// Generated 2016-12-05 17:18:41 by Hibernate Tools 4.3.1


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Restaurant generated by hbm2java
 */
public class Restaurant  implements java.io.Serializable {


     private Integer idresto;
     private Typecuisine typecuisine;
     private String nom;
     private String description;
     private String siteweb;
     private int idMembre;
     private long prixmoyen;
     private String image;
     private Set commentaires = new HashSet(0);
     private Set membres = new HashSet(0);

    public Restaurant() {
    }

	
    public Restaurant(Typecuisine typecuisine, String nom, String description, String siteweb, int idMembre, long prixmoyen, String image) {
        this.typecuisine = typecuisine;
        this.nom = nom;
        this.description = description;
        this.siteweb = siteweb;
        this.idMembre = idMembre;
        this.prixmoyen = prixmoyen;
        this.image = image;
    }
    public Restaurant(Typecuisine typecuisine, String nom, String description, String siteweb, int idMembre, long prixmoyen, String image, Set commentaires, Set membres) {
       this.typecuisine = typecuisine;
       this.nom = nom;
       this.description = description;
       this.siteweb = siteweb;
       this.idMembre = idMembre;
       this.prixmoyen = prixmoyen;
       this.image = image;
       this.commentaires = commentaires;
       this.membres = membres;
    }
   
    public Integer getIdresto() {
        return this.idresto;
    }
    
    public void setIdresto(Integer idresto) {
        this.idresto = idresto;
    }
       
    public void AjoutCommentaire(Commentaire com) {
        this.commentaires.add(com);
    }
    public Typecuisine getTypecuisine() {
        return this.typecuisine;
    }
    public void SupCommentaire(Commentaire com) {
       this.commentaires.remove(com);
    }
   public List<Commentaire> ListCommentaire(){
        
        Object[] arrayCommentaire =this.commentaires.toArray();
        List<Commentaire> lstCom = new ArrayList<Commentaire>();
         for (int i=0;i<this.commentaires.size()  ;i++)
        {
            Commentaire unCom = (Commentaire) arrayCommentaire[i];
             lstCom.add(unCom);
        }
         
        return lstCom;
    }
   public double MoyenneNote(){
        
        double total=0;
        List<Commentaire> lstCom = this.ListCommentaire();
         for (int i=0;i<lstCom.size()  ;i++)
        {
           total +=+lstCom.get(i).getNote();
        }
         
        return total/lstCom.size();
    }
     public Commentaire GetCommentaire(int index){
        
        Object[] arrayCommentaire =this.commentaires.toArray();
        Commentaire unCom = (Commentaire) arrayCommentaire[index];
         
        return unCom;
    }
    public void setTypecuisine(Typecuisine typecuisine) {
        this.typecuisine = typecuisine;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getSiteweb() {
        return this.siteweb;
    }
    
    public void setSiteweb(String siteweb) {
        this.siteweb = siteweb;
    }
    public int getIdMembre() {
        return this.idMembre;
    }
    
    public void setIdMembre(int idMembre) {
        this.idMembre = idMembre;
    }
    public long getPrixmoyen() {
        return this.prixmoyen;
    }
    
    public void setPrixmoyen(long prixmoyen) {
        this.prixmoyen = prixmoyen;
    }
    public String getImage() {
        return this.image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }
    public Set getCommentaires() {
        return this.commentaires;
    }
    
    public void setCommentaires(Set commentaires) {
        this.commentaires = commentaires;
    }
    public Set getMembres() {
        return this.membres;
    }
    
    public void setMembres(Set membres) {
        this.membres = membres;
    }




}


