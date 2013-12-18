
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package RNUH;


/**
 *
<<<<<<< HEAD
 * @author weichert
=======
 * @author Julian Dehne
>>>>>>> 779da78d512e244906ed942c979d65a3ba318e39
 */
public class Thread2 extends Thread {
    public Boolean stop;

    public Thread2(Boolean stop) {

        this.stop = stop;        
    }
    
    


    @Override
    public void run() {
        while (!stop) {
            for(int i = 1; i >= 0; i+=2){
                for(int j = 0; j >= 0; j+=2){
                    RNUH.RNUH();
                }
            }
            
        }
        interrupt();
    }

}
