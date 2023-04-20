package com.learnjava.arrays.questions.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of extra candies: ");
        int extraCandies = sc.nextInt();
        System.out.println(kidsWithCandies(inputArray(), extraCandies));
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        int len = candies.length;
        ArrayList<Boolean> l = new ArrayList<>(len);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++){
            max = Math.max(max, candies[i]);
        }
        for (int i = 0; i < len; i++) {
            int a = candies[i] + extraCandies;
            if(a >= max){
                l.add(true);
            }
            else {
                l.add(false);
            }
        }
        return l;
    }


    static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
