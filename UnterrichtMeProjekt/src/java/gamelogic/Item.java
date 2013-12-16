/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author norbert manderla
 */

package gamelogic;

import ar.com.hjg.pngj.ImageLineHelper;
import ar.com.hjg.pngj.ImageLineInt;
import java.awt.Color;
import java.util.Random;
/**
 *
 * @author manderla
 */
public class Item {
    private int Punkte = 2;
    private int posx;
    private int posy;
    private int länge;
    private int spawn;
    private int despawn;
    Random r = new Random();
    Color c = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
    
        
    public Item (int feldgroesseX, int feldgroesseY) {
        posx = rand(0, feldgroesseY);
        posy = rand(0, feldgroesseY);
    }

    public int getSpawn() {
        return spawn;
    }

    public void setSpawn(int spawn) {
        this.spawn = spawn;
    }

    public int getDespawn() {
        return despawn;
    }

    public void setDespawn(int despawn) {
        this.despawn = despawn;
    }

    
    public static int rand(int low, int high) {
	high++;
	return (int) (Math.random() * (high - low) + low);
    }

  // static int PICTURE_SIZE = 400;
    
    
    
    
    
    
    
    
        
    
    
    
    
    
  //ImageLineInt iline = new ImageLineInt(imi);

    //  Random r = new Random();
       //lor c = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
        //ageLineHelper.setPixelRGB8(100, 100, 100);
}
 