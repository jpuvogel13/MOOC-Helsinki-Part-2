import java.util.ArrayList;
public class Container {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;


    public Container(int maximumWeight){
        this.maximumWeight=maximumWeight;
        this.suitcases=new ArrayList<Suitcase>();

    }
    public void addSuitcase(Suitcase suitcase){
        if(suitcase.totalWeight()+this.totalWeight()<=this.maximumWeight){
            suitcases.add(suitcase);
        }
    }
    public String toString(){
        int numberOfSuitcases=this.suitcases.size();
        int totalWeight=0;
        for(Suitcase object : this.suitcases){
            totalWeight+=object.totalWeight();
        }
        return numberOfSuitcases + " suitcases (" + totalWeight+ " kg)";
    }
    public void printThings(){
        for(Suitcase objects : this.suitcases){
            objects.printThings();
        }
    }
    public int totalWeight(){
        int totalWeight=0;
        for(Suitcase s : this.suitcases){
            totalWeight+=s.totalWeight();
        }
        return totalWeight;

    }



}
