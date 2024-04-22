
package simplecalculator;


public class Calculator {

private double primaryOperand;
private double secondaryOperand;
private char operator;

public Calculator() {
    clear();
}

public double evaluateExpression(String expression) {
        String[] parts = expression.split("\\+|-|\\*|/");
        this.primaryOperand = Double.parseDouble(parts[0]);
        this.secondaryOperand = Double.parseDouble(parts[1]);
        this.operator = expression.charAt(parts[0].length());
        double result = 0;
        
    switch (this.operator) {
        case '+':
        result = this.primaryOperand + this.secondaryOperand;
        break;
       case '-':
        result = this.primaryOperand - this.secondaryOperand;
        break; 
        case '*':
        result = this.primaryOperand * this.secondaryOperand;
        break;
        case '/':
        if (this.secondaryOperand != 0) {
            result = this.primaryOperand / this.secondaryOperand;
        } else {
            throw new ArithmeticException("Division by Zero!");
        } 
        break;
        default:
            throw new IllegalArgumentException("Invslid Operator!");
}
    return result;
}

public void clear() {
    this.primaryOperand = 0;
    this.secondaryOperand = 0;
    this. operator = ' ';
}
}
