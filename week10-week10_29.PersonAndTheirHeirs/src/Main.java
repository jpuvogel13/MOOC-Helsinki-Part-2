
import people.Person;
import people.Student;
import people.Teacher;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200) );
        people.add( new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki") );

        printDepartment(people);
        Teacher l = new Teacher("k","345",56);
        System.out.println(l.getAddress());
    }

    public static void printDepartment(List<Person> people){
        for(Person l : people){
            System.out.println(l.toString());
        }
    }
    }
