/* Take string input like "aaaabbbcccdd" and print it like a : 4
*                                                          b : 3
*                                                          c : 3
*                                                          d : 2
* */

package com.learnjava.miscquestions;

import java.util.Scanner;

public class AmanNeDiyaHai {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase().replaceAll("\\s", "");
        System.out.println("The Entered String is: ");
        System.out.println(input);
        char ch;
        int frequency = 1;
        for (int i = 0; i < input.length() - 1; i++) {
            for (int j = 1; j < input.length(); j++) {
                ch = input.charAt(i);
                char ch2 = input.charAt(j);
                if (ch == ch2){
                    frequency += 1;
                }
            }
            System.out.printf("%c : %i", input.charAt(i), frequency);
            System.out.println();
            input.replaceAll("%c, input.charAt(i)", "");
            if (input.length() == 1){
                System.out.printf("%c : %i", input.charAt(0), 1);
                break;
            }
            if (input.length() == 0){
                break;
            }
        }

    }
}
