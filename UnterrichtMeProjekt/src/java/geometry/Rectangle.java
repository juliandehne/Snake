/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

import java.awt.Polygon;

/**
 *
 * @author Julian
 */
public class Rectangle extends Polygon {

    public Rectangle(int[] xpoints, int[] ypoints, int npoints) {
        super(xpoints, ypoints, npoints);
    }

    public Rectangle(int x, int y, int width, int length) {
        int[] xs = new int[] {x, x+width};
        int[] ys = new int[] {y, y+length};
        super.addPoint(x, y);
        super.addPoint(x+width, y+length);        
    }
    
    
    
}
