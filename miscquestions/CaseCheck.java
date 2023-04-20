package com.learnjava.miscquestions;
import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Character: ");
        char ch = sc.next().trim().charAt(0);
        if (ch >= 'a' &&  ch <= 'z'){
            System.out.println("The entered alphabet is in Lower Case");
        }
        else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("The entered alphabet is in Upper Case");
        }
        else {
            System.out.println("Invalid input!");
        }
    }
}
