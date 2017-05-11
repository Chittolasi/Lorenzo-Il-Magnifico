package partiTablellone;

import carte.CartaSviluppo;

/**
 * Created by Pietro on 10/05/2017.
 */
public class Piano {
    private int costoMinimo;
    private boolean haEffeto;
    private String effettoTorre;
    private boolean occupatoDaGiocatore;
    private CartaSviluppo carta;
    private boolean cartaAssente;

    public Piano(int costoMinimo, boolean effetto,String effettoTorre){
        this.costoMinimo=costoMinimo;
        this.haEffeto=effetto;
        this.effettoTorre=effettoTorre;
    }

    public void setCartaSviluppo(CartaSviluppo carta){
        this.carta=carta;
    }
}
