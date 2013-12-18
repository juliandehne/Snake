package RNUH;

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
        while (!stop) {
            System.err.println("Frohe");
        }
        interrupt();
    }
    
}
