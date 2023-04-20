package com.learnjava.searching.binarysearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5, 6,7 ,8 ,9, 10};
        int[] nums2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int target = 6;
        System.out.println("The target is at index " + binarySearch(nums, target));
        System.out.println("The target is at index " + binarySearch(nums2, target));
        System.out.println(binarySearch(nums, 22));
    }


    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + ((end - start) / 2);
            if (target == arr[mid]){
                return mid;
            }
            if (arr[start] < arr[end]){
                if (target < arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if (target > arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}