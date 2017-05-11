package carte;

/**
 * Created by william on 10/05/2017.
 */
public abstract class CartaSviluppo {

    private int periodo;
    private String nome;
    private boolean effettoRapido;
    private boolean effettoPermanente;

    public CartaSviluppo(int periodo, String nome, boolean effettoRapido, boolean effettoPermanente){

        this.effettoPermanente=effettoPermanente;
        this.effettoRapido=effettoRapido;
        this.nome=nome;
        this.periodo=periodo;

    }

}
