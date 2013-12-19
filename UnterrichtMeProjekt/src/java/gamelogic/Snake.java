package gamelogic;

import java.util.ArrayList;

/**
 *
 * @author lenni
 */
public class Snake {

    private Position pos;
    private int length;
    private Facing facing;
    private ArrayList<Position> snakePositions;

    public Snake(Position pos, int length, Facing facing) {
        this.pos = pos;
        this.length = length;
        this.facing = facing;
        this.snakePositions = new ArrayList<Position>();
        for (int i = 0; i < length; i++) {
            this.snakePositions.add(new Position(this.pos.getX(), this.pos.getY() + i));
        }
    }

    public void move(boolean shouldAddLength) {
        if (!shouldAddLength) {
            this.snakePositions.remove(snakePositions.size()-1);
        }
        this.snakePositions.add(0, this.pos);
        switch (this.facing) {
            case UP:
                this.pos = new Position(this.pos.getX(), this.pos.getY() + 1);
                break;
            case DOWN:
                this.pos = new Position(this.pos.getX(), this.pos.getY() - 1);
                break;
            case RIGHT:
                this.pos = new Position(this.pos.getX() + 1, this.pos.getY());
                break;
            case LEFT:
                this.pos = new Position(this.pos.getX() - 1, this.pos.getY());
                break;
        }
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

    public ArrayList<Position> getSnakePositions() {
        return snakePositions;
    }

    public void setSnakePositions(ArrayList<Position> snakePositions) {
        this.snakePositions = snakePositions;
    }

}
