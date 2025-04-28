
class Animal {
    protected String name;


    public void setName(String name) {
        this.name = name;
    }
}


class Dog extends Animal {


    public void display() {
        System.out.println("Dog's Name: " + name);
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.setName("Buddy");
        myDog.display();
    }
}
