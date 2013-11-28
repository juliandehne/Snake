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
    }
}
