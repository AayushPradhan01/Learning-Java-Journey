package com.learnjava.arrays.questions.leetcode;

import java.util.Arrays;

public class RichestWealthCustomer {
    public static void main(String[] args){
        int[][] arr = new int[][]{
                {1, 2},
                {2, 3},
                {3, 4}
        };
        System.out.println(maximumWealth(arr));

    }
    static int maximumWealth(int[][] arr){
        int ans = Integer.MIN_VALUE;
        int len = arr.length;
        for (int i = 0; i < len; i++){
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++){
                sum = sum + arr[i][j];
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
