public class Planes {
    private int capacity;
    private String planeID;
    private String departureCode;
    private String destinationCode;
    public Planes(){
    }

    public Planes(String planeID, String departureCode, String destinationCode, int capacity) {
        this.departureCode=departureCode;
        this.destinationCode=destinationCode;
        this.planeID=planeID;
        this.capacity=capacity;

    }
    public Planes(String planeID, int capacity){
        this.planeID=planeID;
        this.capacity=capacity;
    }
    public void addDestination(String destinationCode){
        this.destinationCode=destinationCode;
    }
    public void addArrival(String departureCode){
        this.departureCode=departureCode;
    }
    public void addCapacity(int capacity){
        this.capacity=capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }
    public String getDepartureCode(){
        return this.departureCode;
    }
    public String getDestinationCode(){
        return this.destinationCode;
    }
    public String getPlaneID(){
        return planeID;
    }

}