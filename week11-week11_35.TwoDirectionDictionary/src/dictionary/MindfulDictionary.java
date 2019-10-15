package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
public class MindfulDictionary {
    private HashMap<String,String> dictionaryA;
    private HashMap<String,String> dictionaryB;
    private File file;
    private Scanner reader;
    private FileWriter writer;


    public MindfulDictionary(){
        this.dictionaryA= new HashMap<String, String>();
        this.dictionaryB = new HashMap<String, String>();
    }

    public MindfulDictionary(String file) throws FileNotFoundException, IOException{
        this.dictionaryA = new HashMap<String, String>();
        this.dictionaryB = new HashMap<String, String>();
        this.file = new File(file);
        try{
            this.reader = new Scanner(this.file);
        }
        catch (FileNotFoundException e){
            System.out.println("file not found");
        }

    }

    public boolean load(){
        if(!this.reader.hasNextLine()){
            return false;
        }else{
            while(this.reader.hasNextLine()){
                String line = reader.nextLine();
                String [] parts = line.split(":");
                this.dictionaryA.put(parts[0], parts[1]);
                this.dictionaryB.put(parts[1], parts[0]);
            }
            return true;
        }

    }

    public boolean save() {
        try{
            this.writer = new FileWriter(this.file);
            for(String a : this.dictionaryA.keySet()){
                String line = a + ":" + this.dictionaryA.get(a) + "\n";
                this.writer.write(line);
            }
            this.writer.close();
        }catch (IOException e){
            return false;
        }
        return true;
    }

    public void add(String word, String translation){
        if(!this.dictionaryA.containsKey(word) && !this.dictionaryB.containsKey(translation)){
            this.dictionaryA.put(word,translation);
            this.dictionaryB.put(translation,word);
        } else if(this.dictionaryB.containsKey(translation)){

        }else{

        }
    }

    public String translate(String word) {
        for (String l : this.dictionaryA.keySet()) {
            if (l.equals(word)) {
                return this.dictionaryA.get(l);
            }
        }
        for (String k : this.dictionaryB.keySet()) {
            if (k.equals(word)) {
                return this.dictionaryB.get(k);
            }
        }

            return null;
        }

    public void remove(String word){
        if(this.dictionaryA.containsKey(word)){
            this.dictionaryA.remove(word);
            String key = getKeyByValue(this.dictionaryB, word);
            this.dictionaryB.remove(key);
        }else if(this.dictionaryB.containsKey(word)){
            this.dictionaryB.remove(word);
            String key = getKeyByValue(this.dictionaryA, word);
            this.dictionaryA.remove(key);
        }
    }
    public <T, E> T getKeyByValue(Map<T, E> map, E value) {
        for (Map.Entry<T, E> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}
