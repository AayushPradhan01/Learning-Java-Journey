package com.learnjava.searching.binarysearch.leetcodequestions;

public class FindTheRotationCountOfTheArray {
    public static void main(String[] args){
        int[] arr = {5, 6, 7, 1, 2, 3, 4};
        System.out.println(rotationCount(arr));
    }
    static int rotationCount(int[] arr){
        int start = 0;
        int len = arr.length;
        int end = len - 1;
        while (start <= end){
            int mid = start + ((end - start) / 2);
            if (mid < len - 1 && arr[mid] > arr[mid + 1]){
                return mid + 1;
            }
            else if (mid > 0 && arr[mid] < arr[mid - 1]){
                return mid;
            }
            if (arr[start] > arr[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return
                -1;
    }
}