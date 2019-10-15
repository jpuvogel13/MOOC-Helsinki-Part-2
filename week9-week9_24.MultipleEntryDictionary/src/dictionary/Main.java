
package dictionary;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Test your dictionary here
        MultipleEntryDictionary dict = new PersonalMultipleEntryDictionary();
        dict.add("kuusi", "six");
        dict.add("kuusi", "spruce");



        System.out.println(dict.translate("kuusi"));
        dict.remove("pii");
        System.out.println(dict.translate("pii"));

    }
}