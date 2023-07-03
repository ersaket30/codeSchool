package com.coding.school.arrays;

public class NegativeNumberToLeft {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{-10,-23,-56,11,-80,-78,34,-3,-19,34,-1};
        shiftNegativeNumbersToLeft(array);
        for(int i= 0 ; i<=array.length-1;i++){
            System.out.print(array[i]+ " ");
        }

    }

    private static void shiftNegativeNumbersToLeft(Integer[] array) {
        int j = 0;
        for(int i= 0 ; i<=array.length-1;i++){
            if(array[i]<0){
                     if(array[j]>0) {
                         int temp = array[i];
                         array[i] = array[j];
                         array[j] = temp;
                     }
                j++;
            }
        }

    }
}
