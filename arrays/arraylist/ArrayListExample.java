package com.learnjava.arrays.arraylist;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args){
        // Syntax
//      ArrayList<Datatype Wrapper class> reference_variable = new ArrayList<Datatype Wrapper class>(initial capacity);
        ArrayList<Integer> list = new ArrayList<>(4);
        list.add(67);
        list.add(234);
        list.add(654);
        list.add(43);
        list.add(654);
        list.add(8765);
        System.out.println(list);

        System.out.println(list.contains(654));

        list.set(0, 99);
        System.out.println(list.get(0));

        list.remove(2);
        System.out.println(list);

        // Input
        ArrayList<Integer> list1 = new ArrayList<>(5);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            list1.add(sc.nextInt());
        }
        System.out.println(list1);
        // Get item at any index
        for (int i = 0; i < 5; i++){
            System.out.println(list1.get(i));
        }
    }
}
