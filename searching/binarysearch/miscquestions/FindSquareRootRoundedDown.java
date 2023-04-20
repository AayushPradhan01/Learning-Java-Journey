// It's returning 1 instead of 46340 when the input is 2147483647.

package com.learnjava.searching.binarysearch.miscquestions;

import java.util.Scanner;

public class FindSquareRootRoundedDown {
    public static void main(String[] args){
        findSquareRoot();
    }
    static int findSquareRoot(){
        int x = inputInteger();
        int start = 2;
        int end = x / 2;
        while (start <= end){
            int mid = start + ((end - start) / 2);
            if (mid == x / mid || (mid + 1) * (mid + 1) > x && mid * mid < x){
                System.out.println("The square root of " + x + " is " + mid);
                return mid;
            }
            else if (mid > x / mid){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        System.out.println("The square root of " + x + " is 1 ");
        return 1;
    }

    static int inputInteger(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to find the Square root of: ");
        int x = sc.nextInt();
        System.out.println("The number you selected is " + x);
        return x;
    }
}
