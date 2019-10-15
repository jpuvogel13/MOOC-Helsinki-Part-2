package wormgame.domain;
import wormgame.Direction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Worm {
        private Direction direction;
        private List<Piece> worm;
        private int length;

    public Worm(int originalX, int originalY, Direction originalDirection){
        this.direction = originalDirection;
        this.worm = new ArrayList<Piece>();
        this.worm.add(new Piece(originalX,originalY));
        this.length = 3;
    }
    public Direction getDirection(){
        return this.direction;
    }
    public void setDirection(Direction dir){
        this.direction = dir;
    }
    public int getLength(){
        return this.worm.size();
    }

    public List<Piece> getPieces(){
        return this.worm;
    }

    public void move(){
        if(direction.equals(Direction.LEFT)){
            this.worm.add(new Piece(headPiece().getX()-1, headPiece().getY()));
        }if(direction.equals(Direction.RIGHT)){
            this.worm.add(new Piece(headPiece().getX()+1, headPiece().getY()));
        }if(direction.equals(Direction.UP)){
            this.worm.add(new Piece(headPiece().getX(), headPiece().getY()-1));
        }if(direction.equals(Direction.DOWN)){
            this.worm.add(new Piece(headPiece().getX(), headPiece().getY()+1));
        }
        if(worm.size()>length){
            worm.remove(0);

        }
    }

    public void grow() {
        if (this.worm.size() > 2) {
            this.length++;
        }
    }
    public boolean runsInto(Piece piece){
       for(Piece wormPiece : this.worm){
           if(wormPiece.getY() == piece.getY() && wormPiece.getX() == piece.getX()){
            return true;
           }
        }
        return false;
    }

    public boolean runsIntoItself(){
        for (Piece p1 : this.worm) {
            for (Piece p2 : this.worm) {
                if (p1.equals(p2)) {
                    continue;
                }
                if (p1.getX() == p2.getX() && p1.getY() == p2.getY()) {
                    return true;
                }
            }
        }
        return false;
    }

    private Piece headPiece(){
        return worm.get(worm.size()-1);
    }
}
