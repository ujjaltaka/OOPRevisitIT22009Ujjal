
interface Flyable {
    void fly();
}


interface Swimable {
    void swim();
}


class Bird implements Flyable, Swimable {
    public void fly() {
        System.out.println("Bird can fly high in the sky.");
    }

    public void swim() {
        System.out.println("Some birds can swim too.");
    }
}


public class Multipulinheritance{
    public static void main(String[] args) {
        Bird b = new Bird();

        b.fly();
        b.swim();
    }
}
