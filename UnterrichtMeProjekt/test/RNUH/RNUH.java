/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package RNUH;

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
}
