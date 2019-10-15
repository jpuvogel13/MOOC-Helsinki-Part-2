package reference.domain;

public class Film {
    private String name;

    public Film(String name){
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
    @Override
    public boolean equals(Object o) {
        String name = ((Film) o).getName();
        o = new Film(name);
        if(this.name.equals(((Film) o).getName())){
            return true;
        }
            return false;
    }

}
