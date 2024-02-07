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
            System.out.println("1) Manage Animals");
            System.out.println("2) Manage Enclosures");
            System.out.println("3) Manage Zoos");
            System.out.println("Q) Quit");
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
            System.out.println("Q) Back to main menu");
            System.out.println();
            System.out.println("Please select an option: ");
            String option = input.nextLine();

            switch(option.trim().toUpperCase()) {
                case "A":
                    System.out.print("Enter name of the zoo: ");
                    String name = input.nextLine();
                    System.out.print("Enter description of the zoo: ");
                    String description = input.nextLine();
                    zoos.add(new Zoo(name, description, enclosures));
                    break;
                case "B":
                    for(int i = 1; i < zoos.size(); i++) {
                        //System.out.printf("%d. %s", i + 1, zoos.get(i).getName());
                    }
                    System.out.print("Select the zoo to remove: ");
                    int opt = input.nextInt();
                    input.nextLine();
                    zoos.remove(opt - 1);
                    break;
                case "C":
                    break;
                case "D":
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

    }

    public static void manageAnimals() {

    }
}