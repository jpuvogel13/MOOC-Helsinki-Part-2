package tools;
import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover{
    private int numberOfDuplicates;
    private Set<String> uniqueCharacterStrings;

    public PersonalDuplicateRemover(){
        this.numberOfDuplicates=0;
        this.uniqueCharacterStrings= new HashSet<String>();
    }

    public void add(String characterString){
        if(this.uniqueCharacterStrings.contains(characterString)){
            this.numberOfDuplicates++;
        }
        else{
            uniqueCharacterStrings.add(characterString);
        }

    }

    public int getNumberOfDetectedDuplicates(){
        return numberOfDuplicates;

    }

    public Set<String> getUniqueCharacterStrings(){
            return this.uniqueCharacterStrings;

    }

    public void empty(){
        this.uniqueCharacterStrings.clear();
        this.numberOfDuplicates=0;
    }
}
