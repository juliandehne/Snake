/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgaben.datenbankgruppe;

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
 * @author jdehne
 */
public class Aufgabe2 {
    
    private static MysqlConnect instance;
    private static Connection conn;

    public Aufgabe2() {
    }

    @BeforeClass
    public static void setUpClass() throws SQLException {
        System.out.println("connect");
        instance = new MysqlConnect();
        // hier die richtige Datenbankverbindung auswählen
        //conn = DriverManager.getConnection("jdbc:mysql://localhost/mydb?user=root&password=voyager");
        conn = DriverManager.getConnection("jdbc:mydb://10.25.25.155/mysql?user=schueler&password=schueler");
        instance.setConnection(conn);
        instance.connect();
    }

    @AfterClass
    public static void tearDownClass() {
        instance.close();
    }
    
    @Before
    public void setUp() throws SQLException {    
        instance.getConnection().createStatement().execute("use mydb");
    }


    /**
     * Schaut euch die Klasse ../test/database/MysqlConnectTest an. Führt auf
     * eurer TestTabelle folgende Operationen von Java-Seite her aus. INSERT
     * UPDATE DELETE
     */
    @Test
    public void aufgabe2() throws SQLException {
        instance.getConnection().createStatement().execute("create table TestTabelle (id INT, name varchar(1000))ENGINE=InnoDB DEFAULT CHARSET=utf8 ;");
        instance.getConnection().createStatement().execute("INSERT INTO TestTabelle (id) VALUES (5);");
        instance.getConnection().createStatement().execute("UPDATE TestTabelle SET id = 6 WHERE id = 5;");
        instance.getConnection().createStatement().execute("DELETE FROM tabelle TestTabelle WHERE id = 6;");
        instance.getConnection().createStatement().execute("drop table TestTabelle;");
    }
}
