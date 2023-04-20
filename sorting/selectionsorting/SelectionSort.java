// USE CASE - It performs well in small lists.
// It is an Unstable Sorting Algorithm.

package com.learnjava.sorting.selectionsorting;
import java.util.Arrays;
import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        System.out.println("Enter elements: ");
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void sort(int[] arr){
        for(int i = 0; i < arr.length; i++){

            // Find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }


    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i = start; i <= end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}