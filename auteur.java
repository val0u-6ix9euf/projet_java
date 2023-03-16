package projetjava;
import java.util.ArrayList;
import java.util.List;

public class Auteur extends Personne 
{
    
    private int numero; 
    private String nationalite;

    public Auteur (String nom, String prenom, int numero, String nationalite) 
    {
        super(nom, prenom);
        this.numero = numero; 
        this.nationalite = nationalite;
    }
    
      public static List<Auteur> getListeAuteurs() 
    {
        return listeAuteurs;
    }

     public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) 
    {
        this.numero = numero;
    }

    public String getNationalite() 
    {
        return nationalite;
    }

    public void setNationalite (String nationalite) 
    {
        this.nationalite = nationalite;
    }
    
   private static List<Auteur> listeAuteurs = new ArrayList<>();

    
    static 
    {
        Auteur auteur1 = new Auteur("Doe", "John", 1, "Américain");
        Auteur auteur2 = new Auteur("Dupont", "Pierre", 2, "Français");
        Auteur auteur3 = new Auteur("Müller", "Hans", 3, "Allemand");

        listeAuteurs.add(auteur1);
        listeAuteurs.add(auteur2);
        listeAuteurs.add(auteur3);
    }
}
