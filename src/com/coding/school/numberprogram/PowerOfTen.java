package com.coding.school.numberprogram;

public class PowerOfTen {

    public static void main(String[] args) {
        System.out.println("10000 isPowerOfTenRecursiveWay: "+isPowerOfTenRecursiveWay(10000));
        System.out.println("1200 isPowerOfTenRecursiveWay: "+isPowerOfTenRecursiveWay(1200));

        System.out.println("10000 isPowerOfTenWithoutRecursiveWay: "+isPowerOfTenWithoutRecursiveWay(10000));
        System.out.println("1200 isPowerOfTenWithoutRecursiveWay: "+isPowerOfTenWithoutRecursiveWay(1200));
    }

    private static boolean isPowerOfTenWithoutRecursiveWay(int input) {
        if(input%10 != 0 || input == 0){
            return false;
        }
        while (input >= 10 && input % 10 == 0)
            input = input/10;
        return input == 1;
    }

    private static boolean isPowerOfTenRecursiveWay(int number) {

        if(number%10 != 0 || number == 0){
            return false;
        }

        if(number == 10){
            return true;
        }
        return isPowerOfTenRecursiveWay(number/10);
    }
}
