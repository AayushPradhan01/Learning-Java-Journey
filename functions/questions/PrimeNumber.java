package com.learnjava.functions.questions;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
       System.out.println(isPrime());

    }
    static boolean isPrime(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check for prime");
        int input = sc.nextInt();
        if (input <= 1){
            return false;
        }
        int count = 2;
        while (count * count <= input) {
            if (input % count == 0){
                return false;
            }
            count++;
        }
        return true;
    }
}
