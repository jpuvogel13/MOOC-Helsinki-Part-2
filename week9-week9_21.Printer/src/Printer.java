import java.io.File;
import java.util.Scanner;


public class Printer {
    private Scanner reader;
    private File textFile;

    public Printer(String fileName) throws Exception{
        this.textFile=new File(fileName);
    }

    public void printLinesWhichContain(String word) throws Exception{
        this.reader = new Scanner(this.textFile,"UTF-8");
        if(word==""){
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            }else{

        while (reader.hasNextLine()) {
            String line = "";
            line += reader.nextLine();
            if (line.contains(word)) {
                System.out.println(line);
            }
        }

        }

    }
}
