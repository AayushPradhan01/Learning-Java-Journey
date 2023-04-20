package com.learnjava.oop.exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintInvalidInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        boolean again = true;
//        while (again) {
        try {
            System.out.println("Enter any number: ");
            i = sc.nextInt();
//                again = false;
//                System.out.println("The entered number is: " + i);
        }
        catch (InputMismatchException ex){
            System.out.println("Invalid input");
            sc.next();
//            }
        }
//        System.out.println("number is " + i);
    }
}
