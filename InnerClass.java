package com.oops2.InnerClass;

public class InnerClass {
    static class Test {
        String name;
        Test (String name) {   // This Test class is independent of object of InnerClass but InnerClass is nonstatic type and need  object
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Test obj = new Test("NewObj");
        System.out.println(obj.name);
    }
}
