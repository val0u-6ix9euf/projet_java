/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetjava;


public class utilisateur extends personne {
    
    private String login;
    private String mdp;
   
    
    public utilisateur (String nom, String prenom, String login, String mdp) {
        super(nom, prenom);
        this.login = login;
        this.mdp = mdp;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }
     public void setMdp(String mdp) {
        this.mdp = mdp;
    }
}
