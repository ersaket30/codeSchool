package com.coding.school.stringprograms;

public class PrintCharacterWithItsNumber {
    public static void main(String[] args) {
        String givenStr = "aabbbcc";
        printCharacterWithItsNumber(givenStr);
    }

    private static void printCharacterWithItsNumber(String str) {
           int i, length, counter[] = new int[256];

            length = str.length();

            // Count frequency of every character and store
            // it in counter array
            for (i = 0; i < length; i++) {
                counter[str.charAt(i)]++;
            }
            // Print Frequency of characters
            for (i = 0; i < 256; i++) {
                if (counter[i] != 0) {
                    System.out.println((char) i + " --> " + counter[i]);
                }
            }
        }

}
