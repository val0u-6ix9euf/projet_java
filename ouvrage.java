package projetjava;
import java.util.ArrayList;
import java.util.List;

public class Ouvrage {

private int numouvrage;
private String titre;
private String editeur;
private String resume;
private String disponibilite;


public Ouvrage (int numouvrage, String titre, String editeur, String resume, String disponibilite)
{  this.numouvrage=numouvrage;
    this.titre = titre;
    this.editeur = editeur;
    this.resume = resume;
    this.disponibilite = disponibilite; 
}

    public static List<Ouvrage> getListeOuvrage() 
    {
        return listeOuvrages;
    }

public int getNumouvrage(){
return numouvrage;}

public void setNom (int numouvrage){
this.numouvrage = numouvrage ;}

public String getTitre(){
return titre;}

public void setTitre (String titre){
    this.titre = titre ;}

public String getEditeur(){
return editeur;}

public void setEditeur (String Editeur){
    this.editeur = editeur ;}

public String getResume(){
return resume;}

public void setResume (String Resume){
    this.resume = resume ;}

public String getDisponibilite(){
return disponibilite;}

public void setDisponibilite (String disponibilite)
{
    this.disponibilite = disponibilite ;
}

 private static List<Ouvrage> listeOuvrages = new ArrayList<>();

    
    static {
       Ouvrage ouvrage1 = new Ouvrage(314, "l'odysée", "Hachette","blablablabla", "dispo");
        listeOuvrages.add(ouvrage1);
    }
}
