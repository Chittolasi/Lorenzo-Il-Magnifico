package partiTablellone;

/**
 * Created by Pietro on 10/05/2017.
 */
public class PalazzoDelConsiglio {
    private final int costo=1;
    private int[] ordineArrivoGiocatori;
    private int[] ordineTurnoCorrente;

    public PalazzoDelConsiglio(int numeroGiocatori){
        ordineArrivoGiocatori= new int[numeroGiocatori];
        ordineTurnoCorrente= new int[numeroGiocatori];
    }

    public void arrivaGiocatore(int id){}
    public int[] calcoaTurnoSuccessivo(){
    }
    public void setTurnoCorrente(int[] turnoCorrente){
        this.ordineTurnoCorrente=turnoCorrente;
    }
}
