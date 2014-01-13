/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import gamelogic.Facing;
import gamelogic.Item;
import gamelogic.PlayingGround;
import gamelogic.Schlangenteil;
import gamelogic.Spieler;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author julian
 */
public class DatenbankzugriffeTest {
    
    public DatenbankzugriffeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of log method, of class Datenbankzugriffe.
     */
    @Test
    public void testLog() {
        System.out.println("log");
        String logText = "";
        Datenbankzugriffe instance = new Datenbankzugriffe();
        instance.log(logText);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createHighscore method, of class Datenbankzugriffe.
     */
    @Test
    public void testCreateHighscore() {
        System.out.println("createHighscore");
        List<IdNamePair> idNamePairs = null;
        Datenbankzugriffe instance = new Datenbankzugriffe();
        instance.createHighscore(idNamePairs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentPlayerID method, of class Datenbankzugriffe.
     */
    @Test
    public void testGetCurrentPlayerID() {
        System.out.println("getCurrentPlayerID");
        Datenbankzugriffe instance = new Datenbankzugriffe();
        int expResult = 0;
        int result = instance.getCurrentPlayerID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of holeHighscore method, of class Datenbankzugriffe.
     */
    @Test
    public void testHoleHighscore() {
        System.out.println("holeHighscore");
        Datenbankzugriffe instance = new Datenbankzugriffe();
        List<IdNamePair> expResult = null;
        List<IdNamePair> result = instance.holeHighscore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHighscore method, of class Datenbankzugriffe.
     */
    @Test
    public void testGetHighscore() {
        System.out.println("getHighscore");
        Datenbankzugriffe instance = new Datenbankzugriffe();
        List<IdScorePair> expResult = null;
        List<IdScorePair> result = instance.getHighscore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Datenbankzugriffe.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Datenbankzugriffe instance = new Datenbankzugriffe();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPositions method, of class Datenbankzugriffe.
     */
    @Test
    public void testGetPositions() {
        System.out.println("getPositions");
        int id = 1;
        Datenbankzugriffe instance = new Datenbankzugriffe();        
        Queue<Schlangenteil> result = instance.getPositions(id);                
    }

    /**
     * Test of setPositions method, of class Datenbankzugriffe.
     */
    @Test
    public void testSetPositions() {
        System.out.println("setPositions");
        int id = 1;
        Queue<Schlangenteil> queue = new LinkedList<Schlangenteil>();
        queue.add(new Schlangenteil(20,20,1));
        queue.add(new Schlangenteil(21,20,2));
        queue.add(new Schlangenteil(22,20,3));
        queue.add(new Schlangenteil(23,20,4));
        queue.add(new Schlangenteil(24,20,5));        
        Datenbankzugriffe instance = new Datenbankzugriffe();
        instance.setPositions(id, queue);        
    }

    /**
     * Test of getCurrentPlayingGround method, of class Datenbankzugriffe.
     */
    @Test
    public void testGetCurrentPlayingGround() {
        System.out.println("getCurrentPlayingGround");
        int id = 0;
        Datenbankzugriffe instance = new Datenbankzugriffe();
        PlayingGround expResult = null;
        PlayingGround result = instance.getCurrentPlayingGround(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class Datenbankzugriffe.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Integer id = null;
        String richtung = "";
        Datenbankzugriffe instance = new Datenbankzugriffe();
        instance.move(id, richtung);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDirection method, of class Datenbankzugriffe.
     */
    @Test
    public void testGetDirection() {
        System.out.println("getDirection");
        int id = 1;
        Datenbankzugriffe instance = new Datenbankzugriffe();
        Facing expResult = Facing.DOWN;
        Facing result = instance.getDirection(id);
        assertEquals(expResult, result);        
    }


    /**
     * Test of getPlayingGround method, of class Datenbankzugriffe.
     */
    @Test
    public void testGetPlayingGround() {
        System.out.println("getPlayingGround");
        Datenbankzugriffe instance = new Datenbankzugriffe();
        PlayingGround expResult = null;
        PlayingGround result = instance.getPlayingGround();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentPlayingGround method, of class Datenbankzugriffe.
     */
    @Test
    public void testSetCurrentPlayingGround() {
        System.out.println("setCurrentPlayingGround");
        PlayingGround playingGround = null;
        Datenbankzugriffe instance = new Datenbankzugriffe();
        instance.setCurrentPlayingGround(playingGround);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentItems method, of class Datenbankzugriffe.
     */
    @Test
    public void testGetCurrentItems() {
        System.out.println("getCurrentItems");
        Datenbankzugriffe instance = new Datenbankzugriffe();
        List<Item> expResult = null;
        List<Item> result = instance.getCurrentItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentItems method, of class Datenbankzugriffe.
     */
    @Test
    public void testSetCurrentItems() {
        System.out.println("setCurrentItems");
        List<Item> item = null;
        Datenbankzugriffe instance = new Datenbankzugriffe();
        instance.setCurrentItems(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentPlayer method, of class Datenbankzugriffe.
     */
    @Test
    public void testSetCurrentPlayer() {
        System.out.println("setCurrentPlayer");
        Spieler spieler = null;
        Datenbankzugriffe instance = new Datenbankzugriffe();
        instance.setCurrentPlayer(spieler);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentPlayer method, of class Datenbankzugriffe.
     */
    @Test
    public void testGetCurrentPlayer() {
        System.out.println("getCurrentPlayer");
        Datenbankzugriffe instance = new Datenbankzugriffe();
        Spieler expResult = null;
        Spieler result = instance.getCurrentPlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHigscoreForPlayerID method, of class Datenbankzugriffe.
     */
    @Test
    public void testSetHigscoreForPlayerID() {
        System.out.println("setHigscoreForPlayerID");
        int id = 0;
        int Highscore = 0;
        Datenbankzugriffe instance = new Datenbankzugriffe();
        instance.setHigscoreForPlayerID(id, Highscore);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHigscoreForPlayerID method, of class Datenbankzugriffe.
     */
    @Test
    public void testGetHigscoreForPlayerID() {
        System.out.println("getHigscoreForPlayerID");
        int id = 0;
        Datenbankzugriffe instance = new Datenbankzugriffe();
        int expResult = 0;
        int result = instance.getHigscoreForPlayerID(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateRichtung method, of class Datenbankzugriffe.
     */
    @Test
    public void testUpdateRichtung() {
        System.out.println("updateRichtung");
        String richtung = "";
        Datenbankzugriffe instance = new Datenbankzugriffe();
        instance.updateRichtung(richtung);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testInitGame() {
        Datenbankzugriffe d = new Datenbankzugriffe();
        d.initGame(1);        
    }
    
}
