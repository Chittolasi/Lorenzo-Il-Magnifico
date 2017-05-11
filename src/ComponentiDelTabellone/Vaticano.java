package componentiDelTabellone;

import carteDaGioco.CartaScomunica;

/**
 * Created by Pietro on 10/05/2017.
 */
public class Vaticano {
    private CartaScomunica[] carteScomunica;

    public Vaticano(){
        carteScomunica=new CartaScomunica[3];
    }

    public void setCarteScomunica(CartaScomunica periodo1, CartaScomunica periodo2, CartaScomunica periodo3){
        carteScomunica[0]=periodo1;
        carteScomunica[1]=periodo2;
        carteScomunica[2]=periodo3;
    }
}
