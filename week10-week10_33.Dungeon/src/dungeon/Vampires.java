package dungeon;

import java.util.ArrayList;
import java.util.Random;

public class Vampires {
    private int howMany;
    private ArrayList<Vampires> vampiresArrayList;
    private int x;
    private int y;
    private Random random;
    private int height;
    private int length;

    public Vampires (int howMany, int height, int length){
        this.howMany=howMany;
        this.vampiresArrayList= new ArrayList<Vampires>();
        this.random = new Random();
        this.length = length;
        this.height=height;
    }

    public void createVampires(){
        for(int i = 1; i<=howMany; i++){
            Vampires vampires = new Vampires(howMany,height,length);
            vampires.setY();
            vampires.setX();
            vampiresArrayList.add(vampires);
        }
    }

    public ArrayList getVampires(){
        return this.vampiresArrayList;
    }

    public void setX(){
        this.x=random.nextInt(length);
    }

    public void setY(){
        this.y=random.nextInt(height);

    }

    public int getY(){
        return this.y;
    }

    public int getX(){
        return this.x;
    }

    public void moveRight(){
        if(this.x<this.length-1){
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
        if(this.y<this.height){
            this.y++;
        }
    }
    public void moveRandom(){
        this.x=random.nextInt(length);
    }

    public void occupied(){
        int firstX =0;
        int firstY = 0;
    }



}
