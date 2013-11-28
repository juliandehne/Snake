/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author jdehne
 */
public class SpielerTest {
    
    public SpielerTest() {
    }

 

    @Test
    public void testSomeMethod() {
       Spieler spieler = new Spieler("Yilmaz", "Utku", 16);
       int spieleralter = spieler.alter;
       String spielername = spieler.name;
       
       
       Highscore highscore = new Highscore(spieler, 9999);
       String name2 = highscore.spieler.name;
       System.out.println("Der Name des Spielers"
               + " zu der Highscore ist " + name2 + "und "
               + "die id der Highscore ist" + highscore.getId() + 
               "id des Spielers ist" + highscore.spieler.id);
       
       
       
       
    }
}
