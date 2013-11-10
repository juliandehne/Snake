/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gamelogic;

/**
 *
 * @author lenni
 */
public class PlayingGround {
    private final Snake snake;
    private final PositionType[][] playingGround;

    public PlayingGround(int sizeX, int sizeY, Snake snake) {
        this.playingGround = new PositionType[sizeX][sizeY];
        this.snake = snake;
        
        for (int x = 0; x < this.playingGround.length; x++) {
            for (int y = 0; y < this.playingGround[x].length; y++) {
                if (x == 0 || x == this.playingGround.length-1 || y == 0 || y == this.playingGround[x].length-1) {
                    playingGround[x][y] = PositionType.BORDER;
                } else {
                    playingGround[x][y] = PositionType.EMPTY;
                }
            }
        }
        
        this.update();
    }
    
    /**
     * Hauptmehtode zur Logikbehandlung
     * Design: um die Schlange zu updaten, diese direkt verändern, diese Methode merkt dies dann
     */   
    public void update() {
        
        // hier fehlt die logik zum schweif der schlange. da dieser ja auch geknickt sein kann.
        int[][] snakeOccupiedXY = new int[2][2];
        
        for (int x = 0; x < this.playingGround.length; x++) {
            for (int y = 0; y < this.playingGround[x].length; y++) {
                
                //Schlangenkopf
                if (x == snake.getPos().getX() && y == snake.getPos().getY()) {
                    playingGround[x][y] = PositionType.SNAKEHEAD;
                }
                //weitere logik behandlung (items usw...)...
            }
        }
    }

    
    
    //getter and setter
    public Snake getSnake() {
        return snake;
    }

    public PositionType[][] getPlayingGround() {
        return playingGround;
    }
}
