import partiTablellone.Tabellone;

import java.util.ArrayList;

/**
 * Created by Pietro on 10/05/2017.
 */
public class CampoDaGioco {
    private Tabellone tabellone;
    private ArrayList<Giocatore> giocatori;
    public final int NUMEROGIOCATORI;//final ??

    public CampoDaGioco(ArrayList<Giocatore> giocatori){
        this.giocatori=giocatori;
        NUMEROGIOCATORI=giocatori.size();
        tabellone = new Tabellone();

    }


}
