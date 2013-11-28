/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jdehne
 */
public class Highscore {

    public Spieler spieler;
    private int id;
    
    public Highscore(Spieler spieler, int id) {
        this.spieler = spieler;
        this.id = id;
    }
    
    public int getId() {
        return this.id;
    }
}
