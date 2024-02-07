import java.util.ArrayList;
public class Enclosure {
    // Field Descriptors

    private String name;
    private double area;
    private ArrayList<Animal> animals;

    // constructor
    public Enclosure(String name, double area) {
    }

    // method descriptors
    public int countAnimals() { return 0; }
    public double getUtilisedArea() { return 0; }
    public double getUtilisedAreaPercentage() { return 0; }

    public int countSpecies() { return 0; }

    public boolean addAnimal(Animal animal) { return false; }

    // other methods add below as needed
}
