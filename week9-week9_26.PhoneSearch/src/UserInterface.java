
import java.util.Scanner;

    class UserInterface {
    private Scanner reader;
    private PhoneBook phoneBook;
    private String name;


    public UserInterface(){
        this.reader = new Scanner(System.in);
        this.phoneBook = new PhoneBook();

    }

    public void mainMenu(){
        System.out.println("phone search\n" +
                "available operations:\n" +
                " 1 add a number\n" +
                " 2 search for a number\n" +
                " 3 search for a person by phone number\n" +
                " 4 add an address\n" +
                " 5 search for personal information\n" +
                " 6 delete personal information\n" +
                " 7 filtered listing\n" +
                " x quit");
        commandPrompt();
    }

    private void commandPrompt(){
        while(true) {
            System.out.println("");
            System.out.print("command: ");
            String command = reader.nextLine();

            if (command.equalsIgnoreCase("1")) {
                addANumber();
            } else if (command.equalsIgnoreCase("2")) {
                searchForANumber();
            } else if (command.equalsIgnoreCase("3")) {
                searchByNumber();
            } else if (command.equalsIgnoreCase("4")) {
                addAddress();
            } else if (command.equalsIgnoreCase("5")) {
                personalInfortmation();

            } else if (command.equalsIgnoreCase("6")) {
                deleteInformation();

            } else if (command.equalsIgnoreCase("7")) {
                searchByKeyword();

            } else if (command.equalsIgnoreCase("x")) {
                break;
            }
        }
    }
    private void addANumber(){
        System.out.print("whose number : ");
        name = reader.nextLine();
        System.out.print("number: ");
        String number = reader.nextLine();
        if(phoneBook.isPersonOnList(name)){
            phoneBook.addNumberExistingPerson(name,number);
        }else{
            Person person = new Person(name);
            phoneBook.addNumberNewPerson(person,number);
            phoneBook.addPersonToList(person);
        }
    }

    private void searchForANumber(){
        System.out.print("whose number: ");
        name = reader.nextLine();
        if (phoneBook.searchByName(name)==null) {
            System.out.println("  not found");
        } else {
            phoneBook.printNumbers(name);
        }
    }

    private void searchByNumber(){
        System.out.print("number: ");
        String number = reader.nextLine();
        if(phoneBook.searchByNumber(number)==null){
            System.out.println(" not found");
        }else{
            System.out.println(phoneBook.searchByNumber(number));
        }
    }

    private void addAddress(){
        System.out.print("whose address: ");
        name = reader.nextLine();
        System.out.print("street: ");
        String street = reader.nextLine();
        System.out.print("city: ");
        String city = reader.nextLine();
        if(phoneBook.isPersonOnList(name)){
            phoneBook.addAddress(name,street,city);
        }else {
            Person person = new Person(name);
            person.addCity(city);
            person.addStreet(street);
            phoneBook.addPersonToList(person);
            phoneBook.addPersonToPhoneBook(person);
        }

    }
    private void personalInfortmation(){
        System.out.print("whose infortmation: ");
        name = reader.nextLine();
        phoneBook.getPersonalInformation(name);
    }

    private void deleteInformation(){
        System.out.print("whose information: ");
        name = reader.nextLine();
        phoneBook.deleteInformation(name);
    }

    private void searchByKeyword(){
        System.out.print("keyword (if empty, all listed): ");
        String keyword = reader.nextLine();
        if(keyword.isEmpty()){
            phoneBook.printAll();
        }
        phoneBook.searchByKeyword(keyword);
        if(phoneBook.isKeyWordResultsEmpty()){
            System.out.println(" keyword not found");
        }
        phoneBook.sortKeyWordList();
        phoneBook.printKeyWordSearch();
        phoneBook.clearKeyWordResults();
    }
}
