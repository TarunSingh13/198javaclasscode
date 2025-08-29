package com.oops3.Polymorphism;

public class Square extends Shapes{
        @Override
        void area () {
        System.out.println("I am in the Square shape");
    }
    void display () {
        System.out.println("Area of square is side * side");
    }
}
