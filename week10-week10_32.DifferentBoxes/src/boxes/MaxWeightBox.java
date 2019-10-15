package boxes;

import java.util.LinkedList;

public class MaxWeightBox extends Box {
    private int maxWeight;
    private LinkedList<Thing> list;

    public MaxWeightBox(int maxWeight){
        super();
        this.maxWeight=maxWeight;
        this.list= new LinkedList<Thing>();
    }

    @Override
    public boolean isInTheBox(Thing thing){
        for(Thing k : this.list){
            if(k.getName().equals(thing.getName())){
                return true;
            }
        }
        return false;
    }
    @Override
    public void add(Thing thing){
        int weight = 0;
        for(Thing l : this.list){
            weight = weight + l.getWeight();
        }
        if(weight+thing.getWeight()<=this.maxWeight){
            this.list.add(thing);
        }
    }

}
