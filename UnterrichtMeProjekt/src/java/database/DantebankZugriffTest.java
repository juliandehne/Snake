/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import gamelogic.Item;
import gamelogic.PlayingGround;
import gamelogic.Spieler;
import java.util.List;

/**
 *
 * @author vogelsang
 */
public class DantebankZugriffTest implements IDatenbankZugriff {
    
    private static List<Item> currentItems;
    private static Spieler currentPlayer;
    private static PlayingGround currentPlayingGround;
    private static List<List<Object>> highscore;
    

    @Override
    public void createHighscore(List<IdNamePair> idNamePairs) {
    }

    @Override
    public List<Item> getCurrentItems() {
        return currentItems;
    }

    @Override
    public Spieler getCurrentPlayer() {
        return currentPlayer;
    }

    @Override
    public int getCurrentPlayerID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PlayingGround getCurrentPlayingGround() {
        return currentPlayingGround;
    }

    @Override
    public int getHigscoreForPlayerID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCurrentItems(List<Item> items) {
        this.currentItems = items;
    }

    @Override
    public void setCurrentPlayer(Spieler spieler) {
        this.currentPlayer = spieler;
    }

    @Override
    public void setCurrentPlayingGround(PlayingGround playingGround) {
        this.currentPlayingGround = playingGround;
    }

    @Override
    public void setHigscoreForPlayerID(int id, int Highscore) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
