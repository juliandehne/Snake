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
public class Thread1 extends Thread {
    public Boolean stop;

    public Thread1(Boolean stop) {
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
            System.out.println("Frohe Weihnachten!1");
        }
        interrupt();
    }



}
=======
            System.err.println("Weihnachten");
        }
        interrupt();
    }
    
}
>>>>>>> 779da78d512e244906ed942c979d65a3ba318e39
