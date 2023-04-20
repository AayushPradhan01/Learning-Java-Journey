package com.learnjava.arrays.questions.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args){
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(inputArray())));
    }
    static int[] smallerNumbersThanCurrent(int[] nums){
        int len = nums.length;
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            int total = 0;
            for (int j = 0; j < len; j++){
                if (j == i){
                    continue;
                }
                if (nums[j] < nums[i]){
                    total += 1;
                }
            }
            arr[i] = total;
        }
        return arr;
    }
    static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < len; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
