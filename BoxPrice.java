package com.oops3.inheritance;

public class BoxPrice extends BoxWeight{
    double price;
    // Default Constructor
    BoxPrice() {
        this.price = -1;
    }
    // Single Argument Based Constructor
    BoxPrice (double price) {
        this.price = price;
    }
    //  4 Parameter based Constructor
    BoxPrice (double l, double w, double h, double weight, double price) {
        super (l, w, h, weight);
        this.price = price;
    }
    // Cube Constructor
    BoxPrice(double side, double weight, double price) {
        super(side, weight);
        this.price = price;
    }
}
