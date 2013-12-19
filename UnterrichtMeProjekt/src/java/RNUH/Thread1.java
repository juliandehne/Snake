
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package RNUH;

import database.MysqlConnect;

/**
 *

 * @author weichert

 */
public class Thread1 extends Thread {
    public Boolean stop;
    private MysqlConnect instance;

    public Thread1(Boolean stop, MysqlConnect instance) {
        this.stop = stop; 
        this.instance = instance;
    }


    @Override
    public void run() {
        while (!stop) {

            instance.issueInsertOrDeleteStatement("insert into RNUH (name) values(?)", "Frohe Weihnachten");
        }
        interrupt();
    }


}

