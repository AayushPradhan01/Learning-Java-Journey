// Very important point in Strings for competitive programming and interview.

package com.learnjava.strings;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            System.out.print(" " + ch);
            series += ch;  // Not a good practise as it is creating a new object every time. O(n2).
        }
        System.out.println();
        System.out.println(series);

        //  Is there any way that no new object needs to be created again and again?
        //  Yes, there is!
        // It's called String Builder. It adds another string to the existing one without
        // creating a new object. It just modifies the first object. It's a separate class.


    }
}
