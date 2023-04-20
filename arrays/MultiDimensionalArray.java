package com.learnjava.arrays;
import java.util.Scanner;
import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args){

        int[][] arr;          // Column is not mandatory to initialise but row is.

        arr = new int[][]{
                {1, 2, 3},      // 0th index of row
                {4, 5},         // 1st index of row
                {6, 7, 8, 9}    // 2nd index of row
        };

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        // Input 2D array.
        Scanner sc = new Scanner(System.in);
        int[][] arr2 = new int[3][2];
        System.out.println(arr2.length);  // It will print the row size, i.e, the no. of rows.
        for (int row = 0; row < arr2.length; row++){
            for(int col =0; col < arr2[row].length; col++){
                arr2[row][col] = sc.nextInt();
            }
        }

        // Output 2D array.

//        System.out.print(Arrays.toString(arr2));

        for (int row = 0; row < arr2.length; row++){
            System.out.println(Arrays.toString(arr2[row]));
        }

        // 2nd output method.
        for (int row = 0; row < arr2.length; row++) {
            for (int col = 0; col < arr2[row].length; col++) {
                System.out.print(arr2[row][col] + " ");
            }
            System.out.println();
        }
    }
}
