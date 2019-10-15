package reader.criteria;

import java.awt.*;
import java.util.ArrayList;

public class Both implements Criterion {
    private Criterion containsWord;
    private Criterion endsWithQuestionOrExclamationMark;

    public Both(Criterion criterion, Criterion criterion1){
        this.containsWord = criterion;
        this.endsWithQuestionOrExclamationMark = criterion1;
    }

    public boolean complies(String word){
        if(containsWord.complies(word) && endsWithQuestionOrExclamationMark.complies(word)){
        return true;
        }
        return false;
    }
}
