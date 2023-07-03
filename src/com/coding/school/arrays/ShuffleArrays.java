package com.coding.school.arrays;

import java.util.Random;

public class ShuffleArrays {

    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        shuffleArray(array);
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }

    private static void shuffleArray(int[] ar) {
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
}
