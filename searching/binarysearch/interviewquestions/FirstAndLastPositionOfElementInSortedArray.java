// Facebook

package com.learnjava.searching.binarysearch.interviewquestions;

import java.util.Arrays;

public class FirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 7, 7, 7, 7};
        System.out.println(Arrays.toString(position(arr, 7)));
    }

    static int[] position(int[] nums, int target){
        int[] ans = {-1, -1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    static int search(int[] nums, int target, boolean findStartIndex){
        int len = nums.length;
        int start = 0;
        int ans = -1;
        int end = len - 1;
        while (start <= end){
            int mid = start + ((end - start) / 2);
            if (target == nums[mid]){
                ans = mid;
                if (findStartIndex){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else if (target < nums[mid]){
                end = mid - 1;
            }
            else if (target > nums[mid]){
                start = mid + 1;
            }
        }
        return ans;
    }


}
