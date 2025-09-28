package Polymorphism.Kiet;

public class Employee {
    private String name;
    private int id;
    private int salary;
    Employee () {
    }
    Employee (String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    Employee (Employee other) {
        this.name = other.name;
        this.id = other.salary;
        this.salary = other.salary;
    }
    void details() {
        System.out.println("Employee name is " + this.name);
        System.out.println("Employee id is " + this.id);
        System.out.println("Employee salary is " + this.salary);
    }
}
