package projetjava;

import java.util.ArrayList;
import java.util.List;

public class Bibliothecaire extends Utilisateur 
{
    private int numero; 
    private String specialite;

    public Bibliothecaire (String nom, String prenom, String login, String mdp, int numero, String specialite){
        super (nom, prenom, login, mdp);
        this.numero=numero; 
        this.specialite=specialite;
    }
    
        public static List<Bibliothecaire> getListeBibliothecaires() 
    {
        return listeBibliothecaires;
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

    public void setSpecialite (String specialite) 
    {
        this.specialite = specialite;
    }
    
     private static List<Bibliothecaire> listeBibliothecaires = new ArrayList<>();
     
     static 
     {
        Bibliothecaire bibliothecaire1 = new Bibliothecaire("Partouche", "Terence", "t.partouche", "terence", 1, "romans");
        listeBibliothecaires.add(bibliothecaire1);
     }
}
