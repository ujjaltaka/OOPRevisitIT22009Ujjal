
public class Encapsulation {

    private String name;
    private int age;
    private double salary;


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 18) {
            this.age = age;
        } else {
            System.out.println("Age must be greater than 18.");
        }
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive.");
        }
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }


    public static void main(String[] args) {
        Encapsulation emp = new Encapsulation();


        emp.setName("Ujjal");
        emp.setAge(25);
        emp.setSalary(50000);


        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}

