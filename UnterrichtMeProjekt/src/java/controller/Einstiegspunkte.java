package controller;

import static controller.ImageServlet.random;
import gamelogic.Facing;
import gamelogic.PlayingGround;
import gamelogic.Position;
import gamelogic.PositionType;
import gamelogic.Snake;
import itemlogic.ItemController;
import org.apache.log4j.Logger;
import static util.LoggerHelper.initLogger;

/**
 *
 * @author Julian Dehne
 */
public class Einstiegspunkte {

    /**
     * Team Schlange
     * @return 
     */
    public PositionType[][] teamschlange() {
        Logger logger = initLogger();

        // neue TestSchlange erstellen
        Position position = new Position(random.nextInt(99), random.nextInt(99));
        Snake snake = new Snake(position, 5, Facing.RIGHT);
        PlayingGround playingGround = new PlayingGround(100, 100, snake);
        
        /**
         * Aufgabe 0 Korregiert den Algorithmus... siehe Stunde
         */

        /**
         * Aufgabe1 Team Schlange
         *
         * Hier musst jetzt der Code eingefügt werden, der die letzte Position
         * aus der Datenbank ließt und dann ein update durchführt, das die neue
         * Position dann in die Datenbank schreibt.
         *
         * Erstellt hierfür eine Testschlange in der Datenbank!
         */
        /**
         * Aufgabe2 Team Schlange Erweitert den Code von oben, so dass die
         * Richtungsänderungen die Team Frontend in die Datenbank schreibt
         * beachtet werden.
         *
         * Lest die aktuelle Richtung aus einer entsprechenden Tabelle!
         */
        /**
         * Aufgabe3 Team Schlange Wenn es eine Kollision gibt, dann muss die
         * Schlange aus der Datenbank gelöscht werden
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
        return teamschlange();
    }

}
