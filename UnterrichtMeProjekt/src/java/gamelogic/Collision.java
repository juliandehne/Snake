/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelogic;

/**
 *
 * @author René Weichert
 */
public class Collision {
    PlayingGround playingground;
    public Collision(){
        
        
        
     
    
    }

    Collision(PlayingGround aThis) {
        this.playingground = aThis;
    }
    
    
     /**
     * Hauptmehtode zur Logikbehandlung Design: um die Schlange zu updaten,
     * diese direkt verändern, folgende Methode merkt dies dann
     * @return returns whether the game still running (->Game Over)
     */
    public boolean update() {

        
        for (int x = 0; x < playingground.length; x++) {
            for (int y = 0; y < playingground.playingGround[x].length; y++) {
                if (x == playingground.snake.getPos().getX() && y == snake.getPos().getY() && 
                    playingGround[x][y] == PositionType.BORDER) {
                    //GAME ZU ENDE, false wird zurückgegeben
                    return false;
                }
                //Erweiterung durch René Weichert
                else{
                    if (x == snake.getPos().getX() && y == snake.getPos().getY() && 
                        playingGround[x][y] == PositionType.SNAKETAIL) {
                        return false;
                    }
                    else{
                        if(x == snake.getPos().getX() && y == snake.getPos().getY() && 
                            playingGround[x][y] == PositionType.ITEMNORMAL){
                            
                        }
                        else{
                            if (x == snake.getPos().getX() && y == snake.getPos().getY() && 
                                playingGround[x][y] == PositionType.ITEMSHORT) {
                                
                            }
                            else{
                                if (x == snake.getPos().getX() && y == snake.getPos().getY() && 
                                    playingGround[x][y] == PositionType.ITEMFAST) {
                                    
                                }
                                else{
                                    return true;
                                }
                            }
                        }
                            
                                
                    }
                    
                }
                    
                playingGround[x][y] = populateArrayAt(x, y, 
                        this.playingGround.length -1,
                        this.playingGround[x].length-1);
                //weitere logik behandlung (items usw...)...
            }
        } 
        return false;
    }
}
