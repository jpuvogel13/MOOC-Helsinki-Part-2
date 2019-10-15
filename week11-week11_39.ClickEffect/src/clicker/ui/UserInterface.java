package clicker.ui;

import clicker.applicationlogic.Calculator;
import clicker.applicationlogic.PersonalCalculator;

import java.awt.*;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator calculator;

    public UserInterface(Calculator calculator){
        this.calculator=calculator;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(400, 300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(2,0);
        frame.setLayout(layout);

        JLabel text = new JLabel("0");
        JButton button = new JButton("Click!");

        ClickListener click = new ClickListener(calculator,text);
        button.addActionListener(click);

        container.add(text);
        container.add(button);


    }

    public JFrame getFrame() {
        return frame;
    }
}
