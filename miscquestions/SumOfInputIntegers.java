package com.learnjava.miscquestions;
import java.util.Scanner;
public class SumOfInputIntegers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Keep Entering numbers and enter 0 when you want the sum: ");
        int sum = 0;
        int i = 1;
        while (i > 0){
            int input = sc.nextInt();
            sum = sum + input;
            if (input == 0){
                break;
            }
            i++;
        }
        System.out.println("The sum of all the above numbers is " + sum);
    }
}
