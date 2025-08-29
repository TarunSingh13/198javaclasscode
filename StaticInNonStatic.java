package com.oops2.StaticExample;

public class StaticInNonStatic {
    public static void main(String[] args) {
        StaticInNonStatic obj = new StaticInNonStatic();
        obj.nonstaticfun();
    }
    void greeting () {
        System.out.println("Hello, World");
    }
    static void staticfun () {
        //greeting(); // We cant make call nonstatic method from static method cause nonstatic one required obj to access it but static accessible wt any obj
        // So we have to create obj for access of nonstatic method
        System.out.println("Hey i am static fun, u don't req any obj to access me");
        StaticInNonStatic obj = new StaticInNonStatic();
        obj.greeting();
    }
    // Calling a static and nonstatic  fn from a nonstatic fn
    void nonstaticfun () {
        System.out.println("Hey i am non static fn, u req an obj to access me");
        staticfun(); // We can call static fn from a nonstatic fn because the nonstatic fn will be accessible when an obj will be created and then static one will run on by own
        greeting(); // It depends on the object of nonstaticfun when it arrange obj for itself then the same obj will be used by greeting fn for comes in work
    }
}
