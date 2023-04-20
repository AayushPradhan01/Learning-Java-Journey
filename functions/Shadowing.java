// Scope will begin after the variable is initialized and not just declared.
// Shadowing does not work for Methods. It just works for Class Variables.

package com.learnjava.functions;

public class Shadowing {
    static int x = 90;    // This will be Shadowed at line 8.      // Class Variable.
    public static void main(String[] args){
        System.out.println(x);      // 90
        int x = 40;
        System.out.println(x);      // 40
        fun();
    }
    static void fun(){
        System.out.println(x);      // 90
    }
}
