import java.util.Scanner;
class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            int what = intInput("Enter 1 to check if it's prime, 2 to find primes less than, 0 to quit");
            if (what == 1) {
                int num = intInput("Enter a number");
                System.out.println("The statement, '" + num + " is a prime number' is " + isPrime(num));
            }
            
            else if (what == 2) {
                int num = intInput("Enter a number");
                System.out.println("Primes less than " + num);
                primeLessThan(num);
            }
            else if (what == 0) {
                break;
            }
        }
    }

    public static boolean isPrime(int num) {
        int max = num/2;
        for (int i = 2; i <= max; i++) {
            if (num%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeLessThan(int num) {
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static int intInput(String prompt) {
        System.out.print(prompt + "\n>>> ");
        return scan.nextInt();
    }
}