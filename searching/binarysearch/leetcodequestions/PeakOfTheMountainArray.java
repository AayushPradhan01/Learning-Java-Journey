// [1, 3, 4, 5, 12, 17, 14, 13]
// return 17.

package com.learnjava.searching.binarysearch.leetcodequestions;

public class PeakOfTheMountainArray {
    public static void main(String[] args){
        int[] arr = {1, 3, 5, 7, 8, 17, 16, 9, 6, 4, 2};
        System.out.println(peakElement1(arr));
    }

    static int peakElement(int[] arr){
        int len = arr.length;
        int start = 0;
        int end = len - 1;
        while (start <= end){
            int mid = start + ((end - start) / 2);
            if (arr[mid] > arr[mid + 1]) {
                if (arr[mid] > arr[mid - 1]) {
                    return arr[mid];
                }
                else {
                    end = mid - 1;
                }
            }
            else {
                start = mid + 1;
            }
            if (start == end){
                return arr[end];
            }
        }
        return -1;
    }

    //2nd method.
    static int peakElement1(int[] arr){
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
        return arr[end];
    }
}
