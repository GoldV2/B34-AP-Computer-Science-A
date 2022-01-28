import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        input("Enter array length");
        int len = scan.nextInt();
        input("Enter 1 to randomly populate, enter 2 to populate array");
        int pop = scan.nextInt();

        int[] nums = new int[len];
        if (pop == 1) {
            input("Enter minimum random value");
            int min = scan.nextInt();
            input("Enter maximum random value");
            int max = scan.nextInt();

            for (int i = 0; i < len; i++) {
                nums[i] = (int)(min + (Math.random() * (max - min)));
            }
        }
        else if (pop == 2) {
            for (int i = 0; i < len; i++) {
                input(i + ": enter an integer");
                nums[i] = scan.nextInt();
            }
        }

        SpecialArray myArray = new SpecialArray(nums);
        System.out.println(myArray);
    }

    static void input(String str) {
        System.out.print(str + "\n>>> ");
    }

}
