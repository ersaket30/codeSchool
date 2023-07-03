package com.coding.school.stringprograms;

import java.util.ArrayList;
import java.util.List;

public class StringCombinations {
    public static void main(String[] args) {
        String input = "Leader";
        int number = 0;
        List<String> combinations = generateCombinations(input);

        System.out.println("Combinations for '" + input + "':");
        System.out.println("Number of Combinations are '" + number + "':");
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }

    public static List<String> generateCombinations(String input) {
        List<String> combinations = new ArrayList<>();
        generateCombinationsHelper(input, "", combinations);
        return combinations;
    }

    private static void generateCombinationsHelper(String input, String prefix, List<String> combinations) {
        int n = input.length();
        // Base case: if there are no more characters in input, add the current combination to the list
        if (n == 0) {
            combinations.add(prefix);
            return;
        }

        // Recursive case: generate combinations by including or excluding the first character
        generateCombinationsHelper(input.substring(1), prefix + input.charAt(0), combinations);
        generateCombinationsHelper(input.substring(1), prefix, combinations);
    }
}
