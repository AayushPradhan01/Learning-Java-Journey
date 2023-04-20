package com.learnjava.recursion.questions;

public class SumAndProductOfDigits {
    public static void main(String[] args){
        System.out.println(sum(1234));
        System.out.println(product(1234));
    }
    static int sum(int n){
        if (n < 1){
            return 0;
        }
        return (n % 10) + sum(n / 10);
    }
    static int product(int n){
        if (n < 1){
            return 1;
        }
        return (n % 10) * product(n / 10);
    }
}
