public class utilisateur extends personne
    
    private String login;
    private String motpasse;
    
    public utilisateur (String nom, String prenom, String login, String motpasse) {
        this.login = login;
        this.nom = nom;
    }

    public String getlogin() {
        return login;
    }

    public void setlogin(String login) {
        this.login = login;
    }

    public String getlogin() {
        return motpasse;
    }

    public void setmotpasse(String motpasse) {
        this.motpasse = motpasse;
    }
 
}
