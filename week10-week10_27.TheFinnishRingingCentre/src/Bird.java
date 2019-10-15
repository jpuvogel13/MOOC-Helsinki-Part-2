
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }

    public String getName(){
        return this.name;
    }
    public String getLatinName(){
        return this.latinName;
    }
    public int getRingingYear(){
        return this.ringingYear;
    }

    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }


    @Override
    public boolean equals(Object object){
    if(object==null){
        return false;
    }
    Bird compared = (Bird) object;

    if(this.latinName.equals(compared.latinName)){
        return true;
    }
    if(this.ringingYear == compared.ringingYear){
            return true;
        }
    return false;

    }
    public int hashCode(){
        return this.latinName.hashCode();
    }
}


