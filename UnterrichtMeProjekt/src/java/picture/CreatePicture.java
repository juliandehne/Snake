package picture;

import ar.com.hjg.pngj.ImageInfo;
import ar.com.hjg.pngj.ImageLineHelper;
import ar.com.hjg.pngj.ImageLineInt;
import ar.com.hjg.pngj.PngWriter;
import gamelogic.PlayingGround;
import gamelogic.PositionType;
import static gamelogic.PositionType.BORDER;
import static gamelogic.PositionType.SNAKEHEAD;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Julian
 */
public class CreatePicture {

    static int PICTURE_SIZE = 400;

    /**
     * Erweiterung des Reloading Frameworks um in-memory-bilder
     * Julian Dehne
     * @param outputStream 
     */
    public synchronized void paintPicture(File outputStream) {
        try {
            paintPicture(new FileOutputStream(outputStream));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CreatePicture.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // das hier muss in die paintPictureMethode und dort als Datenbankzugriff implementiert werden
            //snake.setFacing(Task.facing);                        
//            snake.move(false);
//            boolean gameRunning = playingGround.update();
//            if (!gameRunning) {
//                //return;
//            }
    

    public synchronized void paintPicture(OutputStream outputStream) {
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
            if (col == 200) {
                ImageLineHelper.setPixelRGB8(iline, col, 100, 100, 100);

            } else {
                ImageLineHelper.setPixelRGB8(iline, col, c.getRed(), c.getGreen(), c.getBlue());
            }

        }
        // die Spalte wird in alle Zeilen geschrieben.
        for (int row = 0; row < png.imgInfo.rows; row++) {
            png.writeRow(iline);
        }
        ///////////////////////////////////////////
        png.end();

    }

    /**
     * Julian Dehne
     * Erweiterung des Reloading Frameworks um in-memory-bilder
     * @param outputStream
     * @param playingGroundArray 
     */
    public synchronized void paintPicture(File outputStream, PositionType[][] playingGroundArray) {
        try {
            paintPicture(new FileOutputStream(outputStream), playingGroundArray);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CreatePicture.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @author lenni
     */
    public static synchronized void paintPicture(OutputStream outputStream, PositionType[][] playingGroundArray) {

        PositionType[][] playingGround2DArray = Helpers.mapArray(playingGroundArray, PICTURE_SIZE);
        //PositionType[][] playingGround2DArray = playingGround.getPlayingGround();

        ImageInfo imi = new ImageInfo(PICTURE_SIZE, PICTURE_SIZE, 8, false); // 8 bits per channel, no alpha

        // open image for writing to a output stream
        PngWriter png = new PngWriter(outputStream, imi);

        ImageLineInt iline = new ImageLineInt(imi);
   for (int x = 0; x < playingGround2DArray.length; x++) {
            for (int y = 0; y < playingGround2DArray[0].length; y++) {
                ImageLineHelper.setPixelRGB8(iline, y,
                        playingGround2DArray[x][y].color.getRed(),
                        playingGround2DArray[x][y].color.getGreen(),
                        playingGround2DArray[x][y].color.getBlue());
            }
            png.writeRow(iline);
        }
     

        png.end();

    }

    public synchronized void copyPicture(File inputStream, File outputStream) throws IOException {
        FileUtils.copyFile(inputStream, outputStream);
    }
}
