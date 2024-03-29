package wormgame.gui;
import wormgame.Direction;
import wormgame.domain.Worm;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardListener implements KeyListener {
    private Worm worm;

    public KeyboardListener(Worm worm){
        this.worm = worm;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            this.worm.setDirection(Direction.RIGHT);
        }else if(e.getKeyCode() == KeyEvent.VK_LEFT){
            this.worm.setDirection(Direction.LEFT);
        }else if(e.getKeyCode() == KeyEvent.VK_DOWN){
            this.worm.setDirection(Direction.DOWN);
        }else if(e.getKeyCode() == KeyEvent.VK_UP){
            this.worm.setDirection(Direction.UP);
        }
    }

    public void keyReleased(KeyEvent e){

    }

    public void keyTyped(KeyEvent e){

    }

}
