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

        instance.getConnection().createStatement().execute("drop database test");

    }

    /**
     * Test of connect method, of class MysqlHelper.
     */
    @Test
    public void beispiel() throws SQLException {        
        instance.getConnection().createStatement().execute("create table lehrer (id INT, name varchar(1000))ENGINE=InnoDB DEFAULT CHARSET=utf8 ;");
        instance.getConnection().createStatement().execute("drop table lehrer");
    }

    /**
     * Erstelle eine Datenbanktabelle für jedes Objekt, welches ihr speichern
     * wollt. Zum Beispiel Schlange, Spielfeld, Position der Schlangen, Richtung
     * der Schlangenbewegung...
     *
     * Mit Rechtsclick -> Test File könnt ihr die Tests ausführen lassen
     * Vergleiche Beispiel oben
     * 
     * @throws SQLException
     */
    @Test
    public void aufgabe1() throws SQLException {
        instance.getConnection().createStatement().execute("create table positionschlange (id INT, x INT, y INT)ENGINE=InnoDB DEFAULT CHARSET=utf8 ;");
        instance.getConnection().createStatement().execute("drop table positionschlange");
        instance.getConnection().createStatement().execute("create table richtungschlangenbewegung (id INT, richtung VARCHAR(1))ENGINE=InnoDB DEFAULT CHARSET=utf8 ;");
        instance.getConnection().createStatement().execute("drop table richtungschlangenbewegung");
        instance.getConnection().createStatement().execute("create table schlangenzustand (id INT, laenge INT, geschwindigkeit INT)ENGINE=InnoDB DEFAULT CHARSET=utf8 ;");
        instance.getConnection().createStatement().execute("drop table schlangenzustand");
        instance.getConnection().createStatement().execute("create table score (id INT, punkte INT)ENGINE=InnoDB DEFAULT CHARSET=utf8 ;");
        instance.getConnection().createStatement().execute("drop table score");
        instance.getConnection().createStatement().execute("create table spieler (id INT, username VARCHAR(50), uservorname VARCHAR(50))ENGINE=InnoDB DEFAULT CHARSET=utf8 ;");
        instance.getConnection().createStatement().execute("drop table spieler");
        instance.getConnection().createStatement().execute("create table spielfeld (id INT, xkoordinate BOOLEAN, ykoordinate BOOLEAN)ENGINE=InnoDB DEFAULT CHARSET=utf8 ;");
        instance.getConnection().createStatement().execute("drop table spielfeld");
    }
}