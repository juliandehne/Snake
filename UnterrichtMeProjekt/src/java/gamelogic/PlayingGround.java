package gamelogic;

import java.util.Queue;

/**
 *
 * @author lenni
 */
public class PlayingGround {

    public final Snake snake;
    public final PositionType[][] playingGround;
    private Queue<Position> positions;
    private Position firstPosition;

    public PlayingGround(int sizeX, int sizeY, Snake snake) {
        this.playingGround = new PositionType[sizeX][sizeY];
        this.snake = snake;
        this.update();
    }

    /**
     * Hauptmehtode zur Logikbehandlung Design: um die Schlange zu updaten,
     * diese direkt verändern, folgende Methode merkt dies dann
     * @return returns whether the game still running (->Game Over)
     */
    public boolean update() {

        for (int x = 0; x < this.playingGround.length; x++) {
            for (int y = 0; y < this.playingGround[x].length; y++) {
                if (x == snake.getPos().getX() && y == snake.getPos().getY() && 
                    playingGround[x][y] == PositionType.BORDER) {
                    //GAME ZU ENDE, false wird zurückgegeben
                    return false;
                }
                playingGround[x][y] = populateArrayAt(x, y, 
                        this.playingGround.length -1,
                        this.playingGround[x].length-1);
                //weitere logik behandlung (items usw...)...
            }
        }
        
        
        
        return true;
        
    }

    /**
     *
     * @param x xValue of Position in Array
     * @param y yValue of Position in Array
     * @param maxX lengthOfArray
     * @param maxY lengthOfArray
     * @return returns the value which should be written at the position x,y
     */
    public PositionType populateArrayAt(int x, int y, int maxX, int maxY) {

        if (x == 0 || x == maxX-1 || y == 0 || y == maxY-1) {
            return PositionType.BORDER;
        }    
                
//        if (!positions.isEmpty()) {
//        positions = snake.getSnakePositions();
//        firstPosition = positions.poll();
//        if (firstPosition.getX() == x && firstPosition.getY() == y) {
//            return PositionType.SNAKEHEAD;
//        }
        
        boolean ishead = true;
        
        for (Position p : snake.getSnakePositions()) {            
            if (ishead && p.getX() == x && p.getY() == y) {                
                ishead = false;
                return PositionType.SNAKEHEAD;
            }  else if (!ishead && p.getX() == x && p.getY() == y) {
                return PositionType.SNAKETAIL;
            }                         
        }
//        }
        return PositionType.EMPTY;
    }

    //getter and setter
    public Snake getSnake() {
        return snake;
    }

    public PositionType[][] getPlayingGround() {
        return playingGround;
    }
    
    public int getPlayingGroundLength(){
        return playingGround.length;
    }
    
    public int getPlayingGround0Length(){
        return playingGround[0].length;
    }

    @Override
    public String toString() {
        String result = "";
        for (PositionType[] positionTypes : playingGround) { 
            result+="\n";
            for (PositionType positionType : positionTypes) {
                if (positionType.equals(PositionType.SNAKETAIL)) {
                    result+="+";
                } 
                if (positionType.equals(PositionType.SNAKEHEAD)) {
                    result+="X";
                }
                if (positionType.equals(PositionType.BORDER)) {
                    result+="#";
                } 
                else {
                    result+="-";
                }
            }
        }
        return result;
    }
    
    
    
    
}
