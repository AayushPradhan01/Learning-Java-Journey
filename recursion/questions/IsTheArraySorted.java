package com.learnjava.recursion.questions;

public class IsTheArraySorted {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 5, 16, 80};
        System.out.println(isSorted(arr, 0));
    }
    static boolean isSorted(int[] nums, int index){
        if (index == nums.length - 1) {
            return true;
        }
        return nums[index] < nums[index + 1] && isSorted(nums, index + 1);
    }
}
