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
    
    /**
     * Test of paintPicture method, of class CreatePicture.
     */
    @Test
    public void testPaintPicture() {
        System.out.println("paintPicture");
        File outputStream = new File("/var/lib/tomcat6/webapps/ROOT/git/UnterrichtMe/UnterrichtMeProjekt/web/pics/spiel.png");
        CreatePicture instance = new CreatePicture();
        instance.paintPicture(outputStream);        
    }
}