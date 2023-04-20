package com.learnjava.oop.inheritance;

public class Box {
    double l;
    double w;
    double h;
    double vol(){
        return l * w * h;
    }
    Box(){
        this.l = 0;
        this.w = -1;
        this.h = -2;
        System.out.println(l + " " + w + " " + h + " " + vol());
    }
    Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
        System.out.println(l + " " + w + " " + h + " " + vol());
        System.out.println("This is a cube and it's volume is " + vol());
    }
    Box(double l, double w, double h){
        this.l = l;
        this.w = w;
        this.h = h;
        System.out.println(l + " " + w + " " + h + " " + vol());
    }
    Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
        System.out.println(l + " " + w + " " + h + " " + vol());
    }
}
