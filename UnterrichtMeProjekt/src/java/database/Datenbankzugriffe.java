package database;

import gamelogic.Item;
import gamelogic.PlayingGround;
import gamelogic.Position;
import gamelogic.Snake;
import gamelogic.Spieler;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Julian
 */
public class Datenbankzugriffe implements IDatenbankZugriff {

    MysqlConnect instance;

    public Datenbankzugriffe() {
        instance = new MysqlConnect();
    }

    /**
     * Diese Methode mit Code füllen...
     */
    @Override
    public void createHighscore(List<IdNamePair> idNamePairs) {

        for (IdNamePair idNamePair : idNamePairs) {
            instance.connect(); 
            instance.issueInsertOrDeleteStatement("insert into spieler (id,name) values (?,?) ", idNamePair.getId(), idNamePair.getName());
            instance.close();
        }

    }

    @Override
    public int getCurrentPlayerID() {
        /// datenbankgruppe organisiert die id dies testspielers                                
        return 0;
    }

    @Override
    public PlayingGround getCurrentPlayingGround() {
        throw new UnsupportedOperationException("Methode noch nicht implemetiert.");
    }

    @Override
    public void setCurrentPlayingGround(PlayingGround playingGround) {
        throw new UnsupportedOperationException("Methode noch nicht implemetiert.");

    }

    @Override
    public List<Item> getCurrentItems() {
        throw new UnsupportedOperationException("Methode noch nicht implemetiert.");
    }

    @Override
    public void setCurrentItems(List<Item> item) {
        throw new UnsupportedOperationException("Methode noch nicht implemetiert.");
    }

    @Override
    public void setCurrentPlayer(Spieler spieler) {
        throw new UnsupportedOperationException("Methode noch nicht implemetiert.");
    }

    @Override
    public Spieler getCurrentPlayer() {
        throw new UnsupportedOperationException("Methode noch nicht implemetiert.");
    }
    
    
    @Override
    public void setHigscoreForPlayerID(int id, int Highscore) {
        throw new UnsupportedOperationException("Methode noch nicht implemetiert.");

    }
    @Override
    public int getHigscoreForPlayerID(int id) {
        throw new UnsupportedOperationException("Methode noch nicht implemetiert.");

    }
}
