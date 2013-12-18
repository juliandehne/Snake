/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package RNUH;

<<<<<<< HEAD
import org.junit.Test;


/**
 *
 * @author weichert
 */
public class RNUH {

    public RNUH() {
    }

    @Test
    public void rnuh() throws InterruptedException{
        Thread1 thread1 = new Thread1(false);
        Thread2 thread2 = new Thread2(false);

        thread1.start();
        thread2.start();

        Thread.sleep(300000);
        thread1.stop = true;
        thread2.stop = true;

    }
=======
/**
 *
 * @author yilmaz
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
public class RNUH {

    private static MysqlConnect instance;
    private static Connection conn;

    public RNUH () {
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
        System.out.println("connect");
        MysqlConnect instance = new MysqlConnect();
        // Verbindung erstellen
        //instance.connect();
        instance.connect(); // bite auskommentieren
        instance.issueInsertOrDeleteStatement("create table RNUH (id , username varchar(100), uservorname varchar(100))ENGINE=InnoDB DEFAULT CHARSET=utf8 ;");
        instance.issueInsertOrDeleteStatement("insert into spieler (id,username,uservorname) values(?,?,? )", 5,"dummyb1","bsp1");
        instance.issueInsertOrDeleteStatement("insert into spieler (id,username,uservorname) values(?,?,? )", 6,"dummyb2","bsp2");
        instance.issueInsertOrDeleteStatement("insert into spieler (id,username,uservorname) values(?,?,? )", 7,"dummyb3","bsp3");
        instance.issueUpdateStatement("update spieler set uservorname = ? where id = ?", "bsp4", 5);
        instance.issueInsertOrDeleteStatement("delete from spieler where id = ?", 6);
    }

>>>>>>> 779da78d512e244906ed942c979d65a3ba318e39
}
