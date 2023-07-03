package com.coding.school.collection;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {

    public static void main(String[] args) {
        Integer[] arrayWithDuplicates = {1, 2, 3, 6, 3, 6, 1};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i< arrayWithDuplicates.length; i++){
            if(map.containsKey(arrayWithDuplicates[i])){
                map.put(arrayWithDuplicates[i],2);
            } else {
                map.put(arrayWithDuplicates[i], 1);
            }
        }

        for (Map.Entry entry :map.entrySet()){
            if(entry.getValue().equals(2) ){
                System.out.println(entry.getKey()+ " ");
            }
        }

    }
}
