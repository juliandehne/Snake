/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;
import database.MysqlConnect;
import java.sql.SQLException;

/**
 *
 * @author lenni
 */
public class MySqlSocket {
    private MysqlConnect connector;

    public MySqlSocket() {
        this.connector = new MysqlConnect();
        //this.connector.connect("jdbc:mysql://localhost/mydb?user=schueler&password=schueler");
    }
    
    public int[] getSnakePos(String playerID) throws SQLException{
        this.connector.execute("SELECT * FROM table_pos WHERE id ==" + playerID);
        
        return null;
    }
    
    
}
