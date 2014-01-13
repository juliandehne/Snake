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
    private LinkedList<Schlangenteil> snakePositions;

    public Snake(Facing facing, LinkedList<Schlangenteil> snakePositions) {
        this.facing = facing;
        this.snakePositions = snakePositions;
    }

    public void move(boolean shouldAddLength) {
        if (!shouldAddLength) {
            this.snakePositions.removeLast();
        }
        switch (this.facing) {
            case UP:
                this.snakePositions.addFirst(new Schlangenteil(this.snakePositions.element().getX(), this.snakePositions.element().getY() + 1, 0));
                break;
            case DOWN:
                this.snakePositions.addFirst(new Schlangenteil(this.snakePositions.element().getX(), this.snakePositions.element().getY() - 1, 0));
                break;
            case RIGHT:
                this.snakePositions.addFirst(new Schlangenteil(this.snakePositions.element().getX() + 1, this.snakePositions.element().getY(), 0));
                break;
            case LEFT:
                this.snakePositions.addFirst(new Schlangenteil(this.snakePositions.element().getX() - 1, this.snakePositions.element().getY(), 0));
                break;
        }
        for (Schlangenteil schlangenteil : snakePositions) {
            schlangenteil.index += 1;
        }
    }

    //getter and setter
    public Schlangenteil getPos() {
        return this.snakePositions.element();
    }

    public Facing getFacing() {
        return facing;
    }

    public void setFacing(Facing facing) {
        this.facing = facing;
    }

    public LinkedList<Schlangenteil> getSnakePositions() {
        return snakePositions;
    }

    public void setSnakePositions(LinkedList<Schlangenteil> snakePositions) {
        this.snakePositions = snakePositions;
    }

}
