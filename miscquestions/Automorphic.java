package com.learnjava.miscquestions;
import java.util.Scanner;
public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        int num = sc.nextInt();               // Takes input.
        int n = num;                     // Storing the no. in another variable so that it doesn't get lost.
        int totalDigits = 0;
        while (num != 0){                 // Finding total no. of digits of the input.
            num = num / 10;
            ++totalDigits;
        }
        int lastDigitFinder = 10;          // This is to know that how many 0s should we use
                                           // after 1 in the 10s to find out the last digits of the square.
        for (int i = 1; i < totalDigits; i++) {
            lastDigitFinder *= 10;
        }
        int lastDigit = (n * n) % lastDigitFinder;                   // the last Digits of the square.

        if (lastDigit == n){                                     // Comparing the last digits of the square
                                                                 // to the input.
            System.out.println("It is an Automorphic number.");
        }
        else {
            System.out.println("It is not an Automorphic number");
        }
    }
}
