package farmsimulator;
import java.util.Collection;

public class Barn {
    private BulkTank tank;
    private MilkingRobot milkingRobot;

    public Barn(BulkTank tank){
        this.tank= tank;
    }

    public BulkTank getBulkTank(){
        return this.tank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.milkingRobot = new MilkingRobot();
        this.milkingRobot.setBulkTank(this.tank);

    }
    public void takeCareOf(Collection<Cow> cows){
        if(this.milkingRobot==null){
            throw new IllegalStateException();
        }
        for(Cow k : cows){
            this.tank.addToTank(k.milk());
        }
    }

    public void takeCareOf(Cow cow){
        if(this.milkingRobot==null) {
            throw new IllegalStateException();
        }
            this.tank.addToTank(cow.milk());
    }
    @Override
    public String toString(){
        return Math.ceil(this.tank.getVolume()) + "/" + Math.ceil(this.tank.getCapacity());
    }

}
