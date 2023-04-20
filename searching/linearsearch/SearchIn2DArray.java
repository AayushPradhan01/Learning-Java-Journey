package com.learnjava.searching.linearsearch;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;
public class SearchIn2DArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Row and then that of the column: ");
        int rowsize = sc.nextInt();
        int colsize = sc.nextInt();
        int[][] arr = new int[rowsize][colsize];
        System.out.println("Enter the Elements: ");
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }
        System.out.println("Enter the Element you are looking for: ");
        int target = sc.nextInt();
        int[] ans = search2DArray(arr, target);
        System.out.println("The element is in index " + Arrays.toString(ans));
    }

    static int[] search2DArray(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1};
    }
}
