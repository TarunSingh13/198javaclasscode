package com.oops1;

public class Main {
    public static void main(String[] args) {
       Employee employee = new Employee();
       Employee employee1 = new Employee(1, "Vishal");
       Employee employee2 = new Employee(employee1);
        System.out.println(employee1.name);
        System.out.println(employee2.name + " " + employee2.id);
    }

}
