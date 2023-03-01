package projetjava;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;


public class Abonne extends Utilisateur 
{
    
    private int numero; 
    private String adresse;
    private Date dateabonnement;
    private Date datesuspendu;
    
    public Abonne (String nom, String prenom, String login, String mdp, int numero, String adresse, Date dateabonnement, Date datesuspendu) 
    { 
        super (login, mdp, nom, prenom);  
        this.numero = numero; 
        this.adresse = adresse;
        this.dateabonnement = dateabonnement;
        this.datesuspendu = datesuspendu;
    }

     public int getNumero() 
     {
        return numero;
    }

    public void setNumero(int numero) 
    {
        this.numero = numero;
    }

    public String getAdresse() 
    {
        return adresse;
    }

    public void setAdresse (String adresse) 
    {
        this.adresse = adresse;
    }

       public Date getDateabonnement() 
    {
        return dateabonnement;
    }

    public void setDateabonnement (Date dateabonnement) 
    {
        this.dateabonnement = dateabonnement;
    }

    public Date getDatesuspendu() 
    {
    return datesuspendu;
    }

    public void setDatesuspendu (Date datesuspendu) 
    {
        this.datesuspendu = datesuspendu;
    }
    
    // liste et tableau des abonnés
     public static void main(String[] args) {
        // Création de la liste d'abonnés
        List<Abonne> listeAbonnes = new ArrayList<>();

        // Création des abonnés et ajout à la liste
        Abonne abonne1 = new Abonne("Tabet", "Marie", "m.tabet", "1234", 1, "3 rue des Lilas", new Date(), null);
        listeAbonnes.add(abonne1);

        Abonne abonne2 = new Abonne("Martin", "Valentine", "v.martin", "5678", 2, "5 avenue de la République", new Date(),null);
        listeAbonnes.add(abonne2);

        Abonne abonne3 = new Abonne("Perrin", "Thomas", "t.perrin", "abcd", 3, "12 rue des Cerisiers", new Date(), null);
        listeAbonnes.add(abonne3);

        // Affichage des informations sur tous les abonnés de la liste
        for (Abonne abonne : listeAbonnes) {
            System.out.println("Nom : " + abonne.getNom());
            System.out.println("Prénom : " + abonne.getPrenom());
            System.out.println("Login : " + abonne.getLogin());
            System.out.println("Mot de passe : " + abonne.getMdp());
            System.out.println("Numéro : " + abonne.getNumero());
            System.out.println("Adresse : " + abonne.getAdresse());
            System.out.println("Date d'abonnement : " + abonne.getDateabonnement());
            System.out.println("Date de suspension : " + abonne.getDatesuspendu());
        }
    }   
}
    

