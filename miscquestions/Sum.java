package com.learnjava.miscquestions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Keep entering numbers and then enter 0 when you want the sum of the three types of numbers: ");
        int sumNegative = 0;
        int sumEven = 0;
        int sumOdd = 0;
        int i = 1;
        while (i > 0){
            int input = sc.nextInt();
            if (input < 0){
                sumNegative = sumNegative + input;
            }
            if (input > 0 && input % 2 == 0){
                sumEven = sumEven + input;
            }
            if (input > 0 && input % 2 != 0){
                sumOdd = sumOdd + input;
            }
            if (input == 0){
                break;
            }
            i++;
        }
        System.out.println("The sum of Negative numbers is " + sumNegative);
        System.out.println("The sum of Positive Even numbers is " + sumEven);
        System.out.println("The sum of Positive Odd numbers is " + sumOdd);
    }
}
