// Google, Amazon
// [1, 2, 3, 4, 5, 6, 7, 8, 9] = [9, 8, 7, 1, 2, 3, 4, 5, 6, 7, 8].
// Index 2 is the pivot.

package com.learnjava.searching.binarysearch.interviewquestions;

public class FindElementInSortedRotatedArray {
    public static void main(String[] args){
        int[] arr1 = {5, 6, 7, 1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        search(arr1, 2);  // Should print 4.
        search(arr1, 6);  // Should print 1.
        search(arr1, 7);  // Should print 2.
        search(arr1, 8);  // Should print "Element not present in the array".
        search(arr2, 5);  // Should print 4.
        search(arr2, 8);  // Should print "Element not present in the array".
    }

    static int search(int[] arr, int target){
        int pivot = findPivot(arr);
        if (pivot == -1){
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        else if (target == arr[pivot]){
            System.out.println("The element is found at Index " + pivot);
            return pivot;
        }
        else {
            if (target >= arr[0]){
                return binarySearch(arr, target, 0, pivot - 1);
            }
            else {
                return binarySearch(arr, target, pivot + 1, arr.length - 1);
            }
        }
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + ((end - start) / end);
            if (arr[mid] == target){
                System.out.println("The element is found at Index " + mid);
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        System.out.println("Element not present in the array");
        return -1;
    }

    static int findPivot(int[] arr){
        int start = 0;
        int len = arr.length;
        int end = len - 1;
        while(start <= end){
            int mid = start + ((end - start) / 2);
            if (mid < len - 1 && arr[mid] > arr[mid + 1]){
                return mid;
            }
            else if (mid > 0 && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if (arr[start] < arr[mid]){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
