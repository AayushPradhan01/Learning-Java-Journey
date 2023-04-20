package com.learnjava.arrays.arraylist.questions;
import java.util.ArrayList;
import java.util.Collections;
public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len = len1 + len2;
        ArrayList<Integer> list = new ArrayList<>(len);
        for (int i = 0; i < len1; i++) {
            list.add(i, nums1[i]);
        }
        for (int i = 0; i < len2; i++) {
            list.add(len1 + i, nums2[i]);
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        int size = list.size();
        if (size % 2 != 0) {
            return list.get(size / 2);
        }
        else {
            return (list.get((size / 2) - 1) + list.get(size / 2)) / 2;
        }
    }
}
