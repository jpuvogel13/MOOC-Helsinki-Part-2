package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400,300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);

    }

    private void createComponents(Container container) {
        GridLayout grid = new GridLayout(3,1);
        container.setLayout(grid);
        JTextField textFieldTop = new JTextField("I was copied here from the JTextArea");
        JButton button = new JButton("Copy!");
        JLabel textFieldBottom = new JLabel("");
        ActionEventListener copier = new ActionEventListener(textFieldBottom,textFieldTop);
        button.addActionListener(copier);
        container.add(textFieldTop);
        container.add(button);
        container.add(textFieldBottom);

    }
}
