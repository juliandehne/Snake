/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gea;
import database.MysqlConnect;

/**
 *
 * @author vogelsang
 */
public class GEAThread extends Thread{
    public Boolean stop;
    public MysqlConnect instance;

    public GEAThread(Boolean stop) {
        this.stop = stop;
    }



    @Override
    public void run() {
        instance = new MysqlConnect();
        instance.connect();
        while (!stop) {
            instance.otherStatements("use snake");
            instance.issueInsertOrDeleteStatement("insert into GEA (Weihnachten) values (?)", "Frohe Weihnachten");
        }
        interrupt();
        instance.close();
    }
}
