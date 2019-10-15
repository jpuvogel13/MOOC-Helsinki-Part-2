package reader.criteria;

public class Not implements Criterion {
    private Criterion criterion;

    public Not(Criterion criterion){
        this.criterion = criterion;
    }

    public boolean complies(String word){
        if(!(criterion.complies(word))) {
            return true;
        }
        return false;
    }
}
