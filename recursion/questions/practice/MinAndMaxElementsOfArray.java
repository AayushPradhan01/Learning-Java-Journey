//    https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/

package com.learnjava.recursion.questions.practice;

public class MinAndMaxElementsOfArray {
    public static void main(String[] args) {
        int[] array = {1, 4, 3, -5, -4, 8, 6};
        int len = array.length;
        System.out.print("min = " + minElement(array, 0, len) + ", ");
        System.out.println("max = " + maxElement(array, 0, len));
    }
    static int min = Integer.MAX_VALUE;
    static int minElement(int[] nums, int index, int len) {
        if (index == len) {
            return min;
        }
        else if (len == 1) {
            return nums[0];
        }
        min = (min > nums[index]) ? nums[index] : min;
        return minElement(nums, index + 1, len);
    }

    static int max = Integer.MIN_VALUE;
    static int maxElement(int[] arr, int index, int len) {
        if (index == len) {
            return max;
        }
        else if (len == 1) {
            return arr[0];
        }
        max = (max < arr[index]) ? arr[index] : max;
        return maxElement(arr, index + 1, len);
    }
}
