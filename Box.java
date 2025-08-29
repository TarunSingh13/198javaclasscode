package com.oops3.inheritance;

public class Box {
    protected double l;
    protected double w;
    protected double h;
    // Default constructor
    Box () {
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }
    // Cube constructor
    Box (double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }
    // 3 Parameter based constructor
    Box (double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
    // Constructor using other box;;
    Box (Box other) {
        this.l = other.l;
        this.w = other.w;
        this.h = other.h;
    }
}
