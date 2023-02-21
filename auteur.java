public class auteur extends personne {
    
    private int numero; 
    private String nationalite;

    public auteur (String nom, String prenom, int numero, String nationalite) {
    this.numero = numero; 
    this.nationalite = nationalite;
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
