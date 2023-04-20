package com.learnjava.recursion.questions;

public class Numbers1ToN {
    public static void main(String[] args){
        num(5);
        numReverse(5);
        numBoth(5);
    }
    static void num(int n){                // Print numbers 1 to n.
        if (n == 1){
            System.out.println(n);
            return;
        }
        num(n - 1);
        System.out.println(n);
    }
    static void numReverse(int n){                // Print numbers n to 1.
        if (n == 0){
            return;
        }
        System.out.println(n);
        numReverse(n - 1);
    }
    static void numBoth(int n){                // Print numbers n to 1 and then 1 to n.
        if (n == 0){
            return;
        }
        System.out.println(n);
        numBoth(n - 1);
        System.out.println(n);
    }
}
