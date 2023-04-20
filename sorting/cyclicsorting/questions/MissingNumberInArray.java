// Given an array "nums" containing n distinct numbers in the range [0, n].
// Return the only number in the range that is missing from the array.
// Input nums = [3, 0, 1]. Output - 2.
// Amazon question.

package com.learnjava.sorting.cyclicsorting.questions;
import java.util.Arrays;
import java.util.Scanner;
public class MissingNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index){
                return index;
            }
        }

        // Case 2
        return arr.length;
    }

    static void swap(int[] arr, int indexA, int indexB) {
        int temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }
}
