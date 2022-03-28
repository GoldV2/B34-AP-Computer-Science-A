public class Ape extends Primate {
    
    int deadliftMax;

    public Ape() {
        super(false);
        this.deadliftMax = Main.intInput("Enter the ape's deadlift max");
        species = "Ape";
    }

    public void getSpecial() {
        super.getSpecial();
        System.out.print("they deadlift " + deadliftMax);
    }
}
