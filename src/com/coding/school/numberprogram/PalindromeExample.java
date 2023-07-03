package com.coding.school.numberprogram;

public class PalindromeExample {

    public static void main(String[] args) {
        int number = 454;
        int unit = 0;
        int temp = number;

        while (number > 0) {
            int remaining = number % 10;
            unit = unit * 10 + remaining;
            number = number / 10;
        }

        if(temp == unit){
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is not Palindrome");
        }
    }
}
