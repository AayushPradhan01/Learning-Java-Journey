package com.learnjava.miscquestions;

import java.util.Arrays;

public class TwoElementsSumEqualsTarget {
    public static void main(String[] args) {
        int[] arr = {2, 3,  6, 1, 8, 9};
        int target = 199;
        System.out.println("The Array is: ");
        System.out.println(Arrays.toString(arr));
        if (Arrays.equals(func(arr, target), new int[]{-1, -1})) {
            System.out.println("No two elements add up to be equal to the target! ");
        }
        else {
            System.out.println("The indices in which the two numbers, which sums to be equal to the target, lies are: ");
            System.out.println(Arrays.toString(func(arr, target)));
        }
    }


    static int[] func(int[] arr, int target){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (target - arr[i] == arr[j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
