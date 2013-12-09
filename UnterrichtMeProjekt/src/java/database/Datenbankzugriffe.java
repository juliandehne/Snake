package database;

import example.Point;
import gamelogic.Item;
import gamelogic.PlayingGround;
import gamelogic.Spieler;
import java.util.List;

/**
 *
 * @author Julian
 */
public class Datenbankzugriffe {

    /**
     * Diese Methode mit Code füllen...
     */
    public void erstelleHighScore(List<IdNamePair> idNamePairs) {
        throw new Error("Methode noch nicht implemetiert."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Diese Methode mit Code füllen...
     * @return 
     */
    public List<IdNamePair> holeHighscore() {        
        throw new Error("Methode noch nicht implemetiert."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getId() {
    /// datenbankgruppe organisiert die id dies testspielers
        throw new Error("Methode noch nicht implemetiert."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Point> getPosition(int id) { 
    return null;
    }
    
    public void move(Integer id, String richtung){
        
    }
    
    public String getRichtung(int id) {
        throw new UnsupportedOperationException("Methode noch nicht implemetiert."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public PlayingGround getPlayingGround(){
        throw new UnsupportedOperationException("Methode noch nicht implemetiert."); 
    }
    
    public List<Item> getItems(){
        throw new UnsupportedOperationException("Methode noch nicht implemetiert."); 
    }
    
    public void spielerAnlegen(Spieler spieler) { 
        // bitte implementiere
    }
    
    public Spieler getSpieler(Integer id){
         throw new UnsupportedOperationException("Methode noch nicht implemetiert."); 
    }
}
