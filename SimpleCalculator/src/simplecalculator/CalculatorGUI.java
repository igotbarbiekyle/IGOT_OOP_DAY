
package simplecalculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorGUI {
   
    private JFrame frame;
    private JPanel panel;
    private JTextField textField;
    private JButton[] buttons;
    private JButton[] functionButtons;
    private Calculator calculator;
    
public CalculatorGUI() {
    frame = new JFrame("Calculator");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    panel = new JPanel ();
    panel.setLayout(new GridLayout(4,4));
    
    textField = new JTextField ();
    
    buttons = new JButton[16];
    String[] buttonLabels = {
        "7", "8", "9", "/",
        "4", "5", "6", "*" ,
        "1", "2", "3", "-",
        "C", "0", "=", "+",
    };
    
    calculator = new Calculator();
    
    ButtonClickListener buttonClickListener = new ButtonClickListener();
            for (int i = 0; i < buttonLabels.length; i++){
                buttons[i] = new JButton(buttonLabels[i]);
                buttons[i].addActionListener(buttonClickListener);
                panel.add(buttons[i]);
}
    frame.add(textField, BorderLayout.NORTH);
    frame.add(panel, BorderLayout.CENTER);
    
    frame.setSize(300, 400);
    frame.setVisible(true);
}

private class ButtonClickListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (Character.isDigit(command.charAt(0)) || command.equals(".")) {
            String currentText = textField.getText();
            textField.setText(currentText + command);
        }else if(command.equals("=")) {
            String expression = textField.getText();
            double result = calculator.evaluateExpression(expression);
            textField.setText(String.valueOf(result));
        } else if (command.equals("C")) {
                textField.setText("");
                calculator.clear();
        } else {
            String currentText = textField.getText();
            textField.setText(currentText + command);
         }
    }

}
 
}