package com.learnjava.sorting.cyclicsorting.questions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MultiDuplicateNum extends RepeatingNumber{
    public static void main(String[] args) {
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
        System.out.println("The number repeating in this array is " +dupliNum(nums));
    }
    static List dupliNum(int[] arr){
        List<Integer> rep = new ArrayList<>();
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1){
                rep.add(arr[i]);
            }
        }
        return rep;
    }
}
