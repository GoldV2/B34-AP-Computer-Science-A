import java.lang.Math;

class Expression {

    double num1;
    double num2;
    int operator;
    String opSymbol;
    double result;

    public Expression(double n1, double n2, int o) {
        num1 = n1;
        num2 = n2;
        operator = o;
        evaluate();
        System.out.println(this);
    }

    private void evaluate() {
        switch (operator) {
            case 1:
                result = num1 + num2;
                opSymbol = "+";
                break;
            
            case 2:
                result = num1 - num2;
                opSymbol = "-";
                break;
            
            case 3:
                result = num1 * num2;
                opSymbol = "*";
                break;
            
            case 4:
                try {
                    result = num1 / num2;
                    opSymbol = "/";
                }
                
                catch (Exception e) {
                    throw new ArithmeticException("Cannot divide by zero.");                    
                }
                break;
                
            case 5:
                result = Math.pow(num1, num2);
                opSymbol = "^";
                break;

            case 6:
                if (num1%2 == 0 && num2 < 0) {
                    throw new ArithmeticException("Result is not a real number.");
                }
                result = Math.pow(num2, 1/num1); 
                opSymbol = "√";
                break;
        }

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            throw new ArithmeticException("Overflow error.");
        }
    }

    public String toString() {
        return num1 + opSymbol + num2 + " = " + result;
    }

}