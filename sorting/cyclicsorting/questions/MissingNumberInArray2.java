// Given an array nums of n integers where num[i] is in the range [1, n].
// Return an array of all the missing integers in the range [1, n].
// Asked in Google.

package com.learnjava.sorting.cyclicsorting.questions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class MissingNumberInArray2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int len = sc.nextInt();
        int[] nums = new int[len];
        System.out.println("Enter elements: ");
        for (int i = 0; i < len; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(missingNumbers(nums));
    }
    static List<Integer> missingNumbers(int[] nums){
        sort(nums);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1){
                list.add(i + 1);
            }
        }
        return list;
    }
    static void sort(int[] nums){
        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i] - 1;
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else {
                i++;
            }
        }
    }
    static void swap(int[] nums, int i, int correctIndex) {
        int temp = nums[i];
        nums[i] = nums[correctIndex];
        nums[correctIndex] = temp;
    }
}
