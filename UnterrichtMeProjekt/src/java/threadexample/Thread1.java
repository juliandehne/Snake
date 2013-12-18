package threadexample;

/**
 *
 * @author Julian Dehne
 */
public class Thread1 extends Thread {
    public Boolean stop;

    public Thread1(Boolean stop) {
        this.stop = stop;        
    }
    
    

    @Override
    public void run() {
        while (!stop) {
            System.err.println("Weihnachten");
        }
        interrupt();
    }
    
}