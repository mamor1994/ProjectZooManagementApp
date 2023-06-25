package ZooJavaProject;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// ZooManager class for managing the zoo animals
class ZooManager {
    private List<Animal> animals;
    private int nextCode=1;

    public ZooManager(){
        this.animals = new ArrayList<>();
        loadAnimals();
    }

    private static final String FILE_PATH = "zoo.ser";

    // Load animals from the file using Deserialization that has been serialized back into its original form
    private void loadAnimals() {
        try {
            File file = new File(FILE_PATH);
            if (file.exists()) {
                FileInputStream fileIn = new FileInputStream(file);
                ObjectInputStream objectIn = new ObjectInputStream(fileIn);
                this.animals = (List<Animal>) objectIn.readObject();
                objectIn.close();
                fileIn.close();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    // Save animals to the file using Serialization that allows to store objects persistently, transfer them across different systems or send them over a network
    private void saveAnimals() {
        try {
            FileOutputStream fileOut = new FileOutputStream(FILE_PATH);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(animals);
            objectOut.close();
            fileOut.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // View all available zoo animals
    public void viewAllAnimals() {
        if (this.animals.isEmpty()) {
            System.out.println("No animals found in the zoo.");
        } else {
            System.out.println("Zoo Animals:");
            for (Animal animal : this.animals) {
                System.out.println(animal);
            }
        }
    }

    // Add a new animal to a specific homotaxy
    public void addAnimal(int typechoice, int typeChoiceAnimal, double weight, int maxAge, List<Animal> animals) {
        Animal animal = null;
        int code = nextCode++;
//        switch (typeChoice) {
//            case 1:
//                animal = new Mammal(code, weight, maxAge);
//                break;
//            case 2:
//                animal = new Bird(code, weight, maxAge);
//                break;
//            case 3:
//                animal = new Reptile(code, weight, maxAge);
//                break;
//            default:
//                System.out.println("Invalid type choice. Animal not added.");
//                return;
//        }
        boolean isInvalid = false;
        if(typechoice==1) {
            switch (typeChoiceAnimal) {
                case 1:
                    animal = new Pig(code, weight, maxAge);
                    break;
                case 2:
                    animal = new Hippo(code, weight, maxAge);
                    break;
                case 3:
                    animal = new Lion(code, weight, maxAge);
                    break;
                case 4:
                    animal = new Zebra(code, weight, maxAge);
                    break;
                default:
                    isInvalid = true;
                    System.out.println("Invalid type choice. Animal not added.");
                    return;
            }
        }
        else if (typechoice==2){
            switch (typeChoiceAnimal) {
                case 1:
                    animal = new Canary(code, weight, maxAge);
                    break;
                case 2:
                    animal = new Parrot(code, weight, maxAge);
                    break;
                case 3:
                    animal = new Pelican(code, weight, maxAge);
                    break;
                case 4:
                    animal = new Eagle(code, weight, maxAge);
                    break;
                default:
                    isInvalid = true;
                    System.out.println("Invalid type choice. Animal not added.");
                    return;
            }
        }
        else if (typechoice==3){
            switch (typeChoiceAnimal) {
                case 1:
                    animal = new Snake(code, weight, maxAge);
                    break;
                case 2:
                    animal = new Turtle(code, weight, maxAge);
                    break;
                case 3:
                    animal = new Frog(code, weight, maxAge);
                    break;
                case 4:
                    animal = new Salamander(code, weight, maxAge);
                    break;
                default:
                    isInvalid = true;
                    System.out.println("Invalid type choice. Animal not added.");
                    return;
            }
        }
        if(!isInvalid) {
            animals.add(animal);
        }
        saveAnimals();
        System.out.println("Animal added successfully.");
    }


    // Search for an animal by name
    public void searchAnimalByName(String name) {
        boolean found = false;
        for (Animal animal : this.animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                System.out.println("Animal found:");
                System.out.println(animal);
                return;

            }
        }
        if (!found) {
            System.out.println("Animal not found in the zoo.");
        }
    }

    // Search for an animal by code
    public void searchAnimalByCode(int code) {
        boolean found = false;
        for (Animal animal : this.animals) {
            if (animal.getCode() == code) {
                System.out.println("Animal found:");
                System.out.println(animal);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Animal not found in the zoo.");
        }
    }

    // Delete an animal by code (An Iterator is an object that can be used to loop through collections)
    public void deleteAnimalByCode(int code) {
        boolean found = false;
        Iterator<Animal> iterator = animals.iterator();
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            if (animal.getCode() == code) {
                iterator.remove();
                found = true;
                break;
            }
        }
        if (found) {
            saveAnimals();
            System.out.println("Animal deleted successfully.");
        } else {
            System.out.println("Animal not found in the zoo.");
        }
    }

    // Simulate feeding the animals
    public void feedAnimal(FeedingAnimal animal) {
        animal.feed();
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
}
