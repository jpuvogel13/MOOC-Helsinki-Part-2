package application;

import java.util.List;
import java.util.ArrayList;
public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List temperatures;

    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
        this.temperatures = new ArrayList<Integer>();

    }

    public boolean isOn() {
        if (checkAllSensors()==true) {
            return true;
        } else {
            return false;
        }
    }
    public boolean checkAllSensors(){
        int sensorCounter=0;
        for(Sensor l : this.sensors){
            if(l.isOn()==true){
                sensorCounter++;
            }
            if(sensorCounter>=this.sensors.size()){
                return true;
            }
        }
        return false;
    }

    public void on() {
        for (Sensor k : this.sensors) {
            k.on();
        }

    }

    public void off() {
        for (Sensor l : this.sensors) {
            l.off();
        }
    }

    public int measure() {
        int temp = 0;
        int avgCounter=0;
        if (isOn() == true){
            if(this.sensors.size()==1){
                for(Sensor k : this.sensors){
                   temp = k.measure();
                    addTemp(temp);
                    return temp;
                }
            }
            for (Sensor k : this.sensors) {
                temp= temp+k.measure();
                avgCounter++;
            }
        } else {
            throw new IllegalStateException();
        }
        int average = temp/avgCounter;
        addTemp(average);
        return average;
    }


    public void addSensor(Sensor additional) {
            if(additional.isOn()){
                on();
            }
            this.sensors.add(additional);
    }

    public List<Integer> readings(){
        return this.temperatures;
    }
    public void addTemp(int temp){
        this.temperatures.add(temp);
    }

}
