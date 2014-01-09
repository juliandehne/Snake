package threadexample;

import database.MysqlConnect;

/**
 *
 * @author Julian Dehne
 */
public class Thread1 extends Thread {
    public Boolean stop;
    public MysqlConnect connect;
    public Thread1(Boolean stop) {
        this.stop = stop;    
        this.connect = new MysqlConnect();
    }
    
    

    @Override
    public void run() { 
        connect.connect();
        int i = 0;
        while (!stop) {
            System.err.println("Weihnachten");
            connect.otherStatements("use snake");
            connect.issueInsertOrDeleteStatement("insert into GEA (Weihnachten) values (?)", "weihnachten");
            
            i++;
        }
        connect.close();
        interrupt();
    }
    
}