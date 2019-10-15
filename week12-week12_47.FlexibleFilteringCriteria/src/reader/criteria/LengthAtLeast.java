package reader.criteria;

public class LengthAtLeast implements Criterion {
    private int length;

    public LengthAtLeast(int length){
        this.length = length;

    }

    public boolean complies(String word){
        if(word.length()>=this.length) {
            return true;
        }
        return false;

    }
}
