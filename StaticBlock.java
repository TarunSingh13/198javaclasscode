package com.oops2.StaticExample;

public class StaticBlock {
    public static void main(String[] args) {
        // When class is loaded first then all static variable will initialise / load first
        System.out.println(StaticIns.a);
        StaticIns.b += 3;
        System.out.println(StaticIns.a + " " + StaticIns.b);
        System.out.println(StaticIns.a + " " + StaticIns.b);
    }
}
class StaticIns {
    static int a = 5;
    static int b;
    // This is called a static block which runs only once when a class is loaded or a new object is created
    static  {
        System.out.println("I am static block and runs only once");
        b = 5 *  a;
    }
}
