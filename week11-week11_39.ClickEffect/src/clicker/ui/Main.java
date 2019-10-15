package clicker.ui;
import clicker.applicationlogic.PersonalCalculator;
import clicker.applicationlogic.Calculator;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new PersonalCalculator();
        UserInterface ui = new UserInterface(calc);
        SwingUtilities.invokeLater(ui);
    }
}
