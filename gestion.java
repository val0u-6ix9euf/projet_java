package java
import java.util.Date;

public class gestion ()
public void menu ()
{  int i;
    System.out.println("Quel est votre role");
    System.out.println("1 Bibliothécaire");
    System.out.println("2 Abonné");
    System.out.println("3 Admin");
    i = Clavier.lireInt();
    switch (i)
    {case 1 : authentifbibli();
    menu();
    break;
    
    case 2 : authentifabonne();
    menu();
    break;

    case 3 : authentifadmin();
    menu()
    break;
    }
}

authentifbibli()
{
    authentif a;
    String login;
    String mdp;
    System.out.println("entrer votre login")
    login = Clavier.lireString();
    a = rechercheAdmin(login);
    if(a!=nulle)
        {System.out.println("entrer votre mot de passe")
        mdp = Clavier.lireString();
        a = rechercheAdmin(mdp);
        if (a!= nulle)
             { // acces authorisé 
            else System.out.println ("mot de passe incorrect");}
        else System.out.println ("login incorrect")

    }
}


menu pour savoir si bibliotécaire, abonné, admin
puis authentification avec recherche admin et mdp
si ca retourne nulle message d'erreur
puis afficher le menu qui correspond 

