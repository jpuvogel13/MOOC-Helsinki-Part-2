package farmsimulator;

public class MilkingRobot implements Milkable {

    private BulkTank tank;

    public MilkingRobot(){

    }

    public BulkTank getBulkTank(){
        if(this.tank==null){
            return null;
        }
        return this.tank;
    }

    public void setBulkTank(BulkTank tank){
        this.tank = new BulkTank();
    }

    public void milk(Milkable milkable){
        if(this.tank==null){
            throw new IllegalStateException();
        }
        this.tank.addToTank(milkable.milk());
    }

    public double milk(){
        return 0.0;
    }
}
