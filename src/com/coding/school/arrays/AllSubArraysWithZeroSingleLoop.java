package com.coding.school.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllSubArraysWithZeroSingleLoop {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{3,4,-7,3,1,3,1,-4,-2,-2};
        printAllSubArraysWithZeroSum(array);
    }

    static void addEntryInMap(Map<Integer, List<Integer>> myMap, Integer key, Integer value){
        myMap.putIfAbsent(key, new ArrayList<>());
        myMap.get(key).add(value);
    }

    private static void printAllSubArraysWithZeroSum(Integer[] array) {
        Map<Integer, List<Integer>> myMap = new HashMap<>();
        addEntryInMap(myMap,0,-1);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (myMap.containsKey(sum)){
                List<Integer> index = myMap.get(sum);
                for (Integer in: index) {
                    Integer number = in+1;
                    System.out.println("SubArray is "+ number + "..." +i);
                }
            }else {
                addEntryInMap(myMap,sum,i);
            }
        }
    }
}
