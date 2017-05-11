import CarteDaGioco.CartaScomunica;
import CarteDaGioco.CartaSviluppo;

import java.util.ArrayList;
/**
 * Created by william on 10/05/2017.
 */
public class Giocatore {

    private int id;
    private Familiare[] familiare;
    private int turno; //ordine di gioco giocatore
    private int legna; //risorsa
    private int pietra; //risorsa
    private int monete; //risorsa
    private int servitori; //risorsa
    private int pergamene; //risorsa
    private int puntiVittoria; //punti
    private int puntiFede; //punti
    private int puntiMilitari; //punti
    private ArrayList<CartaScomunica> scomuniche;
    private ArrayList<CartaSviluppo> carteSviluppo;


    public Giocatore( int id ){ //costruttore per condizioni iniziali del Player

        this.id=id;
        this.legna=2;
        this.pietra=2;
        this.servitori=3;
        this.monete=0;
        this.pergamene=0;
        this.puntiFede=0;
        this.puntiMilitari=0;
        this.puntiVittoria=0;
        this.familiare = new Familiare[4];
    }

}
