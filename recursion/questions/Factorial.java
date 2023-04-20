package com.learnjava.recursion.questions;

public class Factorial {
    public static void main(String[] args){
        System.out.print(fact(5));
    }
    static int fact(int n){
        if (n == 1){
            return 1;
        }
        return n * fact(n - 1);
    }
}
