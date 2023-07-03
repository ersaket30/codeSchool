package com.coding.school.stringprograms;

public class ReverseString {

    public static void main(String[] args) {
        String name = "Saket";
        char reverse[] = name.toCharArray();

        for(int i = reverse.length-1 ; i>= 0; i--){
            System.out.print(reverse[i]);
        }
    }
}
