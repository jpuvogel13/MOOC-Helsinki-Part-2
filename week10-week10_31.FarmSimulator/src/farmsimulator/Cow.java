package farmsimulator;

import java.util.Random;

public class Cow implements Milkable, Alive {
    private String name;
    private double utterCapacity;
    private double milk;
    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"}; //31



    public Cow(String name){
    this.name=name;
    this.utterCapacity=0;
    this.milk=0;
    setUtterCapacity();
    }

    public Cow(){
        Random random = new Random();
        int randomNumb= random.nextInt(31);
        this.name = NAMES[randomNumb];
        this.milk=0;
        setUtterCapacity();

    }
    public String getName(){
        return this.name;
    }

    public double getCapacity(){
        return utterCapacity;
    }

    public double getAmount(){
        return this.milk;

    }
    @Override
    public double milk(){
        return this.milk + resetMilk();

    }
    @Override
    public void liveHour(){
        Random random = new Random();
        double newMilk= .7 + (2-.7) * random.nextDouble();
        if((this.milk+newMilk) >utterCapacity){
            this.milk = this.milk + (utterCapacity-this.milk);
        }else{
            this.milk = this.milk + newMilk;
        }
    }
    @Override
    public String toString(){
      return getName() + " " + Math.ceil(getAmount()) + "/" + Math.ceil(getCapacity());
    }

    public void setUtterCapacity(){
        Random random = new Random();
        this.utterCapacity = 15 + (40-15) * random.nextDouble();
    }

    public double resetMilk(){
        return this.milk=0;
    }




}
