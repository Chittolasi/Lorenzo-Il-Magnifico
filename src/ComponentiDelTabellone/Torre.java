package ComponentiDelTabellone;

/**
 * Created by Pietro on 10/05/2017.
 */
public class Torre {
    private String tipo;
    private Piano[] piani;
    private boolean[] occupata;
//commento
    public Torre(String tipo){
        this.tipo=tipo;
        //creo il primo piano che ha costo 1 e non ha effetto
        piani[0]=new Piano(1,false, "");
        //creo il secondo piano che ha costo 3 e non ha effetto
        piani[0]=new Piano(3,false, "");
        //creo il terzo piano che ha costo 5 e ha effetto
        piani[0]=new Piano(5,true, "incrementaRisorse1");
        //creo il primo piano che ha costo 7 e ha effetto
        piani[0]=new Piano(1,false, "IncrementaRisorse2");
    }
}
