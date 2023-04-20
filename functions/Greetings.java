package com.learnjava.functions;
import java.util.Scanner;
public class Greetings {
    public static void main(String[] args) {
        greetings();
    }

    static void greetings() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input);
    }
}
