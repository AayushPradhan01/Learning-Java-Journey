package com.learnjava.recursion;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {-6, -4, -3, 0, 1, 2, 5, 7, 8, 9};
        System.out.println(binary(arr, 66, 0, arr.length - 1));
    }

    static int binary(int[] arr, int target, int start, int end){
        if (start > end){
            return -1;
        }
        if (arr == null || arr.length == 0){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target){
            return mid;
        }
        if (target < arr[mid]){
            return binary(arr, target, start, mid - 1);
        }
        return binary(arr, target, mid + 1, end);
    }

}