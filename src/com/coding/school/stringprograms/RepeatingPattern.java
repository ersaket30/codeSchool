package com.coding.school.stringprograms;

public class RepeatingPattern {
    public static boolean containsOnlySubstrings(String string) {

        if (string.length() < 2) {
            return false;
        }

        StringBuilder substr = new StringBuilder();
        for (int i = 0; i < string.length() / 2; i++) {
            substr.append(string.charAt(i));

            String clearedFromSubstrings
                    = string.replaceAll(substr.toString(), "");

            if (clearedFromSubstrings.length() == 0) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println("XYZXYZXYZ - "+containsOnlySubstrings("XYZXYZXYZ"));
        System.out.println("XYZXYZXY - "+containsOnlySubstrings("XYZXYZXY"));
        System.out.println("abbabbxabb - "+containsOnlySubstrings("abbabbxabb"));
    }
}
