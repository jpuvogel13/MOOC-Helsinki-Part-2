package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        JFrame frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(200,300));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();

        frame.setVisible(true);
        // Create your app here
    }

    public void createComponents(Container container){
        BoxLayout boxLayout = new BoxLayout(container,BoxLayout.Y_AXIS);
        container.setLayout(boxLayout);
        container.add(new JLabel("Are you?"));
        JCheckBox button = new JCheckBox("Yes!");
        JCheckBox button1 = new JCheckBox("No!");
        container.add(button);
        container.add(button1);
        container.add(new JLabel("Why?"));
        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButton button2 = new JRadioButton("No reason.");
        JRadioButton button3 = new JRadioButton("Because it is fun!");

        buttonGroup.add(button2);
        buttonGroup.add(button3);
        container.add(button2);
        container.add(button3);
        JButton label = new JButton("Done!");
        container.add(label);


    }


    public JFrame getFrame() {
        return frame;
    }
}
