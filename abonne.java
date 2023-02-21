public class abonne extends utilisateur {
    
    private int numero; 
    private String adresse;
    private Date dateabonnement;
    private Date datesuspendu;
    
    public abonne (int numero, String adresse, Date dateabonnement, Date datesuspendu) {
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

    public void setDateabonnement (String dateabonnement) {
        this.dateabonnement = dateabonnement;
    }

           public Date getDatesuspebndu() {
        return datesuspendu;
    }

    public void setDatesuspendu (String datesuspendu) {
        this.datesuspendu = datesuspendu;
    }
}
