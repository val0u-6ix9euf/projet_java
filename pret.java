public class pret {
    private int numpret;
    private Date dateemprunt;
    private Date dateretour;

public pret (int numpret, Date dateemprunt, Date dateretour)
{this.numpret = numpret;                                            // rajouter this
this.dateemprunt= dateemprunt;
this.dateretour=dateretour;}
}

public int getNumpret(){
return numpret;}

public void setNumpret(int numpret){
    this.numpret = numpret ;}

public Date getDateemprunt(){
    return dateemprunt;}

public void setDateemprunt (Date dateemprunt){
    this.dateemprunt = dateemprunt;}

public Date getDateretour(){
return dateretour;}

public void setDateretour(Date dateretour){
    this.dateretour = dateretour ;}
