package wormgame.game;
import wormgame.domain.Apple;
import wormgame.domain.Worm;
import wormgame.domain.Piece;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.gui.Updatable;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    private Random random;
    private Worm worm;
    private Apple apple;

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;

        this.random = new Random();

        addActionListener(this);
        setInitialDelay(2000);

        this.worm = new Worm(width/2, height/2, Direction.DOWN);
        this.apple = new Apple(random.nextInt(width), random.nextInt(height));
        if(this.worm.runsInto(apple)){
            Apple newApple = new Apple(random.nextInt(width),random.nextInt(height));
            setApple(newApple);
        }


    }

    public Worm getWorm(){
        return this.worm;
    }
    public void setWorm(Worm worm){
        this.worm = worm;
    }

    public Apple getApple(){
        return this.apple;
    }

    public void setApple(Apple apple){
        this.apple = apple;

    }

    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        worm.move();
        int head = worm.getLength()-1;
        Piece headPiece = worm.getPieces().get(head);
        if(headPiece.runsInto(apple)){
            Apple newApple = new Apple(random.nextInt(width),random.nextInt(height));
            setApple(newApple);
            worm.grow();
        }
        if(worm.runsIntoItself() == true || headPiece.getY()==0 || headPiece.getY()== height
                || headPiece.getX()==0 || headPiece.getX()==width){
            this.continues=false;
        }
        if(!continues){
            return;
        }
        updatable.update();

        super.setDelay(1000/worm.getLength());

    }

}
