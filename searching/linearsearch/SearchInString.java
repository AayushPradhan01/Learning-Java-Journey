package com.learnjava.searching.linearsearch;
import java.util.Scanner;
public class SearchInString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println("Enter the Character you want to find: ");
        char target = sc.next().charAt(0);
        System.out.println("The character is in index " + searchChar(str, target));
    }

    static int searchChar(String str, char target){
        for(int index = 0; index < str.length(); index++){
            if(str.charAt(index) == target){
                return index;
            }
        }
        return -1;
    }
}
