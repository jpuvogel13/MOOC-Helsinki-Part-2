package wormgame.gui;

import wormgame.domain.Piece;
import wormgame.game.WormGame;

import javax.swing.*;
import java.awt.*;

public class DrawingBoard extends JPanel implements Updatable {
    private int pieceLength;
    private WormGame wormGame;

    public DrawingBoard(WormGame wormGame, int pieceLength){
        super.setBackground(Color.GRAY);
        this.pieceLength= pieceLength;
        this.wormGame = wormGame;
    }
    @Override
    protected void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        for(Piece piece : wormGame.getWorm().getPieces()) {
            graphics.setColor(Color.black);
            graphics.fill3DRect(piece.getX() * pieceLength ,piece.getY() * pieceLength ,pieceLength,pieceLength,true);
        }
        graphics.setColor(Color.RED);
        graphics.fillOval(wormGame.getApple().getX()*pieceLength,wormGame.getApple().getY() * pieceLength,pieceLength,pieceLength);
    }
    public void update(){
        super.repaint();
    }

}
