package database;

import gamelogic.Item;
import gamelogic.PlayingGround;
import gamelogic.Position;
import gamelogic.Snake;
import gamelogic.Spieler;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    
    public void log(String logText) {
            instance.connect();
            instance.issueInsertOrDeleteStatement("insert into logdata (data) values (?) ", logText);
            instance.close();
    }
    
    
    
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
        /**
         * Diese Methode mit Code füllen...
         *
         * @return
         */
        return 1;
    }

    public List<IdNamePair> holeHighscore() {
        instance.connect();

        VereinfachtesResultSet result = instance.issueSelectStatement("select id, username from spieler;");

        List<IdNamePair> idNamePairs = new ArrayList<IdNamePair>();

        while (result.next()) {
            idNamePairs.add(new IdNamePair(result.getInt("id"), result.getString("username")));
        }
        instance.close();
        return idNamePairs;

    }
    
        public List<IdScorePair> getHighscore() {
        instance.connect();

        VereinfachtesResultSet result = instance.issueSelectStatement("select id, punkte from score;");

        List<IdScorePair> IdScorePair = new ArrayList<IdScorePair>();

        while (result.next()) {
            IdScorePair.add(new IdScorePair(result.getInt("id"), result.getInt("punkte")));
        }
        instance.close();
        return IdScorePair;

    }

    public int getId() {
        /// datenbankgruppe organisiert die id dies testspielers                                
        return 0;
    }
    //TODO: In interface packen
    public Queue<Position> getPositions(int id) {
        instance.connect();
        VereinfachtesResultSet result = instance.issueSelectStatement("select x, y from positionschlange where id=? order by indexPos DESC;", id);
        Queue<Position> queue = new LinkedList<Position>();
        while (result.next()) {
            queue.add(new Position(result.getInt("x"), result.getInt("y")));
        }
        instance.close();
        return queue;
    }
    
    public void setPositions(int id, Queue<Position> queue) {
        instance.connect();
        instance.issueInsertOrDeleteStatement("delete from positionschlange where id=?;", id);
        Position[] posArr = queue.toArray(new Position[0]);
        for (int i = 0; i < posArr.length;i++) {
            instance.issueInsertOrDeleteStatement("insert into positionschlange (x,y,id,indexPos) values (?,?,?,?)", posArr[i].getX(), posArr[i].getY(),id,i);
        }
        instance.close();
    }

    @Override
    public PlayingGround getCurrentPlayingGround(int id) {
        VereinfachtesResultSet result = instance.issueSelectStatement("select x, y from positionschlange where id=? order by indexPos;", id);
        /**
         * hier noch zu ende implementieren
         */
        return null;
    }

    public void move(Integer id, String richtung) {
    }

    public String getDirection(int id) {
        throw new UnsupportedOperationException("Methode noch nicht implemetiert."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setDirection(int id) {
    }

    public PlayingGround getPlayingGround() {
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
