package reference.domain;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public String toString(){
        return this.name;
    }
    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
    public boolean equals(Object o){
       String name = ((Person) o).getName();
       Person p = new Person(name);
       if(p.getName().equals(this.name)){
           return true;
       }
       return false;
    }
}


