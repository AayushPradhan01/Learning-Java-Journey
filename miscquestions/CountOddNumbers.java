// https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/?envType=study-plan&id=programming-skills-i

package com.learnjava.miscquestions;
import java.util.Scanner;
public class CountOddNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Lower limit of the range: ");
        int low = sc.nextInt();
        System.out.println("Enter the upper limit of the range: ");
        int high = sc.nextInt();
        System.out.println("The total no. of odd numbers in this range including the limits is: ");
        System.out.println(countOdd(low, high));
        
    }
//    static int countOdd(byte low, byte high){
//        byte count = 0;
//        if (low % 2 != 0){
//            for (int i = low; i <= high; i = i + 2){
//                count++;
//            }
//        }
//        else {
//            for (int i = low + 1; i <= high; i = i + 2) {
//                count++;
//            }
//        }
//        return count;
//    }

    static int countOdd(int low, int high){
        int total_input = high - low + 1;
        int ans = 0;

        if ((low % 2 == 0 && high % 2 != 0) || (low % 2 != 0 && high % 2 == 0)){
            ans = total_input / 2;
        }

        if (low % 2 == 0 && high % 2 == 0){
            ans = (total_input / 2);
        }

        if (low % 2 != 0 && high % 2 != 0){
            ans = (total_input / 2) + 1;
        }
        return ans;
    }
}
