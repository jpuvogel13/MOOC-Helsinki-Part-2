package file;
import  java.io.File;
import java.util.Scanner;

public class Analysis {
    private File file;
    private Scanner reader;

    public Analysis(File file){
        this.file= file;
    }

    public int lines(){

        try {
            reader = new Scanner(file);
        }catch (Exception e){
            System.out.println("We couldn't read the file. Error: " + e.getMessage());
        }
        int counter=0;
        while(reader.hasNextLine()){
            String line = "";
            line=reader.nextLine();
            counter++;
        }
        return counter;
    }

    public int characters(){
        String line = "";
        int totalCharacters=0;
        try {
            reader = new Scanner(file);
        }catch (Exception e){
            System.out.println("We couldn't read the file. Error: " + e.getMessage());
        }
        if(this.file==null){
            return 0;
        }
        while(reader.hasNext()){
            line=reader.nextLine();
            int length = line.length();
            totalCharacters+=length+1;
        }

        return totalCharacters;
    }
}
