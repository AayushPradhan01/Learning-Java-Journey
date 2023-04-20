package com.learnjava.recursion.questions;

public class NumberOfStepsToMakeANumberZero {
    public static void main(String[] args){
        System.out.println(sol(123));
    }
    static int count = 0;
    static int sol(int num){
        if (num < 1) {
            return count;
        }
        count++;
        if (num % 2 == 0) {
            return sol(num / 2);
        }
        else {
            return sol(num - 1);
        }
    }
}