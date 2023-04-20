package com.learnjava.searching.binarysearch;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size =  sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to look for: ");
        int target = sc.nextInt();
        System.out.println("The array you entered: ");
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println("After being sorted: ");
        System.out.println(Arrays.toString(arr));
        if(binarySearch(arr, target)){
            System.out.println("The element is present in the array");
        }
        else {
            System.out.println("The Element is not present in the array");
        }
    }


    static boolean binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            //        int mid = (start + end) / 2;     (start + end) Might exceed the range of int data type.
            int mid = (start) + ((end - start) / 2);
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return arr[mid] == target;
            }
        }
        return false;
    }

    // Insertion Sort.
    static void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j-1]){
                    swap(arr, j, j - 1);
                }
                else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int indexA, int indexB){
        int temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }
}
