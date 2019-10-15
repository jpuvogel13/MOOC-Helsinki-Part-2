
package containers;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

public class ContainerHistory {
    private ArrayList<Double> history;

    public ContainerHistory() {
        this.history = new ArrayList<Double>();
    }

    public void add(double situation) {
        this.history.add(situation);
    }

    public void reset() {
        this.history.clear();
    }

    public String toString() {
        return this.history.toString();
    }

    public double maxValue() {
        double highest = 0;
        if (this.history.isEmpty() == true) {
            return 0.0;
        }
        for (Double l : this.history) {
            if (l > highest) {
                highest = l;
            }
        }
        return highest;
    }
    public double minValue() {
        double lowest=500;
        if (this.history.isEmpty() == true) {
            return 0.0;
        }
        for (Double l : this.history) {
            if (l < lowest) {
                lowest = l;
            }
        }
        return lowest;
    }

    public double average(){
        double sum = 0;
        int size = this.history.size();
        if (this.history.isEmpty() == true) {
            return 0.0;
        }
        for(Double o : this.history){
            sum = sum + o;
        }
        return sum/size;
    }

    public double greatestFluctuation() {
        List<Double> fluctuations = new ArrayList<Double>();
        double greatestFluctuation = 0;
        double greatest = maxValue();
        if (this.history.isEmpty() == true || this.history.size() == 1) {
            return 0;
        }
        for (int i = history.size() - 1; i >= 1; i--) {
            double fluctuation = Math.abs(history.get(i) - history.get(i - 1));
            fluctuations.add(fluctuation);
        }
        for (double f : fluctuations) {
            if (greatestFluctuation < f) {
                greatestFluctuation = f;
            }
        }
        return greatestFluctuation;
    }


    public double variance(){
        double average = average();
        double totalValue = 0;
        double value=0;
        int size = this.history.size();
        for(Double e : this.history){
            value = e-average;
            value = Math.pow(value,2);
            totalValue = totalValue + value;
        }
            return totalValue/(size-1);
    }

}