package com.learnjava.miscquestions;
import java.util.Scanner;
public class RecurringDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a big integer: ");
        long input = sc.nextLong();
        System.out.println("Enter the no. you want check the frequency of: ");
        byte target = sc.nextByte();
        byte count = 0;
        while (input > 0){
            long lastDigit = input % 10;
            if (lastDigit == target){
                count++;
            }
            input = input / 10;
        }
        if (count == 0){
            System.out.println("the digit you entered does not exist in the number.");
        }
        else{
            System.out.println(count + " times this number is occurring");
        }
    }
}
