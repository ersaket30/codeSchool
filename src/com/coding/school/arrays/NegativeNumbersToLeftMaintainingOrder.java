package com.coding.school.arrays;


import java.util.Arrays;

public class NegativeNumbersToLeftMaintainingOrder {
    public static void main(String[] args) {
        int[] array = { -1, 2, -3, -4, 5, 6, -7, 8, 9 };
        for (int i = 0; i < array.length; i++) {
            if(array[i]<0 && i!=0){
                int negativeNo = array[i];
                int j = i-1;
                while (j>=0 && array[j]>0){
                    array[j+1]=array[j];
                    j--;
                }
                array[j+1] = negativeNo;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
