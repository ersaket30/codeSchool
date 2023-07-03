package com.coding.school.stringprograms;

public class PrintLongestPalindrome {

    public static void main(String[] args) {
        String str = "ABDCBCDBDCBBC";

        System.out.println("The longest palindromic substring of " + str + " is "
                + findLongestPalindromicSubstring(str));
    }

    private static String findLongestPalindromicSubstring(String str) {
        // base case
        if (str == null || str.length() == 0) {
            return str;
        }
        // `max_str` stores the maximum length palindromic substring
        // found so far

        String max_str = "", curr_str;

        // `max_length` stores the maximum length of palindromic
        // substring found so far

        int max_length = 0, curr_length;

        // consider every character of the given string as a midpoint and expand
        // in both directions to find maximum length palindrome
        for (int i = 0; i < str.length(); i++) {
           curr_str = expand(str,i,i);
           curr_length = curr_str.length();
            if (curr_length > max_length)
            {
                max_length = curr_length;
                max_str = curr_str;
            }
            curr_str = expand(str, i, i + 1);
            curr_length = curr_str.length();

            // update maximum length palindromic substring if even length
            // palindrome has a greater length

            if (curr_length > max_length)
            {
                max_length = curr_length;
                max_str = curr_str;
            }
        }
        return max_str;
    }

    private static String expand(String str, int i, int j) {
        while (i>=0 && j<str.length() && str.charAt(i)==str.charAt(j)){
            i--;
            j++;
        }
        return str.substring(i+1,j);
    }
}
