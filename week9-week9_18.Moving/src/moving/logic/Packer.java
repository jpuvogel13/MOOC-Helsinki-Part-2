package moving.logic;
import moving.domain.Box;
import moving.domain.Thing;
import java.util.ArrayList;
import java.util.List;
import moving.domain.Item;

public class Packer{
    private List<Box> contents;
    private Box box;
    private int boxesVolume;

    public Packer(int boxesVolume){
        this.box = new Box(boxesVolume);
        this.contents=new ArrayList<Box>();

    }

    public List<Box> packThings(List<Thing> things){
        if(things.isEmpty() == false){
            this.contents.add(box);
            for(Thing j : things){
                if(this.box.addThing(j)==true){

                }else{
                    Box newBox = new Box(this.box);
                    newBox.addThing(j);
                    this.contents.add(newBox);
                }
            }
        }
        return this.contents;
    }


}
