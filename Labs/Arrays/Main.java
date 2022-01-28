import java.util.Scanner;

public class Main {
    
    private static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {
        int size = Integer.parseInt(input("Enter size of array"));
        ArrayItem[] items = populate(size);
        
        System.out.println("-1: Quit\n\"index\" to increment a count\n\"index INT\" to multiply the count by INT\"\n\"index count\" to see index count");
        while (true) {
            String input = input("");
            int ind = get_index(input);
            String command = get_command(input);

            if (ind < -1 || ind >= size) {
                System.out.println("Invalid Input, try again!");
            }
            else if (ind == -1) {
                display(items);
                System.out.println("Goodbye!!");
            }
            else if (command.equals("count")) {
                System.out.print(items[(int)ind].getCount());
            }
            else {
                if (command.equals("")) {
                    items[ind].increment(0);
                }
                else {
                    items[ind].increment(Integer.parseInt(command));
                }
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

    public static int get_index(String s) {
        if (s.contains(" ")) {
            return Integer.parseInt(s.substring(0, s.indexOf(" ")));
        }
        else {
            return Integer.parseInt(s);
        }
    }

    public static String get_command(String s) {
        if (s.contains(" ")) {
            return s.substring(s.indexOf(" ")+1);
        }
        else {
            return "";
        }
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

    public static void display(ArrayItem[] items) {
        System.out.println("Printing count for each index");
        for (ArrayItem item : items) {
            System.out.println(item);
        }
    }
}