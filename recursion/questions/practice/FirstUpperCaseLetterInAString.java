package com.learnjava.recursion.questions.practice;

public class FirstUpperCaseLetterInAString {
    public static void main(String[] args) {
        String str = "geeksforgeEks";
        int len = str.length();
        System.out.println(uCase(str, 0, len));
    }
    static char uCase(String str, int index, int len){
        if (index == len) {
            return 0;
        }
        if (str.charAt(index) >= 'A' && str.charAt(index) <= 'Z') {
            return str.charAt(index);
        }
        return uCase(str, index + 1, len);
    }
}
