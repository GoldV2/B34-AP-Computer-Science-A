public class Monkey extends Primate {
    
    String steals;

    public Monkey() {
        super(true);
        this.steals = Main.stringInput("Enter what the monkey steals");
        species = "Monkey";
    }
}
