package com.learnjava.recursion.questions;

public class CountTheNumberOfZeroes {
    public static void main(String[] args){
        System.out.println(countZero(1020304000));
    }
    static int count = 0;
    static int countZero(int n){
        if (n < 1){
            return count;
        }
        int last_digit = n % 10;
        if (last_digit == 0){
            count++;
        }
        return countZero(n / 10);
    }
}