import application.AverageSensor;
import application.ConstantSensor;

public class Main {

    public static void main(String[] args) {


        AverageSensor helsinkiArea = new AverageSensor();
        helsinkiArea.addSensor(new ConstantSensor(3));
        helsinkiArea.addSensor(new ConstantSensor(7));
        helsinkiArea.on();
        helsinkiArea.measure();
        helsinkiArea.measure();
        helsinkiArea.measure();
        System.out.println("readings: "+helsinkiArea.readings());
    }
}