package com.learnjava.sorting.cyclicsorting.questions;

public class PositiveMissingNumber {
    public static void main(String[] args){
        int[] arr = {-2, 0, 1, -1 , 4, 2, 6};
        missing(arr);
    }

    static void missing(int[] arr){
        sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != i){
                System.out.println("The first missing positive number is " + i);
                break;
            }
        }
    }

    static void sort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] ;
            if (arr[i] < arr.length && arr[i] > -1 && arr[i] != arr[correctIndex]){
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
