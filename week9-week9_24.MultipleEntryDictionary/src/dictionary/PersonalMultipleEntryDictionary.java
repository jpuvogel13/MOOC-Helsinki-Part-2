package dictionary;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private Map<String, Set<String>> dictionary;


    public PersonalMultipleEntryDictionary(){
        this.dictionary= new HashMap<String, Set<String>>();

    }

    public void add(String word, String entry){
        if(!this.dictionary.containsKey(word)) {
            this.dictionary.put(word, new HashSet<String>());
        }
        Set<String> translations = this.dictionary.get(word);
        translations.add(entry);
    }
    public Set<String> translate(String word){
        Set<String> translations = this.dictionary.get(word);
        return translations;
    }
    public void remove(String word){
        if(dictionary.containsKey(word)){
            this.dictionary.remove(word);


        }

    }

    public void print(){
        for(String k : this.dictionary.keySet()){
            System.out.println(k + " words: " + this.dictionary.get(k));
        }
    }
}
