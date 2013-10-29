package picture;

import ar.com.hjg.pngj.ImageInfo;
import ar.com.hjg.pngj.ImageLineHelper;
import ar.com.hjg.pngj.ImageLineInt;
import ar.com.hjg.pngj.PngWriter;
import ar.com.hjg.pngj.chunks.PngChunkTextVar;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Julian
 */
public class CreatePicture {

    public void paintPicture(File outputStream) {
        ImageInfo imi = new ImageInfo(400, 400, 8, false); // 8 bits per channel, no alpha
        // open image for writing to a output stream
        PngWriter png = new PngWriter(outputStream, imi);
        // add some optional metadata (chunks)      
        ImageLineInt iline = new ImageLineInt(imi);
        for (int col = 0; col < imi.cols; col++) { // this line will be written to all rows
            Random random = new Random();
            int r = random.nextInt(255);
//            int r = 255;
            int g = random.nextInt(255);
            int b = 255 * col / imi.cols;
            ImageLineHelper.setPixelRGB8(iline, col, r, g, b); // orange-ish gradient
        }
        for (int row = 0; row < png.imgInfo.rows; row++) {
            png.writeRow(iline);
        }
        png.end();

    }

    public void copyPicture(File inputStream, File outputStream) throws IOException {
        FileUtils.copyFile(inputStream, outputStream);        
    }
}
