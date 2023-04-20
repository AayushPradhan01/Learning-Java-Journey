package com.learnjava.recursion.questions;

public class LinearSearchWithRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(search(arr, 0, 9));
    }
    static int search(int[] num, int index, int target){
        if (index == num.length) {
            return -1;
        }
        else if (num[index] == target) {
            return index;
        }
        else {
            return search(num, index + 1, target);
        }
    }
}
