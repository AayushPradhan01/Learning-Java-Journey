package com.learnjava.miscquestions;
import java.util.Scanner;
public class ReverseTheNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number with more than two digits: ");
        long input = sc.nextLong();
        long rev = 0;
        while (input > 0){
            int lastDigit = (int) input % 10;
            rev = (rev * 10) + lastDigit;
            input = input / 10;
        }
        System.out.println("The reversed number is: " + rev);
    }
}
