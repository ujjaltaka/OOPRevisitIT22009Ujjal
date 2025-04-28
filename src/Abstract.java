// Abstract class
abstract class Animalll {
    // Abstract method (no body)
    public abstract void sound();

    // Regular method
    public void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass (inherits from Animal)
class Dogs extends Animalll {
    // Must override the abstract method
    public void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

// Another subclass
class Cat extends Animalll {
    // Must override the abstract method
    public void sound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

// Main class
public class Abstract {
    public static void main(String[] args) {
        Dogs d = new Dogs();
        Cat c = new Cat();

        d.sound();  // Calls Dog's sound
        d.sleep();  // Calls Animal's sleep

        c.sound();  // Calls Cat's sound
        c.sleep();  // Calls Animal's sleep
    }
}
