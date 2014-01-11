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
 * @author lennart
 * 
 * Implementiert diese Methoden um den Entwicklern Zugriff zu ermöglichen
 * Um das Interface zu nutzen müsst ihr in der Klasse die dies Implementieren
 * dies Schreiben:
 * pulbic class ... implements IDatenbankZugriff
 * 
 */
public interface IDatenbankZugriff {

    void createHighscore(List<IdNamePair> idNamePairs);

    List<Item> getCurrentItems();

    Spieler getCurrentPlayer();

    int getCurrentPlayerID();

    PlayingGround getCurrentPlayingGround();

    int getHigscoreForPlayerID(int id);

    void setCurrentItems(List<Item> item);

    void setCurrentPlayer(Spieler spieler);

    void setCurrentPlayingGround(PlayingGround playingGround);

    void setHigscoreForPlayerID(int id, int Highscore);
    
}
