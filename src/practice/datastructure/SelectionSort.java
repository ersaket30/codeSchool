package practice.datastructure;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] myArray = {64 ,25 ,12 ,22, 11};
        sort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    private static void sort(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            int index = i;
            for (int j = i+1; j < myArray.length; j++) {
                if(myArray[j]<myArray[index]){
                    index = j;
                }
            }
            int tmp = myArray[i];
            myArray[i] = myArray[index];
            myArray[index] = tmp;
        }
    }
}
