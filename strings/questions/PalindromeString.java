package com.learnjava.strings.questions;
import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a String to check if it's palindrome: ");
        String str = sc.nextLine().strip().toLowerCase();
//        str.strip();
//        str.toLowerCase();
//        System.out.println(str);
        isPalindrome(str);
    }

    static boolean isPalindrome(String str){
        if (str == null || str.length() == 0){
            System.out.println("The String is empty!");
            return true;
        }
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if (start != end){
                System.out.println("Not palindrome!");
                return false;
            }
        }
        System.out.println("It's palindrome");
        return true;
    }
}
