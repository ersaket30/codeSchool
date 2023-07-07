package com.coding.school.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxLengthSubArraySingleLoop {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{5,6,-5,5,3,5,3,-2,0};
        Integer givenSum = 8;
        findMaxLengthSubArraySingleLoop(array,givenSum);
        findMaxLenghtWithSlidingWindow(array, givenSum);
    }

    private static void findMaxLenghtWithSlidingWindow(Integer[] array, int givenSum) {
        int sum = 0;
        int left = 0;
        int length = -1;
        int index = -1;
        //Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            while (sum>givenSum && left <i){
                sum = sum - array[left];
                left++;
            }
            while (sum==givenSum && left <= i){
                sum = sum - array[left];
                if(length < Math.max(length, i-left+1)){
                    length = Math.max(length, i-left+1);
                    index = i;
                }
                left++;
            }
        }
        int startIndex = index-length+1;
        System.out.println("Max length is "+startIndex + "..."+index );
    }

    private static void findMaxLengthSubArraySingleLoop(Integer[] array, Integer givenSum) {

        int lenght = 0;
        int index = -1;
        int sum = 0;
        Map<Integer,Integer> myMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            myMap.putIfAbsent(sum,i);
            if(myMap.containsKey(sum-givenSum) && lenght < i-myMap.get(sum-givenSum)){
                lenght = i-myMap.get(sum-givenSum);
                index = i;
            }
        }
        int startIndex = index-lenght+1;
        int lastIndex = index;

        System.out.println("Max lenght subArray containing sum is "+startIndex + ".."+lastIndex);
    }
}
