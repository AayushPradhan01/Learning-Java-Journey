package com.learnjava.arrays.questions.leetcode;

import java.util.Scanner;

public class NumberOfGoodPairs {
    public static void main(String[] args){
        System.out.println("the number of good pairs is: " + goodPairs(inputArray()));
    }
    static int goodPairs(int[] nums){
        int len = nums.length;
        int ans = 0;
        for (int i = 0; i < len - 1; i++){
            for (int j = i + 1; j < len; j++){
                if (nums[i] == nums[j]){
                    ans += 1;
                }
            }
        }
        return ans;
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