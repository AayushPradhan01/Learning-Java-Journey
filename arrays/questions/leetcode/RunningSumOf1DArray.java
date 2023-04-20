package com.learnjava.arrays.questions.leetcode;

import java.util.Arrays;

public class RunningSumOf1DArray {
    public static void main(String[] args){
        int [] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(arr)));
    }

    static int[] runningSum(int[] num){
        int len = num.length;
        int[] arr = new int[len];
        int sum = 0;
        for(int i = 0; i < len; i++){
            sum = sum + num[i];
            arr[i] = sum;
        }
        return arr;
    }
}
