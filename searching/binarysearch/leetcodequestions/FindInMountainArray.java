package com.learnjava.searching.binarysearch.leetcodequestions;

public class FindInMountainArray {
    public static void main(String[] args){
        int[] arr = {1, 3, 5, 7, 8, 17, 16, 9, 6, 4, 2};
        int firstTry = findElement(arr, 9, 0, peak(arr));
        if (firstTry != -1){
            System.out.println(firstTry);
        }
        else {
            System.out.println(findElement(arr, 9, peak(arr) + 1, arr.length - 1));
        }
    }
    static int findElement(int[] arr, int target, int start, int end) {
        while (start <= end){
            int mid = start + ((end - start) / 2);
            if (target == arr[mid]){
                return mid;
            }
            if (arr[start] < arr[end]){
                if (target > arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            else{
                if (target > arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = start + 1;
                }
            }
        }
        return -1;
    }

    static int peak(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid = start + ((end - start) / 2);
            if (arr[mid] > arr[mid + 1]){
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return end;
    }
}