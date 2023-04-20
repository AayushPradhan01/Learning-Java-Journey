package com.learnjava.functions;
import java.util.Scanner;
public class Parameters {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String naam = sc.next();
        name(naam);
    }

    static void name(String name) {
        System.out.println("Hello, my name is " + name);
    }
}
