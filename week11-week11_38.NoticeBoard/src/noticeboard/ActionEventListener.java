package noticeboard;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ActionEventListener implements ActionListener {
    private JLabel destination;
    private JTextField orgin;

    public ActionEventListener(JLabel destination, JTextField orgin){
        this.destination=destination;
        this.orgin=orgin;
    }

    @Override
    public void actionPerformed(ActionEvent ae){
        this.destination.setText(this.orgin.getText());
        this.orgin.setText("");
    }
}
