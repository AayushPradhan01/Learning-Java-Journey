package com.learnjava.arrays.questions.leetcode;

import java.util.Arrays;

public class ArrayFromPermutation {
    public static void main(String[] args){
        int [] arr = {0, 2, 1, 5, 3, 4};
        System.out.println(Arrays.toString(buildArray(arr)));
    }

    static int[] buildArray(int[] nums){
        int len = nums.length;
        int[] ans = new int[len];
        for (int i = 0; i < len; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
