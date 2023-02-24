public class utilisateur extends personne {
    
    private String login;
    private String mdp;
    private String typedecompte;
    
    public utilisateur (String login, String mdp, String typedecompte) {
        this.login = login;
        this.mdp = mdp;
        this.typedecompte=typedecompte;
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

    public void setTypedecompte(String Typedecompte) {
        this.typedecompte = typedecompte
    }
 public String getTypedecompte() {
        return typedecompte;
    }

   
}

FAIRE TABLEAU AVEC LES LOGIN ET LES MDP de type utilisateur
