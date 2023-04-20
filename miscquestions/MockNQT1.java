// Check if a string has all the english alphabets present. If they are, return 0. If they are not,
// print the missing characters. it should be case-insensitive and return in lower case.

package com.learnjava.miscquestions;

import java.util.Arrays;
import java.util.HashSet;

public class MockNQT1 {
    public static void main(String[] args){
        missingAlphabets(" The four boxing wizard starts over quickly ");
    }
    static void missingAlphabets(String str) {
        String str1 = str.toLowerCase().replaceAll(" ", "");
        char[] ch = str1.toCharArray();
        Arrays.sort(ch);
        int len = ch.length;
        HashSet<Character> set = new HashSet<>(26);
        char alphabet = 'a';
        for(int i = 0; i < len; i++) {
            set.add(ch[i]);
        }
        while (alphabet <= 'z') {
            if (set.contains(alphabet)){
                alphabet++;
            }
            else {
                System.out.print(alphabet);
                alphabet++;
            }
        }
    }
}