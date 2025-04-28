
public class Student {

    String name;
   String  ID;


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID  : " +ID);
    }


    public static void main(String[] args) {

        Student s1 = new Student();


        s1.name = "Ujjal Barai";
        s1.ID = "IT22009";


        s1.displayInfo();
    }
}
