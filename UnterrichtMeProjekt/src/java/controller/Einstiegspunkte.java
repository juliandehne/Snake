package controller;

import static controller.ImageServlet.random;
import database.Datenbankzugriffe;
import gamelogic.Facing;
import gamelogic.PlayingGround;
import gamelogic.Schlangenteil;
import gamelogic.PositionType;
import gamelogic.Snake;
import itemlogic.ItemController;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;
import org.apache.log4j.Logger;
import static util.LoggerHelper.initLogger;

/**
 *
 * @author Julian Dehne
 */
public class Einstiegspunkte {

    private int spielerid;
    private int maxx = 100;
    private int maxy = 100;

    /**
     * Team Schlange Spielerid des Testspielers ist 1
     *
     * @param spielerid
     * @return
     */
    public PositionType[][] teamschlange(Integer spielerid) {

        Datenbankzugriffe dbz = new Datenbankzugriffe();                
        LinkedList<Schlangenteil> queue = dbz.getPositions(spielerid.intValue());
        Snake snake = new Snake(dbz.getDirection(spielerid), queue); //TODO

        PlayingGround playingGround = new PlayingGround(maxx, maxy, snake);
        snake.move(false); //TODO

        // update 
        playingGround.update();

        // hits border?
        if (snake.hitsBorder(maxx, maxy)) {
            dbz.initGame(spielerid);
        } else {
            //akutelle Position in datenbank schreiben            
            dbz.setPositions(spielerid.intValue(), snake.getSnakePositions());
        }

        /**
         * Aufgabe3 Team Schlange
         *
         * Wenn es eine Kollision gibt, dann muss die Schlange aus der Datenbank
         * gelöscht werden.
         *
         * Ladet hierfür die Position aller Schlangen - zunächst mehrere
         * Testschlangen - aus der Datenbank!
         *
         * Bei der Spielertabelle, die zu der Schlange gehört, muss markiert
         * werden, dass der Spieler "tot" ist
         */
        /**
         * Aufgabe 4 Team Schlange Erweitert Aufgabe1, so dass die Items aus der
         * Datenbank gelesen werden, die Team "Items" in die Datenbank schreibt!
         *
         */
        /**
         * Aufgabe 5: Erweitert den Algorithmus so, dass ein Highscore geführt
         * wird und dieser in die Highscoretabelle eingetragen wird (Zuarbeit
         * von Highscore-Team)
         *
         *
         */
        /**
         * Aufgabe 6: Erweitert den Algorithmus so, dass anstatt dem Testspieler
         * der jewailige Spieler verwendet wird.
         */
        //logger.info(playingGround.toString()); // should be deleted in deploy version, because it creates huge files
        //logger.info(position.toString()); // should be deleted in deploy version, because it creates huge files
        return playingGround.getPlayingGround();

    }

    /**
     * Team Items
     */
    public void itemTeam() {
        // hier werden die neuen Items generiert
        // für die AufgabenStellung siehe ItemController
        ItemController itemController = new ItemController();
        itemController.spawnItems();
    }

    public PositionType[][] getPlayingGround() {
        return teamschlange(this.spielerid);
    }

    void setSpielerId(int attribute) {
        this.spielerid = attribute;
    }

}
