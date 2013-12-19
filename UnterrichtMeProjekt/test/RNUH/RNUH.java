/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package RNUH;


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

//    @BeforeClass
//    public static void setUpClass() throws SQLException {
//        System.out.println("connect");
//        instance = new MysqlConnect();
//        // hier die richtige Datenbankverbindung auswählen
//        //conn = DriverManager.getConnection("jdbc:mysql://localhost/mydb?user=root&password=voyager");
//        conn = DriverManager.getConnection("jdbc:mydb://10.25.25.155/mysql?user=schueler&password=schueler");
//        instance.setConnection(conn);
//        instance.connect();
//    }
//
//    @AfterClass
//    public static void tearDownClass() {
//        instance.close();
//    }
//
//    @Before
//    public void setUp() throws SQLException {
//        instance.getConnection().createStatement().execute("use mydb");
//    }


    /**
     * Schaut euch die Klasse ../test/database/MysqlConnectTest an. Führt auf
     * eurer TestTabelle folgende Operationen von Java-Seite her aus. INSERT
     * UPDATE DELETE
     */

    @Test
    public void rnuh() throws SQLException, InterruptedException {
        System.out.println("connect");
        MysqlConnect instance = new MysqlConnect();
        // Verbindung erstellen
        //instance.connect();
        instance.connect(); // bite auskommentieren
        instance.otherStatements("use snake");
//        instance.otherStatements("drop RNUH;");
        instance.issueInsertOrDeleteStatement("create table RNUH (id int, name varchar(25))ENGINE=InnoDB DEFAULT CHARSET=utf8 ;");
        Thread1 thread1 = new Thread1(false, instance);
        Thread2 thread2 = new Thread2(false, instance);
        thread1.start();
        thread2.start();
                
        Thread.sleep(300000);
        thread1.stop = true;
        thread2.stop = true;
    }

    

}
