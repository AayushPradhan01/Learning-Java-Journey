//https://leetcode.com/problems/the-kth-factor-of-n/description/

// You are given two positive integers n and k. A factor of an integer n is defined as an integer i where n % i == 0.
//
//Consider a list of all factors of n sorted in ascending order, return the kth factor in this list or return -1 if n has less than k factors.
//
//
//
//Example 1:
//
//Input: n = 12, k = 3
//Output: 3
//Explanation: Factors list is [1, 2, 3, 4, 6, 12], the 3rd factor is 3.
//Example 2:
//
//Input: n = 7, k = 2
//Output: 7
//Explanation: Factors list is [1, 7], the 2nd factor is 7.
//Example 3:
//
//Input: n = 4, k = 4
//Output: -1
//Explanation: Factors list is [1, 2, 4], there is only 3 factors. We should return -1.
//
//
//Constraints:
//
//1 <= k <= n <= 1000

package com.learnjava.miscquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KthFactorOfN {
    public static void main(String[] args){
        System.out.println(kthFactor());
    }

    static int kthFactor(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter k: ");
        int k = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(4);
        for(int i = 1; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                if (i == n / i){
                    list.add(i);
                }
                else {
                    list.add(i);
                    list.add(n / i);
                }
            }
        }
        Collections.sort(list);
        if (k > list.size()){
            return -1;
        }
        return list.get(k-1);
    }



//    static int kthFactor(){
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter n: ");
//        int n = sc.nextInt();
//        System.out.println("Enter k: ");
//        int k = sc.nextInt();
//        ArrayList<Integer> list = new ArrayList<>(4);
//        int i = 0;
//        boolean repeat = false;
//        for (i = 1; i <= Math.sqrt(n); i++){
//            if (n % i == 0){
//                list.add(i);
//            }
//            if (i == n / i){
//                repeat = true;
//            }
//        }
//        if (repeat){
//            i = i - 2;
//        }
//        for (; i >= 1; i--){
//            if (n % i == 0){
//                list.add(n/i);
//            }
//        }
//        if (k > list.size()){
//            return -1;
//        }
//        return list.get(k-1);
}
