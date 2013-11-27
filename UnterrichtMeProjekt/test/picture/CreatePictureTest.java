package picture;

import java.io.File;
import logik.Snake;
import logik.Spielfeld;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Julian
 */
public class CreatePictureTest {
    
    public CreatePictureTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of paintPicture method, of class CreatePicture.
     */
    @Test
    public void testPaintPicture() {
        System.out.println("paintPicture");
        File outputStream = new File("/var/lib/tomcat6/webapps/ROOT/git/UnterrichtMe/UnterrichtMeProjekt/web/pics/spiel.png");
        CreatePicture instance = new CreatePicture();
        Spielfeld feld = new Spielfeld();
        Snake schlange = new Snake(feld);
        instance.paintPicture(outputStream, schlange);        
    }
}