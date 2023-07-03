package com.coding.school.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class FindDuplicateWithoutExtraSpace {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1,2,2,3,3,4,7};
        findDuplicateWithOutExtraSpace(array);
    }

    private static void findDuplicateWithOutExtraSpace(Integer[] array) {
        Integer maxElement = Arrays.stream(array).max(Comparator.naturalOrder()).get();
        boolean[] myBoolArray = new boolean[maxElement+1];
        for (Integer integer : array) {
            if (myBoolArray[integer]) {
                System.out.println("Duplicate is " + integer);
            } else {
                myBoolArray[integer] = true;
            }
        }
    }
}
