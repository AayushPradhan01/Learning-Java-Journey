// Notice the common thing here?
// Only the function names are different while the number, type and order of parameters
// as well as the bodies are same.

package com.learnjava.recursion;

public class NumbersExample {
    public static void main(String[] args) {
        // Write a function that takes in a number and prints it.
        // Print first five numbers: 1 2 3 4 5.
        // You just have to write the calling statement only once.

//        print1(1);
//        print1(2);
//        print1(3);
//        print1(4);
//        print1(5);

//        Or

        print1(1);

    }

//    static void print1(int n) {
//        System.out.println(n);
//    }
//
//    static void print2(int n) {
//        System.out.println(n);
//    }
//
//    static void print3(int n) {
//        System.out.println(n);
//    }
//
//    static void print4(int n) {
//        System.out.println(n);
//    }
//
//    static void print5(int n) {
//        System.out.println(n);
//    }

//  Or, we can call the function from within it's own body instead of writing many functions.
//  As the body of every function is the same as well as the number, type and order of the parameter.

    static void print1(int n) {
        if (n == 5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print1(n + 1);
    }
}