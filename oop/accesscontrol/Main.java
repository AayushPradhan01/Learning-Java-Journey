package com.learnjava.oop.accesscontrol;

public class Main {
    public static void main(String[] args) {
        A obj = new A(5, "Aayush");
        System.out.println(obj.getNum());
        obj.setNum(4);
        System.out.println(obj.getNum());
    }
}
