package carteDaGioco;

import componentiDelTabellone.Giocatore;

/**
 * Created by william on 10/05/2017.
 */
public class CartaImpresa extends CartaSviluppo {

    private String nomeEffettoRapido;
    private CostoCarta costoCarta1;//le carte impresa possono avere due costi tra cui scegliere
    private CostoCarta costoCarta2;
    private boolean doppioCosto;
    private int puntiVittoria;//punti vottoria che la carta darà a fine partita al giocatore

    public CartaImpresa(CostoCarta costo1, CostoCarta costo2, boolean doppioCosto, int periodo, String nome, boolean effettoRapido, String nomeEffettoRapido){

        super(periodo, nome, effettoRapido, false, "Impresa");
        this.nomeEffettoRapido=nomeEffettoRapido;
        this.costoCarta1=costo1;
        this.costoCarta2=costo2;
        this.doppioCosto=doppioCosto;

    }

    public CostoCarta getCosto1(){
        return costoCarta1;
    }

    public CostoCarta getCosto2(){
        return costoCarta2;
    }

    public int getPuntiVittoria(){
        return puntiVittoria;
    }

    /**
     * controlla se la carta ha un effetto rapido e si occupa di chiamare il metodo che implementa l'effetto
     * @param g: giocatore possessore della carta
     */
    public void attivaEffettoRapido(Giocatore g){
        if(super.getEffettoRapido()){
            //cerca meteodo rapido
        }
    }

}
