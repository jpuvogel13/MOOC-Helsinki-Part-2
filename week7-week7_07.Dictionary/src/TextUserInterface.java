import java.util.Scanner;
public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader=reader;
        this.dictionary= dictionary;
    }

    public void start(){
        System.out.println("Statements:");
        System.out.println("    add - adds a word pair to the dictionary");
        System.out.println("    translate - asks a word and prints its translation");
        System.out.println("    quit - quit the text user interface");
        System.out.println();
        while(true){
            System.out.print("Statement: ");
        String answer = this.reader.nextLine();
            if (answer.equalsIgnoreCase("quit")) {
                    System.out.println("Cheers!");
                    break;
            } else if(answer.equalsIgnoreCase("add")){
                add();
            } else if(answer.equalsIgnoreCase("translate")){
                translate();
            }
            else {
                System.out.println("Unknown statement");
            }

        }
    }
    public void add(){
        System.out.print("In Finnish: ");
        String finnishWord=this.reader.nextLine();
        System.out.print("Translation: ");
        String translation= this.reader.nextLine();
        dictionary.add(finnishWord,translation);
        System.out.println("");
    }
    public void translate(){
        System.out.print("Give a word: ");
        String answer=this.reader.nextLine();
        System.out.println("Translation: " + dictionary.translate(answer));
    }

}
