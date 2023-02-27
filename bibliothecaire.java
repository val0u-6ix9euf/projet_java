/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetjava;

public class bibliothecaire extends utilisateur {
    private int numero; 
    private String specialite;

    public bibliothecaire (String nom, String prenom, String login, String mdp, int numero, String specialite){
        super (login, mdp, nom, prenom);
        this.numero=numero; 
        this.specialite=specialite;
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

    public void setSpecialite (String specialite) {
        this.specialite = specialite;
    }
}
