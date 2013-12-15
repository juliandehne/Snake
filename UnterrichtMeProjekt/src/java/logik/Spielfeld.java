/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logik;

import java.util.ArrayList;

/**
 *
 * @author weichert
 */
public class Spielfeld {
    int[][] feld = new int[400][400];
    
    
    public Spielfeld(){
        // das Spielfeld muss nicht mit 0 initialisiert werden, da
        // alle Werte breits mit null belegt sind
        Snake schlange = new Snake(this);
        for(int i = 0; i < feld.length; i++){
            for(int j = 0; j < feld[0].length; j++){
                feld[i][j]= 0;
            }
        }
       
    }
    
    public int getfeldlength(){
        return feld.length;
    }
    public int getfeld0length(){
        return feld[0].length;
    }
    public int getfeld(int x, int y){
        return feld[x][y];    
    }
    
}
