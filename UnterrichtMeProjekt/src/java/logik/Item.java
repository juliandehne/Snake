/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logik;

import java.util.Random;

/**
 *
 * @author krah
 */
class Item {
    protected int x;
    protected int y;
    public int punkte;
    public int zeit;
    public int pause;
    public Item(int x, int y){
        this.x = random();
        this.y = random();
    } 
    
    public int random() {
        Random r = new Random();
        return r;
    }
        
}


    
