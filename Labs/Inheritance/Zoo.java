import java.util.ArrayList;
import java.util.function.Supplier;

public class Zoo {
    ArrayList<Supplier<Animal>> animalFactory = new ArrayList<>();
    ArrayList<Animal> animals = new ArrayList<Animal>();
    String[] displayAnimals = {"Flying Bird", "Flightless Bird", "Monkey", "Ape"};

    public Zoo() {
        this.animalFactory.add(FlyingBird::new);
        this.animalFactory.add(FlightlessBird::new);
        this.animalFactory.add(Monkey::new);
        this.animalFactory.add(Ape::new);
    }

    public void seeAnimals() {
        if (animals.size() == 0) {
            System.out.println("The zoo is empty!");
        }

        for (int i = 0; i < this.animals.size(); i++) {
            System.out.println(i + ": " + animals.get(i).toString());
        }
    }

    public void hearAnimal() {
        this.seeAnimals();

        if (this.animals.size() > 0) {
            int i = Main.intInput("Enter a number to make the animal speak");
            this.animals.get(i).speak();
        }
    }

    public void addAnimal() {
        for (int i = 0; i < this.displayAnimals.length; i++) {
            System.out.println(i + ": " + this.displayAnimals[i]);
        }

        int ind = Main.intInput("");
        this.animals.add(this.animalFactory.get(ind).get());
    }
}
