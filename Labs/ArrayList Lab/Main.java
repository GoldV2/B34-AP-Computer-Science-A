import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        NameArrayList names = new NameArrayList();
        populate(names);
        String winner = getWinner(names);
        System.out.println(names);
        System.out.println("Congratulations to " + winner + "!");
    }

    private static void populate(NameArrayList names) {
        while (true) {
            String name = stringInput("Enter to quit. Enter a name");
            if (name.equals("")) {
                break;
            }

            names.add(name);
        }
    }

    private static String stringInput(String prompt) {
        System.out.print(prompt + "\n>>> ");
        return scan.nextLine();
    }

    private static String getWinner(NameArrayList names) {
        int winningIndex = (int) (Math.random()*(names.vals.size()));
        return names.vals.get(winningIndex);
    }

}
