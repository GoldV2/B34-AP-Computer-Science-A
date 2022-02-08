import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Population pop = new Population();
        
        int auto = intInput("Enter 1 to add songs or 0 to autopopulate");
        if (auto != 1) {
            if (auto != 0 ) {
                print("Couldn't understand that, autopopulating...");
            }
            
            print("Autopopulating...");
            pop.autoPopulate();
        }

        while (true) {
            print("\nArtist count: "+pop.artists.size());
            print("Song count: "+pop.getSongs().size());

            print("\n1: Create song");
            print("2: Create album");
            print("3: Create artist");
            print("4: View all from artist");
            print("5: View all songs");
            print("0: Quit");
            int ido = intInput("Do");
            print("");

            if (ido == 1) {
                pop.createSong();
            }

            else if (ido == 2) {
                pop.createAlbum();
            }

            else if (ido == 3) {
                pop.creatArtist();
            }

            else if (ido == 4) {
                if (pop.artists.size() == 0) {
                    print("You need to create an artist first");
                    continue;
                }

                pop.artistMenu();
                int artistN = intInput("Artist number");
                print(pop.artists.get(artistN-1).toString());
            }

            else if (ido == 5) {
                if (pop.getSongs().size() == 0) {
                    print("You need to create a song first.");
                    continue;
                }

                int by = intInput("Enter 1 to sort by rating, 2 by price");
                int order = intInput("Enter 1 to sort ascending, 2 descending");
                ArrayList<Song> songs = pop.getSongs();
                pop.sortSongs(by, order, songs);
                for (Song song : songs) {
                    print(song.toString());
                }
            }

            else if (ido == 0) {
                print("Goodbye!");
                break;
            }
        }

    }

    public static void print(String str) {
        System.out.println(str);
    }

    public static String strInput(String prompt) {
        System.out.print(prompt+": ");
        return scan.nextLine();
    }

    public static int intInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt+": ");
                return Integer.parseInt(scan.nextLine());
            }

            catch(Exception e) {
                System.out.println("Not a valid integer, try again");
            }
        }
    }

    public static double doubleInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt+": ");
                return Double.parseDouble(scan.nextLine());
            }
            catch(Exception e) {
                System.out.println("Not a valid double, try again");
            }
        }

    }
}
