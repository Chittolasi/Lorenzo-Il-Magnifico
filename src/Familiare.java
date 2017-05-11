/**
 * Created by william on 10/05/2017.
 */
public class Familiare {

    private boolean neutro;
    private int idGiocatore;
    private int numeroDado; // quale dado devo controllare (lancio)
    private int forza; //risultato del dado corrispondente al familiare
    private boolean disponibile; //se posso usufruirne o meno


    public Familiare (boolean neutro, int idGiocatore, int forza, int numeroDado, boolean disponibile){

        this.neutro=neutro;
        this.numeroDado=numeroDado;
        this.idGiocatore=idGiocatore;
        this.disponibile=disponibile;
        this.forza=forza;

    }

}
