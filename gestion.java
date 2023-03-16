package projetjava;
import java.util.Date;
import java.util.ArrayList;

/*  il reste a faire : 
abonné : toutes les méthodes
bibliothecaire : méthodes creerPret, retournerOuvrage, rechercherPretEnCours, rechercherPretparNumero, compterPret
admin : tout est ok
*/


public class Gestion {
    private static ArrayList<Abonne> listeAbonnes = new ArrayList<>();
    private static ArrayList<Bibliothecaire> listeBibliothecaires = new ArrayList<>();
    private static ArrayList<Admin> listeAdmins = new ArrayList<>();    
    private static ArrayList<Auteur> listeAuteurs = new ArrayList<>();
    private static ArrayList<Ouvrage> listeOuvrages = new ArrayList<>();
    private static ArrayList<Pret> listePrets = new ArrayList<>();

    
    public static void main(String[] args)
{
     Utilisateur utilisateur = authentif();
          if (utilisateur != null) {
            // afficher le menu correspondant au type d'utilisateur
            if (utilisateur instanceof Abonne) 
            {
                menuAbonne((Abonne) utilisateur);
            }
                else if (utilisateur instanceof Bibliothecaire) 
            {
               menuBibliothecaire((Bibliothecaire) utilisateur);
            }
                else if (utilisateur instanceof Admin) 
            {
                menuAdmin((Admin)utilisateur) ;
            }
        }
    }
    
private static Utilisateur authentif() {
    String login;
    String mdp;

    System.out.println("Veuillez vous connecter.");
    System.out.println("Entrez votre login : ");
    login = Clavier.lireString();
    System.out.println("Entrez votre mot de passe : ");
    mdp = Clavier.lireString();

    // Authentifier l'utilisateur
    Utilisateur u = null;
    for (Abonne abonne : Abonne.getListeAbonnes()) 
    {
        if (abonne.getLogin().equals(login) && abonne.getMdp().equals(mdp)) 
        {
            System.out.println("Authentification réussie ");
            u = abonne;
            break;
        }
    }
    if (u == null) 
    {
        for (Bibliothecaire bibliothecaire : Bibliothecaire.getListeBibliothecaires())
        {
            if (bibliothecaire.getLogin().equals(login) && bibliothecaire.getMdp().equals(mdp)) {
                System.out.println("Authentification réussie");
                u = bibliothecaire;
                break;
            }
        }
    }
    if (u == null) 
    {
        for (Admin admin : Admin.getListeAdmins())
        {
            if (admin.getLogin().equals(login) && admin.getMdp().equals(mdp)) 
            {
                System.out.println("Authentification réussie");
                u = admin;
                break;
            }
        }
    }
    if (u == null) 
    {
        System.out.println("Identifiants invalides.");
    }
    return u;
}    
       
