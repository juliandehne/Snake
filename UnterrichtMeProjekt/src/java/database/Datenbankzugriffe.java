package database;

import gamelogic.Facing;
import gamelogic.Item;
import gamelogic.PlayingGround;
import gamelogic.Schlangenteil;
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
        instance.otherStatements("use snake");
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
        return 1;
    }

    //TODO: In interface packen
    public LinkedList<Schlangenteil> getPositions(int id) {
        instance.connect();
        instance.otherStatements("use snake");
        VereinfachtesResultSet result = instance.issueSelectStatement("select x, y, indexPos from positionschlange where id=? order by indexPos;", id);
        LinkedList<Schlangenteil> queue = new LinkedList<Schlangenteil>();
        // erste schlange initialisieren      
        while (result.next()) {
            queue.add(new Schlangenteil(result.getInt("x"), result.getInt("y"), result.getInt("indexPos")));
        }
        instance.close();
        return queue;
    }

    public void setPositions(int id, Queue<Schlangenteil> queue) {
        instance.connect();
        instance.otherStatements("use snake");
        instance.issueInsertOrDeleteStatement("delete from positionschlange where id=?;", id);
        for (Schlangenteil schlangenteil : queue) {
            instance.issueInsertOrDeleteStatement("insert into positionschlange (x,y,id,indexPos) values (?,?,?,?)", schlangenteil.getX(), schlangenteil.getY(), id, schlangenteil.index);
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

    public Facing getDirection(int id) {
        instance.connect();
        instance.otherStatements("use snake");
        VereinfachtesResultSet result = instance.issueSelectStatement("select direktion from richtungschlangenbewegung where id=?;", id);
        String direction = "";
        while (result.next()) {
            direction = result.getString("direktion");
            //log(direction);
        }
        instance.close();
        if (direction.equals("links")) {
            return Facing.LEFT;
        }
        if (direction.equals("rechts")) {
            return Facing.RIGHT;
        }
        if (direction.equals("oben")) {
            return Facing.UP;
        }
        if (direction.equals("unten")) {
            return Facing.DOWN;
        }
        return Facing.RIGHT;
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

    @Override
    public void updateRichtung(String richtung) {
        MysqlConnect instance = new MysqlConnect();
        instance.connect();
        instance.otherStatements("use snake");
        instance.issueUpdateStatement("update richtungschlangenbewegung set direktion = ? where id = 1", richtung);
        instance.close();
    }

    public void initGame(int spielerid) {
        instance.connect();
        instance.otherStatements("use snake");
        instance.issueInsertOrDeleteStatement("delete from positionschlange where id = ?", spielerid);
        instance.close();

        LinkedList<Schlangenteil> linkedList = new LinkedList<Schlangenteil>();
        linkedList.add(new Schlangenteil(20, 20, 1));
        linkedList.add(new Schlangenteil(21, 20, 2));
        linkedList.add(new Schlangenteil(22, 20, 3));
        linkedList.add(new Schlangenteil(23, 20, 4));
        setPositions(spielerid, linkedList);

    }
}
