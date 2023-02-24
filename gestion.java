package java
import java.util.Date;

public class gestion ()
public void menu ()
{  int i;
    String typedecompte="";
    System.out.println("Quel est votre role");
    System.out.println("1 Bibliothécaire");
    System.out.println("2 Abonné");
    System.out.println("3 Admin");
    i = Clavier.lireInt();
    switch (i)
    {case 1 : authentif();
    typedecompte="bibliothécaire";
    menu();
    break;
    
    case 2 : authentif();
    typedecompte="Abonné";
    menu();
    break;

    case 3 : authentif();
    typedecompte="Admin"
    menu()
    break;
    }
}

static public boolean authentif()
{
    String login;
    String mdp;
    System.out.println("entrer votre login");
    login = Clavier.lireString();
    System.out.println("entrer votre mot de passe");
    mdp = Clavier.lireString();
    if(testuser(login,mdp))
    {
        System.out.println ("Acces authorisé");
        return true;
    }
    else
    {
        System.out.println ("Acces refusé");
        return false;
    }
}


static public boolean testuser (String login, String mdp)  // static sert a ne pas créer d'objet, le login et le mdp seront dans la bdd et pas dans l'objet
{     
    boolean a, trouve = false;   
    int i = 0; 
    if (tabuser.lenght=!0)                              
    {                                                 // Tabuser --> nom du tableau qu'il faut créer dans la classe utilisateur + faire tableau a deux lignes : une ligne login et une ligne mdp
    while (i<=tabuser.lenght && !trouve)             // ca sert a parcourir le tableau avec deux conditions : la fin du tableau, et qu'on a trouver ce qu'on cherche
    {
        a = tabuser[i];
        if(tabuser[i][0].equalsIgnoreCase(login))     // vérifier que le login existe dans le tableau
        {
        trouve = true;
        }
        else 
        {
            System.out.println("login invalide");
            return false;
        }
        if (tabuser[i][1].equalsIgnoreCase(mdp))
        {
            return true;
        }
        else 
        {
            System.out.println(("mot de passe incorrect"));
            return false;
        }
    }
} //testuser()

menu pour savoir si bibliotécaire, abonné, admin
puis authentification avec recherche admin et mdp
si ca retourne nulle message d'erreur
puis afficher le menu qui correspond 

