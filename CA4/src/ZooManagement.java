import java.util.Scanner;
import java.util.ArrayList;
public class ZooManagement {

    private final static Scanner input = new Scanner(System.in);
    private final static ArrayList<Zoo> zoos = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Welcome to the Zoo Management program.");
        System.out.println("=======================================");

        while (true) {

            // prompt for user input
            System.out.println();
            System.out.println("What would you like to manage?");
            System.out.println();
            System.out.println("1) Manage Zoos");
            System.out.println("2) Manage Enclosures");
            System.out.println("3) Manage Animals");
            System.out.println("Q) Quit Zoo Management");
            System.out.println();
            System.out.println("Please select an option: ");
            String option = input.nextLine();

            // check all options
            switch (option.trim().toUpperCase()) {
                case "1":
                    manageZoos();
                    break;
                case "2":
                    manageEnclosures();
                    break;
                case "3":
                    manageAnimals();
                    break;
                case "Q":
                    return;
                default:
                    System.out.println();
                    System.out.println("Invalid option selected. Please try again.");
                    System.out.println();
            }

        }

    }

    public static void manageZoos() {

        while(true) {

            System.out.println();
            System.out.println("Manage Zoos");
            System.out.println("-------------------------");
            System.out.println("a) Create new zoos");
            System.out.println("b) Delete existing zoos");
            System.out.println("c) Calculate total area of all enclosures in the zoo");
            System.out.println("d) Count total number of enclosures");
            System.out.println("Q) Back to Main Menu");
            System.out.println();
            System.out.println("Please select an option: ");
            String option = input.nextLine();

            switch(option.trim().toUpperCase()) {
                case "A":
                    System.out.print("Enter name of the zoo: ");
                    String name = input.nextLine();
                    System.out.print("Enter description of the zoo: ");
                    String description = input.nextLine();
                    zoos.add(new Zoo(name, description, new ArrayList<>()));
                    System.out.println();
                    System.out.println("Zoo added successfully.");
                    System.out.println();
                    break;
                case "B":
                    for(int i = 0; i < zoos.size(); i++) {
                        System.out.printf("%d. %s", i + 1, zoos.get(i).getName());
                        System.out.println();
                    }
                    System.out.print("Select the zoo to remove: ");
                    // will cause error when user inputs string
//                    int opt = input.nextInt();
//                    input.nextLine();
//                    zoos.remove(opt - 1);
                    String zooName = input.nextLine();
                    int count = zoos.size();
                    for (Zoo zoo1: zoos) {
                        if (zoo1.getName().equals(zooName)) {
                            zoos.remove(zoo1);
                            count--;
                            System.out.println();
                            System.out.print("Zoo removed successfully.");
                        } else {
                            System.out.println("Invalid Zoo name entered. Please try again.");
                            System.out.println();
                        }
                    }
                    break;
                case "C":
                    // kyungjin one
//                    for (int i = 0; i < zoos.size(); i++) {
//                        int num = Integer.valueOf(String.valueOf(zoos.get(i)));
//                        int te = 0;
//                        te += num;
//                        System.out.println("Total area is " + te);
//                    }
//                    System.out.println();
//                    System.out.println();
                    int totalEnclosureArea = 0;
                    for(Zoo zoo1 : zoos){
                        totalEnclosureArea += zoo1.getTotalEnclosureArea();
                    }
                    System.out.println("The total area of all enclosures in the selected zoo is " + totalEnclosureArea);
                    break;
                case "D":
                    int countEnclosures = 0;
                    for(Zoo zoo1 : zoos) {
                        countEnclosures += zoo1.countEnclosures();
                    }
                    System.out.println("The total number of enclosures in the selected zoo is " + countEnclosures);
                    break;
                case "Q":
                    return;
                default:
                    System.out.println();
                    System.out.println("Invalid input. Please try again.");
                    System.out.println();

            }

        }

    }

    public static void manageEnclosures() {
        while (true) {
            System.out.println();
            System.out.println("Manage Enclosures");
            System.out.println("-----------------");
            System.out.println("a) Add an Enclosure to a Zoo");
            System.out.println("b) Delete an existing Enclosure from a Zoo");
            System.out.println("c) Get the utilised area in a given Enclosure");
            System.out.println("d) Get the percentage of utilised area in a given Enclosure");
            System.out.println("e) Count the number of species in an enclosure");
            System.out.println("Q) Back to Main Menu");
            System.out.println("Please select an option: ");
            String option = input.nextLine();

            // check all options
            switch (option.trim().toUpperCase()) {
                case "A":
                    System.out.println("Add an enclosure to a zoo");
                    System.out.println("-------------------");
                    for(int i = 0; i < zoos.size(); i++) {
                        System.out.printf("%d. %s", i + 1, zoos.get(i).getName());
                        System.out.println();
                    }
                    int count = zoos.size();
                    System.out.println("Choose Zoo to add an enclosure to (enter zoo name): ");
                    String zooName = input.nextLine();
                    for(Zoo selectedZoo : zoos) {
                        if (selectedZoo.getName().equals(zooName)) {
                            System.out.println("-----Enclosure Details-----");
                            System.out.println("Enclosure Name: ");
                            String enclosureName = input.nextLine();
                            System.out.println("Area of Enclosure: ");
                            int enclosureArea = input.nextInt();
                            Enclosure newEnclosure = new Enclosure(enclosureName, enclosureArea, new ArrayList<>());
                            selectedZoo.getEnclosures().add(newEnclosure);
                            System.out.println("Enclosure " + enclosureName + " added to Zoo " + zooName + " successfully.");
                        } else {
                            System.out.println("Invalid Zoo name entered. Please try again.");
                        }
                    }
                    break;
                case "B":



        }

    }

    public static void manageAnimals() {

    }
}
