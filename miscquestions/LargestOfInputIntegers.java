// Print the largest number among all the inputs.
// Take input till the user enters 0.

package com.learnjava.miscquestions;
import java.util.Scanner;
import static java.lang.Integer.MIN_VALUE;
public class LargestOfInputIntegers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers and then enter 0 when you want to stop. ");
        int max = MIN_VALUE;
        int i = 1;
        while (i > 0) {
            int n = sc.nextInt();
            if (max < n && n != 0) {
                max = n;
            }
            if (n == 0) {
                break;
            }
            i++;
        }
        System.out.println("The Largest Number is " + max);
    }
}
