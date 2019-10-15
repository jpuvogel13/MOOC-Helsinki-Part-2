package movingfigure;

import java.awt.*;

public class Box extends Figure {
    private int height;
    private int width;

    public Box(int x, int y, int width, int height){
        super(x,y);
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics graphics){
        graphics.fillRect(super.getX(),super.getY(),width,height);

    }
}

