package gamelogic;

/**
 *
 * @author lenni
 */
public class Position {
    private int x;
    private int y;

    /**
     *
     * @param x x-Value
     * @param y y-Value
     */
    public Position(int x,int y){
        this.x = x;
        this.y = y;
    }
    
    
    //some helpers
    
    public int[] getXYArr() {
        int[] xyVals = new int[2];
        xyVals[0] = this.x;
        xyVals[1] = this.y;
        return xyVals;
    }
    
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    
    //simple getter and setters
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Position: " + this.x + " " + this.y;
    }

    
}
