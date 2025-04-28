
interface Animall {

    void sound();


    void eat();
}


class Dogg implements Animall {

    public void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }

    public void eat() {
        System.out.println("Dog eats bones.");
    }
}


class Cats implements Animall {
    public void sound() {
        System.out.println("Cat meows: Meow Meow!");
    }

    public void eat() {
        System.out.println("Cat eats fish.");
    }
}


public class Interface {
    public static void main(String[] args) {
        Dogg d = new Dogg();
        Cats c = new Cats();

        d.sound();
        d.eat();

        c.sound();
        c.eat();
    }
}
