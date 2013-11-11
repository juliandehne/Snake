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
public class Snake {
    private Position pos;
    private int length;
    private Facing facing;
    
    public Snake(Position pos, int length, Facing facing) {
        this.pos = pos;
        this.length = length;
        this.facing = facing;
    } 
    
    public void move(int amountX, int amountY) {
        this.pos.setX(this.pos.getX() + amountX);
        this.pos.setY(this.pos.getY() + amountY);
    }
    
    public void changeDirection(Facing facing) {
        this.facing = facing;
    }
    
    public void changeLength(int amount) {
        this.length += amount;
    }
    
    
    
    //getter and setter
    
    public Position getPos() {
        return pos;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Facing getFacing() {
        return facing;
    }

    public void setFacing(Facing facing) {
        this.facing = facing;
    }

    
}
