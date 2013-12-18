<<<<<<< HEAD
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

=======
>>>>>>> 779da78d512e244906ed942c979d65a3ba318e39
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
<<<<<<< HEAD
        this.stop = stop;
    }
=======
        this.stop = stop;        
    }
    
    
>>>>>>> 779da78d512e244906ed942c979d65a3ba318e39

    @Override
    public void run() {
        while (!stop) {
<<<<<<< HEAD
            System.out.println("Frohe Weihnachten!2");
        }
        interrupt();
    }



=======
            System.err.println("Frohe");
        }
        interrupt();
    }
    
>>>>>>> 779da78d512e244906ed942c979d65a3ba318e39
}
