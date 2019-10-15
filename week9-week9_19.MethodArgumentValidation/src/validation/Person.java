package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
       nameVerify(name);
       ageVerify(age);
    }

    public String nameVerify(String name){
        if(name==null || name.isEmpty() || name.length()>40){
            throw new IllegalArgumentException();
        }else {
            return name;
        }
    }
    public int ageVerify(int age){
        if((age>120 || age<0)){
            throw new IllegalArgumentException();
        }
        else{
            return age;
        }

    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
