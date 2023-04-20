package com.learnjava.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int [] arr;                // Declared
        arr = new int [5];         // Initialised

        System.out.println(arr[1]);                      // print 0 because the default value of int is 0.
        System.out.println(Arrays.toString(arr));        // [0, 0, 0, 0, 0]

        String[] str = new String[6];

        System.out.println(str[0]);             // print null bcz the default value of string array is NULL.
        System.out.println(Arrays.toString(str));   // [null, null, null, null, null, null]

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for (int i :
                arr) {
            System.out.print(i + " ");
        }
    }
}
