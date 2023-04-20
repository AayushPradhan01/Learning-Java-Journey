package com.learnjava.oop.accesscontrol;

public class A {
    private int num;
    protected int b;
    String name;
    int[] arr;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    protected A(int b){
        this.b = b;
        b += 10;
        System.out.println(b);
    }
}
