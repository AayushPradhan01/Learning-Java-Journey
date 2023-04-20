package com.learnjava.oop.inheritance;

public class Main {
    public static void main(String[] args) {
        Box obj1 = new Box();
        Box obj2 = new Box(2);
        Box obj3 = new Box(2, 3, 4);
        Box obj4 = new Box(obj1);
        BoxWeight obj5 = new BoxWeight(4, 5, 6, 10);
        System.out.println(obj5.l + " " + obj5.w + " " + obj5.h + " " + obj5.weight);
    }
}
