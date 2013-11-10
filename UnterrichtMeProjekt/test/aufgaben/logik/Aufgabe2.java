/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgaben.logik;

import gamelogic.*;
import org.junit.Test;
import picture.CreatePicture;


/**
 *
 * @author jdehne
 */
public class Aufgabe2 {
    
    /**
     * a)Implementiert eine Klasse Snake
     * Diese hat als Eigenschaften:
     * Position, Länge, Ausrichtung!
     * 
     * b)Implementiert eine Funktion
     * public synchronized void paintPicture(File outputStream, Snake snake) 
     * in der Klasse CreatePicture!
     * 
     * c)Schreibt TestCode unten, um zu zeigen, dass eurer Code funktioniert!
     * 
     * d)Wenn c gegeben ist, merged euer Ergebnis auf den Master 
     * (Anleitung zu merge steht im Glossar auf Moodle)
     */
    @Test
    public void drawSnake() {
        
        //mein code ist im gamelogic package
        Snake snake = new Snake(new Position(15,15), 10, Facing.RIGHT);
        
        PlayingGround playingGround = new PlayingGround(400, 400, snake);
        //CreatePicture.paintPicture(, playingGround);
        
        snake.setPos(new Position(20,20));
        playingGround.update();
        //CreatePicture.paintPicture(, playingGround);            
    }
}
