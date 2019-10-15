package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Thermometer implements Sensor {
    private Random random = new Random();
    private int counter;


    public Thermometer(){
    }

    public boolean isOn(){
        AverageSensor averageSensor= new AverageSensor();
        if(this.counter>0 || averageSensor.isOn()==true){
            return true;

        }else {
            return false;
        }
    }

    public void on(){
        this.counter=0;
        this.counter+=1;

    }

    public void off(){
        this.counter--;

    }
    public int measure(){
        int randomNumber =0;
        if(isOn()==false){
            throw new IllegalArgumentException();
        }
       if(isOn()==true){
           randomNumber = random.nextInt(30+1+30)-30;
       }
       return randomNumber;
    }

}
