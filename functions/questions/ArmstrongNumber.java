// WAP to print all the 3 digit armstrong numbers.


package com.learnjava.functions.questions;

public class ArmstrongNumber {
    public static void main(String[] args){
        for (int i = 100; i <= 999; i++){
            if (armstrong(i)){
                System.out.print( i + " ");
            }
        }
    }

    static boolean armstrong(int i) {
        int original = i;
        int sum = 0;
        while (i > 0) {
            int last_digit = i % 10;
            int cube = last_digit * last_digit * last_digit;
            sum = sum + cube;
            i = i / 10;
        }
        return sum == original;
    }
}
