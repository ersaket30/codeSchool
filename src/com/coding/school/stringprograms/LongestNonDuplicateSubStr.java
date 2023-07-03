package com.coding.school.stringprograms;

import java.util.HashSet;
import java.util.Set;

public class LongestNonDuplicateSubStr {

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        getUniqueCharacterSubstringBruteForce(str);

    }

    private static void getUniqueCharacterSubstringBruteForce(String str) {
        int lenght = 0;
        int index = -1;
        for (int i = 0; i < str.length(); i++) {
            Set<Character> mySet = new HashSet<>();
            int j=i;
            for (; j < str.length(); j++) {
                if(mySet.contains(str.charAt(j))){
                    break;
                }else{
                    mySet.add(str.charAt(j));
                }
            }
            if(lenght< j-i){
                lenght = j-i;
                index = j;
            }

        }
        System.out.println("Longest subString "+str.substring(index-lenght+1,index+1));
    }
}
