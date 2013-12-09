
package example;

/**
 * Diese ist eine Beispielklasse für Methoden und Funktionen
 * @author Julian
 */
public class Point {
    private Integer x;
    private Integer y;
    private Integer deltax = null;
    private Integer deltay = null;

    public Point(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }
    
    public void bewegeDichX(Integer delta) {
        this.deltax = delta;
        this.x += delta;
    }
    
    public void bewegeDichY(Integer delta) {
        this.deltay = delta;
        this.y += delta;
    }
    
    public Integer letzteBewegungX() {
        return this.deltax;
    }
    
}
