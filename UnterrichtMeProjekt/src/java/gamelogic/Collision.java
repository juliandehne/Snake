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
    
    PlayingGround playingGround;
    
       Collision(PlayingGround aThis) {
        this.playingGround = aThis;
    }
    
    
     /**
     * Hauptmehtode zur Logikbehandlung Design: um die Schlange zu updaten,
     * diese direkt verändern, folgende Methode merkt dies dann
     * @return returns whether the game still running (->Game Over)
     */
    public boolean update() {

        
        for (int x = 0; x < playingGround.playingGroundLength(); x++) {
            for (int y = 0; y < playingGround.playingGround0Length(); y++) {
                if (comparePositionsXY(x, y) && playingGround.getPositiontype(x, y) == PositionType.BORDER) {
                    //GAME ZU ENDE, false wird zurückgegeben
                    return false;
                }
                else{
                    if (comparePositionsXY(x, y) && playingGround.getPositiontype(x, y) == PositionType.SNAKETAIL) {
                        return false;
                    }
                    else{
                        if(comparePositionsXY(x, y) && playingGround.getPositiontype(x, y) == PositionType.ITEMNORMAL){
                            collisionEventItemNormal();
                        }
                        else{
                            if (comparePositionsXY(x, y) && playingGround.getPositiontype(x, y) == PositionType.ITEMSHORT) {
                                collisionEventItemShort();
                            }
                            else{
                                if (comparePositionsXY(x, y) && playingGround.getPositiontype(x, y) == PositionType.ITEMFAST) {
                                    collisionEventItemFast();
                                }
                                else{
                                    return true;
                                }
                            }
                        }
                            
                                
                    }
                    
                }
                    
                playingGround.setPositiontype(x, y, 
                                              playingGround.populateArrayAt(x, y, 
                                              this.playingGround.playingGround0Length() -1, 
                                              this.playingGround.playingGround0Length()));
                //weitere logik behandlung (items usw...)...
            }
        } 
        return false;
    }
    
    private boolean comparePositionsXY(int x, int y){
        if(x == playingGround.getSnake().getPos().getX() && y == playingGround.getSnake().getPos().getY()){
            return true;
        }
        else{
            return false;
        }
    }
    
    //Macht dies in der Item-Klasse mehr Sinn?
    private void collisionEventItemNormal(){
        playingGround.snake.move(true);
    }
    
    private void collisionEventItemFast(){
    
    }
    
    private void collisionEventItemShort(){
    
    }
    
}
