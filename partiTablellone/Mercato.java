package partiTablellone;

/**
 * Created by Pietro on 10/05/2017.
 */
public class Mercato {
    //serve per capire se vanno coperte alcune zone del mercato
    private boolean menoDiQuattroGiocatori;
    private final int costoMinimo=1;
    private boolean[] zoneOccupate;

    public Mercato(boolean menoDiQuattroGiocatori){
        this.menoDiQuattroGiocatori=menoDiQuattroGiocatori;
        for(int i=0; i<4; i++){
            zoneOccupate[i]=false;
        }
    }

}
