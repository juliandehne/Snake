
import org.junit.Test;
import threadexample.Thread1;
import threadexample.Thread2;

/**
 *
 * @author Julian
 */
public class TestWeihnachten {

    public TestWeihnachten() {
    }

    @Test
    public void hello() throws InterruptedException {
        Thread1 thread1 = new Thread1(false);
        Thread2 thread2 = new Thread2(false);
        thread1.start();
        thread2.start();
                
        Thread.sleep(50000);
        thread1.stop = true;
        thread2.stop = true;
    }
}
