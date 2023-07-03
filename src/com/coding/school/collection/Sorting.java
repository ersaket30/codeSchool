package com.coding.school.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Sorting {

    private void sortNumbersUsingCollections(List<Integer> numbers){
        Collections.sort(numbers);
    }

    private void sortStringUsingCollections(List<String> strings){
        Collections.sort(strings);
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,6,2,8,4));
        List<String>  names = new ArrayList<>(Arrays.asList("Saket","Priya","Abc"));
        Sorting sorting = new Sorting();
        sorting.sortStringUsingCollections(names);
        sorting.sortNumbersUsingCollections(numbers);
        Function<String, String> func = x -> x.toUpperCase();
        names.stream().map(name->func.apply(name)).forEach(name -> System.out.print(" "+name +" "));
        System.out.println();
        numbers.stream().forEach(number -> System.out.print(" "+number + " "));
        System.out.println();
    }

    private static String makeUpperCase(String name) {
        return name.toUpperCase();
    }
}
