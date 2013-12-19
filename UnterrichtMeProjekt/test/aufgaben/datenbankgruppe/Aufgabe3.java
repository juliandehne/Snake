/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aufgaben.datenbankgruppe;

import database.Datenbankzugriffe;
import database.IdNamePair;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Julian
 */
public class Aufgabe3 {
    
    public Aufgabe3() {
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
     * Test of erstelleHighScore method, of class Datenbankzugriffe.
     */
    @Test
    public void testErstelleHighScore() {        
        Datenbankzugriffe instance = new Datenbankzugriffe();
        List<IdNamePair> idNamePairs = new ArrayList<IdNamePair>();
        idNamePairs.add(new IdNamePair(22, "Julian"));
        idNamePairs.add(new IdNamePair(44, "jojojo"));
        instance.erstelleHighScore(idNamePairs);        
    }

    /**
     * Test of holeHighscore method, of class Datenbankzugriffe.
     */
    @Test
    public void testHoleHighscore() {
        System.out.println("holeHighscore");
        Datenbankzugriffe instance = new Datenbankzugriffe();
        List<IdNamePair> idNamePairs = new ArrayList<IdNamePair>();
        idNamePairs.add(new IdNamePair(22, "Julian"));
        idNamePairs.add(new IdNamePair(44, "jojojo"));
        List<IdNamePair> expResult = idNamePairs;
        List<IdNamePair> result = instance.holeHighscore();
        assertEquals(expResult, result);  
    }
    
}
