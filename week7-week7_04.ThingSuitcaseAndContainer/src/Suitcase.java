import java.util.ArrayList;
public class Suitcase {
    private int maxWeight;
    private ArrayList<Thing> things;
    private int amount;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        things= new ArrayList<Thing>();
    }

    public void addThing(Thing thing) {
        if (totalWeight() + thing.getWeight() <= maxWeight) {
            this.things.add(thing);
            amount++;
        } else {
        }
    }

    public String toString() {
        int counter=0;
        int totalWeight=0;
        for(Thing t : this.things){
            counter++;
            totalWeight+=t.getWeight();
        }
            if(counter==0) {
                return "empty (" + totalWeight + " kg)";
            }else if(counter==1){
                return "1 thing (" + totalWeight + " kg)";
            }else {
                return counter + " things (" + totalWeight + " kg)";
            }
    }

    public void printThings() {
        for (Thing object : this.things) {
                System.out.println(object);
            }
        }
    public int totalWeight(){
    int totalWeight=0;
    for(Thing object : this.things){
        totalWeight+=object.getWeight();
    }
    return totalWeight;
    }

    public Thing heaviestThing(){
        int heaviest=0;
        Thing heaviestThing= new Thing("",0);
        if(this.things.isEmpty()){
            return null;
        }else{
            for(Thing thing : this.things){
                if(thing.getWeight()>heaviest){
                    heaviest=thing.getWeight();
                    heaviestThing=thing;
                }
            }
        }
        return heaviestThing;
    }

}
