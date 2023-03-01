/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetjava;

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
    
}
