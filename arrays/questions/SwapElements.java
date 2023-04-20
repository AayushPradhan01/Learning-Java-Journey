package com.learnjava.arrays.questions;
import java.util.Arrays;
import java.util.Scanner;
public class SwapElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the elements of the array of size " + len + ": ");
        for (int i = 0; i < len; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter two index numbers whose elements you want to swap: ");
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();
        System.out.println("The array before the swap: ");
        System.out.println(Arrays.toString(arr));
        swap(arr, index1, index2);
        System.out.println("The array after the swap: ");
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
