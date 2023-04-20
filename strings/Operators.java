package com.learnjava.strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');    // It will print the Character's integer value.
        System.out.println("a" + "b");    // It will concatenate the string.
                                          // The only operator overloading allowed in Java.
                                          // '-' operator is not allowed for strings.
        System.out.println('a' + 3);
        System.out.println((char) ('a' + 3));    //TypeCasting.
        System.out.println("a" + 1);
        // integer will be converted to Integer(Wrapper class) that will call toString().
        // This is same as after a few steps: "a" + "1"

        System.out.println("Aayush" + new ArrayList<>());    // Same as above.
//        System.out.println("Aayush" + new Integer(56));
//        System.out.println(new Integer(56) + new ArrayList<>());   This will show error as at least one
//                                                                   argument should be of string type.


//        System.out.println(new Integer(56) + "" + new ArrayList<>());    //This will work.
    }
}
