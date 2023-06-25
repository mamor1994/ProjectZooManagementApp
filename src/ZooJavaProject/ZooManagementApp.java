package ZooJavaProject;

// Imports utility classes that provide various functionalities, such as data structures
import java.util.*;

// Main class for running the zoo management console application
public class ZooManagementApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object (Scanner class is used to get user input)
        ZooManager zooManager = new ZooManager();

        int choice = 0;
        do {
            System.out.println("Zoo Management Menu:");
            System.out.println("1. View all available zoo animals");
            System.out.println("2. Add a new animal");
            System.out.println("3. Search for animal by name");
            System.out.println("4. Search animal by code");
            System.out.println("5. Delete animal by code");
            System.out.println("6. Feed the animals");
            System.out.println("7. Exit the application");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt(); // Reads an int value from the user

            switch (choice) {
                case 1:
                    zooManager.viewAllAnimals();
                    break;
                case 2:
                    // System.out.print("Enter the animal code: ");
                    // int code = scanner.nextInt();
                    // scanner.nextLine();
                    // System.out.print("Enter the animal name: " );
                    // String name = scanner.nextLine();
                    // scanner.nextLine();
                    System.out.println("Select the animal homotaxy:");
                    System.out.println("1. Mammal");
                    System.out.println("2. Bird");
                    System.out.println("3. Reptile");
                    int typeChoice = scanner.nextInt();
                    int typeChoiceAnimal = 0;
                    if (typeChoice == 1){
                        System.out.println("Select the Mammal animal:");
                        System.out.println("1. Pig");
                        System.out.println("2. Hippo");
                        System.out.println("3. Lion");
                        System.out.println("4. Zebra");
                        typeChoiceAnimal = scanner.nextInt();
                    } else if (typeChoice == 2){
                            System.out.println("Select the Bird animal:");
                            System.out.println("1. Canary");
                            System.out.println("2. Parrot");
                            System.out.println("3. Pelican");
                            System.out.println("4. Eagle");
                            typeChoiceAnimal = scanner.nextInt();
                    } else if (typeChoice == 3){
                            System.out.println("Select the Reptile animal:");
                            System.out.println("1. Snake");
                            System.out.println("2. Turtle");
                            System.out.println("3. Frog");
                            System.out.println("4. Salamander");
                            typeChoiceAnimal = scanner.nextInt();
                    }

                    System.out.print("Enter the animal weight: ");
                    double weight = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter the animal maximum age: ");
                    int maxAge = scanner.nextInt();


                    zooManager.addAnimal(typeChoice, typeChoiceAnimal,weight,maxAge,zooManager.getAnimals());
                    break;
                case 3:
                    System.out.print("Enter the animal name to search: ");
                    scanner.nextLine(); // Reads a String value from the user
                    String searchName = scanner.nextLine(); // Reads a String value from the user
                    System.out.println(searchName);
                    zooManager.searchAnimalByName(searchName);
                    break;
                case 4:
                    System.out.print("Enter the animal code to search: ");
                    int searchCode = scanner.nextInt();  // Reads an int value from the user
                    zooManager.searchAnimalByCode(searchCode);
                    break;
                case 5:
                    System.out.print("Enter the animal code to delete: ");
                    int deleteCode = scanner.nextInt();  // Reads an int value from the user
                    zooManager.deleteAnimalByCode(deleteCode);
                    break;
                case 6:
                    for (Animal animal : zooManager.getAnimals()) {
                         zooManager.feedAnimal(animal);
                    }
                    break;
                case 7:
                    System.out.println("Close the application...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();
        } while (choice != 7);

        scanner.close();
    }
}


