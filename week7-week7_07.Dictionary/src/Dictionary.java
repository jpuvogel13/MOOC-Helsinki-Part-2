import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> dictionary;


    public Dictionary(){
        this.dictionary= new HashMap<String, String>();
    }
    public String translate(String word){
        if(!(this.dictionary.containsKey(word))){
        return null;
        }
        return this.dictionary.get(word);
    }
    public void add(String word, String translation){
        amountOfWords();
        this.dictionary.put(word, translation);

    }
    public int amountOfWords(){
        return dictionary.size();

    }
    public ArrayList<String> translationList(){
        ArrayList<String> translationList = new ArrayList<String>();
        for ( String key : dictionary.keySet() ) {
           String translation= key + " =  " + translate(key);
           translationList.add(translation);
        }



      return translationList;
    }
}
