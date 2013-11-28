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
import logik.Snake;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Julian
 */
public class CreatePicture {

    Snake snake;

    public synchronized void paintPicture(File outputStream, Snake snake) {
        this.snake = snake;

        ImageInfo imi = new ImageInfo(snake.getfeldlength(), snake.getfeld0length(), 8, false); // 8 bits per channel, no alpha
        // open image for writing to a output stream
        PngWriter png = new PngWriter(outputStream, imi);
        // add some optional metadata (chunks)      
        ImageLineInt iline = new ImageLineInt(imi);


        // hier könnt ihr das Bild verändern
        // TIPP: Befüllt einen Zweidimensionalen Array
        // und arbeitet diesen dann ab.
        // TIPP2: Ihr wollt am Ende mit Koordinaten Pixel setzen können!
        ///////////////////////////////////////////


        for (int row = 0; row < png.imgInfo.rows; row++) {
            for (int col = 0; col < imi.cols; col++) {
                
                for (int i = 0; i < snake.getfeldlength(); i++) {
                    for (int j = 0; j < snake.getfeld0length(); j++) {
                        
                        for (int z = 0; z < snake.getSchlangeSize(); z += 2) {
                            
                            int a = snake.getSchlange(z);
                            int b = snake.getSchlange(z + 1);
                            if ((i == a) && (j == b)) {
                                ImageLineHelper.setPixelRGB8(iline, col, 0, 255, 0);
                            } else {
                                ImageLineHelper.setPixelRGB8(iline, col, 255, 255, 255);
                            }
                        }
                    }
                }
            }
            png.writeRow(iline);
        }


      

        ///////////////////////////////////////////
        png.end();




    }

    
     public synchronized void paintPicture(File outputStream) {
        
     ImageInfo imi = new ImageInfo(400, 400, 8, false); // 8 bits per channel, no alpha
     // open image for writing to a output stream
     PngWriter png = new PngWriter(outputStream, imi);
     // add some optional metadata (chunks)      
     ImageLineInt iline = new ImageLineInt(imi);        
        
       
     // hier könnt ihr das Bild verändern
     // TIPP: Befüllt einen Zweidimensionalen Array
     // und arbeitet diesen dann ab.
     // TIPP2: Ihr wollt am Ende mit Koordinaten Pixel setzen können!
     ///////////////////////////////////////////
        
     int[][] spielfeld = new int[400][400];
        
     for (int i = 0; i < spielfeld.length; i++){
     for (int j = 0; j < spielfeld[0].length; j++){
     spielfeld[i][j]=0;
     }
     }  
         
        
     Random r = new Random();
     Color c = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
        
        
        
     
     // schreibt eine Spalte
             for (int col = 0; col < imi.cols; col++) {
                 if(col == 100){ 
                     ImageLineHelper.setPixelRGB8(iline, col, 0, 0, 0);
                 }
                 else{
                     ImageLineHelper.setPixelRGB8(iline, col, c.getRed(), c.getGreen(), c.getBlue());
                 }
             }
             // die Spalte wird in alle Zeilen geschrieben.
             for (int row = 0; row < png.imgInfo.rows; row++) {
                 if(row == 20){
                     
                 }
                 else{}
                 png.writeRow(iline);
             }
             
     /*
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
     */
    ///////////////////////////////////////////
        png.end();

     }
    public synchronized void copyPicture(File inputStream, File outputStream) throws IOException {
        FileUtils.copyFile(inputStream, outputStream);
    }
}
