import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Z implements ActionListener {
    private JTextField output;
    private JTextField input;

    public Z (JTextField output, JTextField input){
        this.output=output;
        this.input = input;
    }

    public void actionPerformed(ActionEvent ae){
        this.output.setText("0");
        this.input.setText("");


    }

}

