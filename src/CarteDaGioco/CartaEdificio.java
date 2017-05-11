package carteDaGioco;

import componentiDelTabellone.Familiare;
import componentiDelTabellone.Giocatore;

/**
 * Created by william on 10/05/2017.
 */
public class CartaEdificio extends CartaSviluppo {

    private String nomeEffettoPermanente;
    private String nomeEffettoRapido;
    private CostoCarta costo;
    private int costoAttivazioneEffettoPermanente;

    public CartaEdificio(CostoCarta costo, int costoAttivazioneEffettoPermanente, int periodo, String nome, boolean effettoRapido, boolean effettoPermanente, String nomeEffettoRapido, String nomeEffettoPermanente){

        super(periodo, nome, effettoRapido, effettoPermanente, "edificio");
        this.nomeEffettoPermanente=nomeEffettoPermanente;
        this.nomeEffettoRapido=nomeEffettoRapido;
        this.costo=costo;
        this.costoAttivazioneEffettoPermanente=costoAttivazioneEffettoPermanente;

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
        if(super.getEffettoPermanente() && verificaDisponibilitàForza(f.getForza())){
            //cerca metodo permanente
        }
    }

    /**
     * verifica se il familiare che attiva le carte edificio ha la forza necessaria per attivare l'effetto
     * @param forza: forza del familiare che vuole attivare l'effetto
     * @return true se la forza è maggiore o uguale; false altrimenti
     */
    public boolean verificaDisponibilitàForza(int forza){
        if(forza>=costoAttivazioneEffettoPermanente) return true; return false;
    }

    public CostoCarta getCosto(){
        return costo;
    }

}

