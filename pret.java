package projetjava;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Pret 
{
    private int numpret;
    private Date dateemprunt;
    private Date dateretour;

    public Pret (int numpret, Date dateemprunt, Date dateretour) 
    {
        this.numpret = numpret;
        this.dateemprunt = dateemprunt;
        this.dateretour = dateretour;
    }

      public static List<Pret> getListePrets() 
    {
        return listePrets;
    }

    public int getNumpret() 
    {
        return numpret;
    }

    public void setNumpret(int numpret) 
    {
        this.numpret = numpret;
    }

    public Date getDateemprunt() {
        return dateemprunt;
    }

    public void setDateemprunt(Date dateemprunt) 
    {
        this.dateemprunt = dateemprunt;
    }

    public Date getDateretour() {
        return dateretour;
    }

    public void setDateretour(Date dateretour) 
    {
        this.dateretour = dateretour;
    }
    
  private static List<Pret> listePrets = new ArrayList<>();

    
    static {
        Date dateemprunt = new Date(2023, 3, 1);
        Date dateretour = new Date(2023, 3, 16);
        Pret pret1 = new Pret(1, dateemprunt, dateretour);
        listePrets.add(pret1);
    }
}
