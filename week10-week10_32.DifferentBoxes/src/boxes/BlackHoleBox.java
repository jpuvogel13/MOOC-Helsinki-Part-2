package boxes;

public class BlackHoleBox extends Box{
    private Thing thing;

    public BlackHoleBox(){
        this.thing = null;
    }

    @Override  public void add(Thing thing) {
        if(this.thing == null){

        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
            return false;

        }
}
