package com.learnjava;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextInt();          // It will accept input as integer but print as float.
        System.out.println(num);

        // Type Casting
        int num1 = (int)67.56f;            // It will print as integer only.
        System.out.println(num1);

        // automatic type promotion in expressions
        int a = 257;
        byte b = (byte)a;       // It cannot typecast it because the entered number exceeds the range of
                                // byte. then it will give 257 % range of byte.

        System.out.println(b);  // It will print 257 % 256 i.e., 1.
    }
}