    // menu abonné
    private static void menuAbonne(Abonne abonne) 
    {
        int i = -1;
    while (i != 0) 
    {
        System.out.println("Menu Abonné");
        System.out.println("1. Consulter les prêts en cours");
        System.out.println("2. Modifier le mot de passe");
        System.out.println("3. Rechercher un ouvrage par titre ou numéro de tome");
        System.out.println("4. Rechercher un ouvrage par auteur");
        System.out.println("0. Quitter");
        i = Clavier.lireInt();
        switch (i) 
        {
        case 1:
            consulterPret();
                break;
        case 2: 
            modifMdp();
            break;
        case 3:
            rechercheOuvrageNT();
            break;
        case 4:
            rechercheOuvrageA();
            break;
        case 0:
           return;  
        default:
            System.out.println("Choix invalide.");
            break;
    }
}
}
    
// menu bibliothecaire
 private static void menuBibliothecaire(Bibliothecaire bibliothecaire) {
     int i = -1 ;
    System.out.println("Menu Bibliothécaire");
    System.out.println("1. Créer un auteur");
    System.out.println("2. Créer un ouvrage");
    System.out.println("3. Créer un abonné");
    System.out.println("4. Créer un prêt");
    System.out.println("5. Retourner un ouvrage");
    System.out.println("6. Rechercher les prêts en cours");
    System.out.println("7. Rechercher un abonné par numéro");
    System.out.println("8. Rechercher un prêt par numéro");
    System.out.println("9. Compter les prêts");
    System.out.println("10. Quitter");
    while (i < 1 || i > 9) {
            i = Clavier.lireInt();
            switch (i) {
                case 1:
                    creerAuteur();
                    break;
                case 2:
                    creerOuvrage();
                    break;
                case 3:
                    creerAbonne();
                    break;
                case 4:
                    creerPret();
                    break;
                case 5:
                    retournerOuvrage();
                    break;
                case 6:
                    rechercherPretEnCours();
                    break;
                case 7:
                    rechercherAbonneParNumero();
                    break;
                case 8:
                    rechercherPretParNumero();
                    break;
                case 9:
                    compterPrets();
                    break;
                case 10 : 
                return;
        default:
            System.out.println("Choix invalide");
    }
}
 }
//menu admin 
   private static void menuAdmin(Admin admin) {   
    int i = -1;
    while (i < 1 || i > 10) {
        System.out.println("Menu Administrateur");
        System.out.println("1. Créer bibliothécaire");
        System.out.println("2. Quitter");
        i = Clavier.lireInt();
        switch (i) {
            case 1:
                creerBibliothecaire();
                break;
            case 2:
                return; // Sortir de la méthode afficherMenuAdmin
            default:
                System.out.println("Choix invalide");
        }
    }
}
public static void creerAuteur() 
    {
        System.out.println("Création d'un nouvel auteur");
        System.out.println("Veuillez saisir les informations suivantes :");
        System.out.println("Nom :");
        String nom = Clavier.lireString();
        System.out.println("Prénom :");
        String prenom = Clavier.lireString();
        System.out.println("Numéro :");
        int numero = Clavier.lireInt();
        System.out.println("Nationalité :");
        String nationalite = Clavier.lireString();
       listeAuteurs.add ( new Auteur(nom, prenom, numero, nationalite));
        // Enregistrement de l'auteur dans la base de données ou dans une liste d'auteurs
        System.out.println("Nouvel auteur créé avec succès !");
    }


public static void creerOuvrage()
{
      System.out.println("Création d'un nouvel ouvrage");
      System.out.println("Veuillez saisir les informations suivantes :");
      System.out.print("Numéro de l'ouvrage : ");
      int numouvrage = Clavier.lireInt();
      System.out.print("Titre : ");
      String titre = Clavier.lireString();
      System.out.print("Editeur : ");
      String editeur = Clavier.lireString();
      System.out.print("Résumé : ");
      String resume = Clavier.lireString();
      System.out.print("Disponibilité : ");
      String disponibilite = Clavier.lireString();
      
      listeOuvrages.add( new Ouvrage (numouvrage, titre, editeur, resume, disponibilite));
      System.out.println("Ouvrage créé avec succès !");
}
 
public static void creerAbonne() 
{
    System.out.println("Veuillez entrer le numéro de l'abonné :");
    int numero = Clavier.lireInt();
    System.out.println("Veuillez entrer l'adresse de l'abonné :");
    String adresse = Clavier.lireString();
    System.out.println("Veuillez entrer la date d'abonnement de l'abonné (format jj/mm/aaaa) :");
    Date dateAbonnement = Clavier.lireDate(); // ????
    System.out.println("Veuillez entrer la date de suspension de l'abonné (format jj/mm/aaaa) :");
    Date dateSuspendu = Clavier.lireDate();
    System.out.println("Veuillez entrer le nom de l'abonné :");
    String nom = Clavier.lireString();
    System.out.println("Veuillez entrer le prénom de l'abonné :");
    String prenom = Clavier.lireString();
    System.out.println("Veuillez entrer le login de l'abonné :");
    String login = Clavier.lireString();
    System.out.println("Veuillez entrer le mot de passe de l'abonné :");
    String mdp = Clavier.lireString();

   listeAbonnes.add(new Abonne(nom, prenom, login, mdp, numero, adresse, dateAbonnement, dateSuspendu));
       // Ajouter l'abonné à une liste ou un tableau d'abonnés si nécessaire
    System.out.println("Abonné créé avec succès !");
}

//revoir
public static void creerPret() 
{
        System.out.println("Entrez le numéro de prêt :");
        int numpret = Clavier.lireInt();
        System.out.println("Entrez la date d'emprunt (jj/mm/aaaa) :");
        Date dateemprunt = Clavier.lireDate();
        System.out.println("Entrez la date de retour prévue (jj/mm/aaaa) :");
        Date dateretour = Clavier.lireDate();
        listePrets.add (new Pret(numpret, dateemprunt, dateretour));
        System.out.println("Prêt créé avec succès !"); 
}

// méthodes à créer pour le menu bibliothécaire
public static void retournerOuvrage()
{}

public static void rechercherPretEnCours()
{}
public static void rechercherAbonneParNumero() 
{
    System.out.println("Entrez le numéro de l'abonné à rechercher : ");
    int numero = Clavier.lireInt();

    boolean abonneTrouve = false;
    
    for (Abonne abonne : Abonne.getListeAbonnes())
    {
        if (abonne.getNumero() == numero)
        {
            System.out.println("Abonné trouvé :");
            System.out.println("Nom : " + abonne.getNom());
            System.out.println("Prénom : " + abonne.getPrenom());
            System.out.println("Login : " + abonne.getLogin());
            System.out.println("Mot de passe : " + abonne.getMdp());
            System.out.println("Numéro : " + abonne.getNumero());
            System.out.println("Adresse : " + abonne.getAdresse());
            System.out.println("Date d'abonnement : " + abonne.getDateabonnement());
            System.out.println("Date de suspension : " + abonne.getDatesuspendu());

            abonneTrouve = true;
            break;
        }
    }

    if (!abonneTrouve) 
    {
        System.out.println("Aucun abonné trouvé avec ce numéro.");
    }
} 


public static void rechercherPretParNumero()
{}

public static void compterPrets()
{}

//méthode pour le menu admin
public static void creerBibliothecaire()
{
        System.out.println("Création d'un nouveau bibliothecaire");
        System.out.println("Veuillez saisir les informations suivantes :");
        System.out.println("login :");
        String login = Clavier.lireString();
        System.out.println("mdp :");
        String mdp = Clavier.lireString();
        System.out.println("Nom :");
        String nom = Clavier.lireString();
        System.out.println("Prenom :");
        String prenom = Clavier.lireString();
        System.out.println("Numéro :");
        int numero = Clavier.lireInt();
        System.out.println("Spécialité :");
        String specialite = Clavier.lireString();
        listeBibliothecaires.add(new Bibliothecaire(login, mdp, nom, prenom, numero, specialite));
        // Enregistrement de l'auteur dans la base de données ou dans une liste d'auteurs
        System.out.println("Nouveau bibliothécaire créer avec succès ! ");

}

//méthodes pour le menu abonné
public static void consulterPret()
{
}
public static void modifMdp()
{
    
}       
public static void rechercheOuvrageNT()
{}  
public static void rechercheOuvrageA()
{}

}


  
