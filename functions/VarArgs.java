// When you create a Method that takes a variable number of arguments is called
// a VarArgs method or Variable Length Arguments.
// It is used when you don't know how many argument inputs you'll take.
package com.learnjava.functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args){
        fun(2, 3, 4, 5, 6, 99);
        multiple(43, 233, "Aayush", "Aman", "Deepak");
    }
    static void fun(int ...v){    // It takes it as an array of the written data type.
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...str){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(str));
    }
}
