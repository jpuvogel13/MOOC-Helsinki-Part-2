
import java.awt.*;
import javax.swing.*;

public class GraphicCalculator implements Runnable {
    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(400,500));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        frame.setLayout(new GridLayout(3, 1));
        JTextField textOutput = new JTextField("0");
        textOutput.setEnabled(false);
        JTextField textInput = new JTextField("0");
        JPanel buttons = new JPanel(new GridLayout(1, 3));
        JButton plus = new JButton("+"); buttons.add(plus);
        Addition addition = new Addition(textOutput,textInput);
        plus.addActionListener(addition);
        JButton minus = new JButton("-"); buttons.add(minus);
        Subtraction subtraction = new Subtraction(textOutput,textInput);
        minus.addActionListener(subtraction);
        JButton z = new JButton("Z");buttons.add(z);
        Z zClass = new Z(textOutput,textInput);
        if(textOutput.equals("0")){
            z.setEnabled(false);
        }else{
            z.addActionListener(zClass);}
        container.add(textOutput);
        container.add(textInput);
        container.add(buttons);
        if(textOutput.equals("0")){
            z.setEnabled(false);
        }
    }
    public JFrame getFrame() {
        return frame;
    }
}
