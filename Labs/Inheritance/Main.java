import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Zoo z = new Zoo();
        System.out.println("Welcome to your own zoo!");
        while (true) {
            System.out.println("1: see all animals");
            System.out.println("2: add an animal");
            System.out.println("3: hear an animal speak");
            System.out.println("4: see what is special about the animal");
            System.out.println("0: quit");
            
            int udo = Main.intInput("");
            if (udo == 1) {
                z.seeAnimals();
            }

            else if (udo == 2) {
                z.addAnimal();
            }

            else if (udo == 3) {
                z.hearAnimal();
            }

            else if (udo == 4) {
                z.seeSpecial();
            }

            else if (udo == 0) {
                System.out.println("Bye! Your animals will miss you");
                break;
            }

            else {
                System.out.println("I couldn't understand that. Try again");
            }
        }
    }

    public static String stringInput(String prompt) {
        System.out.print(prompt + "\n>>> ");
        return scan.nextLine();
    }

    public static int intInput(String prompt) {
        System.out.print(prompt + "\n>>> ");
        return scan.nextInt();
    }
}