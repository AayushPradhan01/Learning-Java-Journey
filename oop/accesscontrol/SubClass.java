package com.learnjava.oop.accesscontrol;

public class SubClass extends A{

    protected SubClass(int b) {
        super(b);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(2);
        int var = obj.b;
        System.out.println(var);
//        System.out.println(new A(2));
    }
}
