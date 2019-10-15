import java.util.ArrayList;

    class Person implements Comparable<Person>{
    private String name;
    private String street;
    private String city;
    private ArrayList<String> numbers;


    public Person(String name,String dick){
        this.name = name;
        this.numbers = new ArrayList<String>();

    }


    String getName(){
        return this.name;
    }

    void addNumber(String number){
        this.numbers.add(number);
    }

    ArrayList getNumber(){
        return this.numbers;
    }

    String getStreet(){
        return this.street;
    }

    String getCity(){
        return this.city;
    }

    void addStreet(String street){
        this.street = street;
    }

    void addCity(String city){
        this.city = city;
    }

    @Override
    public int compareTo(Person person){
        return this.getName().compareTo(person.getName());
    }

}
