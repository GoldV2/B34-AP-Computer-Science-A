public class Monkey extends Primate {
    
    String steals;

    public Monkey() {
        super(true);
        this.steals = Main.stringInput("Enter what the monkey steals");
        species = "Monkey";
    }

    public void getSpecial() {
        super.getSpecial();
        System.out.print("they steal " + steals);
    }
}
