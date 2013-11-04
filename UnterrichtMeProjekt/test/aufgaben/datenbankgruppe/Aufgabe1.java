package aufgaben.datenbankgruppe;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import database.MysqlConnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Julian
 */
public class Aufgabe1 {

    private static MysqlConnect instance;
    private static Connection conn;

    public Aufgabe1() {
    }

    @BeforeClass
    public static void setUpClass() throws SQLException {
        System.out.println("connect");
        instance = new MysqlConnect();
        // hier die richtige Datenbankverbindung auswählen
        conn = DriverManager.getConnection("jdbc:mysql://localhost/mydb?user=root&password=voyager");
        //conn = DriverManager.getConnection("jdbc:mysql://10.25.25.155/mydb?user=schueler&password=schueler");
        instance.setConnection(conn);                
        instance.connect();
    }

    @AfterClass
    public static void tearDownClass() {
        instance.close();
    }

    @Before
    public void setUp() throws SQLException {
        instance.getConnection().createStatement().execute("create database test");
        instance.getConnection().createStatement().execute("use test");
    }

    @After
    public void tearDown() throws SQLException {

        instance.getConnection().createStatement().execute("drop test");

    }

    /**
     * Test of connect method, of class MysqlHelper.
     */
    @Test
    public void beispiel() throws SQLException {
        instance.getConnection().createStatement().execute("drop table lehrer");
        instance.getConnection().createStatement().execute("create table lehrer (id INT, name varchar(1000))ENGINE=InnoDB DEFAULT CHARSET=utf8 ;");
    }

    /**
     * Erstelle eine Datenbanktabelle für jedes Objekt, welches ihr speichern
     * wollt. Zum Beispiel Schlange, Spielfeld, Position der Schlangen, Richtung
     * der Schlangenbewegung...
     *
     * @throws SQLException
     */
    @Test
    public void aufgabe1() throws SQLException {
    }
}