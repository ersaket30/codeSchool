package com.coding.school.arrays;

import java.util.HashSet;
import java.util.Set;

public class FindPairWithGivenSumSingleLoop {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 5, 3,7, -1,1};
        Integer sum = 8;
        findPairForGivenSum(array,sum);
    }

    private static void findPairForGivenSum(Integer[] array, Integer sum) {
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < array.length-1; i++) {
            if(st.contains(sum-array[i])){
                Integer number = sum-array[i];
                System.out.println("Pair is "+number+ " "+array[i]);
            }else {
                st.add(array[i]);
            }
        }
    }
}
