//  https://www.geeksforgeeks.org/sum-triangle-from-array/

package com.learnjava.recursion.questions.practice;
import java.util.Arrays;
public class SumTriangleFromArray {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        sum(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sum(int[] arr) {
        int[] num = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++){
            num[i] = arr[i] + arr[i + 1];
        }
        if (arr.length == 2) {
            System.out.println(Arrays.toString(num));
            return;
        }
        sum(num);
        System.out.println(Arrays.toString(num));
    }
}
