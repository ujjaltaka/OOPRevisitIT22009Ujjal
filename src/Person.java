public class Person {
    // Access modifiers:

    public String name;
    private int age;
    protected String address;
    String phoneNumber;


    public void setAge(int age) {
        this.age = age;
    }


    public int getAge() {
        return age;
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age); // Accessing private field inside the class
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
    }


    public static void main(String[] args) {
        Person p = new Person();

        p.name = "Ujjal";
        p.setAge(25);
        p.address = "Gopalgonj";
        p.phoneNumber = "01930624839";

        p.displayInfo();
    }
}
