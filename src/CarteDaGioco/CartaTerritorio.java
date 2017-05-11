package CarteDaGioco;

import CarteDaGioco.CartaSviluppo;

/**
 * Created by william on 10/05/2017.
 */
public class CartaTerritorio extends CartaSviluppo {

    private String nomeEffettoPermanente;
    private String nomeEffettoRapido;

    public CartaTerritorio(int periodo, String nome, boolean effettoRapido, boolean effettoPermanente, String nomeEffettoRapido, String nomeEffettoPermanente){

        super(periodo, nome, effettoRapido, effettoPermanente);
        this.nomeEffettoPermanente=nomeEffettoPermanente;
        this.nomeEffettoRapido=nomeEffettoRapido;

    }

}
