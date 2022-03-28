public class FlightlessBird extends Bird {
 
    int speedMax;

    public FlightlessBird() {
        super(false);
        this.speedMax = Main.intInput("Enter the flightless bird's speed max");
        species = "Flightless Bird";
    }
}
