package ZooJavaProject;

// Imports classes for input and output operations
import java.io.*;

// Animal class using encapsulation
abstract class Animal implements Serializable, FeedingAnimal {
    private int code;
    private String name;
    private double weight;
    private int maxAge;
    private String homotaxy;

    // Class constructor for the Animal class
    public Animal(int code, double weight, int maxAge) {
        this.code = code;
        this.name = this.getClass().getSimpleName();
        this.weight = weight;
        this.maxAge = maxAge;
        this.homotaxy = this.getClass().getSuperclass().getSimpleName();
    }

    // Getters (this method returns the variable value) and Setters (this method sets the value)

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

     public String getName() {
        return this.name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    @Override
    public String toString() {
        return "Code: " + code +
                ", Name: " + this.name +
                ", Weight: " + weight +
                ", Homotaxy: " + this.homotaxy +
                ", Max Age: " + maxAge;

    }

    public String getHomotaxy(){
        return this.homotaxy;
    }
}

// Mammal class representing a mammal animal
class Mammal extends Animal {
    public Mammal(int code, double weight, int maxAge) {
        super(code, weight, maxAge);
    }

    @Override
    public void feed() {
        System.out.println("Feeding " + getName() + "the" + getHomotaxy());
        // Add specific feeding logic for mammals
    }

    @Override
    public String getHomotaxy() {
        return "Mammal";
    }
}

class Bird extends Animal {
    public Bird(int code, double weight, int maxAge) {
        super(code, weight, maxAge);
    }

    @Override
    public void feed() {
        System.out.println("Feeding " + getName() + "the" + getHomotaxy());
    }

    @Override
    public String getHomotaxy() {
        return "Bird";
    }
}

class Reptile extends Animal {
    public Reptile(int code, double weight, int maxAge) {
        super(code, weight, maxAge);
    }

    @Override
    public void feed() {
        System.out.println("Feeding " + getName() + "the" + getHomotaxy());
    }

    @Override
    public String getHomotaxy() {
        return "Reptile";
    }
}

// Pig class representing a pig animal
class Pig extends Mammal {
    public Pig(int code, double weight, int maxAge) {
        super(code, weight, maxAge);
    }

    @Override
    public void feed() {
        System.out.println("The " + getName() + " wants to eat!");
    }

    @Override
    public String getName() {
        return "Pig";
    }
}

// Hippo class representing a hippo animal
class Hippo extends Mammal {
    public Hippo(int code, double weight, int maxAge) {
        super(code, weight, maxAge);
    }

    @Override
    public void feed() {
        System.out.println("The " + getName() + " wants to eat!");
    }

    @Override
    public String getName() {
        return "Hippo";
    }
}

// Lion class representing a lion animal
class Lion extends Mammal {
    public Lion(int code, double weight, int maxAge) {
        super(code, weight, maxAge);
    }

    @Override
    public void feed() {
        System.out.println("The " + getName() + " wants to eat!");
    }

    @Override
    public String getName() {
        return "Lion";
    }
}

// Zebra class representing a zebra animal
class Zebra extends Mammal {
    public Zebra(int code, double weight, int maxAge) {
        super(code, weight, maxAge);
    }

    @Override
    public void feed() {
        System.out.println("The " + getName() + " wants to eat!");
    }

    @Override
    public String getName() {
        return "Zebra";
    }
}

// Canary class representing a zebra animal
class Canary extends Bird {
    public Canary(int code, double weight, int maxAge) {
        super(code, weight, maxAge);
    }

    @Override
    public void feed() {
        System.out.println("The " + getName() + " wants to eat!");
    }

    @Override
    public String getName() {
        return "Zebra";
    }
}

// Parrot class representing a zebra animal
class Parrot extends Bird {
    public Parrot(int code, double weight, int maxAge) {
        super(code, weight, maxAge);
    }

    @Override
    public void feed() {
        System.out.println("The " + getName() + " wants to eat!");
    }

    @Override
    public String getName() {
        return "Parrot";
    }
}

// Pelican class representing a zebra animal
class Pelican extends Bird {
    public Pelican(int code, double weight, int maxAge) {
        super(code, weight, maxAge);
    }

    @Override
    public void feed() {
        System.out.println("The " + getName() + " wants to eat!");
    }

    @Override
    public String getName() {
        return "Pelican";
    }
}

// Eagle class representing a zebra animal
class Eagle extends Bird {
    public Eagle(int code, double weight, int maxAge) {
        super(code, weight, maxAge);
    }

    @Override
    public void feed() {
        System.out.println("The " + getName() + " wants to eat!");
    }

    @Override
    public String getName() {
        return "Eagle";
    }
}

// Snake class representing a zebra animal
class Snake extends Reptile {
    public Snake(int code, double weight, int maxAge) {
        super(code, weight, maxAge);
    }

    @Override
    public void feed() {
        System.out.println("The " + getName() + " wants to eat!");
    }

    @Override
    public String getName() {
        return "Snake";
    }
}

// Turtle class representing a zebra animal
class Turtle extends Reptile {
    public Turtle(int code, double weight, int maxAge) {
        super(code, weight, maxAge);
    }

    @Override
    public void feed() {
        System.out.println("The " + getName() + " wants to eat!");
    }

    @Override
    public String getName() {
        return "Turtle";
    }
}

// Frog class representing a zebra animal
class Frog extends Reptile {
    public Frog(int code, double weight, int maxAge) {
        super(code, weight, maxAge);
    }

    @Override
    public void feed() {
        System.out.println("The " + getName() + " wants to eat!");
    }

    @Override
    public String getName() {
        return "Frog";
    }
}

// Salamander class representing a zebra animal
class Salamander extends Reptile {
    public Salamander(int code, double weight, int maxAge) {
        super(code, weight, maxAge);
    }

    @Override
    public void feed() {
        System.out.println("The " + getName() + " wants to eat!");
    }

    @Override
    public String getName() {
        return "Salamander";
    }
}