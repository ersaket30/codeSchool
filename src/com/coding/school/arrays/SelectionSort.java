package com.coding.school.arrays;

public class SelectionSort {

    private  void sort(int arrays[]){
        int n = arrays.length;
        for(int i = 0 ; i<n-1; i++){
            int min_idx = i;
            for (int j =i+1 ; j<n; j++) {
                if (arrays[j] < arrays[min_idx]) {
                    min_idx = j;
                }
            }
                    int temp = arrays[min_idx];
                    arrays[min_idx] = arrays[i];
                    arrays[i] = temp;
                }
    }

    public static void main(String[] args) {

        SelectionSort selectionSort = new SelectionSort();
        int[] array = {64,25,12,22,11};
        selectionSort.sort(array);
        System.out.println("Sorted array is: ");
        for(int i = 0 ; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
