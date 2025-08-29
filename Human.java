package com.oops2.StaticExample;

public class Human {
    String name;
    int age;
    static int population;
    Human (String name, int age) {
        this.name = name;
        this.age = age;
        Human.population += 1;
    }
    Human () {
        Human.population += 1;
    }
}
