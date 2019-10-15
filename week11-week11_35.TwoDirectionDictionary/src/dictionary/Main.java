package dictionary;

public class Main {
    public static void main(String[] args) throws Exception{
        MindfulDictionary dict = new MindfulDictionary("src/words.txt");
        dict.load();
        dict.add("apina", "monkey");
        dict.add("banaani", "banana");
        dict.add("apina", "apfe");

        System.out.println( dict.translate("apina") );
        System.out.println( dict.translate("monkey") );
        System.out.println( dict.translate("programming") );
        System.out.println( dict.translate("banana") );

        dict.save();

    }
}
