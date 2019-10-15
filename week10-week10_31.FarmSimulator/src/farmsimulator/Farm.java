package farmsimulator;

import java.util.ArrayList;
import java.util.Collection;

public class Farm implements Alive{
    private String name;
    private Barn barn;
    private ArrayList<Cow> cows;


    public Farm(String name, Barn barn){
        this.name=name;
        this.barn=barn;
        this.cows = new ArrayList<Cow>();

    }

    public void installMilkingRobot(MilkingRobot robot){
        this.barn.installMilkingRobot(robot);
    }

    public void liveHour(){
        for(Cow l : this.cows){
            l.liveHour();
        }
    }

    public String getOwner(){
        return this.name;
    }

    public void addCow(Cow cow){
        this.cows.add(cow);
    }

    public ArrayList<Cow> getCows(){
        return this.cows;
    }


    public void manageCows(){
        barn.takeCareOf(cows);
    }

    public String cowList(){
        String list = "";
        if(this.cows.isEmpty()){
            return "No cows.";
        }
        for(Cow l : this.cows){
            list= list + "        " + l.toString() + "\n";
        }

        return list;
    }
    @Override
    public String toString(){
        return "Farm owner: " + getOwner() + "\nBarn bulk tank: " + this.barn.toString() + "\nAnimals:  \n" + cowList();
    }
}
