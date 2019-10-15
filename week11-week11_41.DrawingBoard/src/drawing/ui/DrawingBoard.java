package drawing.ui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel {

    public DrawingBoard() {
        super.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        //left eye
        graphics.fillRect(80,50, 50,50);
        //right eye
        graphics.fillRect(225,50, 50,50);
        //left smile
        graphics.fillRect(50, 200, 50,50);
        //long smile
        graphics.fillRect(100,250,190,50);
        graphics.fillRect(290,200,50,50);
    }
}
