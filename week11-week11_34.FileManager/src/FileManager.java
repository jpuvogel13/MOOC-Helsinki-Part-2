
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {
    private ArrayList<String> list = new ArrayList<String>();


    public List<String> read(String file) throws FileNotFoundException{
        Scanner reader = new Scanner(new File(file));
       while(reader.hasNextLine()){
           list.add(reader.nextLine());
       }
        return list;
    }

    public void save(String file, String text) throws IOException {
        FileWriter writer = new FileWriter(new File(file));
        writer.write(text);
        writer.close();
    }

    public void save(String file, List<String> texts) throws IOException {
        FileWriter writer = new FileWriter(new File(file));
        for(String k : texts){
            writer.write(k + "\n");
        }
        writer.close();
    }
}
