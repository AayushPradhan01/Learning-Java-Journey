//  Is there any way that no new object needs to be created again and again?
//  Yes, there is!
// It's called String Builder. It adds another string to the existing one without
// creating a new object. It just modifies the first object. It's a separate class.

package com.learnjava.strings;

public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);
    }
}
