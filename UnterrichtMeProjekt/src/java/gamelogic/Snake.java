package gamelogic;

import java.util.ArrayList;
import java.util.HashSet;
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
    
    public Boolean collides(Schlangenteil pos) {
        for (Schlangenteil s: snakePositions) {
            if (s.equals(pos)) {
                return true;
            }
        }
        return false;
    }
    
    public Boolean hitsBorder(int maxx, int maxy) {
         for (Schlangenteil s: snakePositions) {
            if (s.getX() == maxx || s.getY() == maxy || s.getX() == 0 || s.getY() == 0) {
                return true;
            }
        }
        return false;
    }

    public Boolean hitsSelf() {
        return this.snakePositions.size() != new HashSet<Schlangenteil>(this.snakePositions).size();
    }

}
