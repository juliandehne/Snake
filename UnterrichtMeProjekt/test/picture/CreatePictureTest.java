package picture;

import java.io.File;
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
        File outputStream = new File("./web/pics/test.png");
        CreatePicture instance = new CreatePicture();
        instance.paintPicture(outputStream);        
    }
}