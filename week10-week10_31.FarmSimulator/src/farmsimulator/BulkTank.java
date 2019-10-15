package farmsimulator;

public class BulkTank {
    private double capacity;
    private double milk;

    public BulkTank(){
        this.capacity=2000.0;
        this.milk=0;
    }

    public BulkTank(double capacity){
        this.capacity=capacity;
        this.milk=0;
    }
    public double getCapacity(){
        return this.capacity;
    }
    public double getVolume(){
        return this.milk;
    }

    public double howMuchFreeSpace(){
        return this.capacity-this.milk;
    }

    public void addToTank(double amount){
        if(howMuchFreeSpace()<amount){
            this.milk+=howMuchFreeSpace();
    }else{
        this.milk= this.milk + amount;
        }
    }
    public double getFromTank(double amount){
        if(this.milk<amount){
            this.milk=0;
            return 0;
        }
            return milk=milk-amount;
    }
    @Override
    public String toString(){
        return Math.ceil(getVolume()) + "/" + Math.ceil(capacity);

    }

}
