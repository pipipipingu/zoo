import java.util.ArrayList;
public class Zoo {
    // field descriptors
    private String name;
    private String description;
    private ArrayList<Enclosure> enclosures;

    // constructor
    public Zoo(String name, String description, ArrayList<Enclosure> enclosures){
        this.name = name;
        this.description = description;
        this.enclosures = enclosures;
    }

    // method descriptors
    public int getTotalEnclosureArea() {
        int totalEnclosureArea = 0;
        for (Enclosure enclosure : enclosures) {
            totalEnclosureArea += enclosure.getArea();
        }
        return totalEnclosureArea;
    }

    public int countEnclosures() {
        return enclosures.size();
    }

    // getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // getter and setter for description
    public String getDescription() {
        return description;
    }

    public void setDescription( String description) {
        this.description = description;
    }

    // getter and setter for enclosure
    public ArrayList<Enclosure> getEnclosures() {
        return enclosures;
    }

    public void setEnclosures (ArrayList<Enclosure> enclosures) {
        this.enclosures = enclosures;
    }
}

    public void setEnclosures (ArrayList<Enclosure> enclosures) {
        this.enclosures = enclosures;
    }
}
