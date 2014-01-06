package KLCF;


import database.MysqlConnect;

/**
 *
 * @author Julian Dehne
 */
public class Thread2 extends Thread {
    public Boolean stop;

    public Thread2(Boolean stop) {
        this.stop = stop;        
    }
    
    

    @Override
    public void run() {
        MysqlConnect instance = new MysqlConnect();
        instance.connect();
        instance.otherStatements("use snake;");
        Integer v=1;
        //instance.issueInsertOrDeleteStatement("insert into klcf (id,fw) values (?,?)", "i", "Frohe Weihnachten");    
        while (!stop) {
            instance.issueInsertOrDeleteStatement("insert into klcf (id,fw2) values (?, ?)", v, "Frohe Weihnachten");
            v=v++;
        }
        interrupt();
    }
    
}