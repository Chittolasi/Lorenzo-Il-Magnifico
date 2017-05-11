package CarteDaGioco;

/**
 * Created by william on 10/05/2017.
 */
public class CartaPersonaggio extends CartaSviluppo {

    private String nomeEffettoPermanente;
    private String nomeEffettoRapido;
    private CostoCarta costo;

    public CartaPersonaggio(CostoCarta costo, int periodo, String nome, boolean effettoRapido, boolean effettoPermanente, String nomeEffettoRapido, String nomeEffettoPermanente){

        super(periodo, nome, effettoRapido, effettoPermanente);
        this.nomeEffettoPermanente=nomeEffettoPermanente;
        this.nomeEffettoRapido=nomeEffettoRapido;
        this.costo=costo;

    }

}
