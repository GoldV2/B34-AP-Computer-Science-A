import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = intInput("Enter # of rows, -1 for random");
        int m = intInput("Enter # of cols, -1 for random");
        int random = intInput("Enter 1 to manually set values, 2 to randomly set");

        TDArray a = new TDArray(n, m, random);

        System.out.println("\n\nARRAY AND SUMS\n");
        System.out.println(a);

        System.out.println("\n\nTRANSPOSED ARRAY AND SUMS\n");
        a.transpose();
        System.out.println(a);
    }

    private static int intInput(String prompt) {
        System.out.print(prompt+"\n>>> ");
        return scan.nextInt();
    }

}