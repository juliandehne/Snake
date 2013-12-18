/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package RNUH;

/**
 *
 * @author weichert
 */
public class Thread2 extends Thread {
    public Boolean stop;

    public Thread2(Boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        while (!stop) {
            System.out.println("Frohe Weihnachten!2");
        }
        interrupt();
    }



}
