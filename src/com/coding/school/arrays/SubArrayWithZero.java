package com.coding.school.arrays;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithZero {
    public static void main(String[] args) {
        //Integer[] array = new Integer[]{3,4,-7,3,1,3,1,-4,-2,-2};
        Integer[] array = new Integer[]{3,4,-2};
        if(findSumWithZeroExist(array)==1){
            System.out.println("Sum Exist with zero");
        }else {
            System.out.println("Sum does not exist with zero");
        }
    }

    private static int findSumWithZeroExist(Integer[] array) {
        Set<Integer> mySet = new HashSet<>();
        mySet.add(0);
        int sum = 0;
        for (int i = 0; i <array.length-1 ; i++) {
            sum += array[i];
            if (mySet.contains(sum)){
                return 1;
            }else {
                mySet.add(sum);
            }
        }
        return -1;
    }
}
