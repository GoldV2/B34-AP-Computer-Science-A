import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            String[] ops = {"+", "-", "*", "/", "^", "nth√"};
            for (int i = 0; i < ops.length; i++) {
                System.out.println("[" + (i+1) + "] " + ops[i]);
            }
        
            int op = intInput("Select an operation");
            double n1 = doubleInput("Enter a number");
            double n2 = doubleInput("Enter another number");
            new Expression(n1, n2, op);
        }
    }
    
    public static int intInput(String prompt) {
        System.out.print(prompt + "\n>>> ");
        return scan.nextInt();
    }
    
    public static double doubleInput(String prompt) {
        System.out.print(prompt + "\n>>> ");
        return scan.nextDouble();
    }
}