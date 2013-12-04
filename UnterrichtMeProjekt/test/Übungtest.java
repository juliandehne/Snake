


/**
 *
 * @author Julian
 */
public class MysqlConnectTest {
    
    
    @Test
    public void testConnect() throws SQLException {
        System.out.println("connect");
        MysqlConnect instance = new MysqlConnect();
        instance.connect();
        instance.getConnection().createStatement().execute("drop table lehrer");
        instance.getConnection().createStatement().execute("create table lehrer (id INT, name varchar(1000))ENGINE=InnoDB DEFAULT CHARSET=utf8 ;");
        instance.close();
    }

    
}