package people;

public class Person {
    private String name;
    private String address;

    public Person(String name, String address){
        this.address=address;
        this.name=name;

    }
    public String getAddress(){
        return this.address;
    }

    public String toString(){
        return this.name + "\n" + "  " + this.address;
    }

}
