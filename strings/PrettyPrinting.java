// % is called placeholder. '.2f' tells that it has to print till 2 decimal places.
// it also rounds off the number.

package com.learnjava.strings;

import java.util.ArrayList;

public class PrettyPrinting {
    public static void main(String[] args) {
        float f = 453.1257f;
        System.out.printf("Formatted number is %.2f ", f);
        System.out.println();
        System.out.println(Math.PI);
        System.out.printf("Pie: %.3f", Math.PI);
        System.out.println();
        System.out.printf("Hello! My name is %s and I am %s", "Aayush", "cool");
        System.out.println();
//        System.out.println(new Integer(56) +""+ new ArrayList<>());  // '+' operator can only concatenate
                                                                       // two complex objects if there is at
                                                                       // least one string in between.
    }
}