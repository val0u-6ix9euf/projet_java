public class auteur extend personne{
    private int numero; 
    private String nationalite;

    public auteur (int numero, String nationalite){
    this.numero=numero; 
    this.nationalite=nationalite;
    }

     public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite (String nationalite) {
        this.nationalite = nationalite;
    }
}




    public class abonne extend utilisateur{
    private int numero; 
    private String adresse;
    private Date dateabonnement;
    private Date datesuspendu;
    
    public abonne (int numero, String adresse, Date dateabonnement, Date datesuspendu){
    this.numero=numero; 
    this.adresse=adresse;
    this.dateabonnement=dateabonnement;
    this.datesuspendu=datesuspendu;
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





public class bibliothecaire extend utilistaeur{
    private int numero; 
    private String specialite;

    public bibliothecaire (int numero, String specialite){
    this.numero=numero; 
    this.specialite=specialite;
    }

     public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite (String specialite) {
        this.specialite = specialite;
    }
}