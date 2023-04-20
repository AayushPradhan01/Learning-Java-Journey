package com.learnjava.miscquestions;

public class MockNQT2 {
    public static void main(String[] args){
        System.out.println(kinematics(5, 4, 1));
    }

    static int kinematics(int n1, int n2, int x){
        if (n2 <= n1) {
            return -1;
        }
        int count = 1;
        int totalDistance1 = n1;
        int totalDist2 = n2 - x;
        while (totalDist2 <= totalDistance1){
            totalDist2 = totalDist2 + n2;
            totalDistance1 = totalDistance1 + n1;
            count++;
        }
        return count;
    }
}
