package com.coding.school.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicatesInThreeArrays {
    public static void main(String[] args) {
        Integer ar1[] = {1, 5, 10, 20, 40, 80};
        Integer ar2[] = {6, 7, 20, 80, 100};
        Integer ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};

        List<Integer> list1 = new ArrayList<>(Arrays.asList(ar1));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(ar2));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(ar3));

        list1.retainAll(list2);
        list1.retainAll(list3);
        list1.stream().forEach(x-> System.out.println(x + " "));
    }
}
