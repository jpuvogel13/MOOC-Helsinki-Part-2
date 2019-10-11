import java.util.Scanner;
public class Reader {
    private Scanner reader;

    public Reader(){
        this.reader= new Scanner(System.in);
    }

    public String readString(){
        String string= reader.nextLine();
        return string;
    }

    public int readInteger(){
        int input= Integer.parseInt(this.reader.nextLine());
        return input;
    }
}
