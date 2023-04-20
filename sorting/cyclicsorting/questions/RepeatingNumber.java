// Amazon and Microsoft.
// Array range is [1, n].

package com.learnjava.sorting.cyclicsorting.questions;
import java.util.Arrays;
import java.util.Scanner;
public class RepeatingNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter elements: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("The array you entered: ");
        System.out.println(Arrays.toString(nums));
        System.out.println("After getting sorted: ");
        sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("The number repeating in this array is " +repeatingNum(nums));
    }

    static int repeatingNum(int[] arr){
        sort(arr);
        int rep = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[arr.length - 1] == arr[i]){
                rep = arr[i];
                break;
            }
        }
        return rep;
    }

    static void sort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int indexA, int indexB){
        int temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }
}
