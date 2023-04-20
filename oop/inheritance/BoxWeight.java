package com.learnjava.oop.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight = 1;
    }

    public BoxWeight(double l, double w, double h, double weight){
        super(l, w, h); // What's this? It calls the parent class constructor.
        // It's used to initialise values present in the parent class.
        this.weight = weight;
    }
}
