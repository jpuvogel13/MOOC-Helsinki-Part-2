package boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {

        this.name = name;
        this.weight = weight;
        if(this.weight<0){
            throw new IllegalArgumentException();
        }
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }


    public boolean equals(Thing thing){
        if(this.name.equals(thing.name)){
            return true;
        }
        return false;
    }

    public int hashCode(){
        return this.name.hashCode();
    }

}
