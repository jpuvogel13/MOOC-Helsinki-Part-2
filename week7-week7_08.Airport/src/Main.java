import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        Scanner reader = new Scanner(System.in);
        ArrayList<Planes> flightsList = new ArrayList<Planes>();
        ArrayList<Planes> planesList = new ArrayList<Planes>();
        FlightService flightService = new FlightService(flightsList,planesList);
        Planes plane = new Planes();
        start(reader,flightsList,plane,planesList,flightService);
        

    }
    //Start menu
    public static void start(Scanner reader, ArrayList<Planes> flightsList,Planes plane, ArrayList<Planes> planesList,FlightService flightService) {
        System.out.println("Airport panel");
        System.out.println("-------------------");
        while (true) {
            panelIntro();
            System.out.print("> ");
            String command = reader.nextLine();
            if (command.equals("x")) {
                flightService.start();
                while(true) {
                    flightService.commandPrompt(reader);
                    flightService.userChoice(reader, plane,planesList,flightsList);
                }
            }
            if (command.equals("1")) {
                addAirplane(reader, planesList,flightsList);

            } else if (command.equals("2")) {
                addFlight(reader, flightsList, planesList);
            }
        }
    }
    //Add aiprlane to database
    public static void addAirplane(Scanner reader, ArrayList<Planes>planesList,ArrayList<Planes> flightlist){
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        System.out.print("Give plane capacity: ");
        int planeCapacity = Integer.parseInt(reader.nextLine());
        Planes planes=new Planes(planeID,planeCapacity);
        planesList.add(planes);
    }

    //Add flight info for a plane
    public static void addFlight(Scanner reader,ArrayList<Planes> flightsList,ArrayList<Planes> planesList){
        int planeCapacity=0;
        System.out.print("Give plane ID: ");
        String planeID= reader.nextLine();
        System.out.print("Give departure airport code: ");
        String departureCode=reader.nextLine();
        System.out.print("Give destination airport code: ");
        String destinationCode= reader.nextLine();
        for(Planes flights : flightsList){
            if(flights.getPlaneID().equalsIgnoreCase(planeID)){
                planeCapacity+=flights.getCapacity();
                break;
            }
        }
        for(Planes planes : planesList) {
            if (planes.getPlaneID().equalsIgnoreCase(planeID)) {
                planeCapacity=planes.getCapacity();
            }
        }
        Planes flight = new Planes(planeID,departureCode,destinationCode,planeCapacity);
        flightsList.add(flight);
    }
    //Main menu
    public static void panelIntro(){
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");

    }

}
