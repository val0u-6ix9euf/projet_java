/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetjava;

import gestion.java.clavier;
import java.util.Date;

public class gestion 
{

          public static void main (String[]args)
    {
       utilisateur utilisateur = authentif ();
       
       if (utilisateur ! = null)
       {
        if(utilisateur instanceof abonne)
        {
            afficherMenuAbonne((Abonne)utilisateur);
        }
        else if (utilisateur instanceof bibliothecaire)
        {
            afficherMenuBibliothecaire ((bibliothecaire) utilisateur);
                    }
        else if (utilisateur instanceof admin)
        {
             afficherMenuAdmin ((admin) utilisateur);
        }
     }
    }
         // créer menu bibliothécaire, abonné, admin
      
          private static void authentif() {
        System.out.println("Veuillez vous connecter.");

        String login = clavier.lireString("Login : ");
        String mdp = clavier.lireString("Mot de passe : ");

              Object utilisateurConnecte = authentif(login, mdp);

        if (utilisateurConnecte == null) {
            System.out.println("Accès refusé. Veuillez vérifier vos identifiants.");
        } else {
            System.out.println("Accès autorisé.");
        }
    }

  // créer menus
    

public void creerAuteur() 
    {
        System.out.println("Création d'un nouvel auteur");
        System.out.println("Veuillez saisir les informations suivantes :");
        System.out.println("Nom :");
        String nom = clavier.lireString();
        System.out.println("Prénom :");
        String prenom = clavier.lireString();
        System.out.println("Numéro :");
        int numero = clavier.lireInt();
        System.out.println("Nationalité :");
        String nationalite = clavier.lireString();

        auteur auteur = new auteur(nom, prenom, numero, nationalite);
        // Enregistrement de l'auteur dans la base de données ou dans une liste d'auteurs
        System.out.println("Nouvel auteur créé : " + auteur);
    }


public void creerOuvrage()
{
      System.out.println("Création d'un nouvel ouvrage");
      System.out.println("Veuillez saisir les informations suivantes :");
      System.out.print("Numéro de l'ouvrage : ");
      int numouvrage = clavier.lireInt();
      System.out.print("Titre : ");
      String titre = clavier.lireString();
      System.out.print("Editeur : ");
      String editeur = clavier.lireString();
      System.out.print("Résumé : ");
      String resume = clavier.lireString();
      System.out.print("Disponibilité : ");
      String disponibilite = clavier.lireString();
      
      ouvrage ouvrage = new ouvrage(numouvrage, titre, editeur, resume, disponibilite);
      System.out.println("Ouvrage créé avec succès !");
    // Ajout de l'ouvrage à la liste des ouvrages
}
 
public static void creerAbonne() 
{
    System.out.println("Veuillez entrer le numéro de l'abonné :");
    int numero = clavier.lireInt();
    System.out.println("Veuillez entrer l'adresse de l'abonné :");
    String adresse = clavier.lireString();
    System.out.println("Veuillez entrer la date d'abonnement de l'abonné (format jj/mm/aaaa) :");
    Date dateAbonnement = clavier.lireDate(); // ????
    System.out.println("Veuillez entrer la date de suspension de l'abonné (format jj/mm/aaaa) :");
    Date dateSuspendu = clavier.lireDate();

    abonne abonne = new abonne(numero, adresse, dateAbonnement, dateSuspendu);
    abonne.ajouterabonne(abonne);
    // Ajouter l'abonné à une liste ou un tableau d'abonnés si nécessaire
    System.out.println("Abonné créé avec succès !");
}

public void creerPret() 
{
        System.out.println("Entrez le numéro de prêt :");
        int numpret = clavier.lireInt();
        System.out.println("Entrez la date d'emprunt (jj/mm/aaaa) :");
        Date dateemprunt = clavier.lireDate();
        System.out.println("Entrez la date de retour prévue (jj/mm/aaaa) :");
        Date dateretour = clavier.lireDate();
        pret pret = new pret(numpret, dateemprunt, dateretour);
        // Ajouter le prêt à une liste ou une base de données
 
}
}

    
