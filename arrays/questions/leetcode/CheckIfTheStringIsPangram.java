package com.learnjava.arrays.questions.leetcode;

import java.util.LinkedHashSet;

public class CheckIfTheStringIsPangram {
    public static void main(String[] args){
        String str = "thequickbrownfoxjumpsoverthelazydog";
        checkIfPangram(str);
    }
    static Boolean checkIfPangram(String sentence){
        if (sentence.length() < 26)
        {
            return false;
        }
        int len = sentence.length();
        LinkedHashSet<Character> set = new LinkedHashSet<>(26);
        for (int i = 0; i < len; i++){
            set.add(sentence.charAt(i));
        }
        if (set.size() == 26){
            System.out.println("True");
            return true;
        }
        else {
            System.out.println("False");
            return false;
        }
    }
}