package application;


public class ConstantSensor implements Sensor {
    private int number;

    public ConstantSensor(int number){
        this.number=number;

    }
    public boolean isOn(){
            return true;
    }

    public void on(){
            isOn();

    }
    public void off(){

    }
    public int measure() {
        return number;
    }

}
