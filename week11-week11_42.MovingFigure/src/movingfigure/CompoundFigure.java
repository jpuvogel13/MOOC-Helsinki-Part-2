package movingfigure;

import java.awt.*;
import java.util.ArrayList;

public class CompoundFigure extends Figure {
    private ArrayList<Figure> list;

    public CompoundFigure(){
        super(0,0);
        this.list = new ArrayList<Figure>();
    }

    public void add(Figure f){
        this.list.add(f);

    }

    public void draw(Graphics graphics){
        for(Figure k : this.list){
            k.draw(graphics);
        }
    }
    @Override
    public void move(int dx, int dy){
        for(Figure l : this.list){
            l.move(dx,dy);
        }
    }
}
