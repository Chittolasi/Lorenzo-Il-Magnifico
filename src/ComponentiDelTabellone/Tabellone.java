package partiTablellone;

/**
 * Created by Pietro on 11/05/2017.
 */
public class Tabellone {
    private Torre[] torri;
    private Vaticano vaticano;
    private Mercato mercato;
    private PalazzoDelConsiglio palazzoDelConsiglio;
    private Zona zonaProduzione;
    private Zona zonaRaccolto;
    private int numeroGiocatori;
    //private boolean treGiocatori;
    //private boolean quattroGiocatori;

    public Tabellone(boolean treGiocatori,boolean quattroGiocatori){
        if(treGiocatori)
            numeroGiocatori=3;
        else if(quattroGiocatori)
            numeroGiocatori=4;
        else numeroGiocatori=2;
        torri=new Torre[4];
        torri[0]=new Torre("territori");
        torri[1]=new Torre("personaggi");
        torri[2]=new Torre("edifici");
        torri[3]=new Torre("imprese");
        vaticano=new Vaticano();
        mercato=new Mercato(!quattroGiocatori);
        palazzoDelConsiglio = new PalazzoDelConsiglio(numeroGiocatori);
        zonaProduzione=new Zona(true, treGiocatori);
        zonaRaccolto=new Zona(false, treGiocatori);
    }
}

