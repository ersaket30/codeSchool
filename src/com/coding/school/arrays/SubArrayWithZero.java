package com.coding.school.arrays;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithZero {
    public static void main(String[] args) {
        //Integer[] array = new Integer[]{3,4,-7,3,1,3,1,-4,-2,-2};
        Integer[] array = new Integer[]{1,3,4,-2,-5};
        if(findSumWithZeroExist(array)){
            System.out.println("Sum Exist with zero");
        }else {
            System.out.println("Sum does not exist with zero");
        }
    }

    private static boolean findSumWithZeroExist(Integer[] arr) {
        // Creates an empty hashset hs
        Set<Integer> hs = new HashSet<Integer>();

        // Initialize sum of elements
        int sum = 0;

        // Traverse through the given array
        for (int i = 0; i < arr.length; i++) {
            // Add current element to sum
            sum += arr[i];

            // Return true in following cases
            // a) Current element is 0
            // b) sum of elements from 0 to i is 0
            // c) sum is already present in hash set
            if (arr[i] == 0 || sum == 0 || hs.contains(sum))
                return true;

            // Add sum to hash set
            hs.add(sum);
        }
        return false;
    }
}
