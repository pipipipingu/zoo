import java.util.ArrayList;
public class Enclosure {
    // Field Descriptors

    private String name;
    private int area;
    private ArrayList<Animal> animals;

    // constructor
    public Enclosure(String name, int area, ArrayList<Animal> animals) {
        this.name = name;
        this.area = area;
        this.animals = animals;
    }

    // method descriptors
    public int countAnimals() {
        return animals.size();
    }

    public int getUtilisedArea() {
        int totalUtilisedArea = 0;
        for (Animal animal : animals) {
            totalUtilisedArea += animal.getAreaNeeded();
        }
        return totalUtilisedArea;
    }

    public double getUtilisedAreaPercentage() {
        double areaUsed = getUtilisedArea();
        double percentage = areaUsed / area;
        return percentage;
    }

    public int countSpecies(String type) {
        int countSpecies = 0;
        for (Animal animal : animals) {
            if (animal.getSpecies().equals(type)) {
                countSpecies++;
            }
        }
        return countSpecies;
    }

    public boolean addAnimal(Animal animal) {
        if ((area - getUtilisedArea()) >= animal.getAreaNeeded()) {
            animals.add(animal);
            return true;
        } else {
            return false;
        }
    }

    // getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // getter and setter for area
    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    // getter and setter for animals
    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }
}
