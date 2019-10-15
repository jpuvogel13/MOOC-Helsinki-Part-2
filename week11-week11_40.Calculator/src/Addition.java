import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Addition implements ActionListener {
    private JTextField output;
    private JTextField input;

    public Addition(JTextField output, JTextField input){
        this.output = output;
        this.input = input;

    }
    public void actionPerformed(ActionEvent ae){
        int input = 0;
        try{
            input = Integer.parseInt(this.input.getText());
        }catch (NumberFormatException exception){
            this.input.setText("");

        }
        int output = Integer.parseInt(this.output.getText());
        int total = output + input;
        String answer = Integer.toString(total);
        this.input.setText("");
        this.output.setText(answer);

    }
}
