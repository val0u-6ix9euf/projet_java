package projetjava;

import java.util.ArrayList;
import java.util.List;

public class Admin extends Utilisateur 
{
    
    private String idAdmin;
    private String nomAdmin;
    
    public Admin (String nom, String prenom, String login, String mdp, String idAdmin, String nomAdmin)
    {
    super (nom, prenom, login, mdp);
    this.idAdmin = idAdmin;
    this.nomAdmin = nomAdmin;
    }
     public static List<Admin> getListeAdmins() 
    {
        return listeAdmins;
    }
    
    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getNomAdmin() {
        return nomAdmin;
    }

    public void setNomAdmin(String nomAdmin) {
        this.nomAdmin = nomAdmin;
    }
    
    
  private static List<Admin> listeAdmins = new ArrayList<>();

    static 
    {
        Admin admin1 = new Admin("Dupont", "Jean", "j.dupont", "azerty", "ADM001", "Jean Dupont");
        listeAdmins.add(admin1);

        // Affichage des informations sur tous les administrateurs de la liste
        for (Admin admin : listeAdmins) 
        {
            System.out.println("Nom : " + admin.getNom());
            System.out.println("Prénom : " + admin.getPrenom());
            System.out.println("Login : " + admin.getLogin());
            System.out.println("Mot de passe : " + admin.getMdp());
            System.out.println("ID : " + admin.getIdAdmin());
            System.out.println("Nom d'administrateur : " + admin.getNomAdmin());
        }
    }
}

