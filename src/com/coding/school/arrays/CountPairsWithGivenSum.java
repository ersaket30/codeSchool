package com.coding.school.arrays;

import java.util.HashSet;
import java.util.Set;

public class CountPairsWithGivenSum {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{ 1, 3, 5, 7 };
        Integer sum = 8;
        findPairForGivenSum(array,sum);
    }

    private static void findPairForGivenSum(Integer[] array, Integer sum) {
        Set<Integer> mySet = new HashSet<>();
        int count = 0;
        for (Integer integer : array) {
            if (mySet.contains(sum - integer)) {
                int second = sum - integer;
                System.out.println("Pairs are: "+integer+ " : "+second );
            }
            mySet.add(integer);
        }

        System.out.println("Pairs for given sum are/is "+count);
    }
}
