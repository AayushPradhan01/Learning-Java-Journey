package com.learnjava.functions;
import java.util.Scanner;
public class Operations {
    public static void main(String[] args){
        sum();
//        System.out.println(multiply());       //This will give an error cause the return type is void.
        System.out.println(subtract());
        double ans = divide();
        System.out.println(ans);
    }

    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum is " + sum);
    }

    static void multiply(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number you want to multiply: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int product = a * b;
    }

    static int subtract(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number from which you want to subtract: ");
        int a = sc.nextInt();
        System.out.println("Enter the number you want to subtract from the first number: ");
        int b = sc.nextInt();
        int sub = a - b;
        return sub;
    }

    static double divide(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. you want to divide: ");
        int a = sc.nextInt();
        System.out.println("Enter the number you want to divide the first number by: ");
        int b = sc.nextInt();
        double div = b / 2;
        return div;
    }
}
