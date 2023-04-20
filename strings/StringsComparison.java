package com.learnjava.strings;

public class StringsComparison {
    public static void main(String[] args){

        String a = "Aayush";
        String b = "Aayush";
        // There will be only one object("Aayush") will be created in the String Pool.
        // Both the variables will point to that one object.


        // == is a Comparator. It checks whether both the reference variables are pointing
        // to the same object or not.
        System.out.println(a == b);                      // It'll print True.


        String name1 = new String("Aayush");
        String name2 = new String("Aayush");
        // It will create two different objects in the Heap, outside the String Pool.

        System.out.println(name1 == name2);             // It'll print false.

        // .equals() method checks if the values of the two objects are equal or not.
        System.out.println(name1.equals(name2));        // It'll print true.
    }
}
