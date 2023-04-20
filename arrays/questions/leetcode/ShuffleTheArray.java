package com.learnjava.arrays.questions.leetcode;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 4, 7};
//        System.out.println(Arrays.toString(shuffle(arr, 3)));
        shuffle(arr, 3);
    }

    static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2 * n];
        for (int i = 0; i < n; i++) {
            arr[2 * i] = nums[i];
            arr[2 * i + 1] = nums[i + n];
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}