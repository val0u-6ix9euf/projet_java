package projetjava;

import java.util.Date;

public class abonne extends utilisateur {
    
    private int numero; 
    private String adresse;
    private Date dateabonnement;
    private Date datesuspendu;
    
    
    public abonne (String nom, String prenom, String login, String mdp, int numero, String adresse, Date dateabonnement, Date datesuspendu) { 
        super (login, mdp, nom, prenom); // il faut mettre ceux de personne aussi 
        this.numero = numero; 
        this.adresse = adresse;
        this.dateabonnement = dateabonnement;
        this.datesuspendu = datesuspendu;
    }
    
   
    

     public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse (String adresse) {
        this.adresse = adresse;
    }

       public Date getDateabonnement() {
        return dateabonnement;
    }

    public void setDateabonnement (Date dateabonnement) {
        this.dateabonnement = dateabonnement;
    }

           public Date getDatesuspendu() {
        return datesuspendu;
    }

    public void setDatesuspendu (Date datesuspendu) {
        this.datesuspendu = datesuspendu;
    }
}
    

