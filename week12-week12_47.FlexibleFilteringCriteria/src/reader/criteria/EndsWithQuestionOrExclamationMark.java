package reader.criteria;

public class EndsWithQuestionOrExclamationMark implements Criterion {

    public boolean complies(String word){
        int length = word.length()-1;
        if(word==""){
            return false;
        }
        else if(word.charAt(length)=='?' || word.charAt(length)== '!'){
            return true;
        }
        return false;
    }

}
