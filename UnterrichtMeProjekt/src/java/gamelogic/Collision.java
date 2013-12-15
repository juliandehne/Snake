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
    
       Collision(PlayingGround aThis) {
        this.playingground = aThis;
    }
    
    
     /**
     * Hauptmehtode zur Logikbehandlung Design: um die Schlange zu updaten,
     * diese direkt verändern, folgende Methode merkt dies dann
     * @return returns whether the game still running (->Game Over)
     */
    public boolean update() {

        
        for (int x = 0; x < playingground.playingGround.length; x++) {
            for (int y = 0; y < playingground.playingGround[x].length; y++) {
                if (x == playingground.snake.getPos().getX() && y == playingground.snake.getPos().getY() && 
                    playingground.playingGround[x][y] == PositionType.BORDER) {
                    //GAME ZU ENDE, false wird zurückgegeben
                    return false;
                }
                else{
                    if (x == playingground.snake.getPos().getX() && y == playingground.snake.getPos().getY() && 
                        playingground.playingGround[x][y] == PositionType.SNAKETAIL) {
                        return false;
                    }
                    else{
                        if(x == playingground.snake.getPos().getX() && y == playingground.snake.getPos().getY() && 
                            playingground.playingGround[x][y] == PositionType.ITEMNORMAL){
                            collisionEventItemNormal();
                        }
                        else{
                            if (x == playingground.snake.getPos().getX() && y == playingground.snake.getPos().getY() && 
                                playingground.playingGround[x][y] == PositionType.ITEMSHORT) {
                                collisionEventItemShort();
                            }
                            else{
                                if (x == playingground.snake.getPos().getX() && y == playingground.snake.getPos().getY() && 
                                    playingground.playingGround[x][y] == PositionType.ITEMFAST) {
                                    collisionEventItemFast();
                                }
                                else{
                                    return true;
                                }
                            }
                        }
                            
                                
                    }
                    
                }
                    
                playingground.playingGround[x][y] = playingground.populateArrayAt(x, y, 
                        this.playingground.playingGround.length -1,
                        this.playingground.playingGround[x].length-1);
                //weitere logik behandlung (items usw...)...
            }
        } 
        return false;
    }
    
    //Macht dies in der Item-Klasse mehr Sinn?
    private void collisionEventItemNormal(){
        playingground.snake.move(true);
    }
    
    private void collisionEventItemFast(){
    
    }
    
    private void collisionEventItemShort(){
    
    }
    
}
