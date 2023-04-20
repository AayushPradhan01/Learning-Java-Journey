//https://leetcode.com/problems/max-value-of-equation/


//You are given an array points containing the coordinates of points on a 2D plane, sorted by the x-values, where points[i] = [xi, yi] such that xi < xj for all 1 <= i < j <= points.length. You are also given an integer k.
//
//        Return the maximum value of the equation yi + yj + |xi - xj| where |xi - xj| <= k and 1 <= i < j <= points.length.
//
//        It is guaranteed that there exists at least one pair of points that satisfy the constraint |xi - xj| <= k.
//
//
//
//        Example 1:
//
//        Input: points = [[1,3],[2,0],[5,10],[6,-10]], k = 1
//        Output: 4
//        Explanation: The first two points satisfy the condition |xi - xj| <= 1 and if we calculate the equation we get 3 + 0 + |1 - 2| = 4. Third and fourth points also satisfy the condition and give a value of 10 + -10 + |5 - 6| = 1.
//        No other pairs satisfy the condition, so we return the max of 4 and 1.
//        Example 2:
//
//        Input: points = [[0,0],[3,0],[9,2]], k = 3
//        Output: 3
//        Explanation: Only the first two points have an absolute difference of 3 or less in the x-values, and give the value of 0 + 0 + |0 - 3| = 3.
//
//
//        Constraints:
//
//        2 <= points.length <= 105
//        points[i].length == 2
//        -108 <= xi, yi <= 108
//        0 <= k <= 2 * 108
//        xi < xj for all 1 <= i < j <= points.length
//        xi form a strictly increasing sequence.


package com.learnjava.arrays.questions.leetcode;

public class MaxValueOfEquation {
    public static void main(String[] args){
        int[][] arr = new int[][]{
                {1, 3},
                {2, 0},
                {5, 10},
                {6, -10}
        };
        System.out.println(findMaxValueOfEquation(arr, 1));
    }
    static int findMaxValueOfEquation(int[][] points, int k){
        int max = Integer.MIN_VALUE;
        int len = points.length;
        for (int i = 0; i < len - 1; i++){
            for (int p = i + 1; p < len; p++){
                for (int j = 0; j < 1; j++){
                    int modSub = points[i][j] - points[p][j];
                    if ( modSub < 0){
                        modSub = modSub * (-1);
                    }
                    if (modSub <= k){
                        int sum = points[i][j + 1] + points[p][j + 1] + modSub;
                        max = Math.max(max, sum);
                    }
                }
            }
        }
        return max;
    }
}