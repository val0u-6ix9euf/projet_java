package projetjava;
import java.util.Date;
import java.util.ArrayList;

public class Gestion {
    private static ArrayList<Abonne> listeAbonnes = new ArrayList<>();
    private static ArrayList<Bibliothecaire> listeBibliothecaires = new ArrayList<>();
    private static ArrayList<Admin> listeAdmins = new ArrayList<>();    
    private static ArrayList<Auteur> listeAuteurs = new ArrayList<>();
    private static ArrayList<Ouvrage> listeOuvrages = new ArrayList<>();
    private static ArrayList<Pret> listePrets = new ArrayList<>();
    private static ArrayList<Utilisateur> listeUtilisateurs = new ArrayList<>();

    
    
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
public static void retournerOuvrage() {    
    Ouvrage o, trouve = null; 
    int numouvrage, i=0; 

    System.out.println("Numero de l'ouvrage à retourner : ");
            numouvrage=Clavier.lireInt();
            if (!listeOuvrages.isEmpty()) { 
                while ((i<listeOuvrages.size()) && (trouve==null)){
                    o = listeOuvrages.get(i);
                    if ((o.getNumouvrage()==numouvrage)){
                          trouve = o;
                    }
                    i++;
                 }
           }
}

public static Pret rechercherPretEnCours()
{
    System.out.println("Entrez le numéro du prêt à rechercher : ");
    int numero = Clavier.lireInt();

    boolean pretTrouve = false;
    
    for (Pret pret : Pret.getListePrets())
    {
        if (pret.getNumpret() == numero && pret.getDateretour() == null)
        {
            System.out.println("Prêt en cours trouvé :");
            System.out.println("Numpret : " + pret.getNumpret());
            System.out.println("Date emprunt : " + pret.getDateemprunt());
            System.out.println("Date retour : " + pret.getDateretour());
   
            return pret;
        }
    }
    
    System.out.println("Aucun prêt en cours trouvé avec ce numéro.");
    return null; 
}

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

public static Pret rechercherPretParNumero()
{
    System.out.println("Entrez le numéro du prêt à rechercher : ");
    int numero = Clavier.lireInt();

    boolean pretTrouve = false;
    
    for (Pret pret : Pret.getListePrets())
    {
        if (pret.getNumpret() == numero)
        {
            System.out.println("Prêt trouvé :");
            System.out.println("Numpret : " + pret.getNumpret());
            System.out.println("Date emprunt : " + pret.getDateemprunt());
            System.out.println("Date retour : " + pret.getDateretour());
   
         return pret;
        }
    }
            System.out.println("Aucun prêt trouvé avec ce numéro.");
        return null; 
}
    
public static void compterPrets() {
   int count = 0;
   for (Pret pret : listePrets) {
        count++;
    }
    if (count == 0) {
        System.out.println("Aucun prêt.");
    } else {
        System.out.println("Nombre de prêts : " + count);
    }
}   

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
public static void consulterPret() {
    Pret p = null, trouve = null;
    int numpret = 0;
    
    for (Pret pret : listePrets) {
        if (pret.equals(p.getNumpret())) { 
            numpret++;
            System.out.println("Numéro du prêt : " + p.getNumpret());
            System.out.println("Date d'emprunt : " + p.getDateemprunt());
            System.out.println("Date limite de retour : " + p.getDateretour());
        } else { 
        }
    }
    
    if (numpret == 0) {
        System.out.println("Vous n'avez aucun prêt en cours.");
    }
}

public static void modifMdp() {   
    Utilisateur u, trouve = null; 
    String ancienMdp, nouveauMdp, confirmMdp; 
   
    System.out.print("Entrez votre ancien mot de passe : ");
    ancienMdp = Clavier.lireString();
    
    if (!listeUtilisateurs.isEmpty()) { 
    int i = 0;
    while ((i < listeUtilisateurs.size()) && (trouve == null)) {
        u = listeUtilisateurs.get(i);
        if (u.getMdp().equals(ancienMdp)) {
            trouve = u;
        }
        i++;
    }            
    if (trouve != null) {
            System.out.print("Entrez votre nouveau mot de passe : ");
            nouveauMdp = Clavier.lireString();
            
            System.out.print("Confirmez votre nouveau mot de passe : ");
            confirmMdp = Clavier.lireString();
            
            if (nouveauMdp.equals(confirmMdp)) {
                trouve.setMdp(nouveauMdp);
                System.out.println("Le mot de passe a été modifié avec succès.");
            } else {
                System.out.println("Erreur : les mots de passe ne correspondent pas.");
            }
        } else {
            System.out.println("Erreur : ancien mot de passe incorrect.");
        }
    } else {
    System.out.println("Erreur : aucun utilisateur enregistré.");
    }
}

public static Ouvrage rechercheOuvrageNT()
{
    System.out.println("Entrez le numéro de l'ouvrage : ");
    int numouvrage = Clavier.lireInt();

    boolean ouvrageTrouve = false;
    
    for (Ouvrage ouvrage : Ouvrage.getListeOuvrage())
    {
        if (ouvrage.getNumouvrage() == numouvrage)
        {
            System.out.println("Auteur trouvé :");
            System.out.println("Numero : " + ouvrage.getNumouvrage());
            System.out.println("Titre : " + ouvrage.getTitre());
            System.out.println("Editeur : " + ouvrage.getEditeur());
            System.out.println("Résumé : " + ouvrage.getResume());
            System.out.println("Disponibilité : " + ouvrage.getDisponibilite());
             
         return ouvrage;
        }
    }
            System.out.println("Aucun ouvrage trouvé avec ce numéro.");
        return null; 
}

public static Auteur rechercheOuvrageA()
{
    System.out.println("Entrez le numéro de l'auteur : ");
    int numero = Clavier.lireInt();

    boolean auteurTrouve = false;
    
    for (Auteur auteur : Auteur.getListeAuteurs())
    {
        if (auteur.getNumero() == numero)
        {
            System.out.println("Auteur trouvé :");
            System.out.println("Numero : " + auteur.getNumero());
            System.out.println("Nationalité : " + auteur.getNationalite());
             
         return auteur;
        }
    }
            System.out.println("Aucun auteur trouvé avec ce numéro.");
        return null; 
}
}


  
