// A 2D Array is sorted row wise and column wise. that is [10, 20, 30 ,40]
//                                                        [15, 25 ,35 ,45]
//                                                        [28, 29, 37, 49]
//                                                        [33, 34, 38, 50]
// Find the target element.

package com.learnjava.searching.binarysearch.multiDimArray;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchIn2DArray {
    public static void main(String[] args) {
        search(inputArray(), 37);
    }

    static int[] search(int[][] arr, int target) {
        int len = arr.length;
        int row = 0;
        int col = len - 1;
        while (row < len && col >= 0) {
            if (arr[row][col] == target) {
                System.out.println("The target element " + target + " is at index " + Arrays.toString(new int[]{row, col}));
                return new int[]{row, col};
            }
            else if (arr[row][col] < target) {
                row++;
            }
            else {
                col--;
            }
        }
        System.out.println(" The element is not present in the array! ");
        return new int[]{-1, -1};
    }

    static int[][] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int len = sc.nextInt();
        int[][] arr = new int[len][len];
        System.out.println("Enter the elements ");
        for (int i = 0; i < len; i++) {
            System.out.println("Now fill this row: ");
            for (int j = 0; j < len; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
}