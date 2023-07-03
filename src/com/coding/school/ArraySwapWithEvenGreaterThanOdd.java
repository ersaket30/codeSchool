package com.coding.school;

import java.util.Arrays;
import java.util.Collections;

public class ArraySwapWithEvenGreaterThanOdd {

        // To do two way sort. First sort even numbers in
        // ascending order, then odd numbers in descending
        // order.
        static void twoWaySort(Integer arr[], int n)
        {
            // Current indexes from left and right
            int l = 0, r = n - 1;

            // Count of odd numbers
            int k = 0;

            while (l < r)
            {

                // Find first odd number from left side.
                while (arr[l] % 2 != 0)
                {
                    l++;
                    k++;
                }

                // Find first even number from right side.
                while (arr[r] % 2 == 0 && l < r)
                    r--;

                // Swap even number present on left and odd
                // number right.
                if (l < r)
                {

                    // swap arr[l] arr[r]
                    int temp = arr[l];
                    arr[l] = arr[r];
                    arr[r] = temp;
                }
            }

            // Sort odd number in descending order
            Arrays.sort(arr, 0, k);

            // Sort even number in ascending order
            Arrays.sort(arr, k, n);
        }

        // Driver Method
        public static void main(String[] args)
        {
            String pattern = "1,2,4,9;9,2,1";
            //output = "1,1,9,9,2,2,4"
            String firstPart = pattern.split(";")[0];
            String secondPart = pattern.split(";")[1];

            String jointArray = firstPart+","+secondPart;


            String[] arrayString = jointArray.split(",");
            Integer[] array = new Integer[arrayString.length];
            for (int i = 0; i< arrayString.length ;i++){
                array[i] = Integer.valueOf(arrayString[i]);
            }



            twoWaySort(array, array.length);

            System.out.println(Arrays.toString(array));
        }
}
