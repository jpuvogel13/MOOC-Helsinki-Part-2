package dungeon;
import java.util.ArrayList;

public class Player {
    private int x;
    private int y;
    private String name;
    private int xBoundary;
    private int yBoundary;

    public Player(String name, int xBoundary, int yBoundary){
        this.y=0;
        this.x=0;
        this.name="@";
        this.xBoundary=xBoundary;
        this.yBoundary=yBoundary;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public String getName(){
        return this.name;
    }

    public void moveRight(){
        if(this.x<this.xBoundary-1){
            this.x++;
        }
    }

    public void moveLeft(){
        if(this.x>0){
            this.x--;
        }
    }

    public void moveUp(){
        if(this.y>0){
            this.y--;
        }
    }

    public void moveDown(){
        if(this.y<this.yBoundary){
            this.y++;
        }
    }


}
