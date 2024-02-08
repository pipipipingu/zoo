public class Animal {
    //Field descriptors
    private String species;
    private Enclosure enclosure;
    private int areaNeeded;

    // constructor
    public Animal(String species, Enclosure enclosure, int areaNeeded) {
        this.species = species;
        this.enclosure = enclosure;
        this.areaNeeded = areaNeeded;
    }


    // method descriptors
    public boolean hasCompanion() {
        int countSpecies = 0;
        for (Animal animal : enclosure.getAnimals()) {
            if (animal.getSpecies().equals(species)) {
                countSpecies++;
            }
        }
        return countSpecies >=1;
    }

    // getter and setter for species
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }


    // getter and setter for Enclosure
    public Enclosure getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(Enclosure enclosure) {
        this.enclosure = enclosure;
    }


    // getter and setter for areaNeeded
    public int getAreaNeeded() {
        return areaNeeded;
    }

    public void setAreaNeeded() {
        this.areaNeeded = areaNeeded;
    }
}
