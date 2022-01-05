import java.util.Scanner;

public class Main {
    
    private static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {
        int size = Integer.parseInt(input("Enter size of array"));
        ArrayItem[] items = populate(size);
        
        System.out.println("-1: Quit\n\"index\" to increment a count\n\"index.INT\" to multiply the count by INT\"\n\"index.123\" to see index count");
        while (true) {
            double ind = Double.parseDouble(input(""));
            if (ind < -1 || ind >= size) {
                System.out.println("INVALID INPUT, try again!");
            }
            else if (ind == -1) {
                System.out.println("PRINTING COUNT FOR EACH INDEX");
                for (int i=0; i < size; i++) {
                    System.out.println("Index " + i + ": " + items[i].getCount());
                }
                System.out.println("GOODBYE!");
            }
            else if ((int)((ind-(int)ind)*1000) == 123 || (int)((ind-(int)ind)*1000) == 122) {
                System.out.print("COUNT: " + items[(int)ind].getCount());
            }
            else {
                int remainder = (int)(ind % 1 * 10);
                int indInt = (int)ind;
                items[indInt].increment(remainder);
            }
        }

    }

    public static ArrayItem[] populate(int size) {
        ArrayItem[] items = new ArrayItem[size];
        for (int i=0; i < size; i++) {
            items[i] = new ArrayItem(i);
        }

        return items;
    }

    public static String input(String s) {
        if (s.equals("")) {
            System.out.print("\n>>> ");
        }
        else {
            System.out.print(s + "\n>>> ");
        }
        return scan.nextLine();
    }

}