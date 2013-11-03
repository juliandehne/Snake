/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Window;
import javax.servlet.http.HttpSessionBindingEvent;
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
public class TaskTest {
    
    public TaskTest() {
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
     * Test of run method, of class Task.
     */
    @Test
    public void testRun() {
        System.out.println("run");
                        
        Task instance = new Task();
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueBound method, of class Task.
     */
    @Test
    public void testValueBound() {
        System.out.println("valueBound");
        HttpSessionBindingEvent event = null;
        Task instance = new Task();
        instance.valueBound(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueUnbound method, of class Task.
     */
    @Test
    public void testValueUnbound() {
        System.out.println("valueUnbound");
        HttpSessionBindingEvent event = null;
        Task instance = new Task();
        instance.valueUnbound(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}