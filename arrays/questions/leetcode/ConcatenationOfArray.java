package com.learnjava.arrays.questions.leetcode;

import java.util.Arrays;

public class ConcatenationOfArray {

    public static void main(String[] args){
        int[] nums = {1, 2, 3, 1};
        System.out.println(Arrays.toString(getConcatenate(nums)));
    }

    static int[] getConcatenate(int[] arr){
        int len = arr.length;
        int[] ans = new int[2 * len];
        for (int i = 0; i < len; i++) {
            ans[i] = ans[len + i] = arr[i];
        }
        return ans;
    }

}