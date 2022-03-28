public class Ape extends Primate {
    
    int deadliftMax;

    public Ape() {
        super(false);
        this.deadliftMax = Main.intInput("Enter the ape's deadlift max");
        species = "Ape";
    }

    public String getSpecial() {
        return super.getSpecial() + "they deadlift " + deadliftMax;
    }
}
