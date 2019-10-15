package clicker.ui;

import clicker.applicationlogic.PersonalCalculator;
import clicker.applicationlogic.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener {
    private Calculator calculator;
    private JLabel label;

    public ClickListener( Calculator calculator, JLabel label){
        this.label= label;
        this.calculator= calculator;
    }

    @Override
    public void actionPerformed(ActionEvent ae){
        calculator.increase();
        label.setText(calculator.toString());

        }
}
