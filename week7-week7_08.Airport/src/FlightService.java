import java.util.ArrayList;
import java.util.Scanner;
public class FlightService{
    private String command;
    private ArrayList planesList;
    private ArrayList flightList;
    private Readable readable;

    public FlightService(ArrayList<Planes> flightList,ArrayList<Planes>planesList){
        this.planesList=planesList;
        this.flightList=flightList;
    }
    public void start(){
        System.out.println();
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println();

    }

    //Main menu for flightservice
    public String commandPrompt(Scanner reader){
        System.out.println("Choose operation: ");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
        System.out.print("> ");
        this.command= reader.nextLine();
        return this.command;
    }
    //Directs the users choice from the main menu
    public void userChoice(Scanner reader,Planes plane,ArrayList<Planes> planesList,ArrayList<Planes> flightList){
        if(this.command.equals("x")){
            System.exit(0);
        }else if(this.command.equals("1")){
            printPlanes(planesList);
        }else if(this.command.equals("2")){
            printFlights(flightList);
            //print flights method
        }else if(this.command.equals("3")){
            System.out.print("Give plane ID: ");
            String planeCommand=reader.nextLine();
            printPlaneInfo(planeCommand,planesList);
            //print plane info
        }
    }
    //prints planes
    public void printPlanes(ArrayList<Planes> planesList){
        for(Planes plane: planesList){
            System.out.println(plane.getPlaneID()+" ("+plane.getCapacity() + " ppl)");
        }
    }
    //prints flights (plane, capacity, departuce city code and arrival city code)
    public void printFlights(ArrayList<Planes> flightList){
        for(Planes flights : flightList){
            System.out.println(flights.getPlaneID()+ " (" + flights.getCapacity()+" ppl) (" +flights.getDestinationCode()+"-"+flights.getDepartureCode() + ")");
        }
        System.out.println();
    }
    //prints plane info
    public void printPlaneInfo(String planeCommand, ArrayList<Planes> flightList){
        for(Planes flights : flightList){
            if(flights.getPlaneID().equals(planeCommand)){
                System.out.println(flights.getPlaneID()+ " (" + flights.getCapacity()+" ppl)");
            }
        }
        System.out.println();
    }
}
