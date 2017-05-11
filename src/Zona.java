/**
 * Created by Pietro on 10/05/2017.
 */
public class Zona {

    //indica se è la zona di produzione o di raccolto
    private boolean produzione;

    //indica quali giocatori sono presenti nella zona e in che campo azione si trovano
    private boolean[][] posizioneGiocatori;

    //indica se ci sono almeno 3 giocatori per coprire certe zone
    private boolean treGiocatori;

    /*indica la forza di tutti i familiari non neutri e neutri
        posizione 0x -->g1
        posizione 1x -->g2
        posizione 2x -->g3 se presente
        posizione 3x -->g4 se presente
        posizione x1 -->familiare colorato
        posizione x2 -->familiare neutro

        se un familiare non è presente la sua forza è -1
     */
    private int[][] forzaGiocatori;

    public Zona(boolean produzione, boolean treGiocatori){
        this.produzione=produzione;
        this.treGiocatori=treGiocatori;
    }

}
