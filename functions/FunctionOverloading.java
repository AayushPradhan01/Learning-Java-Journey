package com.learnjava.functions;

public class FunctionOverloading {
    public static void main(String[] Args){
        demo("Hello Bhai!");
        demo("Aman", "Aayush");
        System.out.println(sum(2, 3));
        System.out.println(sum(2, 3));
    }
    static void demo(String str){
        System.out.println(str);
    }
    static void demo(String str, String s){
        System.out.println(str + " " + s);
    }
    static double sum(int a, int b){
        double sum = a + b;
        return sum;
    }
    static double sum(double a, double b){
        double sum = a + b;
        return sum;
    }
}
