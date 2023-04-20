//        *****
//        *****
//        *****
//        *****
//        *****

package com.learnjava.practise.questions;

public class DifferentPatterns {
    public static void main(String[] args) {
        pattern1();
        System.out.println();
        pattern2();
        System.out.println();
        pattern3();
        System.out.println();
        pattern4();
        System.out.println();
        pattern5();
    }
    static void pattern1() {                                 //        *
        for (int i = 1; i <= 5; i++) {                       //        **
            for (int j = 1; j <= i; j++) {                   //        ***
                System.out.print("* ");                      //        ****
            }                                                //        *****
            System.out.println();
        }
    }
    static void pattern2() {                                  //        *****
        for (int i = 1; i <= 5; i++) {                        //        *****
            for (int j = 1; j <= 5; j++){                     //        *****
                System.out.print("* ");                       //        *****
            }                                                 //        *****
            System.out.println();
        }
    }
    static void pattern3() {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern5() {
        int n = 5;
        for (int row = 1; row <= (2 * n) - 1; row++) {
            int j = row > n ? (2 * n) - row : row;
            for (int col = 1; col <= j; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
