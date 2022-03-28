public class FlyingBird extends Bird {
    
    int heightMax;

    public FlyingBird() {
        super(true);
        this.heightMax = Main.intInput("Enter the flying bird's flying height max");
        species = "Flying Bird";
    }

    public void getSpecial() {
        super.getSpecial();
        System.out.print("their max flying height is " + heightMax);
    }
}
