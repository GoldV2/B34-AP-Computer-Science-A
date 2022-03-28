public class Animal {
    
    String name;
    String species;
    String says;
    int weight;
    int age;

    public Animal() {
        Main.scan.nextLine();
        this.name = Main.stringInput("Enter the animal's name");
        this.says = Main.stringInput("Enter what the animal says");
        this.weight = Main.intInput("Enter the animal's weight");
        this.age = Main.intInput("Enter the animal's age");
    }

    public void getSpecial() {
        System.out.println(this.name+"'s special thing is that ");
    }

    public String toString() {
        return this.name + " the " + this.species + " is " + this.weight + " lbs and " + age + " years old.";
    }

    public void speak() {
        System.out.println(this.name + " says " + this.says);
    }
}
