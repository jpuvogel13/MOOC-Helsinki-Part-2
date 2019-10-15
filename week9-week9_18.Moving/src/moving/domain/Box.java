package moving.domain;
import java.util.ArrayList;

public class Box implements Thing{
    private int maximumCapacity;
    private ArrayList<Thing> boxContents;



    public Box(int maximumCapacity){
        this.maximumCapacity=maximumCapacity;
        this.boxContents=new ArrayList<Thing>();

    }
    public Box(Box box){
        this.boxContents=new ArrayList<Thing>();
        this.maximumCapacity=box.maximumCapacity;
    }

    public boolean addThing(Thing thing){

        if(thing.getVolume()+this.getVolume()<=maximumCapacity){
            this.boxContents.add(thing);
            return true;
        }
            return false;
    }

    public int getVolume(){
        int volume=0;
        for(Thing k : this.boxContents){
            volume+=k.getVolume();
        }
        return volume;
    }

    public String toString(){
        return "number of boxes: ";
    }


}
