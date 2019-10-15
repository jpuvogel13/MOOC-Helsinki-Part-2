package reader.criteria;

import java.util.ArrayList;

public class AtLeastOne implements Criterion {
    private ArrayList<Criterion> list;

    public AtLeastOne(Criterion... criterion){
        list = new ArrayList<Criterion>();
        for(int i =0; i<=criterion.length-1; i++){
            list.add(criterion[i]);
        }
    }

    public boolean complies(String word){
        for(Criterion k : this.list){
            if(k.complies(word)){
                return true;
            }
        }
        return false;
    }
}
