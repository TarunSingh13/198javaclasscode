package com.oops1;

public class Employee {
    int id;
    String name;
    Employee (int id, String name) {
        this.id = id;
        this.name = name;
    }
    Employee () {
    }
    Employee (Employee employee) {
        this.id = employee.id;
        this.name  = employee.name;
    }
}
