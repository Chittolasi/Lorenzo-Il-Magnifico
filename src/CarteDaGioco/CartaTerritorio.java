import componentiDelTabellone.Giocatore;

/**
 * Created by william on 10/05/2017.
 */
public class CartaTerritorio extends CartaSviluppo{

    private String nomeEffettoPermanente;
    private String nomeEffettoRapido;
    private int costoAttivazioneEffettoPermanente;

    public CartaTerritorio(int periodo, String nome, boolean effettoRapido, boolean effettoPermanente, String nomeEffettoRapido, String nomeEffettoPermanente, int costoAttivazioneEffettoPermanente){

        super(periodo, nome, effettoRapido, effettoPermanente, "territorio");
        this.nomeEffettoPermanente=nomeEffettoPermanente;
        this.nomeEffettoRapido=nomeEffettoRapido;
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

}
