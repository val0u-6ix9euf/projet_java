package projetjava;

public class Bibliothecaire extends Utilisateur {
    private int numero; 
    private String specialite;

    public Bibliothecaire (String nom, String prenom, String login, String mdp, int numero, String specialite){
        super (login, mdp, nom, prenom);
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
