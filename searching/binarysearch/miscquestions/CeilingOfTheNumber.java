// Take an array as an input and return the smallest element in the array greater than the
// target element or return the target only if it's present in the array.

package com.learnjava.searching.binarysearch.miscquestions;

public class CeilingOfTheNumber {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 11, 13, 14, 15, 16, 17};
        System.out.println(ceilingNumber(arr, 7));
    }
    static int ceilingNumber(int[] arr, int target){
        int start = 0;
        int len = arr.length;
        int end = len - 1;
        int mid = 0;
        while (start <= end){
            mid = start + ((end - start) / 2);
            if (arr[mid] == target){
                return target;
            }
            if (target < arr[mid]){
                end = mid - 1;
            }
            if (target > arr[mid]){
                start = mid + 1;
            }
        }
        return arr[mid];
    }
}
