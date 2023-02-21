public class utilisateur extends personne
    
    private String login;
    private String motpasse;
    
    public utilisateur (String nom, String prenom, String login, String motpasse) {
        this.login = login;
        this.nom = nom;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMotpasse() {
        return motpasse;
    }

    public void setMotpasse(String motpasse) {
        this.motpasse = motpasse;
    }
 
}
