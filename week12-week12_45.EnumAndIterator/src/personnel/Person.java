package personnel;

public class Person {
    private Education education;
    private String name;

    public Person(String name, Education education){
        this.education = education;
        this.name = name;
    }

    public Education getEducation(){
        return this.education;
    }

    public String toString(){
        return this.name + ", " + getEducation();

    }
}
