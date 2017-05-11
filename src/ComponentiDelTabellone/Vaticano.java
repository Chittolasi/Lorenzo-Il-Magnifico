package ComponentiDelTabellone;

import CarteDaGioco.CartaScomunica;

/**
 * Created by Pietro on 10/05/2017.
 */
public class Vaticano {
    private CartaScomunica[] carteScomunica;

    /*
    Il costruttore prende in ingresso le 3 cartye scomunica e le salva nell'array;
     */
    public Vaticano(CartaScomunica periodo1, CartaScomunica periodo2, CartaScomunica periodo3){
        carteScomunica=new CartaScomunica[3];
        carteScomunica[0]=periodo1;
        carteScomunica[1]=periodo2;
        carteScomunica[2]=periodo3;
    }
}
