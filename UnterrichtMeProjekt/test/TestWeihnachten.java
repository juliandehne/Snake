
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import KLCF.Thread1;
import KLCF.Thread2; 

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
                
        Thread.sleep(300000);
        thread1.stop = true;
        thread2.stop = true;
    }
}
