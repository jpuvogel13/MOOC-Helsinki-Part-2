package reference;
import reference.domain.Person;
import reference.domain.Film;
import reference.domain.*;
import sun.dc.path.PathError;
import java.util.Map;
import java.util.*;
import reference.comparator.*;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while(true) {
            System.out.print("Write a number: ");

            try {
                int num = Integer.parseInt(reader.nextLine());
                System.out.println("Looks good!");
                break;
            } catch (Exception e) {
                System.out.println("You haven't written a proper number.");

            }

        }

    }


}
