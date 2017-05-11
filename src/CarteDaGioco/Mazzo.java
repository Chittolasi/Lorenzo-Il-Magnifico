package carteDaGioco;

import java.util.ArrayList;

/**
 * Created by Pietro on 11/05/2017.
 * un mazzo è formato da carte dello stesso periodo e tipo
 */
public class CreatoreMazzi {
    private ArrayList<CartaSviluppo> mazzo;

    public CreatoreMazzi(ArrayList<CartaSviluppo> mazzo){
        this.mazzo=mazzo;
    }

    public ArrayList<CartaSviluppo> primoPeriodoTerreni(){

        return smistaMazzo(1,"territorio");

    }

    public ArrayList<CartaSviluppo> secondoPeriodoTerreni(){
        return smistaMazzo(2,"territorio");
    }

    public ArrayList<CartaSviluppo> terzoPeriodoTerreni(){
        return smistaMazzo(3,"territorio");
    }

    public ArrayList<CartaSviluppo> primoPeriodoEdifici(){
        return smistaMazzo(1,"edificio");
    }

    public ArrayList<CartaSviluppo> secondoPeriodoEdifici(){
        return smistaMazzo(2,"edificio");
    }

    public ArrayList<CartaSviluppo> terzoPeriodoEdifici(){
        return smistaMazzo(3,"edificio");
    }

    public ArrayList<CartaSviluppo> primoPeriodoPersonaggi(){
        return smistaMazzo(1,"personaggio");
    }

    public ArrayList<CartaSviluppo> secondoPeriodoPersonaggi(){
        return smistaMazzo(2,"personaggio");
    }

    public ArrayList<CartaSviluppo> terzoPeriodoPersonaggi(){
        return smistaMazzo(3,"personaggio");
    }

    public ArrayList<CartaSviluppo> primoPeriodoImprese(){
        return smistaMazzo(1,"impresa");
    }

    public ArrayList<CartaSviluppo> secondoPeriodoImprese(){
        return smistaMazzo(2,"impresa");
    }

    public ArrayList<CartaSviluppo> terzoPeriodoImprese(){
        return smistaMazzo(3,"impresa");
    }

    public ArrayList<CartaSviluppo> smistaMazzo (int periodo, String tipo){
        ArrayList<CartaSviluppo> mazzetto= new ArrayList<CartaSviluppo>();

        for(CartaSviluppo c: mazzo){
            if(c.getPeriodo()==periodo && c.getTipo().equals(tipo)){
                mazzetto.add(c);
            }
        }

        mazzetto=mischiaMazzo(mazzetto);

        return mazzetto;
    }

    private ArrayList<CartaSviluppo> mischiaMazzo(ArrayList<CartaSviluppo> mazzettoNonMischiato){

        CartaSviluppo temp;

        for(int i=0; i<8; i++){
            temp=mazzettoNonMischiato.get(i);
            double ran=(Math.random()*100);
            int r=(int)ran%8;
            mazzettoNonMischiato.remove(i);
            mazzettoNonMischiato.add(i,mazzettoNonMischiato.get(r));
            mazzettoNonMischiato.remove(r);
            mazzettoNonMischiato.add(r, temp);
        }

        return mazzettoNonMischiato;

    }

}
