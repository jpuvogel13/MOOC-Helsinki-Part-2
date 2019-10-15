import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Subtraction implements ActionListener {

    private JTextField textOutput;
    private JTextField textInput;

    public Subtraction ( JTextField textOutput, JTextField textInput){
        this.textInput=textInput;
        this.textOutput= textOutput;
    }

    @Override
    public void actionPerformed(ActionEvent ae){
        int input = 0;
        try {
            input = Integer.parseInt(textInput.getText());
        }catch (NumberFormatException exception){
            this.textInput.setText("");
        }
        int output = Integer.parseInt(textOutput.getText());
        int total = output - input;
        String answer = Integer.toString(total);
        textOutput.setText(answer);
        this.textInput.setText("");
    }
}
