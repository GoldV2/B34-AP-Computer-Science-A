public class FlyingBird extends Bird {
    
    int heightMax;

    public FlyingBird() {
        super(true);
        this.heightMax = Main.intInput("Enter the flying bird's flying height max");
        species = "Flying Bird";
    }

    public String getSpecial() {
        return super.getSpecial() + "their max flying height is " + heightMax;
    }
}
