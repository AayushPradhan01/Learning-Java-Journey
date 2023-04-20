// Print the repeating nos. and the missing nos.

package com.learnjava.sorting.cyclicsorting.questions;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class SetMismatch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array you entered: ");
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println("After being sorted: ");
        System.out.println(Arrays.toString(arr));
        mismatch(arr);
    }

    static void mismatch(int[] arr){
        sort(arr);
        ArrayList<Integer> missing = new ArrayList<>(7);
        ArrayList<Integer> repeating = new ArrayList<>(7);
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1){
                repeating.add(arr[index]);
                missing.add(index + 1);
            }
        }
        System.out.println("The numbers repeating are " + repeating);
        System.out.println("The numbers missing are " + missing);
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            }
            else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
