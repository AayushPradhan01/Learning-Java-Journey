// Print how many elements are there in the Array which have even number of digits.

package com.learnjava.searching.linearsearch;
import java.util.Scanner;
public class EvenNumberOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array ");
        int size = sc.nextInt();
        System.out.println("Enter the Elements ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(evenDigits(arr));
    }

    static int evenDigits(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(numberOfDigits(arr[i]) == true){
                count++;
            }
        }
        return count;
    }

    static boolean numberOfDigits(int input){
        int count = 0;
        while(input > 0){
            count++;
            input = input / 10;
        }
        return count % 2 == 0;
    }
}
