package com.coding.school.numberprogram;

/*A happy number is a number defined by the following process:

        Starting with any positive integer, replace the number by the sum of the squares of its digits.
        Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
        Those numbers for which this process ends in 1 are happy.
        Return true if n is a happy number, and false if not.*/
public class HappyNumber {

    private static boolean isHappyNumber(Integer number){
        String convertedNumber = String.valueOf(number);
        Integer numberSquare = 0;
        for (int i=0;i<convertedNumber.length();i++){
             numberSquare = numberSquare + Character.getNumericValue(convertedNumber.charAt(i))* Character.getNumericValue(convertedNumber.charAt(i));
             if (i == convertedNumber.length()-1 && numberSquare == 1){
                 return true;
             }

             if(i == convertedNumber.length()-1){
                return isHappyNumber(numberSquare);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        try {
            System.out.println("Is number happy: "+ HappyNumber.isHappyNumber(3));

        } catch (StackOverflowError e){
            System.out.println("Number is not Happy");
        }

    }
}
