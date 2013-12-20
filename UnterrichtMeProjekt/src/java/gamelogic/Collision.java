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
                if (x == playingGround.getSnake().getPos().getX() && y == playingGround.getSnake().getPos().getY() && 
                    playingGround.getPlayingGroundPositionType(x, y) == PositionType.BORDER) {
                    //GAME ZU ENDE, false wird zurückgegeben
                    return false;
                }
                else{
                    if (x == playingGround.getSnake().getPos().getX() && y == playingGround.getSnake().getPos().getY() && 
                        playingGround.getPlayingGroundPositionType(x, y) == PositionType.SNAKETAIL) {
                        return false;
                    }
                    else{
                        if(x == playingGround.getSnake().getPos().getX() && y == playingGround.getSnake().getPos().getY() && 
                            playingGround.getPlayingGroundPositionType(x, y) == PositionType.ITEMNORMAL){
                            collisionEventItemNormal();
                        }
                        else{
                            if (x == playingGround.getSnake().getPos().getX() && y == playingGround.getSnake().getPos().getY() && 
                                playingGround.getPlayingGroundPositionType(x, y) == PositionType.ITEMSHORT) {
                                collisionEventItemShort();
                            }
                            else{
                                if (x == playingGround.getSnake().getPos().getX() && y == playingGround.getSnake().getPos().getY() && 
                                    playingGround.getPlayingGroundPositionType(x, y) == PositionType.ITEMFAST) {
                                    collisionEventItemFast();
                                }
                                else{
                                    return true;
                                }
                            }
                        }
                            
                                
                    }
                    
                }
                    
                playingGround.setPlayingGroundPositionType(x, y, playingGround.populateArrayAt(x, y, 
                        this.playingGround.playingGroundLength() -1,
                        this.playingGround.playingGround0Length()-1));
            }
        } 
        return false;
    }
    
    //Macht dies in der Item-Klasse mehr Sinn?
    private void collisionEventItemNormal(){
        playingGround.getSnake().move(true);
    }
    
    private void collisionEventItemFast(){
    
    }
    
    private void collisionEventItemShort(){
    
    }
    
}
