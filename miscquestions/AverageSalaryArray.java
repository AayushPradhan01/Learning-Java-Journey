// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/description/

package com.learnjava.miscquestions;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
public class AverageSalaryArray {
    public static void main(String[] args){
        System.out.println(averageSalary(inputSalaries()));
    }


    static int[] inputSalaries(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < len; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static double averageSalary(int[] salary){
        double avg;
        double sum = 0;
        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] < min){
                min = salary[i];
            }
            if (salary[i] > max){
                max = salary[i];
            }
            sum = sum + salary[i];
        }
        double total = sum - (min + max);
        avg = total / (salary.length - 2);
        return avg;
    }


//    static double averageSalary(Integer[] salary){
//        double avg = 0;
//        double sum = 0;
////        for (int i : salary){
////            sum += salary;
////        }
//        for (int i = 0; i < salary.length; i++){
//            sum = sum + salary[i];
//        }
//        double min_max = (Collections.min(Arrays.asList(salary)) + (Collections.max(Arrays.asList(salary))));
//        double total = sum - min_max;
//        avg = total / (salary.length - 2);
//        return avg;
//    }
}
