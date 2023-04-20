// Find an element in the Array and return the Index Number.
// Return -1 if the element is not found.

package com.learnjava.searching.linearsearch;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array- ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Elements of the Array:- ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element that you want to look for: ");
        int target = sc.nextInt();
        System.out.println("The element is in the index number " + linearSearch(arr, target));
    }
    static int linearSearch(int[] arr, int target){
        for(int index = 0; index < arr.length; index++){
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }
}
