package gamelogic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author lenni
 */
public class Snake {

    private Facing facing;
    private Queue<Position> snakePositions;

    public Snake(Facing facing, Queue<Position> snakePositions) {
        this.facing = facing;
        this.snakePositions = snakePositions;
        /*
        this.snakePositions = new ArrayList<Position>();
        for (int i = 0; i < length; i++) {
            this.snakePositions.add(new Position(this.pos.getX(), this.pos.getY() + i));
        }
        */
    }
    
    
    

    public void move(boolean shouldAddLength) {
        if (!shouldAddLength) {
            LinkedList<Position> positins = new LinkedList<Position>(this.snakePositions);
            positins.removeLast();
            this.snakePositions = positins;
        }
        switch (this.facing) {
            case UP:
                this.snakePositions.add(new Position(this.snakePositions.element().getX(),this.snakePositions.element().getY()+1));
                break;
            case DOWN:
                this.snakePositions.add(new Position(this.snakePositions.element().getX(),this.snakePositions.element().getY()-1));
                break;
            case RIGHT:
                this.snakePositions.add(new Position(this.snakePositions.element().getX()+1,this.snakePositions.element().getY()));               
                break;
            case LEFT:
                this.snakePositions.add(new Position(this.snakePositions.element().getX()-1,this.snakePositions.element().getY()));               
                break;
        }
    }

    //getter and setter
    public Position getPos() {
        return this.snakePositions.element();
    }


    public Facing getFacing() {
        return facing;
    }

    public void setFacing(Facing facing) {
        this.facing = facing;
    }

    public Queue<Position> getSnakePositions() {
        return snakePositions;
    }

    public void setSnakePositions(Queue<Position> snakePositions) {
        this.snakePositions = snakePositions;
    }

}
