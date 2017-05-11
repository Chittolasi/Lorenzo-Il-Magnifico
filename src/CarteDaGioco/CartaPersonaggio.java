package carteDaGioco;

import componentiDelTabellone.Familiare;
import componentiDelTabellone.Giocatore;

/**
 * Created by william on 10/05/2017.
 */
public class CartaPersonaggio extends CartaSviluppo {

    private String nomeEffettoPermanente;
    private String nomeEffettoRapido;
    private CostoCarta costo;

    public CartaPersonaggio(CostoCarta costo, int periodo, String nome, boolean effettoRapido, boolean effettoPermanente, String nomeEffettoRapido, String nomeEffettoPermanente){

        super(periodo,nome,effettoRapido,effettoPermanente,"personaggio");
        this.nomeEffettoPermanente=nomeEffettoPermanente;
        this.nomeEffettoRapido=nomeEffettoRapido;
        this.costo=costo;

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

    /**
     * controlla se la carta ha un effetto permanente e si occupa dell'attivazione del metodo che implementa l'effetto
     * @param f: familiare del giocatore possessore della carta
     */
    public void attivaEffettoPermanente(Familiare f){
        if(super.getEffettoPermanente()){
            //cerca metodo permanente
        }
    }

    public CostoCarta getCosto(){
        return costo;
    }

}
