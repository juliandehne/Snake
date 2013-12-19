package gea;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import gea.GEAThread;

/**
 *
 * @author vogelsang
 */
public class GEATest {
        public GEATest() {
    }

    public void hello(){
        GEAThread thread1 = new GEAThread(false);
        GEAThread thread2 = new GEAThread(false);
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        thread2.start();

        try {
        Thread.sleep(100);
        } catch (Exception e) {
        }
        thread1.stop = true;
        thread2.stop = true;
    }


}
