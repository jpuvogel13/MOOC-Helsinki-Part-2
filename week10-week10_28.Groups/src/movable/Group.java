package movable;

import java.util.ArrayList;

public class Group implements Movable {
    private ArrayList<Movable> group;

    public Group(){

        this.group = new ArrayList<Movable>();
    }
    public String toString(){
        String move= "";
        for(Movable l : this.group) {
            move += l.toString() +"\n";

        }
        return move;
}

    public void addToGroup(Movable movable){
        this.group.add(movable);


    }
    public void move(int dx, int dy){
        for(Movable k : this.group){
            k.move(dx,dy);
        }
    }

}
