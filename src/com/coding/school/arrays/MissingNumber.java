package com.coding.school.arrays;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 4, 6, 3, 7, 8};
        findMissingNumber(array);
    }

    private static void findMissingNumber(Integer[] array) {
        int totalSum = 0;
        for(int i = 1 ; i<= array.length+1 ; i++){
            totalSum = totalSum +i;
        }

        Integer sum = Arrays.stream(array).mapToInt(Integer::intValue).sum();
        Integer missingNumber = totalSum - sum ;
        System.out.println("Missing number is "+ missingNumber);
    }

}
