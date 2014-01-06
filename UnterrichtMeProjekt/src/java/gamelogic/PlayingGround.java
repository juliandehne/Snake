
package gamelogic;

/**
 *
 * @author lenni
 */
public class PlayingGround {

    public final Snake snake;
    public final PositionType[][] playingGround;

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
        if (x == snake.getPos().getX() && y == snake.getPos().getY()) {
            return PositionType.SNAKEHEAD;
        }
        if (x == 0 || x == maxX || y == 0 || y == maxY) {
            return PositionType.BORDER;
        }

        for (Position p : snake.getSnakePositions()) {
            if (p.getX() == x && p.getY() == y) {
                return PositionType.SNAKETAIL;
            }
        }
        return PositionType.EMPTY;
    }

    //getter and setter
    public Snake getSnake() {
        return snake;
    }

    public PositionType[][] getPlayingGround() {
        return playingGround;
    }
    
    public PositionType getPositiontype(int x, int y){
        return playingGround[x][y];
    }
    
    public void setPositiontype(int x, int y, PositionType positiontype){
        playingGround[x][y] = positiontype;
    }
    
    public int playingGround0Length() {
        return playingGround[0].length;
    }
    
    public int playingGroundLength() {
        return playingGround.length;
    }

    @Override
    public String toString() {
        String result = "";
        for (PositionType[] positionTypes : playingGround) { 
            result+="\n";
            for (PositionType positionType : positionTypes) {
                if (positionType.equals(PositionType.SNAKETAIL)) {
                    result+="+";
                } else {
                    result+="-";
                }
            }
        }
        return result;
    }
    
    
    
    
}

