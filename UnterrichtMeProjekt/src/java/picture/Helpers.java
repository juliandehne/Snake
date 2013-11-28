/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package picture;

import gamelogic.PositionType;

/**
 *
 * @author lenni
 */
public class Helpers {
    
    public static synchronized PositionType[][] mapArray(PositionType[][] input, int  outputSize) {
        PositionType output[][] = new PositionType[outputSize][outputSize];
        for (int x = 0; x < output.length; x++) {
            for (int y = 0; y < output.length; y++) {
                int xVal = map(x,0,output.length,0,input.length);
                int yVal = map(y,0,output.length,0,input.length);
                output[x][y] = input[xVal][yVal];
            }
        }
        return output;
    }
    
    //schamlos geklaut von http://arduino.cc/de/Reference/Map 
    public static synchronized int map(int x, int in_min, int in_max, int out_min, int out_max) {
          return (x - in_min) * (out_max - out_min) / (in_max - in_min) + out_min;
    }
    
}
