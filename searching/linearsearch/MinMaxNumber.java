// Print lowest and highest number in the array.

package com.learnjava.searching.linearsearch;

import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args){
        minMaxNum(inputArray());
//        int min = (int) Collections.min(Arrays.asList(inputArray()));
//        int max = (int) Collections.max(Arrays.asList(inputArray()));
//        System.out.println("The Maximum element is " + max);
//        System.out.println("The Minimum element is " + min);
//


    }

    // Take input from the user to create an array
    static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < len; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }


    // Find minimum and maximum element
    static void minMaxNum(int[] num){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : num){
            if (num[i] < min){
                min = num[i];
            }
            if (num[i] > max){
                max = num[i];
            }
        }
        System.out.println("the minimum element is " + min);
        System.out.println("The maximum element is " + max);
    }
}
