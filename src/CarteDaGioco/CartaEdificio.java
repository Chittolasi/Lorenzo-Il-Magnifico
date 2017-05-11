package CarteDaGioco;

/**
 * Created by william on 10/05/2017.
 */
public class CartaEdificio extends CartaSviluppo {

        private String nomeEffettoPermanente;
        private String nomeEffettoRapido;
        private CostoCarta costo;
        private int costoAttivazioneEffettoPermanente;

        public CartaEdificio(CostoCarta costo, int costoAttivazioneEffettoPermanente, int periodo, String nome, boolean effettoRapido, boolean effettoPermanente, String nomeEffettoRapido, String nomeEffettoPermanente){

            super(periodo, nome, effettoRapido, effettoPermanente);
            this.nomeEffettoPermanente=nomeEffettoPermanente;
            this.nomeEffettoRapido=nomeEffettoRapido;
            this.costo=costo;
            this.costoAttivazioneEffettoPermanente=costoAttivazioneEffettoPermanente;

        }

}
