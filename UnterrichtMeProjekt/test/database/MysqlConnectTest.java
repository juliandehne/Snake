/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.ResultSet;
import java.sql.SQLException;
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
public class MysqlConnectTest {
    
    public MysqlConnectTest() {
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
     * Test of connect method, of class MysqlConnect.
     */
    @Test
    public void testConnect() throws SQLException {
        System.out.println("connect");
        MysqlConnect instance = new MysqlConnect();
        instance.connect();        
        instance.getConnection().createStatement().execute("drop table lehrer");
        instance.getConnection().createStatement().execute("create table lehrer (id INT, name varchar(1000))ENGINE=InnoDB DEFAULT CHARSET=utf8 ;");
        instance.close();
    }

    @Test
    public void testWrap() throws SQLException {
        MysqlConnect m = new MysqlConnect();
        m.connect();
        int i = 5;
        final ResultSet rs = m.execute("select * from lehrer where id = ?;", i);                                
        m.close();
    }
}