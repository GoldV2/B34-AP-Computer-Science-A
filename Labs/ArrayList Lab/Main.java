import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        StringList nameList = new StringList();
        populate(nameList);
        String winner = getWinner(nameList);
        System.out.println(nameList);
        System.out.println("Congratulations to " + winner + "!");
    }

    private static void populate(StringList nameList) {
        while (true) {
            String name = stringInput("Enter to quit. Enter a name");
            if (name.equals("")) {
                break;
            }

            nameList.add(name);
        }
    }

    private static String stringInput(String prompt) {
        System.out.print(prompt + "\n>>> ");
        return scan.nextLine();
    }

    private static String getWinner(StringList nameList) {
        int winningIndex = (int) (Math.random()*(nameList.size+1));
        return nameList.get(winningIndex);
    }

}
