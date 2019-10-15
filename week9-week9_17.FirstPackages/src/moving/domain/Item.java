package moving.domain;

public class Item implements Thing, Comparable<Item>{
    private int volume;
    private String name;

    public Item(String name, int volume){
        this.name=name;
        this.volume=volume;
    }
    public String getName(){
        return this.name;
    }
    public String toString(){
        return this.name+ " (" + this.volume + " dm^3)";

    }
    public int getVolume(){
        return this.volume;
    }
    @Override
    public int compareTo(Item item){
        return this.volume-item.volume;
    }

}
