import java.util.*;

    class PhoneBook{
    private Map<Person, ArrayList<String>> phonebook;
    private List<Person> people;
    private List<Person> keyWordResults;

    public PhoneBook() {
        this.phonebook = new HashMap<Person, ArrayList<String>>();
        this.people = new ArrayList<Person>();
        this.keyWordResults = new ArrayList<Person>();


    }

    void addNumberExistingPerson(String person, String number) {
        for(Person k : this.people){
            if(k.getName().equalsIgnoreCase(person)){
                k.addNumber(number);
                phonebook.get(k).add(number);
            }
        }
    }

    void addNumberNewPerson(Person person, String number){
        this.phonebook.put(person, new ArrayList<String>());
        this.phonebook.get(person).add(number);
        person.addNumber(number);
    }

    ArrayList<String> searchByName(String name) {
        for (Person k : this.phonebook.keySet()) {
            if (k.getName().equalsIgnoreCase(name)) {
                return this.phonebook.get(k);
            }
        }
        return null;
    }

    String searchByNumber(String number) {
        for (Person name : this.phonebook.keySet()) {
            ArrayList<String> numbers = this.phonebook.get(name);
            for (String k : numbers) {
                if (number.equalsIgnoreCase(k)) {
                    return " " + name.getName();
                }
            }
        }
        return null;
    }

    void printNumbers(String name) {
        for(Person k : this.phonebook.keySet()) {
            if(k.getName().equalsIgnoreCase(name)){
            ArrayList<String> numbers = this.phonebook.get(k);
            for (String l : numbers) {
                System.out.println("   " + l);
            }
                }
                     }
    }
    void addAddress(String name, String street, String city){
        for(Person k : this.people){
            if(k.getName().equalsIgnoreCase(name)){
                k.addStreet(street);
                k.addCity(city);
            }
        }
    }

    void addPersonToPhoneBook(Person person){
        this.phonebook.put(person, new ArrayList<String>());
    }

    void getPersonalInformation(String name){
        if(isPersonOnList(name)==false){
            System.out.println("  not found");
        }
        for(Person k : this.people) {
            if (k.getName().equalsIgnoreCase(name)) {
                if (k.getStreet() == null || k.getCity() == null) {
                    System.out.println("  address unknown");
                    System.out.println("  phone numbers:");
                    printNumbers(k.getName());
                    break;
                } else if (k.getNumber().isEmpty()) {
                    System.out.println("  address: " + k.getStreet() + " " + k.getCity());
                    System.out.println("  phone number not found");
                    break;
                } else if(k.getStreet()!=null && k.getNumber().isEmpty()==false) {
                    System.out.println("  address: " + k.getStreet() + " " + k.getCity());
                    System.out.println("  phone numbers:");
                    printNumbers(k.getName());
                    break;
                }
            }
        }
        }
        void printAll(){
            for(Person k : this.people) {
                    if (k.getStreet() == null || k.getCity() == null) {
                        System.out.println(k.getName());
                        System.out.println("  address unknown");
                        System.out.println("  phone numbers:");
                        printNumbers(k.getName());
                        break;
                    } else if (k.getNumber().isEmpty()) {
                        System.out.println(k.getName());
                        System.out.println("  address: " + k.getStreet() + " " + k.getCity());
                        System.out.println("  phone number not found");
                        break;
                    } else if(k.getStreet()!=null && k.getNumber().isEmpty()==false) {
                        System.out.println(k.getName());
                        System.out.println("  address: " + k.getStreet() + " " + k.getCity());
                        System.out.println("  phone numbers:");
                        printNumbers(k.getName());
                        break;
                }
            }
        }

        void printKeyWordSearch(){
            for(Person k : this.keyWordResults) {
                if (k.getStreet() == null || k.getCity() == null) {
                    System.out.println(" " + k.getName());
                    System.out.println("  address unknown");
                    System.out.println("  phone numbers:");
                    printNumbers(k.getName());

                } else if (k.getNumber().isEmpty()) {
                    System.out.println(" " + k.getName());
                    System.out.println("  address: " + k.getStreet() + " " + k.getCity());
                    System.out.println("  phone number not found");

                } else if (k.getStreet() != null && k.getNumber().isEmpty() == false) {
                    System.out.println(" " + k.getName());
                    System.out.println("  address: " + k.getStreet() + " " + k.getCity());
                    System.out.println("  phone numbers:");
                    printNumbers(k.getName());

                }

        }
}
        void deleteInformation(String name) {
            ArrayList<Person> toBeRemoved = new ArrayList<Person>();
            for (Person k : people) {
                if (k.getName().equalsIgnoreCase(name)){
                    toBeRemoved.add(k);

                }
            }
            Person person = null;
            people.removeAll(toBeRemoved);
            for(Person l : this. phonebook.keySet()){
                if(l.getName().equalsIgnoreCase(name)){
                    person = l ;
                }
            }
            this.phonebook.remove(person);
    }

        void searchByKeyword(String keyword){
            for(Person k : this.people){
                if((k.getName().contains(keyword))){
                    keyWordResults.add(k);
                }else if(!(k.getStreet()== null && k.getCity()==null) && ((k.getStreet().contains(keyword) || k.getCity().contains(keyword)))){
                    keyWordResults.add(k);

                }
            }
    }


    List<Person> sortKeyWordList(){
        Collections.sort(keyWordResults);
        return keyWordResults;
    }


    boolean isPersonOnList(String name){
            for(Person k : this.people){
                if(k.getName().equalsIgnoreCase(name)){
                    return true;

                }
            }
            return false;
        }
        void addPersonToList(Person person){
        this.people.add(person);

        }

        void clearKeyWordResults(){
        this.keyWordResults.clear();
        }

        boolean isKeyWordResultsEmpty(){
        if(keyWordResults.isEmpty()){
            return true;
            }
            return false;
         }


}
