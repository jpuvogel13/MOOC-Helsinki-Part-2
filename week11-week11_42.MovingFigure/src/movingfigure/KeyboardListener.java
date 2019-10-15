package movingfigure;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Component;

public class KeyboardListener implements KeyListener {
    private Figure figure;
    private Component drawingBoard;

    public KeyboardListener(Component drawingBoard, Figure figure){
        this.figure = figure;
        this.drawingBoard = drawingBoard;

    }

    public void keyPressed(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_UP){
            figure.move(0,-1);
        }
        else if(e.getKeyCode() == KeyEvent.VK_DOWN){
            figure.move(0,1);
        }
        else if(e.getKeyCode() == KeyEvent.VK_LEFT){
            figure.move(-1,0);
        }else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            figure.move(1,0);
        }
        drawingBoard.repaint();
    }

    public void keyReleased(KeyEvent e){


    }
    public void keyTyped(KeyEvent e){

    }
}
