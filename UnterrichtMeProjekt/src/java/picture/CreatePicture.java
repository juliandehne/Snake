package picture;

import ar.com.hjg.pngj.ImageInfo;
import ar.com.hjg.pngj.ImageLineHelper;
import ar.com.hjg.pngj.ImageLineInt;
import ar.com.hjg.pngj.PngWriter;
import ar.com.hjg.pngj.chunks.PngChunkTextVar;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;


/**
 *
 * @author Julian
 */
public class CreatePicture {

    
    public synchronized void paintPicture(File outputStream) {
        ImageInfo imi = new ImageInfo(400, 400, 8, false); // 8 bits per channel, no alpha
        // open image for writing to a output stream
        PngWriter png = new PngWriter(outputStream, imi);
   
            
        
        // hier könnt ihr das Bild verändern
        // TIPP: Befüllt einen Zweidimensionalen Array
        // und arbeitet diesen dann ab.
        // TIPP2: Ihr wollt am Ende mit Koordinaten Pixel setzen können!
        ///////////////////////////////////////////
        
        ImageLineInt iline = new ImageLineInt(imi);  // eine Zeile 
        
        Random r = new Random();
        Color c = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
        
        // schreibt eine Spalte
        for (int col = 0; col < imi.cols; col++) {
            ImageLineHelper.setPixelRGB8(iline, col, c.getRed(), c.getGreen(), c.getBlue());
        }
        // die Spalte wird in alle Zeilen geschrieben.
        for (int row = 0; row < png.imgInfo.rows; row++) {
            png.writeRow(iline);
        }        
        ///////////////////////////////////////////
        png.end();

    }

    public synchronized void copyPicture(File inputStream, File outputStream) throws IOException {
        FileUtils.copyFile(inputStream, outputStream);
    }
}
