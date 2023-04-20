// What if we need to print a function multiple times without using a loop
// or without writing the print statement multiple times?
// Here is one thing we can do:-

package com.learnjava.recursion;

public class Message {
    public static void main(String[] args) {
//        message();
//        message1();
//        message2();
//        message3();
//        message4();

//        or

        message();

    }

    static void message(){
        System.out.println("Hello!");
        message1();
    }

    static void message1(){
        System.out.println("Hello!");
        message2();
    }

    static void message2(){
        System.out.println("Hello!");
        message3();
    }

    static void message3(){
        System.out.println("Hello!");
        message4();
    }

    static void message4(){
        System.out.println("Hello!");
    }
}
