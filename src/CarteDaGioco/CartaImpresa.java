package CarteDaGioco;

/**
 * Created by william on 10/05/2017.
 */
public class CartaImpresa extends CartaSviluppo {

    private String nomeEffettoPermanente;
    private String nomeEffettoRapido;
    private CostoCarta costoCarta1;
    private CostoCarta costoCarta2;
    private boolean doppioCosto;

   public CartaImpresa(CostoCarta costo1, CostoCarta costo2, boolean doppioCosto, int periodo, String nome, boolean effettoRapido, boolean effettoPermanente, String nomeEffettoRapido, String nomeEffettoPermanente){

        super(periodo, nome, effettoRapido, effettoPermanente);
        this.nomeEffettoPermanente=nomeEffettoPermanente;
        this.nomeEffettoRapido=nomeEffettoRapido;
        this.costoCarta1=costoCarta1;
        this.costoCarta2=costoCarta2;
        this.doppioCosto=doppioCosto;

   }

}
