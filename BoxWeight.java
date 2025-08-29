package com.oops3.inheritance;

public class BoxWeight extends Box {
    double weight;
    // Default constructor
    BoxWeight () {
        this.weight = -1;
    }
    // 4 Parameter based constructor
    BoxWeight (double l, double w, double h, double weight) {
        super(l, w, h);
        this.weight = weight;
    }
    // Constructor using other box;
    BoxWeight (Box old, double weight) {
        super(old);
        this.weight = weight;
    }
    // Cube Constructor
    BoxWeight(double side, double weight) {
        super (side);
        this.weight = weight;
    }
}
